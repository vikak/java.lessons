package lesson11;

public class les11ex1 {
	//Создайте массив из 20 случайных чисел (числа должны быть в диапазоне от 0 до 1000) 
	//и отсортируйте массив по убыванию при помощи сортировки пузырьком.
	public static void main(String[] args) {
		int arr[] = new int[20];
		for(int i = 0; i <  arr.length; i++) {
			arr[i] =  (int)(Math.random() * 1000);
			System.out.print(arr[i] + "  ");
		}
		for(int i = arr.length-1 ; i > 0 ; i--){
	        for(int j = 0 ; j < i ; j++){
	            if( arr[j] < arr[j+1] ){
	                int tmp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = tmp;
	            }
	        }
	    }
		System.out.print("\n");
		for(int i = 0; i <  arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		
	}
}
