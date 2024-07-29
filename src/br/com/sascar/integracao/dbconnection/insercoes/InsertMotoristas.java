package br.com.sascar.integracao.dbconnection.insercoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import br.com.sascar.integracao.Motorista;
import br.com.sascar.integracao.SasIntegraNotification;
import br.com.sascar.integracao.SasIntegraWS;
import br.com.sascar.integracao.SasIntegraWSService;

import java.text.SimpleDateFormat;

public class InsertMotoristas {

    private static final long INTERVALO = 24 * 60 * 60 * 1000;

    public static void main(String[] args) {
        SasIntegraWSService service = new SasIntegraWSService();
        SasIntegraWS port = service.getSasIntegraWSPort();

        String usuario = "GRIFFIRODOPAR";
        String senha = "sascar";
        int quantidade = 2000;
        Integer idMotorista = null;

        String dbURL = "jdbc:sqlserver://SERVERBD\\SQLBDSASCAR;databaseName=db_sascar;integratedSecurity=true;encrypt=false;";

        while (true) {
            try (Connection conn = DriverManager.getConnection(dbURL)) {
                List<Motorista> motoristas = port.obterMotoristas(usuario, senha, quantidade, idMotorista);

                if (motoristas != null && !motoristas.isEmpty()) {
                    String mergeSql = "MERGE INTO Motorista AS target "
                            + "USING (VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)) AS source "
                            + "(idMotorista, nome, tipoMotorista, dataContratacao, tipoDocumento, numeroDocumento, tipoCNH, vencimentoCNH, telefone, celular, login, senha, generico) "
                            + "ON (target.idMotorista = source.idMotorista) "
                            + "WHEN MATCHED THEN "
                            + "UPDATE SET nome = source.nome, tipoMotorista = source.tipoMotorista, dataContratacao = source.dataContratacao, tipoDocumento = source.tipoDocumento, "
                            + "numeroDocumento = source.numeroDocumento, tipoCNH = source.tipoCNH, vencimentoCNH = source.vencimentoCNH, telefone = source.telefone, "
                            + "celular = source.celular, login = source.login, senha = source.senha, generico = source.generico "
                            + "WHEN NOT MATCHED THEN "
                            + "INSERT (idMotorista, nome, tipoMotorista, dataContratacao, tipoDocumento, numeroDocumento, tipoCNH, vencimentoCNH, telefone, celular, login, senha, generico) "
                            + "VALUES (source.idMotorista, source.nome, source.tipoMotorista, source.dataContratacao, source.tipoDocumento, source.numeroDocumento, "
                            + "source.tipoCNH, source.vencimentoCNH, source.telefone, source.celular, source.login, source.senha, source.generico);";

                    try (PreparedStatement mergeStmt = conn.prepareStatement(mergeSql)) {
                        for (Motorista motorista : motoristas) {
                            mergeStmt.setInt(1, motorista.getIdMotorista());
                            mergeStmt.setString(2, motorista.getNome());
                            mergeStmt.setString(3, String.valueOf(motorista.getTipoMotorista()));

                            Object dataContratacaoObj = motorista.getDataContratacao();
                            java.sql.Date dataContratacao = null;

                            if (dataContratacaoObj instanceof Element) {
                                Element dataContratacaoElement = (Element) dataContratacaoObj;
                                String dataContratacaoStr = dataContratacaoElement.getTextContent();

                                SimpleDateFormat sdfInput = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                                try {
                                    java.util.Date parsedDate = sdfInput.parse(dataContratacaoStr);
                                    dataContratacao = new java.sql.Date(parsedDate.getTime());
                                } catch (Exception e) {
                                    System.err.println("Erro ao converter data de contratação: " + e.getMessage());
                                }
                            }

                            mergeStmt.setDate(4, dataContratacao);
                            mergeStmt.setString(5, String.valueOf(motorista.getTipoDocumento()));
                            mergeStmt.setString(6, motorista.getNumeroDocumento());
                            mergeStmt.setString(7, motorista.getTipoCNH());
                            Object vencimentoCNHObj = motorista.getVencimentoCNH();
                            java.sql.Date vencimentoCNH = null;

                            if (vencimentoCNHObj instanceof Element) {
                                Element vencimentoCNHElem = (Element) vencimentoCNHObj;
                                String vencimentoCNHStr = vencimentoCNHElem.getTextContent();

                                try {
                                    SimpleDateFormat sdfInput = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                                    java.util.Date parsedVencimentoDate = sdfInput.parse(vencimentoCNHStr);
                                    vencimentoCNH = new java.sql.Date(parsedVencimentoDate.getTime());
                                } catch (Exception e) {
                                    System.err.println("Erro ao converter data de vencimento da CNH: " + e.getMessage());
                                }
                            }

                            mergeStmt.setDate(8, vencimentoCNH);
                            mergeStmt.setString(9, motorista.getTelefone());
                            mergeStmt.setString(10, motorista.getCelular());
                            mergeStmt.setString(11, motorista.getLogin());
                            mergeStmt.setString(12, motorista.getSenha());
                            mergeStmt.setBoolean(13, motorista.isGenerico());

                            mergeStmt.executeUpdate();
                        }
                    }
                    System.out.println("Motoristas inseridos ou atualizados com sucesso no banco de dados.");
                } else {
                    System.out.println("Nenhum motorista encontrado.");
                }
            } catch (SQLException | SasIntegraNotification ex) {
                System.err.println("Erro ao obter motoristas ou inserir no banco de dados: " + ex.getMessage());
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
