import java.util.Scanner;

public class Ikkinchisi {
    public static void main(String[] args) {
        {
            Scanner scanner=new Scanner(System.in);
            int n, count=0;
            double S=1,nollar=0;

            System.out.print("Son Kiriting = ");
            n=scanner.nextInt();

            for (int i = 2; i <= n; i++) {
                for (int j = 1; j < i; j++) {
                    if (i % j == 0){
                        count++;
                    }
                }
                if (count == 1){
                    if (i%10 == 2 || i%10 == 5){
                        System.out.println(i%10);
                        S=S*i;
                    }
                }
                count=0;
            }
            System.out.println("Bizda nolni 2 va 5 hosil qilgani uchun tub sonlarni ohirgi 2 va 5 bn tugaganini topib olamiz demak 2 va 5 bor holos");
            System.out.println("Tub sonlar kopaytmasi faqat bitta nol bilan tugaydi");
        }
    }
}
