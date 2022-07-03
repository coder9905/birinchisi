import java.util.Random;
import java.util.Scanner;

public class Birinchi {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Random random = new Random();

        int[][] a=new int[7][7];
        int ustun=0, satr=0, markaz=0;

//        int x=random.nextInt(50);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("a["+i+"]"+"["+j+"]=");
                a[i][j]=scanner.nextInt();
            }
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (a[i][j] == 1){
                    ustun=i;
                    satr=j;
                }
            }
        }

        markaz=Math.abs(ustun-3)+Math.abs(satr-3);

        System.out.println("Markaz="+markaz);

    }
}
