package ru.lepikhin.main;

import ru.lepikhin.weapon.Shooter;
import ru.lepikhin.weapon.Weapon;

public class WeaponDemo {
    public static void fireAll(Weapon... weapons) {
        for (Weapon weapon : weapons) {
            System.out.println("Стреляет: " + weapon);
            weapon.shoot();
        }
    }

    public static void shootersFire(Shooter... shooters) {
        for (Shooter shooter : shooters) {
            System.out.println("Стрелок " + shooter.getName() + " стреляет:");
            shooter.shoot();
        }
    }
}