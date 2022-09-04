package decoratorExrc;

import decoratorExrc.decorators.ChickenMealDecorator;
import decoratorExrc.decorators.SauceMealDecorator;
import decoratorExrc.decorators.ShrimpMealDecorator;
import decoratorExrc.meals.Meal;
import decoratorExrc.meals.PatatoMeal;
import decoratorExrc.meals.RiceMeal;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("New meal:");

        Meal riceMeal = new RiceMeal();
        riceMeal.prepareMeal();

        System.out.println("----------");

        Meal riceMealWithShrimp = new ShrimpMealDecorator(new RiceMeal());
        riceMealWithShrimp.prepareMeal();

        System.out.println("----------");

        Meal patatoMealWitchChickenAndSauce = new SauceMealDecorator(new ChickenMealDecorator(new PatatoMeal()));
        patatoMealWitchChickenAndSauce.prepareMeal();

    }
}
