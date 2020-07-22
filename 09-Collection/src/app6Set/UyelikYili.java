package app6Set;

import java.util.HashSet;

/*
 * add("...") --> Eleman eklemek i�in kullan�l�r
 * clear() --> Eklenmi� olan t�m elemanlari silmek icin kullan�l�r
 * remove(int index) --> Belirtilen indexteki elemani silmek icin kullan�l�r
 * remove(Object o ) --> O olarak tan�mlanan elemani silmek icin kullan�l�r
 * size() --> Toplam eleman sayisini verir.
 */
public class UyelikYili {

	public static void main(String[] args) {
		
		HashSet<Integer> hast1 = new HashSet<Integer>();
		hast1.add(15);
		hast1.add(10);
		hast1.add(16);
		hast1.add(13);
		
		for(Integer i :hast1) {
			// ekleme s�ras�na g�re s�ralanmad�
			System.out.println("�yelik yili : "+i);
		}
		hast1.remove(13);
		System.out.println();
		System.out.println();
		for(Integer i :hast1) {
			// ekleme s�ras�na g�re s�ralanmad�
			System.out.println("�yelik yili : "+i);
		}
		
	}
}
