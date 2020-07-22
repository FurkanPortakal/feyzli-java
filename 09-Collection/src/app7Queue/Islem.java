package app7Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * offer() --> Eleman ekleme i�levi yerine getirir. Bu i�lev basar�l� olursa 
 *   	 	  'true' basar�s�z olursa 'false' degeri dondurur.
 * add() --> Eleman ekleme i�levi yerine getirir. Eleman eklememesi durumunda
 * 			Java taraf�ndan hata firlat�r ve program durur
 * clear() --> Kuyruga eklenen t�m verileri temizler.
 * size() --> Kuyruktaki depolanan eleman sayisini verir.
 * remove() --> Depolanan eleman� 'first in first out' yap�s�na uygun olarak
 * 			kuyruktan siler.Ancak kuyrukta eleman yoksa Java taraf�ndan hata f�rlat�l�r
 * poll() -->Depolanan elemani 'first in first out' yapisina uygun olarak kuyruktan
 * 			siler. Kuyrukta herahngi bir eleman yoksa 'null' degeri d�ner.
 * element()--> Dopalanan ilk elemani dondurur. Herhangi bir eleman olmamas� durumunda 
 * 			java hata f�rlat�r.
 * peek()--> Dopalanan ilk elemani dondurur Herhangi bir eleman olmamas� durumunda 'null' degeri doner
 * isEmpty() --> Kuyrukta eleman olup olmad�g�n� kontrol eder. 
 * Eger eleman bulursa 'false' eleman bulunmuyorsa 'true' d�nd�r�r.
 */

public class Islem {

	public static void main(String[] args) {
		Queue<String> q1 = new LinkedList();
		q1.offer("a");
		q1.offer("b");
		q1.offer("c");
		q1.offer("d");
		System.out.println("q1 kuyrugunun boyu : " + q1.size());
		System.out.println("q1 kuyrugunun dep�lanan ilk eleman : " + q1.element());

		while(!q1.isEmpty()) {
			System.out.println("q1 kuyrugundaki eleman siliniyor : "+q1.poll());
		}
		
		
		System.out.println("");
		//cunku butun elemanlar� s�ld�k kral
		System.out.println("Depolanan ilk veri : "+q1.peek());
		// element kullanm�yoruz  cunku hata f�rlat�yor null dondurdugu �c�n peek tercih edilir.
		System.out.println("Depolanan ilk veri : "+q1.element());
		
	}

}
