package builder;

public class Test {

	public static void main(String[] args) {
		Sandwich.Builder builder = new Sandwich.Builder("bavarska");
		
		builder.meat("pecenica").salad("zelena").meat("sunka").dressing("majonez").salad("ruska");
		
		Sandwich sandwich = builder.build();
		
		SandwichStatic sandwichStatic = SandwichStatic.Builder.meat("a").salad("b").build();

	}

}
