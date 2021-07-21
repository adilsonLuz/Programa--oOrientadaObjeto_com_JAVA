/**
 * Classe criada para gerar mercadorias vendidos em uma loja de roupa
 * @author Adilson Luz
 * @since Classe Criada em 20/05/2021, 10:26:47
 */
public class Produto {
    private int codigo;
    private String descricao;
    private float preco;

    public Produto(int codigo, String descricao, float preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}//fim da classe
