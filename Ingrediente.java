import java.util.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;


public class Ingrediente {


    protected String nome = "";
    protected Date dataValidade;
    


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


