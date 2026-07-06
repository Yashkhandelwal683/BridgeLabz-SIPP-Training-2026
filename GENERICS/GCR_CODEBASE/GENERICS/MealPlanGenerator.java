import java.util.ArrayList;
import java.util.List;

interface MealPlan {
    String getDescription();
}

class VegetarianMeal implements MealPlan {
    private String dish;

    public VegetarianMeal(String dish) {
        this.dish = dish;
    }

    public String getDescription() {
        return "Vegetarian: " + dish;
    }
}

class VeganMeal implements MealPlan {
    private String dish;

    public VeganMeal(String dish) {
        this.dish = dish;
    }

    public String getDescription() {
        return "Vegan: " + dish;
    }
}

class KetoMeal implements MealPlan {
    private String dish;

    public KetoMeal(String dish) {
        this.dish = dish;
    }

    public String getDescription() {
        return "Keto: " + dish;
    }
}

class HighProteinMeal implements MealPlan {
    private String dish;

    public HighProteinMeal(String dish) {
        this.dish = dish;
    }

    public String getDescription() {
        return "High-Protein: " + dish;
    }
}

class Meal<T extends MealPlan> {
    private String name;
    private T mealType;

    public Meal(String name, T mealType) {
        this.name = name;
        this.mealType = mealType;
    }

    public String getName() { return name; }
    public T getMealType() { return mealType; }

    public void display() {
        System.out.println("Meal Plan: " + name);
        System.out.println("Details: " + mealType.getDescription());
    }
}

public class MealPlanGenerator {
    public static <T extends MealPlan> boolean validateMeal(Meal<T> meal) {
        if (meal == null || meal.getName() == null || meal.getName().isEmpty()) {
            return false;
        }
        if (meal.getMealType() == null) {
            return false;
        }
        return true;
    }

    public static <T extends MealPlan> Meal<T> generateMealPlan(String name, T mealType) {
        Meal<T> meal = new Meal<>(name, mealType);
        if (validateMeal(meal)) {
            System.out.println("Valid meal plan generated successfully!");
            return meal;
        } else {
            System.out.println("Invalid meal plan - returning null");
            return null;
        }
    }

    public static void displayAllMealPlans(List<? extends MealPlan> mealPlans) {
        System.out.println("--- All Meal Plans ---");
        for (MealPlan mp : mealPlans) {
            System.out.println(mp.getDescription());
        }
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = generateMealPlan("Lunch", new VegetarianMeal("Vegetable Stir Fry"));
        Meal<VeganMeal> veganMeal = generateMealPlan("Breakfast", new VeganMeal("Smoothie Bowl"));
        Meal<KetoMeal> ketoMeal = generateMealPlan("Dinner", new KetoMeal("Grilled Salmon with Avocado"));
        Meal<HighProteinMeal> proteinMeal = generateMealPlan("Post-Workout", new HighProteinMeal("Chicken Breast with Quinoa"));

        System.out.println();
        vegMeal.display();
        System.out.println();
        veganMeal.display();
        System.out.println();
        ketoMeal.display();
        System.out.println();
        proteinMeal.display();

        List<MealPlan> allMeals = new ArrayList<>();
        allMeals.add(vegMeal.getMealType());
        allMeals.add(veganMeal.getMealType());
        allMeals.add(ketoMeal.getMealType());
        allMeals.add(proteinMeal.getMealType());

        System.out.println();
        displayAllMealPlans(allMeals);
    }
}
