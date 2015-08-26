package lesson13;

public class les13ex1 {

	public static void main(String[] args) {
		// Дан массив целых чисел, найти среди элементов массива числа,
		//которые делятся на 3 и на 6
		int n=10;
		int intArr[] = new int[n];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] =  (int)(Math.random() * 20);
		    System.out.print(intArr[i] + " ");
		}; 
		System.out.println();
		/*
		for(int i=0; i< intArr.length; i++){
			if(intArr[i] % 3 == 0 || intArr[i] % 6 == 0){
				System.out.print(intArr[i] + " ");
			}
		}
		*/
		System.out.print("Числа массива кратные 3: ");
		for(int i=0; i< intArr.length; i++){
			if(intArr[i] % 3 == 0 ){
				System.out.print(intArr[i] + " ");
			}
		}
		System.out.println();
		System.out.print("Числа массива кратные : ");
		for(int i=0; i< intArr.length; i++){
			if(intArr[i] % 6 == 0 ){
				System.out.print(intArr[i] + " ");
			}
		}
		
	}

}
