package generators.factory_method.head_first;

import generators.factory_method.head_first.pizza.*;
import generators.factory_method.head_first.topping.NYPizzaIngredientFactory;
import generators.factory_method.head_first.topping.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY Stile Cheese pizza");
        } else if (type.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NY Stile Veggie pizza");
        } else if (type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NY Stile Clam pizza");
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("NY Stile Pepperoni pizza");
        }
        return pizza;
    }
}
