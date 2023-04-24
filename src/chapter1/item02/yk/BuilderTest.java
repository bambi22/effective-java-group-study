package chapter1.item02.yk;

public class BuilderTest {
    public static void main(String[] args) {
        //객체 설정및 호출방법 1
        NutritionFacts.Builder NutriBuilder = new NutritionFacts.Builder(240, 8);
        NutriBuilder.calories(450);
        NutriBuilder.fat(15);
        NutriBuilder.sodium(30);
        NutritionFacts item = NutriBuilder.build();

        System.out.println(item.toString());

        //객체 설정및 호출방법 2 - 플루언트 API 또는 method chaining
        NutritionFacts newItem = new NutritionFacts.Builder(500, 2).calories(700).fat(7).build();
        System.out.println(newItem.toString());
    }
}
