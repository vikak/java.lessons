package lesson12;

public class es12ex4 {

	public static void main(String[] args) {
		// Дан двумерный массив, содержащий отрицательные и положительные числа.
		//Выведете на экран номера тех ячеек массива, которые содержат отрицательные числа.
	int[][] massiv  = new int[2][2];
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
    			massiv[i][j] = ( (int)(Math.random() * 20)-10);
    			if (massiv[i][j]<0) System.out.print("["+i+"]" +" "+"["+j+"]"+" "+massiv[i][j] + " ");
    		}; 
    		System.out.println();
    		 
        }	
	

	}

}
