package org.course.testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.course.testing.Person;

public class PersonTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


    @Test
    public void testGetName() {
        Person instance = new Person();
        String expResult = "abc";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Persona.
     */
    @Test
    public void testSetName() {
        System.out.println("setNombre");
        String name = "";
        Person instance = new Person();
        instance.setName(name);
        
        assertEquals("", instance.getName());
    }

}