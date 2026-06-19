package program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		//Quando indexOf não encontra nada ele retorna -1
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println(result);
		System.out.println("---------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println(name);
		
		
		
		System.out.println("---------------------------");
		list.remove("Ana");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : list) {
			System.out.println(x);
		}
		
	}

}
