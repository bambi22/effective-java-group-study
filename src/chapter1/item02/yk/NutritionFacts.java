package chapter1.item02.yk;

public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;

	private NutritionFacts(Builder builder){
		servingSize = builder.servingSize;
		servings 	= builder.servings;
		calories 	= builder.calories;
		fat 		= builder.fat;
		sodium 		= builder.sodium;
	}

	public static class Builder {
		// 필수 매개변수
		private final int servingSize;
		private final int servings;

		// 선택 매개변수 - 기본값으로 초기화
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;

		public Builder(int servingSize, int servings){
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val){
			calories = val;
			return this;
		}

		public Builder fat(int val){
			fat = val;
			return this;
		}

		public Builder sodium(int val){
			sodium = val;
			return this;
		}

		public NutritionFacts build(){
			return new NutritionFacts(this);
		}
	}

	@Override
	public String toString() {
		return "NutritionFacts : {servingSize = "+servingSize +"g, calories = " +calories +", fat = " +fat +", sodium = " +sodium +"}";
	}
}




