package soal1;
import java.util.Random;

public class Dadu {
    private int nilai;

    public int getNilai() {
        return nilai;
    }

    public void acakNilai() {
        Random nilaiRandom = new Random();
        nilai = nilaiRandom.nextInt(6) + 1;
    }
}