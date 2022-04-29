/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.redhat.knapsackoptaplanner.solver;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import org.optaplanner.core.api.score.stream.Constraint;
import org.optaplanner.core.api.score.stream.ConstraintFactory;

import com.redhat.knapsackoptaplanner.domain.Ingot;

/**
 *
 * @author Alexandre
 */
public class KnapsackConstraintProviderTest {
    
    public KnapsackConstraintProviderTest() {
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
     * Test of defineConstraints method, of class KnapsackConstraintProvider.
     */
    @Test
    public void testDefineConstraints() {
    	Ingot packages = new Ingot();
    	packages.setWeight(10);
    	packages.setSelected(true);
        ConstraintFactory constraintFactory = Mockito.mock(ConstraintFactory.class);
        KnapsackConstraintProvider instance = new KnapsackConstraintProvider();
        Constraint[] expResult = null;
        Constraint[] result = instance.defineConstraints(constraintFactory);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
