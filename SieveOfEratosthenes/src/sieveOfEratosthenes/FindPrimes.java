package sieveOfEratosthenes;

	public class FindPrimes {
	
		public static void main(String[] args) {
			 
	        int i;
	        int maxNum = 100;
	        boolean isPrime = true;
	 
	        String primeNumbersFound = "";
	 
	        for (i = 1; i <= maxNum; i++) {
	            isPrime = CheckPrime(i);
	            if (isPrime) {
	                primeNumbersFound = primeNumbersFound + i + " ";
	            }
	        }
	        System.out.println("Prime numbers from 1 to " + maxNum + " are:");
	 
	        System.out.println(primeNumbersFound);
	    }
	    public static boolean CheckPrime(int number) {
	        int remainder;
	        for (int i = 2; i <= number / 2; i++) {
	            remainder = number % i;
	            //if remainder is 0 than numberCheck is not prime and break loop. Else continue loop
	            if (remainder == 0) {
	                return false;
	            }
	        }
	        return true;
	 
	    }

}
