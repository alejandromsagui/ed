package es.iessoterhernandez.daw.endes.fibonacciMain;

import java.util.Scanner;

import es.iessoterhernandez.daw.endes.fibonacci.*;

public class FibonacciMain 
{
	  public static void main( String[] args )
	    {
	    	
	    		
	    		Scanner numeros = new Scanner (System.in);
	    		
	    		System.out.print("Ingresa algún número para que se ejecute la serie: ");
	    		int maxCount = numeros.nextInt();
	    		numeros.close();
	    		
	            for (int i = 0; i <= maxCount; i++) {
	            	
	                int fibonacciNumber = Fibonacci.printFibonacci(i);
	                System.out.print(" " + fibonacciNumber);
	            }

	    	}

	    }

