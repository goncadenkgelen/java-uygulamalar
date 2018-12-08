// Eklenmesi gerekenler: d�ng�, kullan�c� string girdi�inde karakter hatas� //
import java.util.Scanner;

public class HesapMakinesi {
	public static void main(String[] args) {
		Scanner okuma = new Scanner(System.in);
		System.out.println("(1) Toplama ��lemi ");
		System.out.println("(2) ��karma ��lemi ");
		System.out.println("(3) �arpma ��lemi ");
		System.out.println("(4) B�lme ��lemi ");
		System.out.println("(5) Karek�k Hesapla ");
		System.out.println("(6) Cikis Yap ");
		Boolean anahtar = true;
		while (anahtar) {
		System.out.print("Yapmak istedi�iniz i�lem i�in bir numara se�in (��kmak i�in (6)) : ");
		Integer islemNumarasi = okuma.nextInt();
			if (islemNumarasi == 1) {
				topla(okuma);
			}
			else if (islemNumarasi == 2) {
				cikarma(okuma);
			}
			else if (islemNumarasi == 3) {
				carpma(okuma);
			}
			else if (islemNumarasi == 4) {
				bolme(okuma);
			}
			else if (islemNumarasi == 5) {
				karekok(okuma);
			}
			else if (islemNumarasi == 6) {
				anahtar = false;
				System.out.print("Program Sonland�r�ld�.");			
			}
			else {
				System.out.println("L�tfen yukar�da s�ralanan numaralardan birini se�iniz!");
			}
		}
	}
	
	private static void topla(Scanner okuma) {
		System.out.print("Toplama i�lemi i�in birnci say�y� giriniz: ");
		float sayi1 = okuma.nextFloat();
		System.out.print("Toplama i�lemi i�in ikinci say�y� giriniz: ");
		float sayi2 = okuma.nextFloat();
		System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1 + sayi2));
	}

	private static void cikarma(Scanner okuma) {
		System.out.print("��karma i�lemi i�in birnci say�y� giriniz: ");
		float sayi1 = okuma.nextFloat();
		System.out.print("��karma i�lemi i�in ikinci say�y� giriniz: ");
		float sayi2 = okuma.nextFloat();
		System.out.println(sayi1 + " - " + sayi2 + " = " + (sayi1 - sayi2));;
	}

	private static void carpma(Scanner okuma) {
		System.out.print("�arpma i�lemi i�in birnci say�y� giriniz: ");
		float sayi1 = okuma.nextFloat();
		System.out.print("�arpma i�lemi i�in ikinci say�y� giriniz: ");
		float sayi2 = okuma.nextFloat();
		System.out.println(sayi1 + " x " + sayi2 + " = " + (sayi1 * sayi2));
	}

	private static void bolme(Scanner okuma) {
		System.out.print("B�lme i�lemi i�in birnci say�y� giriniz: ");
		float sayi1 = okuma.nextFloat();
		System.out.print("B�lme i�lemi i�in ikinci say�y� giriniz: ");
		float sayi2 = okuma.nextFloat();
		if (sayi2 != 0) {
			System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1 / sayi2));
		}
		else {
			System.out.print("Bir say�y� s�f�ra b�lemezsiniz!");
		}
	}

	private static void karekok(Scanner okuma) {
		System.out.print("Karek�k alaca��n�z say�y� giriniz: ");
		double sayi = okuma.nextInt();
		double karekok = Math.sqrt(sayi);
		System.out.println(sayi + " 'in karek�k� = " +karekok);
	}
}
