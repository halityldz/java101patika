import java.util.Scanner;

public class giris {
    public static void main(String[] args) {

        String userName,password;
        Scanner inp=new Scanner(System.in);

        System.out.println("KULLANCI ADINIZ : ");
        userName=inp.nextLine();
        System.out.println("Şifre griniz");
        password=inp.nextLine();

        if(userName.equals("patika")&&password.equals("java123")){
            System.out.println("giriş yaptınız");
        }
        else {
            System.out.println("hatalı giriş yaptınız");
        }

    }
}
