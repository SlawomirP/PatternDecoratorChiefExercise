package decoratorExrc;

public class PatatoMeal extends Meal{
    @Override
    public void prepareMeal() {
        System.out.println("Patato dish is preparing ...");
    }
}
