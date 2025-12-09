public class SetorFiscal extends SetorRelatorio {

    private static SetorFiscal instancia = new SetorFiscal();

    private SetorFiscal() {}

    public static SetorFiscal getInstancia() {
        return instancia;
    }
}