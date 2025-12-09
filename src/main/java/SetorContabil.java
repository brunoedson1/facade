public class SetorContabil extends SetorRelatorio {

    private static SetorContabil instancia = new SetorContabil();

    private SetorContabil() {}

    public static SetorContabil getInstancia() {
        return instancia;
    }
}