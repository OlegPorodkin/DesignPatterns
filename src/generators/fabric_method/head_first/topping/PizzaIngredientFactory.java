package generators.fabric_method.head_first.topping;

import generators.fabric_method.head_first.topping.ingredients.*;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clam createClam();
}
