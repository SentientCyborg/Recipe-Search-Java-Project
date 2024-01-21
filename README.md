# Recipe Search
## MOOC.FI Part 07_07

This is my solution to MOOC.Fi's 'Recipe Search' exercise at the end of [Java I](https://java-programming.mooc.fi/). 

My answer was significantly more verbose than the given answer, but I broke my code down into more classes.

The explanations are as follows:

The Recipe class represents a recipe and is fairly simple. There are methods to get the recipe's name and cooking time, as 
well as a method to check if the recipe contained a specific ingredient. A 'toString' method prints the recipe in the specific
format given by the assignment's directions.

The Rolodex class represents recipes as a group of recipes. All the functionality for searching through the recipes exists in
the rolodex. A new rolodex can be created with or without existing recipes, though there are currently no methods to add or
remove recipes from a rolodex, meaning an empty rolodex will be empty forever--I intentially did not add these features as 
they were unnecessary for the purposes of the assignment, and I don't think I ever needed to create an empty rolodex despite
having a constructor for it. 

The fileReader class is a class that takes the file name and has functionality to read the file and create recipes from it. I made 
the reader class with the idea that it could be expanded upon to read files of different types. In its present state, it only has 
functionality to read from the text file provided by the course (a method the program calls without user input) but new methods could 
be added to allow a user to read recipes from differnt file types. 

The Interface class is where a user would interact with the code. Commands from the user are executed via the rolodex, and a new
rolodex is returned, as needed. The returned recipes are then printed from the new rolodex.

RecipeSearch class is the only class provided by the course, and it started empty. As the main class, I used it to create
the scanner object and create/start the interface. The rest of the code runs from the Interface class. 

---

If I were to expand upon this program, I would add functionality to the Rolodex class to add/remove recipes, as well as update the
Interface to allow users to search the recipes they found via the first recipe search. For example, if a user searched for ingredient
"egg," two recipes are returned in a new rolodex, but there is no option to search the new rolodex for things like cooktime. Given 
there were only three "recipes" in the search file, adding further search functionality wasn't really a goal of mine. 

I would like to improve upon this code as I learn more about Java and OOP. I am posting these notes mostly as a refrence as to why I made
this program the way that I did. In the future, I would like to revisit this code and refactor/improve upon it. 