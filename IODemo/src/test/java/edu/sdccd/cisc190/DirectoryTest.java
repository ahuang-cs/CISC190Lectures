package edu.sdccd.cisc190;

import org.junit.jupiter.api.*;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DirectoryTest {
    Directory dir;

    private void printErrorMessageAndExit(String errorMessage) {
        System.err.println(errorMessage);
        System.exit(1);
    }
    @BeforeEach
    void setUp() {
        try {
            dir = new Directory(Main.DESTINATION_PATH);
        } catch (IOException e) {
            printErrorMessageAndExit(e.getMessage());
        }
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @Order(1)
    void create() {
        dir.create();
        assertTrue(dir.exists());
    }

    @Test
    @Order(2)
    void list() {
        assertTrue(dir.list().size() == 0);
    }

    @Test
    @Order(3)
    void copyFile() {
        File file;
        try {
            file = new File(Main.DESTINATION_PATH + "/world.txt");
            file.copyFromResourcesBuffered("hello.txt");
            assertTrue(file.exists());

            if(!file.delete()) {
                printErrorMessageAndExit("The file could not be deleted!");
            }
            assertFalse(file.exists());
        } catch (IOException e) {
            printErrorMessageAndExit(e.getMessage());
        }

    }

    @Test
    @Order(4)
    void delete() {
        dir.delete();
        assertFalse(dir.exists());
    }


}