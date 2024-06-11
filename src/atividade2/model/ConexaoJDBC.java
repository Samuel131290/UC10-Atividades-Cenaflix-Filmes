package atividade2.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Classe responsável por estabelecer e encerrar conexões com o banco de dados MySQL.
 */
public class ConexaoJDBC 
{    
    private Connection conexao;

    /**
    * Obtém a conexão atual com o banco de dados.
    * 
    * @return A conexão com o banco de dados
    */
    public Connection getConexao() 
    {
        return conexao;
    }
    
    /**
    * Estabelece uma conexão com o banco de dados.
    */
    public void conectar() 
    {
        try 
        {
            // Carrega a classe do driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Estabelece a conexão com o banco de dados
            conexao = DriverManager.getConnection("jdbc:mysql://root@localhost/atividade2","root","1234");
            System.out.println("Conexão com DataBase efetuada com sucesso!");
        }
        catch (ClassNotFoundException e) 
        {
            // Trata erro de classe não encontrada.
            System.out.println("Falha ao carregar a classe de conexão. Classe não encontrada!");
        } 
        catch (SQLException se) 
        {
            // Trata erro de conexão SQL
            System.out.println("Falha ao conectar com o banco. Erro de SQL.");
        }
    }
    
    /**
    * Encerra a conexão com o banco de dados, se estiver aberta.
    */
    public void desconectar() 
    {
        try 
        {
            //Verifica se a conexão está aberta e a fecha
            if(conexao != null && !conexao.isClosed()) 
            {
                conexao.close();
                System.out.println("Desconectado com Sucesso!");
            }
        } 
        catch (SQLException e) 
        {   
            // Trata erro de desconexão
            System.out.println("Erro ao desconectar");
        }
    }
}
