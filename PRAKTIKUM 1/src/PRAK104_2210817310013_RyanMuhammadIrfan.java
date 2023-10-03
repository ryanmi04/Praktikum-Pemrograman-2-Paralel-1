import java.util.Scanner;

public class PRAK104_2210817310013_RyanMuhammadIrfan {
    public static void main(String[] args) {
        int abu_point = 0;
        int bagas_point = 0;
        Scanner userinput = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String abu_round1 = userinput.next().toUpperCase();
        String abu_round2 = userinput.next().toUpperCase();
        String abu_round3 = userinput.next().toUpperCase();

        System.out.print("Tangan Bagas: ");
        String bagas_round1 = userinput.next().toUpperCase();
        String bagas_round2 = userinput.next().toUpperCase();
        String bagas_round3 = userinput.next().toUpperCase();


        if ( abu_round1.equals("B") && bagas_round1.equals("G") ||
                abu_round1.equals("G") && bagas_round1.equals("K")||
                abu_round1.equals("K") && bagas_round1.equals("B")){
            abu_point++;
        }
        else if (abu_round1.equals("G") && bagas_round1.equals("B") ||
                abu_round1.equals("K") && bagas_round1.equals("G")||
                abu_round1.equals("B") && bagas_round1.equals("K")){
            bagas_point++;
        }

        if (abu_round2.equals("B") && bagas_round2.equals("G") ||
                abu_round2.equals("G") && bagas_round2.equals("K")||
                abu_round2.equals("K") && bagas_round2.equals("B")){
            abu_point++;
        }
        else if (abu_round2.equals("G") && bagas_round2.equals("B") ||
                abu_round2.equals("K") && bagas_round2.equals("G")||
                abu_round2.equals("B") && bagas_round2.equals("K")) {
            bagas_point++;
        }

        if (abu_round3.equals("B") && bagas_round3.equals("G") ||
                abu_round3.equals("G") && bagas_round3.equals("K")||
                abu_round3.equals("K") && bagas_round3.equals("B")){
            abu_point++;
        }
        else if (abu_round3.equals("G") && bagas_round3.equals("B") ||
                abu_round3.equals("K") && bagas_round3.equals("G")||
                abu_round3.equals("B") && bagas_round3.equals("K")) {
            bagas_point++;
        }

        if (abu_point>bagas_point){
            System.out.println("Abu");
        }
        else if (bagas_point>abu_point) {
            System.out.println("Bagas");
        }
        else{
            System.out.println("Seri");
        }

    }
}