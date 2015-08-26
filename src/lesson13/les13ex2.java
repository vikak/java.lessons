package lesson13;

public class les13ex2 {

	public static void main(String[] args) {
		//Посчитать среднее арифметическое чисел в массиве
		double sum=0;
		int n=10;
		int intArr[] = new int[n];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] =  (int)(Math.random() * 20);
		    System.out.print(intArr[i] + " ");
		}; 
		System.out.println();
		for (int i = 0; i < intArr.length; i++) {
			sum +=intArr[i];
		}; 
		double div=sum/n;
		System.out.print("среднее арифметическое чисел в массиве: "+div);

	}

}
