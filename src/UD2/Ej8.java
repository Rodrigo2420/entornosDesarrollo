package UD2;

public class Ej8 {

	public static void main(String[] args) {
		boolean result = isPrime(97);
		System.out.println("¿Es primo? " + result);
		}
		

	
	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false; 
			}
		}
		return true;
		}

}
