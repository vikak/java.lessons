package lesson13;

public class les12example2 {

	public static void main(String[] args) {
		int i = 1;
		i = i++ + (( i > 2 )? i++: (i++ * i++)) + i++ ;
		System.out.println(i);
		i = 2;
		i = i++ + (( i > 2 )? i++: (i++ * i++)) + i++ ;
		System.out.println(i);

	}

}
