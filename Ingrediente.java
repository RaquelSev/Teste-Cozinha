import java.util.Date;
import java.util.ArrayList;


public class Ingrediente {


    protected String nome = "";
    protected Date dataValidade;
    ArrayList<Ingrediente> linstaIngredientes = new ArrayList<Ingrediente>();


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


