package br.com.sascar.integracao.dbconnection;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import br.com.sascar.integracao.SasIntegraWS;
import br.com.sascar.integracao.Motorista;
import br.com.sascar.integracao.SasIntegraNotification;
import br.com.sascar.integracao.SasIntegraWSService;

/**
 *
 * @author camila.aguiar
 */
public class obterMotoristaDemo {
    public static void main(String[] args) {
        SasIntegraWSService service = new SasIntegraWSService();
        SasIntegraWS port = service.getSasIntegraWSPort();

        String usuario = "GRIFFIRODOPAR";
        String senha = "sascar";
        int quantidade = 2000;
        Integer idMotorista = null;

        try {
            List<Motorista> motoristas = port.obterMotoristas(usuario, senha, quantidade, idMotorista);

            if (motoristas != null && !motoristas.isEmpty()) {
                for (Motorista motor : motoristas) {
                    System.out.println("ID do motorista: " + motor.getIdMotorista());
                    System.out.println("Nome do motorista: " + motor.getNome());
                    System.out.println("Tipo do motorista: " + motor.getTipoMotorista());

                    Object dataContratacaoObj = motor.getDataContratacao();
                    System.out.println("Tipo de data de contratação: " + dataContratacaoObj.getClass().getName());

                    if (dataContratacaoObj instanceof Element) {
                        Element dataContratacaoElement = (Element) dataContratacaoObj;
                        String dataContratacaoStr = dataContratacaoElement.getTextContent();

                        SimpleDateFormat sdfInput = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                        SimpleDateFormat sdfOutput = new SimpleDateFormat("dd/MM/yyyy"); 

                        try {
                            Calendar dataContratacao = Calendar.getInstance();
                            dataContratacao.setTime(sdfInput.parse(dataContratacaoStr));

                            // Formata a data para exibição
                            String dataFormatada = sdfOutput.format(dataContratacao.getTime());
                            System.out.println("Data de contratação: " + dataFormatada);
                        } catch (Exception e) {
                            System.err.println("Erro ao converter data: " + e.getMessage());
                        }
                    } else {
                        System.err.println("Data de contratação não é um Element: " + dataContratacaoObj);
                    }

                    System.out.println("Tipo de documento: " + motor.getTipoDocumento());
                    System.out.println("Número do documento: " + motor.getNumeroDocumento());
                    System.out.println("teste" + motor.getVencimentoCNH());
                    System.out.println("--------------------------------------");
                }
            } else {
                System.out.println("Nenhum motorista encontrado.");
            }
        } catch (SasIntegraNotification ex) {
            System.err.println("Erro ao obter motoristas: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
