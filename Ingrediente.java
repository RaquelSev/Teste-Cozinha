import java.util.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;


public class Ingrediente {


    protected String nomeIngrediente = "";
    protected Date dataValidade;
    


    public Ingrediente(String nomeIngrediente, Date dataValidade) {
        this.nomeIngrediente = nomeIngrediente;
        this.dataValidade = dataValidade;
    }


    public String getNome() {
        return nome;
    }


    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }


    public Date getDataValidade() {
        return dataValidade;
    }


    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
   

}


