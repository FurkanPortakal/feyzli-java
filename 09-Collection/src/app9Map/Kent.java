package app9Map;
/*
 * put() : Anahtar/Key ve Deger/Value ekleme i�levi yerine getirir.
 * get(key) : Anahtara kar��l�k gelen degeri d�nd�r�r.
 * remove() : Anahtara veya degere kar��l�k gelen veriyi siler.
 * size() : Map i�erisinde depolanan anahtar ve degerlerin sayisini d�ner
 * clear() : Map i�erisinde depolanan t�m verileri siler.
 * containsKey(key) : Depolanan veri i�erisinde anahtar aramay� saglar.
 * Eger anahtar varsa 'true' yoksa 'false' d�ner.
 * 
 * HashMap<K,V> 
 * - Map s�n�f�n�n bir temel ozelli�i olarak generic olarak tan�mlanm�st�r.
 * Bu sayede farkl� veri tiplerinde farkl� islemler yap�labilir.
 * Ayrica veriler anahtar deger ili�kisine g�re depolan�r
 * 
 *-	Ayni anahtar tan�m� sadece bir kez yapabilmesine kars�n ayn� deger birden 
 *	fazla kez depolanabilir.
 *
 *- Elemanlar bellekte rastgele depolan�r.
 * */

import java.util.HashMap;
import java.util.Map;

public class Kent {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(34, "�stanbul");
		hashMap.put(01, "Adana");
		hashMap.put(78, "Karab�k");
		hashMap.put(16, "Bursa");
		hashMap.put(15, "Burdur");
		hashMap.put(06, "Ankara");
		hashMap.put(36, "Kars");

		for (Integer i : hashMap.keySet()) {
			System.out.println("Plaka(K) : " + i + "->" + " Kent(V) " + hashMap.get(i));
		}

		hashMap.remove(36);
		System.out.println(" ");
		System.out.println("Kentler : " + hashMap);
		System.out.println(" ");
		hashMap.put(34, "Edirne");
		System.out.println("Kentler : " + hashMap);
		System.out.println(" ");
		System.out.println("Kars depoland� mi ? " + hashMap.containsKey(36));

		System.out.println();
		for (Map.Entry<Integer, String> m2 : hashMap.entrySet()) {
			System.out.println("Plaka(K) : "+ m2.getKey()+"  -> "+"Kent(V) : "+m2.getValue());
		}

	}
}
