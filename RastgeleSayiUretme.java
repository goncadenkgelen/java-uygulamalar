import java.util.Random;
import java.util.Scanner;

public class RastgeleSayiUretme {
	public static void main(String[] args) {
		Scanner okuma = new Scanner(System.in);
		Boolean anahtar = true; //oyunun yeniden ba�lat�lmas� i�in
		while (anahtar) { 
			System.out.println("0 ile 9 aras�nda bir say� giriniz: ");
			System.out.print("1.Oyuncu: ");
			Integer girilenSayi1 = okuma.nextInt();
			System.out.print("2.Oyuncu: ");
			Integer girilenSayi2 = okuma.nextInt();
			System.out.print("3.Oyuncu: ");
			Integer girilenSayi3 = okuma.nextInt();
			Random sayi = new Random();
			int uretilenSayi;
			uretilenSayi = sayi.nextInt(9);
			if (uretilenSayi == girilenSayi1 && uretilenSayi != girilenSayi2 && uretilenSayi != girilenSayi3) {
				System.out.println("1.Oyuncu DO�RU tahminde bulundu.");
				System.out.println("2. ve 3.Oyuncu YANLI� tahminde bulundu.");
			}
			else if (uretilenSayi == girilenSayi2 && uretilenSayi != girilenSayi1 && uretilenSayi != girilenSayi3) {
				System.out.println("2.Oyuncu DO�RU tahminde bulundu.");
				System.out.println("1. ve 3.Oyuncu YANLI� tahminde bulundu.");
			}
			else if (uretilenSayi == girilenSayi3 && uretilenSayi != girilenSayi1 && uretilenSayi != girilenSayi2) {
				System.out.println("3.Oyuncu DO�RU tahminde bulundu.");
				System.out.println("1. ve 2.Oyuncu YANLI� tahminde bulundu.");
			}
			else if (uretilenSayi == girilenSayi1 && uretilenSayi == girilenSayi2 && uretilenSayi != girilenSayi3) {
				System.out.println("1. ve 2.Oyuncu DO�RU tahminde bulundu.");
				System.out.println("3.Oyuncu YANLI� tahminde bulundu.");
			}
			else if (uretilenSayi == girilenSayi2 && uretilenSayi == girilenSayi3 && uretilenSayi != girilenSayi1) {
				System.out.println("1. ve 3.Oyuncu DO�RU tahminde bulundu.");
				System.out.println("2.Oyuncu YANLI� tahminde bulundu.");
			}
			else if (uretilenSayi == girilenSayi1 && uretilenSayi == girilenSayi3 && uretilenSayi != girilenSayi2) {
				System.out.println("2. ve 3.Oyuncu DO�RU tahminde bulundu.");
				System.out.println("1.Oyuncu YANLI� tahminde bulundu.");
			}
			else if (uretilenSayi != girilenSayi1 && uretilenSayi != girilenSayi2 && uretilenSayi != girilenSayi3) {
				System.out.println("B�t�n oyuncular YANLI� tahminde bulundu!");
			}
			else if (uretilenSayi == girilenSayi1 && uretilenSayi == girilenSayi2 && uretilenSayi == girilenSayi3) {
				System.out.println("B�t�n oyuncular DO�RU tahminde bulundu!");
			}
			System.out.println("Rastgelen �retilen Sayi: " +uretilenSayi);
		}
	}
}
