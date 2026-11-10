import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Escolha AnalistaDados ou CientistaML e complete 2 testes.
 * Um deles deve obrigatoriamente verificar registrarPagamento.
 */
public class ColaboradorTest {
    @Test
    void exemploEstruturaAaa() {
        AnalistaDados analista = new AnalistaDados("Ana", "A001");
        double horas = analista.addHoraPipeline(1.0);
        assertEquals(0.0, horas, 0.001,
                "este exemplo só ilustra AAA; substitua pelos seus 2 testes");
    }

    // TODO: criar 2 testes unitários (AAA + mensagem na asserção)
    // TODO: um deles deve testar registrarPagamento
    @Test 
    void addHoraPipeline(){
        //Arrange
        AnalistaDados colabAnalista = new AnalistaDados("Sofia", "989A");

        //Act
        double adicionaHora = colabAnalista.addHoraPipeline(36.0);

        //Assert
        assertEquals(35.0, adicionaHora, "As horas estão sendo adicionadas corretamente");
    }

    @Test 
    void registrarPagamento(){
        //Arrange
        AnalistaDados colabAnalista = new AnalistaDados("Helena", "999A");
        colabAnalista.addHoraPipeline(9.0);

        //Act
        double salarioFinal = colabAnalista.registrarPagamento();

        //Assert
        assertEquals(4672.5, salarioFinal);
    }
}
