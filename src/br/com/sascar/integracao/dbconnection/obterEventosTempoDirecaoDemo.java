package br.com.sascar.integracao.dbconnection;
import java.util.List;
import br.com.sascar.integracao.SasIntegraWS;
import br.com.sascar.integracao.EventoTempoDirecao;
import br.com.sascar.integracao.EventoTempoDirecao;
import br.com.sascar.integracao.SasIntegraNotification;
import br.com.sascar.integracao.SasIntegraNotification;
import br.com.sascar.integracao.SasIntegraWS;
import br.com.sascar.integracao.SasIntegraWSService;
import br.com.sascar.integracao.SasIntegraWSService;

public class obterEventosTempoDirecaoDemo {
   public static void main(String[] args) {
        SasIntegraWSService service = new SasIntegraWSService();
        SasIntegraWS port = service.getSasIntegraWSPort();
        
        String usuario = "seu usuário";
        String senha = "sua senha";
        int quantidade = 2000;
        Integer idMotorista = null; 
        String dataInicio = "2024-07-01 00:00:00"; 
        String dataFim = "2024-07-31 00:00:00";  
        
         try {
            List<EventoTempoDirecao> eventosTempoDirecao = port.obterEventosTempoDirecao(usuario, senha, quantidade, idMotorista, dataInicio, dataFim);

            if (eventosTempoDirecao != null && !eventosTempoDirecao.isEmpty()) {
                for (EventoTempoDirecao evento : eventosTempoDirecao) {
                    System.out.println("Cidade: " + evento.getCidade());
                    System.out.println("Data Inicio: " + evento.getDataInicio());
                    System.out.println("Descrição do Evento: " + evento.getDescricaoEventoTempoDirecao());
                    System.out.println("Descrição do Evento Anterior: " + evento.getDescricaoEventoTempoDirecaoAnterior());
                    System.out.println("ID do Evento: " + evento.getEventoTempoDirecao());;
                    System.out.println("ID do Evento anterior: " + evento.getEventoTempoDirecaoAnterior());
                    System.out.println("ID do cliente: " + evento.getIdCliente());
                    System.out.println("ID do motorista: " + evento.getIdMotorista());
                    System.out.println("ID do motorista reserva: " + evento.getIdMotoristaReserva());
                    System.out.println("ID do Veiculo: " + evento.getIdVeiculo());
                    System.out.println("Latitude: " + evento.getLatitude());
                    System.out.println("Longitude: " + evento.getLongitude());
                    System.out.println("Nome do cliente: " + evento.getNomeCliente());
                    System.out.println("Nome do motorista: " + evento.getNomeMotorista());
                    System.out.println("Nome do motorista reserva: " + evento.getNomeMotoristaReserva());
                    System.out.println("Odometro: " + evento.getOdometro());
                    System.out.println("Placa do Veículo: " + evento.getPlaca());
                    System.out.println("Rua: " + evento.getRua());
                    System.out.println("UF: " + evento.getUf());
                    System.out.println("--------------------------------------");                }
            } else {
                System.out.println("Nenhum evento de tempo de direção encontrado.");
            }
        } catch (SasIntegraNotification ex) {
            System.err.println("Erro ao obter eventos de tempo de direção: " + ex.getMessage());
            ex.printStackTrace();
        }
   }
}
