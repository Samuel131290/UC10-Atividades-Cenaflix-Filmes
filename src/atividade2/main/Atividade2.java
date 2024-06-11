package atividade2.main;
import java.sql.SQLException;
import atividade2.view.CadastroFilmes;

/**
 * Classe principal que inicia a aplicação de registro de filmes.
 */
public class Atividade2 
{

/**
* Método principal do programa.
* Inicializa a interface gráfica de registro de filmes.
* 
* @param args Argumentos da linha de comando (não utilizados neste programa)
* @throws SQLException se houver um erro relacionado ao banco de dados
*/    
    public static void main(String[] args) throws SQLException 
    {
        CadastroFilmes fl = new CadastroFilmes();
        fl.setVisible(true);
    }
}
