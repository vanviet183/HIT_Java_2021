package bai3;

import java.util.Arrays;
import java.util.Random;

public class RunMain {
    public static void main(String[] args) {
        Guns DiepBeDe = new Guns("ShotGun", 100);
        Guns DoanXinhGai = new Guns("Aka-47", 100);
        Random random = new Random();
        while(true) {
            System.out.println("DiepBeDe: " + DiepBeDe.getAmmoNumber());
            System.out.println("DoanXinhGai: " + DoanXinhGai.getAmmoNumber());
            // Nạp đạn
            DiepBeDe.Load(random.nextInt(10) + 1);
            DoanXinhGai.Load(random.nextInt(10) + 1);
            // Bắn
            DiepBeDe.Shoot(random.nextInt(10) + 1);
            DoanXinhGai.Shoot(random.nextInt(10) + 1);
            if(DoanXinhGai.getAmmoNumber() == 0 || DiepBeDe.getAmmoNumber()  == 0) {
                System.out.println("===== Kết quả ====== ");
                if(DiepBeDe.getAmmoNumber() == 0 && DoanXinhGai.getAmmoNumber() != 0) {
                    System.out.println("DiepBeDe het dan");
                    System.out.println("DoanXinhGai win");
                    break;
                } else if(DoanXinhGai.getAmmoNumber() == 0 && DiepBeDe.getAmmoNumber()  != 0) {
                    System.out.println("DoanXinhGai het dan");
                    System.out.println("DiepBeDe win");
                    break;
                } else if(DiepBeDe.getAmmoNumber()  == 0 && DoanXinhGai.getAmmoNumber() == 0) {
                    System.out.println("Hoa nhau");
                    break;
                }
            }

        }
    }
}

