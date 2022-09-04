package decoratorExrc.meals;

//klasa bazowa abstrakcyja z metoda do nadpisania w innych klasach
public abstract class Meal {
    public void prepareMeal(){
        System.out.println("Meal is preparing ...");
    }
}
