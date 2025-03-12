import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        m-=45;
        if(m<0){
            h-=1;
            if(h<0){
                h = 23;
            }
            m+=60;
        }

        System.out.printf("%d %d",h,m);
    }
}
