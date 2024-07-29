package br.com.sascar.integracao.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTestReturn {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:sqlserver://SERVERBD\\SQLBDSASCAR;integratedSecurity=true;encrypt=false;");
        System.out.println("Driver version: " + conn.getMetaData().getDriverVersion());
    }
}
