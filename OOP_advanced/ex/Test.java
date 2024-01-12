package appello6.ex;

import static appello6.ex.Diet.Nutrient.*;

import static org.junit.Assert.*;

import java.util.Map;

public class Test {

	/*
	 * Implementare l'interfaccia Diet che realizza il concetto di dieta.
	 * 
	 * Come si può vedere nel metodo fillProduct qui sotto, ad una dieta si
	 * associa innanzitutto una tabella nutrizionale. Ad esempio qui sotto si dice
	 * che la pasta (100 grammi), fornisce 280 calorie di carboidrati, 70 di proteine
	 * e 50 di grassi.
	 * 
	 * A quel punto la dieta ha un metodo per stabilire se una certa selezione di prodotti,
	 * ad esempio 200 grammi di pasta, 300 di pollo, e 200 di grana (si veda la prima assert
	 * di testStandard) è corretta rispetto alla tipologia di dieta in questione.
	 * 
	 * Vi sono poi due diete da relizzare:
	 * - StandardDiet è una dieta in cui la selezione dei prodotti è ok se 
	 * il totale delle calorie sta nel range [1500,2000]
	 * - LowCarbDiet è una dieta in cui la selezione dei prodotti è ok se 
	 *  il totale delle calorie sta nel range [1000,2000] e
	 *  i carbs totali forniscono calorie <=300
	 *  
	 * Si noti che:
	 * - 200 grammi di pasta portano 280*2=560 calorie di CARBS, 140 di PROT, 100 di FAT
	 * - 300 grammi di pollo portano 10*3=30 calorie di CARBS, 180 di PROT, 90 di FAT
	 * - 200 grammi di grana portano 0*2=0 calorie di CARBS, 400 di PROT, 400 di FAT
	 * e quindi in totale: 590 di CARBS, 720 di PROT, 540 di FAT
	 * Calcolarsi questa semplice mappa, da nutrienti a calorie complessive è probabilmente utile quindi.
	 *  
	 * La buona progettazione della soluzione, utilizzando patterns che portino a codice succinto 
	 * che evita ripetizioni concorre al raggiungimento del punteggio pieno, così come l'utlizzo di meccanismi
	 * avanzati quali lambda e stream.
	 * 
	 */
	
	
	private void fillProducts(Diet diet) {
		diet.addFood("pasta", Map.of(CARBS,280,PROTEINS,70,FAT,50)); // 400 calories overall
		diet.addFood("riso", Map.of(CARBS,250,PROTEINS,70,FAT,30));  // 350 calories overall
		diet.addFood("pollo", Map.of(CARBS,10,PROTEINS,60,FAT,30));  // 100 calories overall
		diet.addFood("insalata", Map.of(CARBS,10,PROTEINS,3,FAT,2)); // 15 calories overall
		diet.addFood("broccoli", Map.of(CARBS,20,PROTEINS,10,FAT,5));// 35 calories overall
		diet.addFood("grana", Map.of(CARBS,0,PROTEINS,200,FAT,200)); // 400 calories overall
	}
	
		
	@org.junit.Test
	public void testStandard() {
		var diet = new StandardDiet();
		this.fillProducts(diet);
		assertTrue(diet.isValid(Map.of("pasta",200.0,"pollo",300.0,"grana",200.0))); // 800+300+800 calories
		assertFalse(diet.isValid(Map.of("pasta",200.0,"pollo",300.0,"grana",50.0))); // 800+300+200 calories: too low!!
		assertFalse(diet.isValid(Map.of("pasta",300.0,"pollo",300.0,"grana",200.0,"broccoli",300.0))); // 1200+300+800+105 calories: too much!!
	}
	
	@org.junit.Test
	public void testLowCarb() {
		var diet = new LowCarbDiet();
		this.fillProducts(diet);
		assertTrue(diet.isValid(Map.of("pollo",1000.0))); // ok calories, ok carbs
		assertFalse(diet.isValid(Map.of("pasta",200.0,"pollo",300.0,"grana",200.0))); // 800+300+800 calories, too much!
		assertFalse(diet.isValid(Map.of("pasta",400.0))); // ok calories, but too much carbs
	}
	
}
