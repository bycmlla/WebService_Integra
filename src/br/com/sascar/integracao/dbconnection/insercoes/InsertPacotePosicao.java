package br.com.sascar.integracao.dbconnection.insercoes;

import br.com.sascar.integracao.PacotePosicao;
import br.com.sascar.integracao.SasIntegraNotification;
import br.com.sascar.integracao.SasIntegraWS;
import br.com.sascar.integracao.SasIntegraWSService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;

public class InsertPacotePosicao {
        private static final long INTERVALO = 2 * 60 * 1000;

    public static void main(String[] args) {
        SasIntegraWSService service = new SasIntegraWSService();
        SasIntegraWS port = service.getSasIntegraWSPort();

        String usuario = "GRIFFIRODOPAR";
        String senha = "sascar";
        int quantidade = 2000;
        String dbURL = "jdbc:sqlserver://SERVERBD\\SQLBDSASCAR;databaseName=db_sascar;integratedSecurity=true;encrypt=false;";

        while (true) {
            try (Connection conn = DriverManager.getConnection(dbURL)) {
                List<PacotePosicao> pacotes = port.obterPacotePosicoes(usuario, senha, quantidade);

                if (pacotes != null && !pacotes.isEmpty()) {
                    String checkSql = "SELECT COUNT(*) FROM PacotePosicoes WHERE idPacote = ?";
                    String insertSql = "INSERT INTO PacotePosicoes ("
                            + "idVeiculo, idPacote, dataPosicao, dataPacote, latitude, longitude, "
                            + "direcao, velocidade, ignicao, horimetro, odometro, tensao, "
                            + "saida1, saida2, saida3, saida4, entrada1, entrada2, entrada3, entrada4, "
                            + "satelite, memoria, idReferencia, bloqueio, gps, uf, cidade, rua, pontoReferencia, "
                            + "anguloReferencia, distanciaReferencia, rpm, temperatura1, temperatura2, temperatura3, "
                            + "saida5, saida6, saida7, saida8, entrada5, entrada6, entrada7, entrada8, pontoEntrada, "
                            + "pontoSaida, codigoMacro, conteudoMensagem, textoMensagem, tipoTeclado, jamming) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                    try (PreparedStatement checkStmt = conn.prepareStatement(checkSql);
                            PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {
                        SimpleDateFormat sdfOutput = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        for (PacotePosicao pacote : pacotes) {
                            checkStmt.setLong(1, pacote.getIdPacote());
                            try (ResultSet rs = checkStmt.executeQuery()) {
                                if (rs.next() && rs.getInt(1) == 0) {
                                    insertStmt.setInt(1, pacote.getIdVeiculo());
                                    insertStmt.setLong(2, pacote.getIdPacote());

                                    Date dataPosicao = DateUtil.toDate(pacote.getDataPosicao());
                                    Date dataPacote = DateUtil.toDate(pacote.getDataPacote());

                                    insertStmt.setString(3, dataPosicao != null ? sdfOutput.format(dataPosicao) : null);
                                    insertStmt.setString(4, dataPacote != null ? sdfOutput.format(dataPacote) : null);

                                    insertStmt.setDouble(5, pacote.getLatitude());
                                    insertStmt.setDouble(6, pacote.getLongitude());
                                    insertStmt.setInt(7, pacote.getDirecao());
                                    insertStmt.setInt(8, pacote.getVelocidade());
                                    insertStmt.setInt(9, pacote.getIgnicao());
                                    insertStmt.setInt(10, pacote.getHorimetro());
                                    insertStmt.setInt(11, pacote.getOdometro());
                                    insertStmt.setInt(12, pacote.getTensao());
                                    insertStmt.setInt(13, pacote.getSaida1());
                                    insertStmt.setInt(14, pacote.getSaida2());
                                    insertStmt.setInt(15, pacote.getSaida3());
                                    insertStmt.setInt(16, pacote.getSaida4());
                                    insertStmt.setInt(17, pacote.getEntrada1());
                                    insertStmt.setInt(18, pacote.getEntrada2());
                                    insertStmt.setInt(19, pacote.getEntrada3());
                                    insertStmt.setInt(20, pacote.getEntrada4());
                                    insertStmt.setInt(21, pacote.getSatelite());
                                    insertStmt.setInt(22, pacote.getMemoria());
                                    insertStmt.setInt(23, pacote.getIdReferencia());
                                    insertStmt.setInt(24, pacote.getBloqueio());
                                    insertStmt.setInt(25, pacote.getGps());
                                    insertStmt.setString(26, pacote.getUf());
                                    insertStmt.setString(27, pacote.getCidade());
                                    insertStmt.setString(28, pacote.getRua());
                                    insertStmt.setString(29, pacote.getPontoReferencia());
                                    insertStmt.setInt(30, pacote.getAnguloReferencia());
                                    insertStmt.setInt(31, pacote.getDistanciaReferencia());
                                    insertStmt.setInt(32, pacote.getRpm());
                                    insertStmt.setInt(33, pacote.getTemperatura1());
                                    insertStmt.setInt(34, pacote.getTemperatura2());
                                    insertStmt.setInt(35, pacote.getTemperatura3());
                                    insertStmt.setInt(36, pacote.getSaida5());
                                    insertStmt.setInt(37, pacote.getSaida6());
                                    insertStmt.setInt(38, pacote.getSaida7());
                                    insertStmt.setInt(39, pacote.getSaida8());
                                    insertStmt.setInt(40, pacote.getEntrada5());
                                    insertStmt.setInt(41, pacote.getEntrada6());
                                    insertStmt.setInt(42, pacote.getEntrada7());
                                    insertStmt.setInt(43, pacote.getEntrada8());
                                    insertStmt.setInt(44, pacote.getPontoEntrada());
                                    insertStmt.setInt(45, pacote.getPontoSaida());
                                    insertStmt.setInt(46, pacote.getCodigoMacro());
                                    insertStmt.setString(47, pacote.getConteudoMensagem());
                                    insertStmt.setString(48, pacote.getTextoMensagem());
                                    insertStmt.setInt(49, pacote.getTipoTeclado());
                                    insertStmt.setInt(50, pacote.getJamming());
                                    insertStmt.addBatch();
                                }
                            }
                        }
                        insertStmt.executeBatch();
                    }
                    System.out.println("Pacotes inseridos com sucesso no banco de dados.");
                } else {
                    System.out.println("Nenhum pacote de posição encontrado.");
                }
            } catch (SQLException | SasIntegraNotification ex) {
                System.err.println("Erro ao obter pacotes de posição ou inserir no banco de dados: " + ex.getMessage());
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
