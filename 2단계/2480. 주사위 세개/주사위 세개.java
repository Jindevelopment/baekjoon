import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int prize = 0;
        if(num1==num2 && num2==num3){
            prize = 10000 + num1 * 1000;
        }else if(num1==num2){
            prize = 1000+num1*100;
        }else if(num2==num3){
            prize = 1000+num2*100;
        }else if(num1==num3){
            prize = 1000+num1*100;
        }else{
            if(num1>num2 && num1>num3){
                prize = num1 * 100;
            }
            if(num2>num1 && num2>num3){
                prize = num2 * 100;
            }
            if(num3>num1 && num3>num2){
                prize = num3 * 100;
            }
        }

        System.out.println(prize);
    }
}
