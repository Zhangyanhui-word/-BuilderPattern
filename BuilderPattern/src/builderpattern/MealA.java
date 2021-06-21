package builderpattern;

public class MealA extends MealBuilder {
	
    public void buildDrink() {
    	meal.setDrink("¿ÉÀÖ");
    }
    public void buildFood() {
    	meal.setFood("ÊíÌõ");
    }

}
