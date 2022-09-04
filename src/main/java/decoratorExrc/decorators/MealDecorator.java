package decoratorExrc.decorators;

import decoratorExrc.meals.Meal;
//klasa szablon dla decoratorow
public class MealDecorator extends Meal {
    protected Meal meal;
    public MealDecorator(Meal meal) {
        this.meal = meal;
    }
    @Override
    public void prepareMeal() {
        //tu wywola metode zaleznie od obiektu
        //podanego w konstruktorze
        this.meal.prepareMeal();
    }
}
