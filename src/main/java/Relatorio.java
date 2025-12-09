public class Relatorio {

    public boolean fechar() {
        return RelatorioFacade.verificarPendenciasFechamento(this);
    }
}