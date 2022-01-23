
import java.time.LocalDate;

public class Ingrediente {

    protected String nomeIngrediente = "";
    protected LocalDate dataValidade;

    public Ingrediente(String nomeIngrediente, LocalDate dataValidade) {
        this.nomeIngrediente = nomeIngrediente;
        this.dataValidade = dataValidade;
    }

    public String getNomeIngrediente() {
        return nomeIngrediente;
    }

    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

}
