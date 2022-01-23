import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Cozinha extends Ingrediente {

    protected String nomeCozinha = "";
    protected int horaAbertura = 0;
    protected int horaFechamento = 0;
    protected String pratoPrincipal = "";
    protected Ingrediente [] listaIngredientes;



    public Cozinha(String nomeIngrediente, Date dataValidade, String nomeCozinha, int horaAbertura, int horaFechamento,
            String pratoPrincipal, Ingrediente[] listaIngredientes) {
        super(nomeIngrediente, dataValidade);
        this.nomeCozinha = nomeCozinha;
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.pratoPrincipal = pratoPrincipal;
        this.listaIngredientes = listaIngredientes;

        ArrayList<Ingrediente> listaIngredientesCozinha = new ArrayList<Ingrediente>();
        
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