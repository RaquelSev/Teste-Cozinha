import java.util.Date;


public class Ingrediente {


    String nome = "";
    Date dataValidade;


    public Ingrediente(String nome, Date dataValidade) {
        this.nome = nome;
        this.dataValidade = dataValidade;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Date getDataValidade() {
        return dataValidade;
    }


    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
   

}


