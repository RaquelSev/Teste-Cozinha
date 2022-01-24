import java.time.LocalDate;
import java.util.ArrayList;


public class App {

    public static void main(String[] args) {

        ArrayList<Ingrediente> listaIngredienteCozinhaMineira = new ArrayList<Ingrediente>();

        ArrayList<Ingrediente> listaIngredienteCozinhaChinesa = new ArrayList<Ingrediente>();

        // Lista de Ingredientes Cozinha Mineira

        listaIngredienteCozinhaMineira.add(
                new Ingrediente("Feijão", LocalDate.of(2023, 3, 22)));

        listaIngredienteCozinhaMineira.add(
                new Ingrediente("Farinha", LocalDate.of(2023, 2, 04)));

        listaIngredienteCozinhaMineira.add(
                new Ingrediente("Arroz", LocalDate.of(2023, 1, 13)));

        listaIngredienteCozinhaMineira.add(
                new Ingrediente("Carne de Porco", LocalDate.of(2022, 1, 24)));

        listaIngredienteCozinhaMineira.add(
                new Ingrediente("Linguiça", LocalDate.of(2022, 1, 27)));

        // Lista de Ingredientes Cozinha Chinesa

        listaIngredienteCozinhaChinesa.add(
                new Ingrediente("Champignon", LocalDate.of(2022, 2, 02)));

        listaIngredienteCozinhaChinesa.add(
                new Ingrediente("Brócolis", LocalDate.of(2022, 1, 25)));

        listaIngredienteCozinhaChinesa.add(
                new Ingrediente("Macarrão", LocalDate.of(2023, 2, 20)));

        listaIngredienteCozinhaChinesa.add(
                new Ingrediente("Carne", LocalDate.of(2022, 1, 26)));

        Cozinha cozinhaMineira = new Cozinha("Cozinha Mineira", 14, 20, "Feijoada", listaIngredienteCozinhaMineira);

        Cozinha cozinhaChinesa = new Cozinha("Cozinha Chinesa", 10, 23, "Yakissoba", listaIngredienteCozinhaChinesa);

       System.out.println(cozinhaChinesa.contagemIngredientes());
    }
}
