package ru.lepikhin.weapon;

public class AutomaticRifle extends Pistol {
    private final int fireRate;

    public AutomaticRifle() {
        super(30);
        this.fireRate = 30;
    }

    public AutomaticRifle(int maxAmmo) {
        super(maxAmmo);

        int rate = maxAmmo / 2;

        if (rate <= 0) {
            throw new IllegalArgumentException(
                    "Скорострельность должна быть положительной, увеличь вместимость");
        }

        this.fireRate = rate;
    }

    // c) С вместимостью и скорострельностью
    public AutomaticRifle(int maxAmmo, int fireRate) {
        super(maxAmmo);

        if (fireRate <= 0) {
            throw new IllegalArgumentException(
                    "Скорострельность должна быть положительной: " + fireRate);
        }

        this.fireRate = fireRate;
    }

    public int getFireRate() {
        return fireRate;
    }

    // Один выстрел = очередь длиной в скорострельность
    @Override
    public void shoot() {
        for (int i = 0; i < fireRate; i++) {
            super.shoot();
        }
    }

    // Стрельба N секунд = N * скорострельность выстрелов
    public void shoot(int seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException(
                    "Время стрельбы не может быть отрицательным: " + seconds);
        }

        for (int i = 0; i < seconds; i++) {
            shoot();
        }
    }

    @Override
    public String toString() {
        return "автомат, скорострельность: " + fireRate
                + ", патронов: " + getAmmo() + " из " + getMaxAmmo();
    }
}