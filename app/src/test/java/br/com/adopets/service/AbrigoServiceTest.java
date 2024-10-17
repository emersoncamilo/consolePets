package br.com.adopets.service;

import br.com.adopets.client.ClientHttpConfiguration;
import br.com.adopets.domain.Abrigo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.http.HttpResponse;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class AbrigoServiceTest {

//    private ClientHttpConfiguration client = mock(ClientHttpConfiguration.class);
//    private AbrigoService abrigoService = new AbrigoService(client);
//    private HttpResponse<String> response = mock(HttpResponse.class);
//    private Abrigo abrigo = new Abrigo("Teste", "61981880392", "abrigo_petmania@gmail.com");


    @Mock
    private ClientHttpConfiguration client;

    @InjectMocks
    private AbrigoService abrigoService;

    @Mock
    private HttpResponse<String> response;

    private final Abrigo abrigo = new Abrigo("Teste", "61981880392", "abrigo_petmania@gmail.com");

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void deveVerificarQuandoHaAbrigo() throws IOException, InterruptedException {
        // criando o resultado esperado
        abrigo.setId(0L);
        String expectedAbrigosCadastrados = "Abrigos cadastrados:";
        String expectedIdENome = "0 - Teste";

        // pegando todo o retorno do syout
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        when(response.body()).thenReturn("[{"+abrigo.toString()+"}]");
        when(client.dispararRequisicaoGet(anyString())).thenReturn(response);

        abrigoService.listarAbrigo();

        String[] lines = baos.toString().split(System.lineSeparator());
        String actualAbrigosCadastrados = lines[0];
        String actualIdENome = lines[1];

        Assertions.assertEquals(expectedAbrigosCadastrados, actualAbrigosCadastrados);
        Assertions.assertEquals(expectedIdENome, actualIdENome);
    }




    @Test
    public void deveVerificarQuandoNaoHaAbrigo() throws IOException, InterruptedException {
        // criando o resultado esperado
        abrigo.setId(0L);
        String expected = "Nao há abrigos Cadastrados";

        // pegando todo o retorno do syout
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        when(response.body()).thenReturn("[]");
        when(client.dispararRequisicaoGet(anyString())).thenReturn(response);

        abrigoService.listarAbrigo();

        String[] lines = baos.toString().split(System.lineSeparator());
        String actual = lines[0];

        Assertions.assertEquals(expected, actual);
    }



}