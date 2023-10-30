package Week7;

import java.util.Scanner;
import Model.Layout;
import Model.Position;
import Model.Robot;

public class RobotApp {
    public static void main(String[] args) {
        new RobotApp();
    }

    private Layout layout;
    private Robot robot;
    private Scanner scanner;

    public RobotApp() {
        this.layout = new Layout(10, 10, '*');
        this.robot = new Robot('o', new Position(0, 0));
        this.scanner = new Scanner(System.in);
        String instruction = "";

        System.out.println("-------- Permainan Dimulai --------");
        do {
            draw();
            instruction = waitInstruction();
            processInstruction(instruction);
        } while (!instruction.equals("x"));
        System.out.println("-------- Permainan Selesai --------");
    }

    private String waitInstruction() {
        System.out.println("-------- Instruksi --------");
        System.out.println("Instruksi: {d=kanan/a=kiri/w=atas/s=bawah}{jumlah langkah}");
        System.out.println("Contoh: w3 berarti 'ke atas 3 langkah'");
        System.out.print("Masukan instruksi: ");
        return scanner.nextLine();
    }

    private void processInstruction(String instruction) {
        char direction = instruction.charAt(0);
        int steps = Integer.parseInt(instruction.substring(1));
        robot.move(direction, steps, layout);
    }

    private void draw() {
        System.out.println("------ Posisi Terbaru ------");

        for (int y = 0; y < layout.getMaxY(); y++) {
            for (int x = 0; x < layout.getMaxX(); x++) {
                if (robot.getPosition().getX() == x && robot.getPosition().getY() == y) {
                    System.out.print(robot.getIcon());
                } else {
                    System.out.print(layout.getIcon());
                }
            }
            System.out.println();
        }
    }
}

        /*
        Gambar layout:
        Contoh:
        - Posisi robot di 1,1
        - Area permainan luasnya 10,10
        sehingga gambar layout akan menjadi:

            o*********
            **********
            **********
            **********
            **********
            **********
            **********
            **********
            **********
            **********

            - konfigurasi (icon robot, posisi robot, luas area dan icon area permainan yang tidak ditempati robot) silahkan gunakan prinsip OOP
            - icon cukup menggunakan karakter yang ada di keyboard.
         */
