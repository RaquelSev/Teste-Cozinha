
import java.util.ArrayList;

public class Cozinha {

    protected String nomeCozinha = "";
    protected int horaAbertura = 0;
    protected int horaFechamento = 0;
    protected String pratoPrincipal = "";
    protected ArrayList<Ingrediente> ingredientes;

    public Cozinha(String nomeCozinha, int horaAbertura, int horaFechamento,
            String pratoPrincipal, ArrayList<Ingrediente> ingredientes) {
        this.nomeCozinha = nomeCozinha;
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.pratoPrincipal = pratoPrincipal;
        this.ingredientes = ingredientes;

    }

    // public List <Veiculo> ListaVeiculoOrdenado() {
    //     return veiculo.stream()
    //     .sorted(Comparator.comparing(veiculo -> veiculo.getAnoFabricacao())) 
    //     .collect(Collectors.toList());

    }

    // 4a etapa: Crie um método na classe Cozinha que retorne quantos ingredientes possui na Cozinha.

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