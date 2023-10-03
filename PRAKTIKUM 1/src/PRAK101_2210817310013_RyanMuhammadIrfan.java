import java.util.Scanner;

public class PRAK101_2210817310013_RyanMuhammadIrfan {
    public static void main(String[] args) {
        boolean inputvalid = false;
        String month_name_selected ="";

        String [] month_name = {
                "Januari", "Febuari", "Maret", "April",
                "Mei", "Juni", "Juli", "Agustus", "September",
                "Oktober", "November", "Desember"
        };

        Scanner userinput = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap: ");
        String name = userinput.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String place_of_birth = userinput.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int date_of_birth = userinput.nextInt();

        while (!inputvalid){
            System.out.print("Masukkan Bulan Lahir: ");
            int month_of_birth = userinput.nextInt();
            if (month_of_birth >=1 && month_of_birth <=12){
                inputvalid = true;
                month_name_selected = month_name[month_of_birth - 1];
            }
        }

        System.out.print("Masukkan Tahun Lahir: ");
        int year_of_birth = userinput.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int height = userinput.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        float weight = userinput.nextFloat();

        System.out.println("Nama Lengkap "+name+", Lahir di "+place_of_birth+
                " pada Tanggal "+date_of_birth+" "+month_name_selected+
                " "+year_of_birth+" Tinggi Badan "+height+
                " cm dan Berat Badan "+weight+" kilogram");
    }
}