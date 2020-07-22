package project2;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class PlakaTahmin {
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(1, "Adana");
		hMap.put(2, "Adiyaman");
		hMap.put(3, "Afyonkarahisar");
		hMap.put(4, "Agri");
		hMap.put(5, "Amasya");
		hMap.put(6, "Ankara");
		hMap.put(7, "Antalya");
		hMap.put(8, "Artvin");
		hMap.put(9, "Aydin");
		hMap.put(10, "Balikesir");
		hMap.put(11, "Bilecik");
		hMap.put(12, "Bingol");
		hMap.put(13, "Bitlis");
		hMap.put(14, "Bolu");
		hMap.put(15, "Burdur");
		hMap.put(16, "Bursa");
		hMap.put(17, "�anakkale");
		hMap.put(18, "�ankiri");
		hMap.put(19, "�orum");
		hMap.put(20, "Denizli");
		hMap.put(21, "Diyarbak�r");
		hMap.put(22, "Edirne");
		hMap.put(23, "Elaz��");
		hMap.put(24, "Erzincan");
		hMap.put(25, "Erzurum");
		hMap.put(26, "Eskisehir");
		hMap.put(27, "Gaziantep");
		hMap.put(28, "Giresun");
		hMap.put(29, "Gumushane");
		hMap.put(30, "Hakkari");
		hMap.put(31, "Hatay");
		hMap.put(32, "Isparta");
		hMap.put(33, "Mersin");
		hMap.put(34, "�stanbul");
		hMap.put(35, "�zmir");
		hMap.put(36, "Kars");
		hMap.put(37, "Kastamonu");
		hMap.put(38, "Kayseri");
		hMap.put(39, "Kirkareli");
		hMap.put(40, "Kirsehir");
		int hak = 3;
		String message = "�ehir Tahmin Oyununa Ho�geldiniz\n" + "Oyunumuzda toplam 3 tahmin hakk�n�z bulunmaktad�r.\n"
				+ "Plaka kodlar� 1'den 40'a kadard�r.\n" + "Oyun ba�lad�.Ba�ar�lar...";
		while (true) {
			System.out.println("");
			System.out.println(message);
			Random random = new Random();
			int plaka = 1 + random.nextInt(39);
			for (int i = hak; i > 0; i--) {
				System.out.println(plaka + " hangi �ehrimizin plakas�d�r ?");
				String sehir_tahmin = scanner.nextLine();
				if (sehir_tahmin.equals(hMap.get(plaka))) {
					String message2 = "Tebrikler �ehri do�ru tahmin ettiniz\n"
							+ "Tekrar oynamak i�in 1'e ��kmak i�in 0'a bas�n�z";
					System.out.println(message2);
					int cevap = scanner.nextInt();
					if (cevap == 0) {
						System.out.println("��k�� yap�l�yor...");
						Thread.sleep(3000);
						return;
					} else {
						break;
					}
				} else if (!sehir_tahmin.equals(hMap.get(plaka))) {
					String message3 = "Hatal� bir tahmin yapt�n�z\n" + "Kalan tahmin hakk�=" + (i - 1);
					System.out.println(message3);
					if (i == 1) {
						String message4 = "Tahmin hakk�n�z bitti\n" + "Tekrar oynamak i�in 1'e ��kmak i�in 0'a bas�n�z";
						System.out.println(message4);
						int cevap = scanner.nextInt();
						if (cevap == 0) {
							System.out.println("��k�� yap�l�yor...");
							Thread.sleep(3000);
							return;
						} else {
							break;
						}
					}
				}
			}
		}

	}
}
