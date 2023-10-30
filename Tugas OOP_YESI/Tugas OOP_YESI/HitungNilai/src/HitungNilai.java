public class HitungNilai {
    public static void main(String[] args) {
        System.out.print("Nama  : ");
        String nama = System.console().readLine();

        System.out.print("NIM    : ");
        String nim = System.console().readLine();

        System.out.print("Nilai Tubes : ");
        double nilaiTubes = Double.parseDouble(System.console().readLine());

        System.out.print("Nilai Quiz  : ");
        double nilaiQuiz = Double.parseDouble(System.console().readLine());

        System.out.print("Nilai Tugas : ");
        double nilaiTugas = Double.parseDouble(System.console().readLine());

        System.out.print("Nilai UTS   : ");
        double nilaiUTS = Double.parseDouble(System.console().readLine());

        System.out.print("Nilai UAS   : ");
        double nilaiUAS = Double.parseDouble(System.console().readLine());

        double totalNilai = (0.3 * nilaiTubes) + (0.1 * nilaiQuiz) + (0.1 * nilaiTugas) + (0.25 * nilaiUTS) + (0.25 * nilaiUAS);

        System.out.println("\nNilai Matakuliah Pemrograman Berorientasi Objek :");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Total Nilai : " + totalNilai);

        if (totalNilai >= 80) {
            System.out.println("Grade : A");
        } else if (totalNilai >= 70) {
            System.out.println("Grade : B");
        } else if (totalNilai >= 60) {
            System.out.println("Grade : C");
        } else if (totalNilai >= 50) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : E");
        }
    }
}
