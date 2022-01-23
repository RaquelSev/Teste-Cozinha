import java.util.ArrayList;
import java.util.Date;


public class Cozinha extends Ingrediente {

    protected int horaAbertura = 0;
    protected int horaFechamento = 0;
    protected String nomeCozinha = "";
    protected String pratoPrincipal = "";
    

    public Cozinha(String nome, Date dataValidade, int horaAbertura, int horaFechamento, String nomeCozinha,
            String pratoPrincipal) {
        super(nome, dataValidade);
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.nomeCozinha = nomeCozinha;
        this.pratoPrincipal = pratoPrincipal;

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



    public static void ListaIngrediente(ArrayList<Ingrediente> listaIngredientes) {
        listaIngredientes.add((new Ingrediente("Alho Poró", 9/12/2023)));
        listaIngredientes.add((new Ingrediente("Brócolis", 8/10/2023)));

        
    

    
}