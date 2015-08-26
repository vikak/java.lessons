package lesson13;
import static java.lang.Math.*;
public class les13x3 {

	public static void main(String[] args) {
		// Известны катеты прямоугольного треугольника, найти его площадь и периметр
		int a=3;
		int b=2;
		double c= sqrt(pow(a,2)+pow(b,2));
		double P=a+b+c;
		double S= a * b* (1/2.d) ;
		System.out.println("c=" +c);
		System.out.println("P=" +P);
		System.out.println("S=" +S);
		

	}

}
