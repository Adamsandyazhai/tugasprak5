/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author adams
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BangunRuang[] bangunRuang = new BangunRuang[2];
        bangunRuang[0] = new Balok(5, 4, 3);
        bangunRuang[1] = new Kubus(4);

        for (int i = 0; i < bangunRuang.length; i++) {
            System.out.println("Bangun Ruang " + (i + 1));
            System.out.println("Volume: " + bangunRuang[i].hitungVolume());
            System.out.println("Luas Permukaan: " + bangunRuang[i].hitungLuasPermukaan());
            System.out.println();
        }
    }
    }
    

