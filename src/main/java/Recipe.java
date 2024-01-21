import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = ingredients;
    }

    //Checks recipe ingredients for a given ingredient
    public boolean checkIngredients(String ingredient) {
        if (this.ingredients.contains(ingredient)) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public int getCookTime() {
        return this.cookTime;
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookTime;
    }

}
