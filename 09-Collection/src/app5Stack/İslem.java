package app5Stack;

import java.util.Stack;

/*
 * push   -- > Eleman eklemek icin kullan�l�r
 * peek   -- > Son eklenen eleman� d�nd�r�r.
 * pop 	  -- > Son eklenen eleman� d�nd�r�r ve siler
 * remove -- > Stack i�inde elemani siler
 * empty  -- > Stack i�inde eleman olup olmad�g�n� kontrol eder.
 * 			   Eger eleman varsa true; yoksa false dond�r�r.
*/
public class �slem {

	public static void main(String[] args) {
		Stack<String> s1 = new Stack<String>();
		 s1.push("a");
		 s1.push("b");
		 s1.push("c");
		 s1.push("d");
		 
		 for(String x : s1) {
			 System.out.println("Deger :"+ x); 
		 }
		 System.out.println();
		 System.out.println();
		 System.out.println("Son depolanan eleman : "+s1.peek());

		 System.out.println();
		 System.out.println();
		 System.out.println("Eleman cikarildi : "+s1.pop());
		 for(String x : s1) {
			 System.out.println("Deger :"+ x);
		 }
		 
	}

}