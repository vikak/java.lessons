package lesson13;

public class les13example1 {

	public static void main(String[] args) {
		int x = 3, y = 3;
		x = x++ + ++x;
		y = --y - y--;
		System.out.println(x);
		System.out.println(y);
	
	/*	int a = 3, b = 3;
		int prefix = 15 / 3 - ++a; // итог prefix = 1 
		int postfix = 15 / 3 - b++; // итог postfix = 2
		System.out.println(prefix);
		System.out.println(postfix);*/
	}
	

}
