package br.com.sascar.integracao.dbconnection.insercoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import br.com.sascar.integracao.SasIntegraWS;
import br.com.sascar.integracao.EventoTempoDirecao;
import br.com.sascar.integracao.SasIntegraNotification;
import br.com.sascar.integracao.SasIntegraWSService;

public class InsertEventosTempoDirecao {

    private static final long INTERVALO = 2 * 60 * 1000; 

    public static void main(String[] args) {
        SasIntegraWSService service = new SasIntegraWSService();
        SasIntegraWS port = service.getSasIntegraWSPort();

        String usuario = "seu usuário";
        String senha = "sua senha";
        int quantidade = 2000;
        Integer idMotorista = null;
        String dataInicio = "2024-07-01 00:00:00";
        String dataFim = "2024-07-31 00:00:00";
        String dbURL = "jdbc:sqlserver://seuservidor\\suainstancia;databaseName=db_sascar;integratedSecurity=true;encrypt=false;";
        
        while (true) {
            try (Connection conn = DriverManager.getConnection(dbURL)) {
                List<EventoTempoDirecao> eventosTempoDirecao = port.obterEventosTempoDirecao(usuario, senha, quantidade, idMotorista, dataInicio, dataFim);

                if (eventosTempoDirecao != null && !eventosTempoDirecao.isEmpty()) {
                    String checkSql = "SELECT COUNT(*) FROM EventosTempoDirecao WHERE idMotorista = ? AND dataInicio = ?";
                    String insertSql = "INSERT INTO EventosTempoDirecao ("
                            + "cidade, "
                            + "dataInicio, "
                            + "descEvento, "
                            + "descEventoAnt, "
                            + "evento, "
                            + "eventoAnt, "
                            + "idCliente, "
                            + "idMotorista, "
                            + "idMotoristaReserva, "
                            + "idVeiculo, "
                            + "latitude, "
                            + "longitude, "
                            + "nomeCliente, "
                            + "nomeMotorista, "
                            + "nomeMotoristaReserva, "
                            + "odometro, "
                            + "placa, "
                            + "rua, "
                            + "uf) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    try (PreparedStatement checkStmt = conn.prepareStatement(checkSql);
                         PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {
                        for (EventoTempoDirecao evento : eventosTempoDirecao) {
                            checkStmt.setInt(1, evento.getIdMotorista());
                            checkStmt.setString(2, evento.getDataInicio());
                            try (ResultSet rs = checkStmt.executeQuery()) {
                                if (rs.next() && rs.getInt(1) == 0) {
                                    insertStmt.setString(1, evento.getCidade());
                                    insertStmt.setString(2, evento.getDataInicio());
                                    insertStmt.setString(3, evento.getDescricaoEventoTempoDirecao());
                                    insertStmt.setString(4, evento.getDescricaoEventoTempoDirecaoAnterior());
                                    insertStmt.setInt(5, evento.getEventoTempoDirecao());
                                    insertStmt.setInt(6, evento.getEventoTempoDirecaoAnterior());
                                    insertStmt.setInt(7, evento.getIdCliente());
                                    insertStmt.setInt(8, evento.getIdMotorista());
                                    insertStmt.setInt(9, evento.getIdMotoristaReserva());
                                    insertStmt.setInt(10, evento.getIdVeiculo());
                                    insertStmt.setDouble(11, evento.getLatitude());
                                    insertStmt.setDouble(12, evento.getLongitude());
                                    insertStmt.setString(13, evento.getNomeCliente());
                                    insertStmt.setString(14, evento.getNomeMotorista());
                                    insertStmt.setString(15, evento.getNomeMotoristaReserva());
                                    insertStmt.setInt(16, evento.getOdometro());
                                    insertStmt.setString(17, evento.getPlaca());
                                    insertStmt.setString(18, evento.getRua());
                                    insertStmt.setString(19, evento.getUf());
                                    insertStmt.addBatch();
                                }
                            }
                        }
                        insertStmt.executeBatch();
                    }
                    System.out.println("Eventos inseridos com sucesso no banco de dados.");
                } else {
                    System.out.println("Nenhum evento de tempo de direção encontrado.");
                }
            } catch (SQLException | SasIntegraNotification ex) {
                System.err.println("Erro ao obter eventos de tempo de direção ou inserir no banco de dados: " + ex.getMessage());
                ex.printStackTrace();
            }
            
            try {
                Thread.sleep(INTERVALO);
            } catch (InterruptedException e) {
                System.err.println("A espera foi interrompida: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
    }
}
