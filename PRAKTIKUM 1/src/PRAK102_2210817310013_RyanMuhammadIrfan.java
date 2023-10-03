import java.util.Scanner;

public class PRAK102_2210817310013_RyanMuhammadIrfan {
    public static void main(String[] args) {

        int i = 1;
        Scanner userinput = new Scanner(System.in);

        int number = userinput.nextInt();
        while (i<=11){
            if (number % 5 == 0){
                System.out.print(number / 5 - 1);
            }
            else {
                System.out.print(number);
            }
            if (i<11){
                System.out.print(",");
            }
            i++;
            number++;
        }
    }
}