import java.util.Scanner;

public class odevv2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km;
        int yas;
        int yolculukTipi;
        int indirim;
        int toplamfiyat;
        System.out.println("meseafeyi giriniz: ");
        km=input.nextInt();
        if(km>0) {
            toplamfiyat = (int) (km * 0.10);
            //System.out.println(toplamfiyat);
            System.out.println("yaşınız giriniz: ");
            yas = input.nextInt();
            if (yas < 12) {
                indirim = toplamfiyat / 2;
                toplamfiyat = toplamfiyat - indirim;
            } else if (yas > 12 && yas < 24) {
                indirim = (int) (toplamfiyat * 0.10);
                toplamfiyat = toplamfiyat - indirim;
            } else if (yas > 65) {
                indirim = (int) (toplamfiyat * 0.30);
                toplamfiyat = toplamfiyat - indirim;
            }
            System.out.println("Yolculuk tipini giriniz(Tek yon için 1, Gidis-dönüş için 2 giriniz)");
            yolculukTipi = input.nextInt();
            if (yolculukTipi == 1) {
                toplamfiyat = toplamfiyat;
            } else if (yolculukTipi == 2) {
                indirim = (int) (toplamfiyat * (0.20));
                toplamfiyat = toplamfiyat - indirim;
            } else {
                System.out.println("hatalı değer girdiniz");
            }
            System.out.println("Bilet Fiyatı: "+toplamfiyat);
        }
        else{
            System.out.println("hatalı değer girdiniz");
        }

    }
}
