# Connect to Database SQL Server with Java

Para conectar ao banco de dados SQL Server utilizando Java, você pode seguir os passos abaixo. Aqui está um exemplo completo de como configurar e realizar a conexão usando a biblioteca JDBC.

## Instalação do Driver JDBC:

Primeiro é necessário abrir o seu **SQL Server Configuration Manager**, e habilitar os protocolos TCP/IP se estiverem desabilitados. Caso necessário, habilite também os Endereços IP, adicionado a porta padrão 1433. 

![Untitled](Connect%20to%20Database%20SQL%20Server%20with%20Java%20a694730081914bd59b31a261d386eff2/Untitled.png)

Para realizar a integração, é necessário que a versão do JDBC seja compatível com a versão do Java no qual você esteja utilizando. Para isso acesse a aba de versões:

https://learn.microsoft.com/pt-br/sql/connect/jdbc/release-notes-for-the-jdbc-driver?view=sql-server-ver16#previous-releases

O primeiro passo é criar uma pasta **lib** dentro do repositório do seu projeto, copiar e colar o arquivo `sqljdbc42.jar` dentro desta pasta. 

Na sua IDE NetBeans, clique com o botão direito em cima do seu projeto e vá até propriedades:

![Untitled](Connect%20to%20Database%20SQL%20Server%20with%20Java%20a694730081914bd59b31a261d386eff2/Untitled%201.png)

Em **bibliotecas**, clique em “**Adicionar JAR/Pasta**” e adicione o caminho onde se encontra o seu arquivo:

![Untitled](Connect%20to%20Database%20SQL%20Server%20with%20Java%20a694730081914bd59b31a261d386eff2/Untitled%202.png)

Após isso dê Ok para salvar as informações.

O próximo passo é ir até a pasta C: e criar uma pasta chamada **sqlauth**. Abra a pasta e cole o arquivo `sqljdbc_auth.dll` que também se encontra no arquivo JDBC baixado. 

Após isso, vá novamente em sua IDE, e em Executar, ainda em propriedades, adicione -Djava.library.path="C:\sqlauth” na caixa de Opções de VM. Dê ok e prossiga.

![Untitled](Connect%20to%20Database%20SQL%20Server%20with%20Java%20a694730081914bd59b31a261d386eff2/Untitled%203.png)

Para a versão do Java 8, a versão compatível da biblioteca é a 4.2.

Para ter certeza que você tem o arquivo `sqljdbc42.jar` ou `sqljdbc41.jar` correto, execute as seguintes linhas de código. Se a saída for "**versão do driver: 4.2.6420.100**", você terá o pacote JDBC Driver 4.2.

```jsx
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author camila.aguiar
 */
public class NewClass {

    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:sqlserver://<servidor>\\<instância>;integratedSecurity=true;encrypt=false;");
        System.out.println("Driver version: " + conn.getMetaData().getDriverVersion());
    }
}

```

Conexão com o banco de dados:

```jsx

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class teste {

    public static void main(String[] args) {
        String connectionUrl
                = "jdbc:sqlserver://servidor\\instância;database=banco;integratedSecurity=true;encrypt=false;";

        try (Connection connection = DriverManager.getConnection(connectionUrl)) {
            System.out.println("Conexão bem-sucedida!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

```
