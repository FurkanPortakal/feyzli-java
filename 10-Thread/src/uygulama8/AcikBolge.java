package uygulama8;

public class AcikBolge {
	private int elma_sayisi;
	private boolean ordaM�s�n;

	public synchronized int elma_tuket() {
		while (ordaM�s�n == false) {
			try {
				wait();
			} catch (Exception e) {
			}

		}
		ordaM�s�n = false;
		notifyAll();
		return elma_sayisi;
	}

	public synchronized void elma_uret(int uretilenElma) {
		while (ordaM�s�n == true) {
			try {
				wait();
			} catch (Exception e) {
			}

		}
		elma_sayisi = uretilenElma;
		ordaM�s�n = true;
		notifyAll();

	}
}

class Uretici extends Thread {
	public AcikBolge t;

	public Uretici(AcikBolge t) {
		this.t = t;
	}

	@Override
	public synchronized void run() {
		super.run();
		for (int i = 0; i < 10; i++) {
			t.elma_uret(i);
			System.out.println("�retici-�retilen Elma Say�s�=" + i + " kg.");
		}
	}

}

class Tuketici extends Thread {
	public AcikBolge t;

	public Tuketici(AcikBolge t) {
		this.t = t;
	}

	@Override
	public void run() {
		super.run();
		int alinan_elma = 0;
		for (int i = 0; i < 10; i++) {
			alinan_elma = t.elma_tuket();
			System.out.println("T�ketici-T�ketilen Elma Say�s�=" + i + " kg.");
		}
	}

}