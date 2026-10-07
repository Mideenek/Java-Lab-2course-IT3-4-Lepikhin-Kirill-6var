package ru.lepikhin.weapon;

public abstract class Weapon {
    protected int ammo;

    protected Weapon() {
        this.ammo = 0;
    }

    public abstract void shoot();

    public int getAmmo() {
        return ammo;
    }

    public boolean isLoaded() {
        return ammo > 0;
    }

    @Override
    public String toString() {
        return "оружие, патронов: " + ammo;
    }
}