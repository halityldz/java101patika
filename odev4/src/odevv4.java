package Maths;

import java.util.Scanner;

public class odevv4 {
    public static void main(String[] args) {
        int sayi, asal ;
        Scanner giris=new Scanner(System.in);
        System.out.print("Pozitif bir sayi giriniz : ");
        sayi= giris.nextInt();

        asal=isAsal(sayi,sayi/2);

        if (asal==1){
            System.out.println(sayi+" sayisi asaldir");
        }else {
            System.out.println(sayi+" sayisi asal değildir");
        }
    }
    private static int isAsal(int sayi, int i) {
        if (i==1){
            return 1;
        }else {
            if (sayi%i==0){
                return 0;
            }
            else return isAsal(sayi,i-1);
        }
    }
}