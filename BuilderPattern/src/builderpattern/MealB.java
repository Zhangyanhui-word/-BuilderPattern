package builderpattern;

public class MealB extends MealBuilder {
	
    public void buildDrink() {
    	meal.setDrink("���ʹ�֭");
    }
    public void buildFood() {
    	meal.setFood("����");
    }
}