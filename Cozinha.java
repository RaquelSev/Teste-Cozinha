import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Cozinha extends Ingrediente {

    protected String nomeCozinha = "";
    protected int horaAbertura = 0;
    protected int horaFechamento = 0;
    protected String pratoPrincipal = "";
    protected ArrayList<Ingrediente> ingredientes;


    public Cozinha(String nomeIngrediente, Date dataValidade, String nomeCozinha, int horaAbertura, int horaFechamento,
            String pratoPrincipal, ArrayList<Ingrediente> ingredientes) {
        super(nomeIngrediente, dataValidade);
        this.nomeCozinha = nomeCozinha;
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.pratoPrincipal = pratoPrincipal;
        this.ingredientes = ingredientes;

        ArrayList<Ingrediente> listaIngredienteCozinhaMineira = new ArrayList<Ingrediente>();

        ArrayList<Ingrediente> listaIngredienteCozinhaChinesa = new ArrayList<Ingrediente>();

        listaIngredienteCozinhaChinesa.add("Feijão, Farinha, Arroz, Carne de Porco, Linguiça", 09/12/2023); 
        //faço para cada ingrediente? estou confusa
        //Mas aqui nao tem que fazer o 
        //SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy"); 
          //Date dataFormatadaValidade = formato.parse("08/02/2022");

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