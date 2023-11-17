package canteen.management;

import java.util.LinkedList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<String> ingredients = new LinkedList<String>();
		ingredients.add(new String("Pasta"));
		ingredients.add(new String("Melanzane"));
		ingredients.add(new String("Pomodoro"));
		
		Dish d1 = new Dish("Pasta alla norma", 9.70, ingredients);
		
		Order<Dish> ord = new Order<>();
		ord.addProductToOrder(d1);
		System.out.println("Prezzo Totale : " + ord.engineTotalPrice());
		System.out.println(ord.getOrder());
	}
}
