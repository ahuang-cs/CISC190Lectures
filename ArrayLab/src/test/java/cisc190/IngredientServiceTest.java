package cisc190;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredientServiceTest {
    IngredientService service;
    Ingredient redCarrot = new Ingredient("Red Carrot", "A red root vegetable.");

    @BeforeEach
    void setUp() {
        service = new IngredientService(5);
        assertEquals(5, service.getIngredients().length);
        assertNull(service.getIngredients()[0]);
    }

    @Test
    void getIngredients() {
    }

    @Test
    void setIngredients() {
    }

    @Test
    void growArray() {
        int curLength = service.getIngredients().length;
        assertEquals(curLength, service.getIngredients().length);
        try {
            service.growArray(5);
            assertEquals(curLength + 5, service.getIngredients().length);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    @Test
    void addIngredient() {
        try {
            assertFalse(service.containsIngredient(redCarrot));
            service.addIngredient(redCarrot);
            assertTrue(service.containsIngredient(redCarrot));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    void removeIngredient() {
        try {
            service.addIngredient(redCarrot);
            assertTrue(service.containsIngredient(redCarrot));
            service.removeIngredient(redCarrot);
            assertFalse(service.containsIngredient(redCarrot));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    void addIngredients() {
    }

    @Test
    void removeIngredients() {
    }
}