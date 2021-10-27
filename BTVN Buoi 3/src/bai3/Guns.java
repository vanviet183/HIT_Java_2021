package bai3;

public class Guns {
    private String weaponName;
    private int ammoNumber = 100;

    Guns() {

    }

    Guns(String weaponName) {
        this.weaponName = weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public int getAmmoNumber() {
        return this.ammoNumber;
    }

    public void Load(int x) {
        this.ammoNumber += x;
    }

    public void Shoot(int x) {
        if (this.ammoNumber - x >= 0) {
            this.ammoNumber -= x;
        }
    }


}
