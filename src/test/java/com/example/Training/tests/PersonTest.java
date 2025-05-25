package com.example.Training.tests;

import junit.framework.TestCase;
import com.example.Training.model.*;

public class PersonTest extends TestCase {
    public void testIsAdult() {
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Alice", 15);

        assertTrue(person1.isAdult());
        assertFalse(person2.isAdult());
    }
}
