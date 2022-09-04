package decoratorExrc.meals;

public class RiceMeal extends Meal{
    @Override
    public void prepareMeal() {
        System.out.println("Rice dish is preparing ...");
    }
}
