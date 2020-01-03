/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.patrones.nullobject;

import java.util.Optional;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Supaada-q214
 */
public class ShapeMainTest {

    public ShapeMainTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class ShapeMain.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ShapeMain.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void optionalGetTest() {
        Shape shape = ShapeFactory.createShape("Circle");
        Optional<Shape> nonEmpty = Optional.ofNullable(shape);
        assertNotNull(nonEmpty.get());
    }

    @Test
    public void optionalGetWithNullTest() {
        Shape shape = null;
        Optional<Shape> empty = Optional.ofNullable(shape);
        empty.get();
    }

    @Test
    public void optionalOrElseTest() {
        Shape shape = ShapeFactory.createShape("Rectangle");
        Shape shape1 = ShapeFactory.createShape("Circle");
        Optional<Shape> nonEmpty = Optional.of(shape1);
        assertEquals(shape1, nonEmpty.orElse(shape));
        Optional<Shape> empty = Optional.empty();
        empty.ifPresent(circle -> circle.draw());
        assertEquals(shape, empty.orElse(shape));
    }

    @Test
    public void optionalOrElseGetTest() {
        Shape shape = ShapeFactory.createShape("Rectangle");
        Shape shape1 = ShapeFactory.createShape("Circle");
        Optional<Shape> nonEmpty = Optional.of(shape1);
        assertEquals(shape1, nonEmpty.orElseGet(() -> ShapeFactory.createShape("Rectangle")));
        Optional<Shape> empty = Optional.empty();
        empty.ifPresent(circle -> circle.draw());
        // comparing the area of the shape since orElseGet will create another instance of rectangle
        assertEquals(shape.area(), empty.orElseGet(() -> ShapeFactory.createShape("Rectangle")).area(), 0.001d);
    }

    @Test
    public void optionalOrElseThrowWithNullTest() {
        Shape shape = null;
        Optional<Shape> empty = Optional.ofNullable(shape);
        empty.orElseThrow(IllegalArgumentException::new);
    }

}
