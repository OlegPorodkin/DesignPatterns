package generators.fabric_method.head_first;

import generators.fabric_method.head_first.pizza.*;
import generators.fabric_method.head_first.topping.NYPizzaIngredientFactory;
import generators.fabric_method.head_first.topping.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Stile Cheese pizza");
        } else if (type.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Stile Veggie pizza");
        } else if (type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Stile Clam pizza");
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Stile Pepperoni pizza");
        }
        return pizza;
    }
}
