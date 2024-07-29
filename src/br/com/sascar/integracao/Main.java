package br.com.sascar.integracao;

import java.util.List;

public class Main {
    public static SasIntegraWS port;
    public static List<PacotePosicao> posicaoList = null;
    
    public static void main(String[] args) throws SasIntegraNotification{
        SasIntegraWSService service = new SasIntegraWSService();
        port = service.getSasIntegraWSPort();
        
        posicaoList = Main.port.obterPacotePosicoes("GRIFFIRODOPAR", "sascar", 300);
        posicaoList.stream().map((pos) -> {
            System.out.println("IdPacot: " + pos.getIdPacote());
            return pos;
        }).map((pos) -> {
            System.out.println("IDVeiculo: " + pos.getIdVeiculo());
            return pos;
        }).forEachOrdered((pos) -> {
            System.out.println("dataPacote: " + pos.getDataPacote());
        });
    }
}
