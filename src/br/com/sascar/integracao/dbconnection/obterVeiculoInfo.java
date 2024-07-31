package br.com.sascar.integracao.dbconnection;
import br.com.sascar.integracao.SasIntegraWS;
import br.com.sascar.integracao.Veiculo;
import br.com.sascar.integracao.SasIntegraNotification;
import br.com.sascar.integracao.SasIntegraNotification;
import br.com.sascar.integracao.SasIntegraWS;
import br.com.sascar.integracao.SasIntegraWSService;
import br.com.sascar.integracao.SasIntegraWSService;
import br.com.sascar.integracao.Veiculo;

import java.util.List;

public class obterVeiculoInfo {

    public static void main(String[] args) {
        SasIntegraWSService service = new SasIntegraWSService();
        SasIntegraWS port = service.getSasIntegraWSPort();

        String usuario = "seu usuário";
        String senha = "sua senha";
        int quantidade = 1000;

        try {
            List<Veiculo> veiculoList = port.obterVeiculos(usuario, senha, quantidade, null);
            
            if (veiculoList != null && !veiculoList.isEmpty()) {
                for (Veiculo veiculo : veiculoList) {
                    System.out.println("ID do Veículo: " + veiculo.getIdVeiculo());
                    System.out.println("Placa: " + veiculo.getPlaca());
                    System.out.println("ID do Cliente: " + veiculo.getIdCliente());
                    System.out.println("Descrição: " + veiculo.getDescricao());
                    System.out.println("ID do Equipamento: " + veiculo.getIdEquipamento());
                    System.out.println("--------------------------------------");
                }
            } else {
                System.out.println("Nenhum veículo encontrado.");
            }
        } catch (SasIntegraNotification ex) {
            System.err.println("Erro ao obter veículos: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
