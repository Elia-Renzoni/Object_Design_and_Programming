package appello6.ex;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StandardDiet implements Diet {
	private static final int MIN_CALORIES = 1500;
	private static final int MAX_CALORIES = 2000;
	
	private List<Pair<String, Map<Nutrient, Integer>>> nutrionMap;
	private double totalCalories;
	
	public StandardDiet() {
		this.nutrionMap = new LinkedList<>();
		this.totalCalories = 0.0;
	}
	
	@Override
	public void addFood(String name, Map<Nutrient, Integer> nutritionMap) {
		if (!(this.checkIfAlreadyPresent(name)))
			this.nutrionMap.add(new Pair<>(name, nutritionMap));
		else 
			throw new FoodAlreadyPresentException();
	}

	@Override
	public boolean isValid(Map<String, Double> dietMap) {
		for (var value : dietMap.entrySet()) {
			for (var values1 : this.nutrionMap) {
				if (value.getKey().equals(values1.get1())) {
					for (var val : values1.get2().entrySet()) {
						this.totalCalories += val.getValue() * (value.getValue() / 100);
					}
				}
			}
		}
		if (this.totalCalories >= StandardDiet.MIN_CALORIES && this.totalCalories <= StandardDiet.MAX_CALORIES)
			return true;
		else 
			return false;
	}
	
	private boolean checkIfAlreadyPresent(final String name) {
		return this.nutrionMap.stream()
				.map(n -> n.get1())
				.anyMatch(n -> n.equals(name));
	}

}
