package lesson12;
import java.util.*;
public class les12ex5 {

	public static void main(String[] args) {
		// Отсортируйте элементы в строках двумерного массива по возрастанию
		int[][] massiv  = new int[2][5];
	    for (int i = 0; i < 2; i++) {
	        for (int j = 0; j < 5; j++) {
	    			massiv[i][j] = ( (int)(Math.random() * 20)-10);
	    			 System.out.print(massiv[i][j] + " ");
	    		}; 
	    		System.out.println();
	    		 
	        }
	    for (int i = 0; i < massiv.length; i++) {
	    	Arrays.sort(massiv[i]);
	    }
		System.out.println();
	    for (int i = 0; i < 2; i++) {
	        for (int j = 0; j < 2; j++) {
	    			 System.out.print(massiv[i][j] + " ");
	    		}; 
	    		System.out.println();
	}
	}
}
