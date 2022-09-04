package decoratorExrc.decorators;

import decoratorExrc.meals.Meal;

public class ChickenMealDecorator extends MealDecorator{

    public ChickenMealDecorator(Meal meal) {
        super(meal);
    }
    //metoda ktora doda decorator do obiektu podstawowego
    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addChicken();
    }
    private void addChicken(){
        System.out.println("Chicken is added to the dish ...");
    }
}
