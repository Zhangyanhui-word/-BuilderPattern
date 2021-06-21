package builderpattern;

public class KFCServer {
	private MealBuilder mealBuilder;
	public KFCServer(MealBuilder mealBuilder) {
		this.mealBuilder = mealBuilder;
	}
	public Meal construct() {
		mealBuilder.buildFood();
		mealBuilder.buildDrink();
		return mealBuilder.getMeal();
	}
}
