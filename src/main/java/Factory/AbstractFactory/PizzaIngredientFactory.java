package Factory.AbstractFactory;

import Factory.AbstractFactory.Cheese.Cheese;
import Factory.AbstractFactory.Clams.Clams;
import Factory.AbstractFactory.Dough.Dough;
import Factory.AbstractFactory.Pepperoni.Pepperoni;
import Factory.AbstractFactory.Sauce.Sauce;
import Factory.AbstractFactory.Veggies.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
