package lesson11;
import java.util.*;
public class les11ex2 {
//Создайте массив содержащий марки автомобилей, 
//отсортируйте его сначала по возрастанию, потом по убыванию.
	public static void main(String[] args) {
		String[] names = new String[] {"Reno","Audi", "Porshe", "Smart"}; 
		Arrays.sort(names);
		for(int i = 0; i <  names.length; i++) {
			System.out.print(names[i] + "  ");
		}
		System.out.print("\n");
		Arrays.sort(names,Collections.reverseOrder());
		for(int i = 0; i <  names.length; i++) {
			System.out.print(names[i] + "  ");
		}

	}

}
