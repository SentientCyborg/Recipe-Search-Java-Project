import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeReader {
    private String file;
    private ArrayList<Recipe> recipes;

    public RecipeReader(String file) {
        this.file = file;
        this.recipes = new ArrayList<>();
    }
    
    //Reads a txt file and adds contents to this.recipes
    //Recipes will be an empty ArrayList if reading file fails
    public void readTxtFile() {
        ArrayList<Recipe> myRecipes = new ArrayList<>();
        try (Scanner pathScanner = new Scanner(Paths.get(this.file))) {
            while (pathScanner.hasNextLine()) {
                String row = pathScanner.nextLine();
                if (row.equals("")) {
                    continue;
                }
                String name = row;
                int cookTime = Integer.valueOf(pathScanner.nextLine());
                ArrayList<String> ingredients = parseForIngredients(pathScanner);
                myRecipes.add(new Recipe(name, cookTime, ingredients));
            }
        }

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        this.recipes = myRecipes;

    }
    

    public ArrayList<Recipe> getRecipes() {
        return this.recipes;
    }

    //Collects all ingredients into an ArrayList and returns the list
    private ArrayList<String> parseForIngredients(Scanner scanner) {
        ArrayList<String> ingredients = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String ingredient = scanner.nextLine();
            if (ingredient.isEmpty()) {
                break;
            }
            ingredients.add(ingredient);
        }
        return ingredients;
    }
}
