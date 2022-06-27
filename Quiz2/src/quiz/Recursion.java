package quiz;
/**
 * This class is recursion class of gcd.
 * if m<= n and m divides n (i.e n % m = 0)
 * if n < m return gcd(m,n)
 * else return gcd(m,n%m)
 * 
 * @author hazelsoyeonahn
 *
 */

public class Recursion {
	//the recursion method
	public static int gcd(int n, int m) {
		if(n < m) {
			return gcd(m,n);
		}
		//base case of this recursion
		else if(n % m == 0) {
			return m;
		}
		else {
			return gcd(m,n % m);
		}
	}
	
	//main of this class
	public static void main(String[] args) {
		System.out.println(gcd(10,5));
		System.out.println(gcd(102,4));
		System.out.println(gcd(53,11));
	}
}
