package app9Map;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;

/*
TreeMap
�Map interfacesinin yan�nda ayr�ca NavigableMap Ara�y�z�n� impelement 
eder yani 
kurgular bundan dolay� Map ve Navigable Map interfacesinin metodlar�n�,
�zelliklerini vb. i�erir."descendingKeySet" ve "descendingMap" NavigableMap
s�n�f�nda tan�ml� �nemli metodlard�r.

�Anahtar-de�er mant���na g�re �al���r ve bir anahtar sadece bir de�ere 
kar��l�k kullan�labilir.

�Anahtar ile de�erleri a�a� yap�s�na uygun olarak depolan�r.�al��ma ise
 anahtara g�re do�al s�raya veya comparator taraf�ndan belirlenen 
 s�raya g�redir.

LinkedHashMap
�Map interfacesini impelement eder yani kurgular bundan dolay� Map 
interfacesinin metodlar�n�,�zelliklerini vb. i�erir.

�Anahtar-de�er mant���na g�re �al���r ve bir anahtar sadece bir de�ere 
kar��l�k kullan�labilir.

�LinkedHashMap s�n�f�,HashMap s�n�f�n�n dezavantajl� oldu�u verilerin
rastgele s�ralama �zelli�ine bir alternatif sa�lar.Dolay�s�yla
 veriler rastgele de�il ekleme s�ras�na g�re s�ralan�r

*/
public class Firma {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(3, "Hakan");
		tMap.put(9, "Sude");
		tMap.put(1, "Furkan");
		tMap.put(12, "Porti");
		
		for(Integer i : tMap.keySet()) {
			System.out.println("Numara (K) : "+i+" --> Cal��an(V) : "+tMap.get(i));
		}
		
		LinkedHashMap<Integer, String> kMap = new LinkedHashMap<Integer, String>();
		kMap.put(1, "Ocak");
		kMap.put(4, "Nisan");
		kMap.put(3, "Mart");
		kMap.put(2, "�ubat");

		for(Map.Entry<Integer,String> m2 : kMap.entrySet()) {
			System.out.println(m2.getKey()+".ay ->"+m2.getValue()+" ayina kar��l�k gelir");
		}
		
		Map<Integer, String> t2Map = new TreeMap<Integer, String>();
		
		t2Map.put(2, "a");
		t2Map.put(4, "s");
		t2Map.put(3, "c");
		System.out.println("Anahtar -->"+t2Map.keySet());
		
		
		
		
	}
}
