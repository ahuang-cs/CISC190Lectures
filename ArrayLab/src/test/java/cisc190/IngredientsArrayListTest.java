package cisc190;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class IngredientsArrayListTest {
    List<Ingredient> ingredients;
    Ingredient redCarrot = new Ingredient("Red Carrot", "A red root vegetable.");

    @BeforeEach
    void setUp() {
        ingredients = new ArrayList<>();
        assertEquals(0, ingredients.size());
    }

    @Test
    void testAdd() {
        assertFalse(ingredients.contains(redCarrot));
        ingredients.add(redCarrot);
        assertTrue(ingredients.contains(redCarrot));
    }

    @Test
    void testRemove() {
        ingredients.add(redCarrot);
        Ingredient carrot = ingredients.remove(0);
        assertEquals(redCarrot, carrot);
    }
}
