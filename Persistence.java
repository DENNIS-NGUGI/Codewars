package codewars.testing;

public class Persistence {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		persistence(12);
		
	}
	public static int persistence(long n) {
		int result = 0;
		while (n > 9) {
			long multi = 1;
			for (char t : String.valueOf(n).toCharArray()) {
				multi *= Long.parseLong(String.valueOf(t));
			}
			n = multi;
			result++;
		}
		System.out.println("Results:" + result);
		System.out.println("n:" + n);
		return result;
	}

}
