public class RelatorioFacade {

    public static boolean verificarPendenciasFechamento(Relatorio relatorio) {

        if (SetorFiscal.getInstancia().verificarRelatorioComPendencia(relatorio)) {
            return false;
        }

        if (SetorContabil.getInstancia().verificarRelatorioComPendencia(relatorio)) {
            return false;
        }

        if (SetorControladoria.getInstancia().verificarRelatorioComPendencia(relatorio)) {
            return false;
        }

        return true;
    }
}