package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswer11()
    {
        Calculatrice c = new Calculatrice();
        int x= c.addition(5,6);
        assertEquals(x,15);
	
    }
}
