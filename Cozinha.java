
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Cozinha {

    protected String nomeCozinha = "";
    protected int horaAbertura = 0;
    protected int horaFechamento = 0;
    protected String pratoPrincipal = "";
    protected ArrayList<Ingrediente> ingredientes;
    protected int count = 0;

    public Cozinha(String nomeCozinha, int horaAbertura, int horaFechamento,
            String pratoPrincipal, ArrayList<Ingrediente> ingredientes) {
        this.nomeCozinha = nomeCozinha;
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.pratoPrincipal = pratoPrincipal;
        this.ingredientes = ingredientes;

    }

    
    public int contagemIngredientes () {

        return ingredientes.size();

    }


    public int getHoraAbertura() {
        return horaAbertura;
    }

    public void setHoraAbertura(int horaAbertura) {
        this.horaAbertura = horaAbertura;
    }

    public int getHoraFechamento() {
        return horaFechamento;
    }

    public void setHoraFechamento(int horaFechamento) {
        this.horaFechamento = horaFechamento;
    }

    public String getNomeCozinha() {
        return nomeCozinha;
    }

    public void setNomeCozinha(String nomeCozinha) {
        this.nomeCozinha = nomeCozinha;
    }

    public String getPratoPrincipal() {
        return pratoPrincipal;
    }

    public void setPratoPrincipal(String pratoPrincipal) {
        this.pratoPrincipal = pratoPrincipal;
    }

    @Override
    public String toString() {
        return "Cozinha [Hora Abertura=" + horaAbertura + ", Hora Fechamento=" + horaFechamento + ", Nome Cozinha="
                + nomeCozinha + ", Prato Principal=" + pratoPrincipal + "]";
    }

}