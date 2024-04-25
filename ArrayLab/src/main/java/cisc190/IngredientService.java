package cisc190;

public class IngredientService {
    private Ingredient[] ingredients;
    public IngredientService(int maxNumOfIngredients) {
        ingredients = new Ingredient[maxNumOfIngredients];
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public void growArray(int numOfIngredients) throws Exception {
        // create a new array with larger size
        Ingredient[] newIngredients = new Ingredient[ingredients.length + numOfIngredients];

        // copy the old array to the new one
        for (int i = 0; i < ingredients.length; i++) {
            newIngredients[i] = ingredients[i];
        }

        // set ingredients to the new array
        setIngredients(newIngredients);
    }

    /**
     *
     * @param ingredient
     * @return the first index of the ingredient else -1 if it doesn't exist
     */
    public int getIngredientIndex(Ingredient ingredient) {
        for (int i = 0; i < ingredients.length; i++) {
            if (ingredients[i] != null && ingredients[i].equals(ingredient)) {
                return i;
            }
        }
        return -1;
    }

    public boolean containsIngredient(Ingredient ingredient) {
        // return true if the ingredients contain ingredient else false
        for(Ingredient i : ingredients) {
            if(i.equals(ingredient)) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @return an open index in the ingredients array or -1 if there is no space
     */
    public int findEmptyIndex() {
        for(int i = 0; i < ingredients.length; i++) {
            if(ingredients[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void addIngredient(Ingredient ingredient) throws Exception {
        // find an empty slot or create space for new ingredient
        int index = findEmptyIndex();
        if(index > -1) {
            ingredients[index] = ingredient;
        } else {
            growArray(5);
            ingredients[ingredients.length] = ingredient;
        }

        // TODO make sure the ingredient doesn't already exist
    }

    public void removeIngredient(Ingredient ingredient) throws Exception {
        // find the ingredient and delete it
        int index = getIngredientIndex(ingredient);
        while(index > -1) {
            ingredients[index] = null;
            index = getIngredientIndex(ingredient);
        }
    }

    public void addIngredients(Ingredient[] ingredients) throws Exception {
        // TODO add ingredients to array
    }

    public void removeIngredients(Ingredient[] ingredients) throws Exception {
        // TODO find and delete ingredients
    }
}
