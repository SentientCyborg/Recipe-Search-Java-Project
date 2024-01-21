import java.util.ArrayList;

//A container class to hold and search for recipes
public class Rolodex {
    private ArrayList<Recipe> recipes;

    //Create rolodex without recipes
    public Rolodex() {
        this.recipes = new ArrayList<>();
    }

    //Create rolodex with recipes
    public Rolodex(ArrayList<Recipe> myRecipes) {
        this.recipes = myRecipes;
    }

    //Search for recipes by a name/keyword
    //The recipe name is checked to see if it 'contains' the name given
    public ArrayList<Recipe> searchByName(String name) {
        ArrayList<Recipe> myRecipes = new ArrayList<>();
        for (Recipe x: this.recipes) {
            if (x.getName().contains(name)) {
                myRecipes.add(x);
            }
        }
        return myRecipes;
    }

    //Search rolodex by for recipes based on max cook time
    //Recipes with equal or shorter cook time will be returned
    public ArrayList<Recipe> searchByTime(int time) {
        ArrayList<Recipe> myRecipes = new ArrayList<>(); 
        for (Recipe x: this.recipes) {
            if (x.getCookTime() <= time) {
                myRecipes.add(x);
            }
        }
        return myRecipes;
    }

    //Search recipes by an ingredient the recipes contain
    //Returns a list of all recipes containing the searched ingredient
    public ArrayList<Recipe> searchByIngredient(String ingredient) {
        ArrayList<Recipe> myRecipes = new ArrayList<>();
        for (Recipe x: this.recipes) {
            if (x.checkIngredients(ingredient)) {
                myRecipes.add(x);
            }
        }
        return myRecipes;
    }


    //Returns all the recipes in the rolodex
    public ArrayList<Recipe> getRecipes() {
        return this.recipes;
    }

    //Prints all the recipes in the rolodex
    public void printAllRecipes() {
        for (Recipe x: this.recipes) {
            System.out.println(x);
        }
    }

}
