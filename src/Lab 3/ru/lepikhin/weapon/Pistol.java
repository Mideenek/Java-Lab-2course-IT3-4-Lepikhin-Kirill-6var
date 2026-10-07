package ru.lepikhin.weapon;

public class Pistol extends Weapon {
    private final int maxAmmo;

    public Pistol() {
        this.maxAmmo = 5;
        this.ammo = 5;
    }

    public Pistol(int maxAmmo) {
        if (maxAmmo < 0) {
            throw new IllegalArgumentException("Вместимость не может быть отрицательной: " + maxAmmo);
        }
        this.maxAmmo = maxAmmo;
        this.ammo = 0;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    @Override
    public void shoot() {
        if (ammo > 0) {
            System.out.println("Бах!");
            ammo--;
        } else {
            System.out.println("Клац!");
        }
    }

    public int reload(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Отрицательного числа патронов быть не может");
        }

        int free = maxAmmo - ammo;

        if (count > free) {
            int extra = count - free;
            ammo = maxAmmo;
            return extra;
        }

        ammo += count;
        return 0;
    }


    public int unload() {
        int removed = ammo;
        ammo = 0;
        return removed;
    }

    @Override
    public String toString() {
        return "пистолет, патронов: " + ammo + " из " + maxAmmo;
    }
}