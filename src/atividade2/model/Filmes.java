package atividade2.model;

/**
 * Classe que representa um filme.
 */
public class Filmes 
{
    private int id;
    private String nomeFilme;
    private String dataLancamento;
    private String categoria;
    
    /**
    * Construtor padrão da classe Filmes.
    */
    public Filmes() 
    {

    }

    /**
    * Construtor da classe Filmes com parâmetros.
    * 
    * @param id O ID do filme.
    * @param nomeFilme O nome do filme.
    * @param dataLancamento A data de lançamento do filme.
    * @param categoria A categoria do filme.
    */
    public Filmes(int id, String nomeFilme, String dataLancamento, String categoria)
    {
        this.id = id;
        this.nomeFilme = nomeFilme;
        this.dataLancamento = dataLancamento;
        this.categoria = categoria;
    }

    /**
    * Obtém o ID do filme.
    * 
    * @return O ID do filme.
    */
    public int getId()
    {
        return id;
    }

    /**
    * Define o ID do filme.
    * 
    * @param id O ID do filme.
    */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
    * Obtém o nome do filme.
    * 
    * @return O nome do filme.
    */
    public String getNomeFilme() 
    {
        return nomeFilme;
    }

    /**
    * Define o nome do filme.
    * 
    * @param nomeFilme O nome do filme.
    */
    public void setNomeFilme(String nomeFilme) 
    {
        this.nomeFilme = nomeFilme;
    }
    
    /**
    * Obtém a data de lançamento do filme.
    * 
    * @return A data de lançamento do filme.
    */
    public String getDataLancamento() 
    {
        return dataLancamento;
    }

    /**
    * Define a data de lançamento do filme.
    * 
    * @param dataLancamento A data de lançamento do filme.
    */
    public void setDataLancamento(String dataLancamento) 
    {
        this.dataLancamento = dataLancamento;
    }

    /**
     * Obtém a categora do filme.
     * 
     * @return A categoria do filme. 
     */
    public String getCategoria() 
    {
        return categoria;
    }

    /**
    * Define categoria do filme.
    * 
    * @param categoria A categoria do filme.
    */
    public void setCategoria(String categoria) 
    {
        this.categoria = categoria;
    }
}
