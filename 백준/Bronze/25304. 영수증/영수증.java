import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int total_price = scanner.nextInt();
        int total_count = scanner.nextInt();
        int result = 0;
        for(int i=0; i<total_count; i++){
            int price = scanner.nextInt();
            int count = scanner.nextInt();
            result += price*count;
        }
        if(result==total_price){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
