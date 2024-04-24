/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.day3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 605
 */
public class Day3Test {
    
    public Day3Test() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
   @Test
    public void testEquilateralTriangle() {
        assertEquals("Equilateral", Day3.checkTriangleType(3, 3, 3));
    }
    
    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles", Day3.checkTriangleType(3, 3, 4));
    }
    
    @Test
    public void testScaleneTriangle() {
        assertEquals("Scalene", Day3.checkTriangleType(3, 4, 5));
    }
    
    @Test
    public void testNotATriangle() {
        assertEquals("NotATriangle", Day3.checkTriangleType(1, 2, 4));
    }
    
    @Test
    public void testRightTriangle() {
        assertEquals("RightTriangle", Day3.checkTriangleType(3, 4, 5));
    
    }
}
