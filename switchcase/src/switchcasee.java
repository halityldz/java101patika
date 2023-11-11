import java.util.Scanner;

public class switchcasee {
    public static void main(String[] args) {


        Scanner giris=new Scanner(System.in);
        System.out.println("gün gir \n");
        int day=giris.nextInt();
        switch (day){
            case 1:
                System.out.println("bugun pazartesi");
                break;
            case 2:
                System.out.println("bugun sali");
                break;
            case 3:
                System.out.println("bugun çarşamba");
                break;
            case 4:
                System.out.println("bugun perşembe");
                break;
            case 5:
                System.out.println("bugun cuma");
                break;
            case 6:
                System.out.println("bugun cumartesi");
                break;
            case 7:
                System.out.println("bugun pazar");
                break;
            default:
                System.out.println("hatalı giriş");
        }
    }
}
