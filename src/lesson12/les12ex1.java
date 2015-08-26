package lesson12;

public class les12ex1 {
//Создайте массив размерностью 5 на 6 и 
//заполните его случайными числами (в диапазоне от 0 до 99 ). 
//Выведите на консоль третью строку
	public static void main(String[] args) {
		int[][] massiv  = new int[5][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
        			massiv[i][j] =  (int)(Math.random() * 1000);
        			if (i == 3) System.out.print(massiv[i][j] + " ");
        		}; 
        		System.out.println();
        		 
            }	
       
	}

}
