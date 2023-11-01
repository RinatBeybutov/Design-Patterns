package Factory.AbstractFactory;

import Factory.AbstractFactory.Cheese.Cheese;
import Factory.AbstractFactory.Cheese.MozzarellaCheese;
import Factory.AbstractFactory.Clams.Clams;
import Factory.AbstractFactory.Clams.FrozenClams;
import Factory.AbstractFactory.Dough.Dough;
import Factory.AbstractFactory.Dough.ThickCrustDough;
import Factory.AbstractFactory.Pepperoni.Pepperoni;
import Factory.AbstractFactory.Pepperoni.SlicedPepperoni;
import Factory.AbstractFactory.Sauce.PlumTomatoSauce;
import Factory.AbstractFactory.Sauce.Sauce;
import Factory.AbstractFactory.Veggies.BlackOlives;
import Factory.AbstractFactory.Veggies.Eggplant;
import Factory.AbstractFactory.Veggies.Spinach;
import Factory.AbstractFactory.Veggies.Veggies;

public class ChicagoPizzaIngredientFactory
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(),
		                      new Spinach(),
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
