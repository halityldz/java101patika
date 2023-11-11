import java.util.Scanner;

public class odevv3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int enbuyuk = 0,enkucuk = 0;
        int girilecekSayi;
        System.out.println("kaç sayı gireceksiniz? ");
        girilecekSayi=input.nextInt();
        int [] dizi = new int[girilecekSayi];

        for(int i = 0; i < girilecekSayi; i++)
        {
            System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
            dizi[i] = input.nextInt();
            if(i == 0) {
                enbuyuk = dizi[i];
                enkucuk = dizi[i];
            }
            if(dizi[i] > enbuyuk) {
                enbuyuk = dizi[i];
            }
            if(dizi[i] < enkucuk) {
                enkucuk = dizi[i];
            }
        }
        System.out.println("Dizinin en büyük elemanı = " + enbuyuk);
        System.out.println("Dizinin en kucuk elemanı = " + enkucuk);
    }
}