package builder;

import java.util.ArrayList;
import java.util.List;

public class SandwichStatic {
	private String bread;
	private List<String> spreads;
	private List<String> meats;
	private List<String> salads;
	private List<String> dressings;
	
	public SandwichStatic(Builder builder) {
		this.bread = builder.bread;
		this.spreads = builder.salads;
		this.meats = builder.meats;
		this.salads = builder.salads;
		this.dressings = builder.dressings;
	}
	
	
	public static class Builder{
		private static Builder builder;
		private static String bread;
		private static List<String> spreads;
		private static List<String> meats;
		private static List<String> salads;
		private static List<String> dressings;
		
		public static Builder spread(String spread) {
			builder.spreads.add(spread);
			return builder;
		}
		
		public static Builder meat(String meat) {
			builder.meats.add(meat);
			return builder;
		}
		
		public static Builder salad(String salad) {
			builder.salads.add(salad);
			return builder;
		}
		
		public static Builder dressing(String dressing) {
			builder.dressings.add(dressing);
			return builder;
		}
		
		public static SandwichStatic build() {
			return new SandwichStatic(builder);
		}
		
		
	}

}
