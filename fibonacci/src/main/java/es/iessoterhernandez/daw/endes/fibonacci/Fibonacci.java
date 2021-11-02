package es.iessoterhernandez.daw.endes.fibonacci;

public class Fibonacci {
	
	public static int printFibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return printFibonacci(n - 1) + printFibonacci(n - 2);
    }
}

