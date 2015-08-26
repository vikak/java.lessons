package lesson12;

public class les12ex2 {

	public static void main(String[] args) {
		// Даны матрицы С и D размерностью 3 на 3 и заполненные случайными числами в диапазоне  от 0 до 99. 
		//Выполните по отдельности сначала сложение, потом умножения матриц друг на друга. 
		//Выведете исходные матрицы и результат вычислений на консоль.
		int[][] arrayA  = new int[3][3];
		int[][] arrayB  = new int[3][3];
		int[][] arraySum = new int[3][3];
		int[][] arrayMultiply  = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
        			arrayA[i][j] =  (int)(Math.random() * 100);
        		    System.out.print(arrayA[i][j] + " ");
        		}; 
        		System.out.println(); 
            }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
        			arrayB[i][j] =  (int)(Math.random() * 100);
        		    System.out.print(arrayB[i][j] + " ");
        		}; 
        		System.out.println();	 
            }	
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
        			arraySum[i][j] = arrayA[i][j]+arrayB[i][j] ;
        		    System.out.print(arraySum[i][j] + " ");
        		}; 
        		System.out.println();
        		 
            }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            	 arrayMultiply[i][j] = arrayA[i][j]*arrayB[i][j] ;
        		    System.out.print( arrayMultiply[i][j] + " ");
        		}; 
        		System.out.println();
        		 
            }
	}

}
