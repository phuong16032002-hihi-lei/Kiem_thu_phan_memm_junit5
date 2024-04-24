/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.day2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 605
 */
public class Day2Test {
    
  @Test
    public void testNegativeNumber() {
        assertEquals("negative", Day2.classify(-5));
        assertEquals("negative", Day2.classify(-10));
    }

    @Test
    public void testZero() {
        assertEquals("zero", Day2.classify(0));
    }

    @Test
    public void testPositiveNumber() {
        assertEquals("positive", Day2.classify(5));
        assertEquals("positive", Day2.classify(10));
    }
  

}
