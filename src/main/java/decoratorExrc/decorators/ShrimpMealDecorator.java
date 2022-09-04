package decoratorExrc.decorators;

import decoratorExrc.meals.Meal;

public class ShrimpMealDecorator extends MealDecorator{
    public ShrimpMealDecorator(Meal meal) {
        super(meal);
    }
    //metoda ktora doda decorator do obiektu podstawowego
    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addShrimp();
    }
    private void addShrimp(){
        System.out.println("Shrimp is added to the dish ...");
    }
}
