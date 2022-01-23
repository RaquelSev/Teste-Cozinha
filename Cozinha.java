import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Cozinha extends Ingrediente {

    protected String nomeCozinha = "";
    protected int horaAbertura = 0;
    protected int horaFechamento = 0;
    protected String pratoPrincipal = "";

    ArrayList<Ingrediente> linstaIngredientes = new ArrayList<Ingrediente>();
    

    


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


   
         

        //  public void criarListaIngredientes(ArrayList<Ingrediente> listaIngredientes) throws ParseException {

        //     SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy"); 
        //     Date dataFormatadaValidade = formato.parse("08/02/2022");
    
        //     listaIngredientes.add
        
        //     ((new Ingrediente
        //     ("Alho Poró", dataFormatadaValidade)));
            
    }

   
            
}