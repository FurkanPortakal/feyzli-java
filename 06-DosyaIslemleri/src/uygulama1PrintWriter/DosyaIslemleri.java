package uygulama1PrintWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DosyaIslemleri {

	public static void main(String[] args)  {
			
		
			PrintWriter printWriter ; 
			//PrintWriter printWriter = null yap�p try catch d�s�ndada devamke ; 
			
			//System.out.println("Yazma i�lemi basl�yor.");
		
			try {
				printWriter = new PrintWriter("C:/Users/porrt/Desktop/Metin.txt");
				printWriter.println("Furkan");
				printWriter.println("Portakal");
				printWriter.println("Merhaba");
				printWriter.close();
				
			} catch (Exception e) {

				System.out.println("Hata : "+e.getMessage());
			}
			
			
			
		
	}
}
