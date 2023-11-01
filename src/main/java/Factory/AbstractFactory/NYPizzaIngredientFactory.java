package Factory.AbstractFactory;

import Factory.AbstractFactory.Cheese.Cheese;
import Factory.AbstractFactory.Cheese.ReggianoCheese;
import Factory.AbstractFactory.Clams.Clams;
import Factory.AbstractFactory.Clams.FreshClams;
import Factory.AbstractFactory.Dough.Dough;
import Factory.AbstractFactory.Dough.ThinCrustDough;
import Factory.AbstractFactory.Pepperoni.Pepperoni;
import Factory.AbstractFactory.Pepperoni.SlicedPepperoni;
import Factory.AbstractFactory.Sauce.MarinaraSauce;
import Factory.AbstractFactory.Sauce.Sauce;
import Factory.AbstractFactory.Veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
