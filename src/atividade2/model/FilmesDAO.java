package atividade2.model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por manipular os dados do filme no banco de dados MySQL (CRUD).
 */
public class FilmesDAO 
{
    /**
    * CREATE -> 'C'rud
    * Realiza a operação de criar (cadastrar) um novo filme no banco de dados.
    * 
    * @param filme O objeto Filme a ser cadastrado.
    * @return true se o filme foi cadastrado com sucesso, false caso contrário.
    * @throws SQLException se ocorrer um erro durante a execução da operação SQL.
    */
    public static boolean cadastrar(Filmes filme) throws SQLException 
    {
        try
        {
            // Conexão com o banco.
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();

            // Instrução SQL que será executada.
            String sql = "INSERT INTO filmes(NomeFilme, DataLancamento, Categoria) VALUES(?,?,?);";

            // Usar a string e transformar em SQL usando PreparedStatement.
            PreparedStatement query = conexao.getConexao().prepareStatement(sql);
            query.setString(1, filme.getNomeFilme());
            query.setString(2, filme.getDataLancamento());
            query.setString(3, filme.getCategoria());


            // Executar a instrução SQL.
            query.execute();

            // Desconectar do banco.
            conexao.desconectar();
            return true;
        } 
        catch (SQLException se) 
        {
            // Trata o erro cadastrar.
            System.out.println("Erro ao cadastrar registro no banco de dados!");
            return false;
        }
    }

