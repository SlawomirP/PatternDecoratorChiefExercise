package decoratorExrc.decorators;

import decoratorExrc.meals.Meal;

public class SauceMealDecorator extends MealDecorator{

    public SauceMealDecorator(Meal meal) {
        super(meal);
    }
    //metoda ktora doda decorator do obiektu podstawowego
    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addSauce();
    }
    private void addSauce(){
        System.out.println("Sauce is added to the dish ...");
    }
}
