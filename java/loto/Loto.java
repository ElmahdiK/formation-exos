package loto;

import java.util.ArrayList;
import java.util.List;

public class Loto {
	// int [] lotoNumbers = { 10, 20, 40 };
	List<Integer> lotoNumbers = new ArrayList<Integer>();
	List<Integer> lotoNumbers2 = List.of(10,20,45);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loto loto = new Loto();
		loto.lotoNumbers.add(10);
		loto.lotoNumbers.add(20);
		loto.lotoNumbers.add(40);

		// while
		System.out.println("\nwhile :");
		int i = 0;
		while (i < loto.lotoNumbers.size()) {
			System.out.println(loto.lotoNumbers.get(i));
			i++;
		}

		// for
		System.out.println("\nfor :");
		for (i = 0; i < loto.lotoNumbers.size(); i++) {
			System.out.println(loto.lotoNumbers.get(i));
		}

		// for each
		System.out.println("\nfor each :");
		for (int lotoNumber : loto.lotoNumbers) {
			System.out.println(lotoNumber);
		}

		// for each method
		System.out.println("\nfor each method :");
		loto.lotoNumbers2.forEach(lotoNumber -> System.out.println(lotoNumber));
	}
}
