import java.util.Scanner;

public class burclarss {
    public static void main(String[] args) {
        int month,day;
        Scanner giris=new Scanner(System.in);

        System.out.println("ay giriniz");
        month=giris.nextInt();
        System.out.println("gün giriniz");
        day=giris.nextInt();

        switch (month){
            case 1:
                if(day<22){
                    System.out.println("oğlak burcusunuz");
                }else {
                    System.out.println("kova burcusunuz");
                }
                break;
            case 2:
                if(day<20){
                    System.out.println("kova burcusunuz");
                }else {
                    System.out.println("balık burcusunuz");
                }
                break;
            case 3:
                if(day<21){
                    System.out.println("balık burcusunuz");
                }else {
                    System.out.println("koç burcusunuz");
                }
                break;
            case 4:
                if(day<21){
                    System.out.println("koç burcusunuz");
                }else {
                    System.out.println("boğa burcusunuz");
                }
                break;
            case 5:
                if(day<22){
                    System.out.println("boğa burcusunuz");
                }else {
                    System.out.println("ikizler burcusunuz");
                }
                break;
            case 6:
                if(day<23){
                    System.out.println("ikizler burcusunuz");
                }else {
                    System.out.println("yengeç burcusunuz");
                }
                break;
            case 7:
                if(day<23){
                    System.out.println("yengeç burcusunuz");
                }else {
                    System.out.println("aslan burcusunuz");
                }
                break;
            case 8:
                if(day<23){
                    System.out.println("aslan burcusunuz");
                }else {
                    System.out.println("başak burcusunuz");
                }
                break;
            case 9:
                if(day<23){
                    System.out.println("başak burcusunuz");
                }else {
                    System.out.println("terazi burcusunuz");
                }
                break;
            case 10:
                if(day<23){
                    System.out.println("terazi burcusunuz");
                }else {
                    System.out.println("akrep burcusunuz");
                }
                break;
            case 11:
                if(day<22){
                    System.out.println("akrep burcusunuz");
                }else {
                    System.out.println("yay burcusunuz");
                }
                break;
            case 12:
                if(day<22){
                    System.out.println("yay burcusunuz");
                }else {
                    System.out.println("oğlak burcusunuz");
                }
                break;

        }
    }
}
