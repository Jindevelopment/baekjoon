import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int temp = scanner.nextInt();
        for(int i=0; i<(temp/4); i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
