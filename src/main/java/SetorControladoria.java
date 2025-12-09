public class SetorControladoria extends SetorRelatorio {

    private static SetorControladoria instancia = new SetorControladoria();

    private SetorControladoria() {
    }

    public static SetorControladoria getInstancia() {
        return instancia;
    }
}