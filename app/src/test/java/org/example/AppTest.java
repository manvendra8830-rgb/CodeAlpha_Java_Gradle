
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testProjectName() {
        assertEquals(
            "CodeAlpha Java Gradle Project",
            App.getProjectName()
        );
    }

    @Test
    void testApplicationStatus() {
        assertEquals(
            "Application is running successfully!",
            App.getStatus()
        );
    }

    @Test
    void testAddition() {
        assertEquals(30, App.add(10, 20));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-5, App.add(-2, -3));
    }

    @Test
    void testZeroAddition() {
        assertEquals(10, App.add(10, 0));
    }
}
