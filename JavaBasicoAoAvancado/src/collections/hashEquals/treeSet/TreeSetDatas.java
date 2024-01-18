package collections.hashEquals.treeSet;

import java.time.LocalDate;
import java.util.TreeSet;

public class TreeSetDatas {
	public static void main(String[] args) {
		// A ordem de inserção é feita com base do menor até o maior, serve para datas também, usando o Comparable
		
		TreeSet<LocalDate> datas = new TreeSet<LocalDate>();
		
		datas.add(LocalDate.of(2023, 1, 15));
		datas.add(LocalDate.of(2022, 12, 1));
        datas.add(LocalDate.of(2023, 5, 10));
        datas.add(LocalDate.of(2022, 9, 5));
        datas.add(LocalDate.of(2023, 3, 22));
        
        
        for(LocalDate data: datas) {
        	System.out.println(data);
        }
	}
}