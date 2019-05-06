public class Bar {
	public static void main(String[] args) {
		Drink drink1 = new Drink();
		drink1.name = "Dzika Pomara�cza";
		drink1.price = 10.0;
		drink1.alcohol = true;
		drink1.ingredient1 = new Ingredients();
		drink1.ingredient1.name = "Sok pomarańczowy";
		drink1.ingredient1.amount = 0.2;
		drink1.ingredient2 = new Ingredients();
		drink1.ingredient2.name = "Sok limonowy";
		drink1.ingredient2.amount = 0.1;
		drink1.ingredient3 = new Ingredients();
		drink1.ingredient3.name = "Wódka";
		drink1.ingredient3.amount = 0.05;
		double drink1Amount = drink1.ingredient1.amount + drink1.ingredient2.amount + drink1.ingredient3.amount;

		System.out.println(drink1.name + " cena " + drink1.price + " alkohol " + drink1.alcohol + " sk�adniki :\n"
				+ drink1.ingredient1.name + " - " + drink1.ingredient1.amount + ", "
				+ drink1.ingredient2.name + " - " + drink1.ingredient2.amount + ", "
				+ drink1.ingredient3.name + " - " + drink1.ingredient3.amount);
		System.out.println("pojemność: " +drink1Amount +"\n");

		Drink drink2 = new Drink();
		drink2.name = "Dzika Banana";
		drink2.price = 15.0;
		drink2.alcohol = false;
		drink2.ingredient1 = new Ingredients();
		drink2.ingredient1.name = "Sok bananowy";
		drink2.ingredient1.amount = 0.2;
		drink2.ingredient2 = new Ingredients();
		drink2.ingredient2.name = "Sok jabłkowy";
		drink2.ingredient2.amount = 0.2;
		drink2.ingredient3 = new Ingredients();
		drink2.ingredient3.name = "Woda";
		drink2.ingredient3.amount = 0.1;
		double drink2Amount = drink2.ingredient1.amount + drink2.ingredient2.amount + drink2.ingredient3.amount;

		System.out.println(drink2.name + " " + drink2.price + " Alkohol " + drink2.alcohol + " sk�adniki :\n"
				+ drink2.ingredient1.name + " - " + drink2.ingredient1.amount + ", "
				+ drink2.ingredient2.name + " - " + drink2.ingredient2.amount + ", "
				+ drink2.ingredient3.name + " - " + drink2.ingredient3.amount);
		System.out.print("pojemność: " +drink2Amount);
	}
}
