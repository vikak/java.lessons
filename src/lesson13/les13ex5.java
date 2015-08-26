package lesson13;
import static java.lang.Math.*;
public class les13ex5 {

	public static void main(String[] args) {
		// Даны радиус вращения и высота конуса, вычислить объем конуса.
		double h=4.0;
		double r=3.0;
		double V=(1/3.0)*PI*pow(r,2)*h;
		
		System.out.println("объем конуса=" + V);

	}

}
