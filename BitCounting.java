package codewars.testing;

public class BitCounting {
	public static void main(String[] args) {
		countBits(50);
	}
	public static int countBits(int n){
		// Code to count set of bits
		int count = 0;
		while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        System.out.println(count);
        return count;
    
	}

}
