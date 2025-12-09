import java.util.ArrayList;
import java.util.List;

public abstract class SetorRelatorio {

    private List relatoriosComPendencia = new ArrayList();

    public void addRelatorioPendente(Relatorio relatorio) {
        this.relatoriosComPendencia.add(relatorio);
    }

    public boolean verificarRelatorioComPendencia(Relatorio relatorio) {
        return this.relatoriosComPendencia.contains(relatorio);
    }
}