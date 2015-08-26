package lesson12;
//Просуммируйте все элементы двумерного массива.
public class les12ex3 {
	public static void main(String[] args) {
	int[][] arrayA  = new int[2][2];
	int sum=0;
	for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
    			arrayA[i][j] =  (int)(Math.random() * 20);
    		    System.out.print(arrayA[i][j] + " ");
    		    sum=arrayA[i][j]+sum;
    		}; 
    		System.out.println(); 
        }
	System.out.println();
	System.out.println(sum);
}
}