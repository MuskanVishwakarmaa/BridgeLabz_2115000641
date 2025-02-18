import java.util.*;

// MealPlan interface
interface MealPlan {
    String getMealName();
}

// Specific meal types implementing MealPlan
class VegetarianMeal implements MealPlan {
    private String mealName;

    public VegetarianMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public String toString() {
        return "Vegetarian Meal: " + mealName;
    }
}

class VeganMeal implements MealPlan {
    private String mealName;

    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public String toString() {
        return "Vegan Meal: " + mealName;
    }
}

class KetoMeal implements MealPlan {
    private String mealName;

    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public String toString() {
        return "Keto Meal: " + mealName;
    }
}

class HighProteinMeal implements MealPlan {
    private String mealName;

    public HighProteinMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public String toString() {
        return "High-Protein Meal: " + mealName;
    }
}

// Generic Meal class
class Meal<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();

    public void addMeal(T meal) {
        meals.add(meal);
    }

    public List<T> getMeals() {
        return meals;
    }
}

// Utility class to generate personalized meal plans
class MealPlanUtil {
    public static <T extends MealPlan> void generateMealPlan(Meal<T> meal) {
        System.out.println("Personalized Meal Plan:");
        for (T m : meal.getMeals()) {
            System.out.println(m);
        }
    }
}

public class MealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMeals = new Meal<>();
        vegetarianMeals.addMeal(new VegetarianMeal("Grilled Veggie Bowl"));
        vegetarianMeals.addMeal(new VegetarianMeal("Paneer Tikka"));

        Meal<VeganMeal> veganMeals = new Meal<>();
        veganMeals.addMeal(new VeganMeal("Tofu Stir Fry"));
        veganMeals.addMeal(new VeganMeal("Chickpea Salad"));

        System.out.println("Vegetarian Meal Plan:");
        MealPlanUtil.generateMealPlan(vegetarianMeals);
        
        System.out.println("\nVegan Meal Plan:");
        MealPlanUtil.generateMealPlan(veganMeals);
    }
}
