import java.util.Scanner;

public class Interface {
    private Scanner scanner;

    public Interface(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("File to read:");
        String file = scanner.nextLine();
        RecipeReader myRecipes = new RecipeReader(file);
        myRecipes.readTxtFile();
        Rolodex rolodex = new Rolodex(myRecipes.getRecipes());
        printCommands();

        while (true) {
            Rolodex result = null;
            System.out.println("\nEnter command:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            else if (command.equals("list")) {
                rolodex.printAllRecipes();
            }

            else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String word = scanner.nextLine();
                result = new Rolodex(rolodex.searchByName(word));
            }

            else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scanner.nextLine());
                result = new Rolodex(rolodex.searchByTime(time));
            }

            else if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                result = new Rolodex(rolodex.searchByIngredient(ingredient));
            }

            else {
                //Restart the loop due to a bad command
                System.out.println("Something went wrong. Please try agian.");
                continue;
            }

            System.out.println("\nRecipes:");

            //Only prints recipes if recipes were returned to the result
            if (result != null) {
                result.printAllRecipes();
            }

        }

    }


    public void printCommands() {
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }


}
