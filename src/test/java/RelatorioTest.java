import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioTest {

    @Test
    void deveRetornarPendenciaSetorFiscalFechamento() {
        Relatorio relatorio = new Relatorio();
        SetorFiscal.getInstancia().addRelatorioPendente(relatorio);
        assertEquals(false, relatorio.fechar());
    }

    @Test
    void deveRetornarPendenciaSetorContabilFechamento() {
        Relatorio relatorio = new Relatorio();
        SetorContabil.getInstancia().addRelatorioPendente(relatorio);
        assertEquals(false, relatorio.fechar());
    }

    @Test
    void deveRetornarPendenciaSetorControladoriaFechamento() {
        Relatorio relatorio = new Relatorio();
        SetorControladoria.getInstancia().addRelatorioPendente(relatorio);
        assertEquals(false, relatorio.fechar());
    }

    @Test
    void deveRetornarRelatorioSemPendenciaFechamento() {
        Relatorio relatorio = new Relatorio();
        assertEquals(true, relatorio.fechar());
    }
}