    /**
    * Lista todos os filmes cadastrados no banco de dados.
    * 
    * @return Uma lista contendo todos os filmes cadastrados
    */
    public static List<Filmes> listarTodos() 
    {
        // Declaração da variável lista que será retornada.
        List<Filmes> lista = new ArrayList<Filmes>();

        try 
        {
            // Conectar ao banco.
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();

            // Instrução SQL.
            String sql = "SELECT * FROM filmes";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);

            // Executar a instrução SQL e pegar os resultados.
            // ResultSet -> Classe do Java que armazena os resultados de uma QUERY (busca) feita em SQL.
            ResultSet resposta = consulta.executeQuery();

            while (resposta.next()) 
            {
                Filmes filme = new Filmes();
                filme.setId(resposta.getInt("id"));
                filme.setNomeFilme(resposta.getString("NomeFilme"));
                filme.setDataLancamento(resposta.getString("DataLancamento"));
                filme.setCategoria(resposta.getString("Categoria"));
                lista.add(filme);
            }

            // Desconectar do banco.
            conexao.desconectar();
        } 
        catch (SQLException e) 
        {
            System.out.println("Erro ao listar os registros do banco de dados!");
        }
        return lista;
    }

    /**
    * READ -> c'R'ud
    * Realiza a operação de selecionar (buscar) os dados de um filme no banco de dados MySQL a partir do nome.
    * 
    * @param NomeFilme O nome do filme a ser buscado.
    * @return Um objeto Filme contendo os dados do filme encontrado, ou um objeto Filme vazio se não encontrado.
    */
    public static Filmes buscar(String NomeFilme) 
    {
        Filmes filme = new Filmes();

        try 
        {
            // Conectar ao banco.
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();

            // Instrução SQL.
            String sql = "SELECT * FROM filmes WHERE NomeFilme=?";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            consulta.setString(1, NomeFilme);
            
            // Executar a instrução SQL.
            ResultSet resposta = consulta.executeQuery();
            
            if (resposta.next()) 
            {
                filme.setId(resposta.getInt("id"));
                filme.setNomeFilme(resposta.getString("NomeFilme"));
                filme.setDataLancamento(resposta.getString("DataLancamento"));
                filme.setCategoria(resposta.getString("Categoria"));
            }
            
            // Desconectar do banco.
            conexao.desconectar();
        }
        catch(SQLException se) 
        {
            // Trata o erro ao buscar o filme.
            System.out.println("Erro ao buscar o registro " + NomeFilme + " do banco de dados");
        }
        return filme;
    }
    
    /**
    * UPDATE -> cr'U'd
    * Realiza a operação de update (atualizar) os dados de um filme no banco de dados MySQL.
    * 
    * @param filme Os dados dos filmes a serem atualizados.
    * @return true se o filme foi atualizado com sucesso, false caso contrário.
    * @throws SQLException se ocorrer um erro durante a execução da operação SQL. 
    */
    public static boolean atualizar(Filmes filme) throws SQLException 
    {
        try 
        {
            // Conectar ao banco.
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();

            // Instrução SQL.
            String sql = "UPDATE filmes SET NomeFilme=?, DataLancamento=?, Categoria=? WHERE id=?";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);

            // Passar as informações do objeto para a consulta.
            consulta.setString(1, filme.getNomeFilme());
            consulta.setString(2, filme.getDataLancamento());
            consulta.setString(3, filme.getCategoria());
            consulta.setInt(4, filme.getId());

            // Executar a instrução.
            consulta.execute();

            // Desconectar do Banco.
            conexao.desconectar();
            return true;
        } 
        catch (SQLException e)
        {   
            // Trata o erro ao atualizar o filme.
            System.out.println("Erro ao atualizar o registro do banco de dados");
            return false;
        }
    }
    
    /**
    * DELETE -> cru'D'
    * Realiza a operação de deletar (exluir) os dados de um filme no banco de dados MySQL.
    * 
    * @param id Os dados dos filmes a apartir do ID.
    * @return true se o filme foi excluido com sucesso, false caso contrário.
    */
    public static boolean excluir(int id)
    {
        try 
        {
            // Conectar ao banco.
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();

            // Instrução SQL.
            String sql = "DELETE FROM filmes WHERE id=?";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);

            // Passar Informações do objeto para a consulta.
            consulta.setInt(1, id);

            // Executa a instrução SQL.
            consulta.execute();

            // Desconectar do banco.
            conexao.desconectar();
            return true;
        } 
        catch (SQLException se) 
        {
            // Trata o erro ao deletar o filme.
            System.out.println("Erro ao deletar registro no banco de dados!");
            return false;
        }
    }
    
    /**
    * FILTRO DINÃMICO
    * Realiza a operação de buscar o nome do filme a partir de um filtro dinânico.
    * 
    * @param NomeFilme Busca o nome do filme.
    * @return true se o filme foi ffiltrado com sucesso, nulo caso contrário.
    */
    public List<Filmes> filtrar(String NomeFilme) 
    { 
        try 
        {   
            // Conectar ao banco.
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();
        
            // LIKE nos permite pesquisar por partes de um nome, ao invés de pesquisarmos por todo nome
            String sql = "SELECT * FROM filmes WHERE NomeFilme LIKE ?";
        
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            consulta.setString(1,"%" + NomeFilme + "%"); // Conforme for a palavra ou letra digitada para pesquisa, será buscada antes, no meio e no fim
            ResultSet rs = consulta.executeQuery();            
        
            List<Filmes> lista = new ArrayList<>();
            while (rs.next()) 
            { 
                // .next retorna verdadeiro caso exista uma próxima posição dentro do array
                Filmes filme = new Filmes();
                // Salvar dentro do objeto filme as informações            
                filme.setNomeFilme(rs.getString("NomeFilme"));
                filme.setDataLancamento(rs.getString("DataLancamento"));
                filme.setCategoria(rs.getString("Categoria"));
                // Adicionando os elementos na lista criada
                lista.add(filme);                        
            }
            // Após finalizar o while, o retorno será a lista, onde cada posição é um registro do banco de dados
            return lista;
        }    
        catch (SQLException se) 
        {
            // Trata o erro ao filtrar o filme.
            System.out.println("Erro ao filtrar registro no banco de dados!");
            return null;
        }       
    }
}
