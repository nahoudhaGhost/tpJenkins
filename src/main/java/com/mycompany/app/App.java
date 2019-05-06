package com.mycompany.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculatrice c = new Calculatrice();
        Scanner s  = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.println( "Hello World! : " + c.addition(x, y));
    }

