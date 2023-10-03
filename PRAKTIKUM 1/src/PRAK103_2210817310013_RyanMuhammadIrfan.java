import java.util.Scanner;

public class PRAK103_2210817310013_RyanMuhammadIrfan {
    public static void main(String[] args) {
        int i = 1;
        Scanner userinput= new Scanner(System.in);
        int number1 = userinput.nextInt();
        int number2 = userinput.nextInt();

        do {
            if (number2 % 2 !=0){
                System.out.print(number2);
                if (i<number1){
                    System.out.print(", ");
                }
                i++;
            }
            number2++;
        } while (i <= number1);
    }
}