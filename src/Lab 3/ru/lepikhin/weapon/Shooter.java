package ru.lepikhin.weapon;

public class Shooter {
    private String name;
    private Weapon weapon;

    public Shooter(String name) {
        this.name = name;
        this.weapon = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void shoot() {
        if (weapon == null) {
            System.out.println("не могу участвовать в перестрелке");
        } else {
            weapon.shoot();
        }
    }

    @Override
    public String toString() {
        if (weapon == null) {
            return "стрелок " + name + ", без оружия";
        }

        return "стрелок " + name + ", оружие: " + weapon;
    }
}