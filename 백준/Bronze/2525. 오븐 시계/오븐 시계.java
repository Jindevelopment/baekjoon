import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int cook = scanner.nextInt();
        m+=cook;
        if(m>=60){
            h+=(m/60);
            m%=60;
            if(h>=24){
                h-=24;
            }
        }
        System.out.printf("%d %d",h,m);
    }
}
