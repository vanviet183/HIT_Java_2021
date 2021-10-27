package bai3;

import java.util.Arrays;

public class RunMain {
    public static void main(String[] args) {
        Guns DiepBeDe = new Guns("ShotGun");
        Guns DoanXinhGai = new Guns("Aka-47");

        while(true) {
            int x = (int)(Math.random() * 10 + 1);
            int y = (int)(Math.random() * 10 + 1);
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

            // Nạp đạn
            DiepBeDe.Load(y);
            DoanXinhGai.Load(x);
            // Bắn
            DiepBeDe.Shoot(x);
            DoanXinhGai.Shoot(y);
        }
    }
}

