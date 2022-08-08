import java.util.Scanner;
public class proje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;

            boolean t = true;
            while (t){
                System.out.print("Bir sayı giriniz :");
                int x = input.nextInt();
                if((x%2 == 1))break;
                if(x%4 == 0)i+=x;
            }
        System.out.println("sayıların toplamı :"+i);


    }
}
