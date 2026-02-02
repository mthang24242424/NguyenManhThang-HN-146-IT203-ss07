package Ss07;

public class Bai5 {
    public static void main(String[] args) {
        double score = 8.5;

        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Diem hop le: " + score);
        } else {
            System.out.println("Diem khong hop le");
        }

        System.out.println("MAX_SCORE = " + Config.MAX_SCORE);
        System.out.println("MIN_SCORE = " + Config.MIN_SCORE);

    }
}
