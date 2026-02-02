package Ss07;

public class Bai3 {
    public static void main(String[] args) {
        double[] scores = {6.5, 8.0, 4.5};

        System.out.println("Danh sach diem: 6.5, 8.0, 4.5");
        System.out.println("\n>> Ket qua xu ly:");

        double avg = ScoreUtils.calculateAverage(scores);
        System.out.printf("- Diem trung binh ca lop: %.2f\n", avg);

        for (int i = 0; i < scores.length; i++) {
            if (ScoreUtils.checkPass(scores[i])) {
                System.out.println("- Diem " + scores[i] + ": Dat");
            } else {
                System.out.println("- Diem " + scores[i] + ": Truot");
            }
        }
    }
}
