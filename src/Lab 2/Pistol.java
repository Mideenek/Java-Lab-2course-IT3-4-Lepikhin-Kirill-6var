public class Pistol {
    private int ammo;

    public Pistol() {
        this.ammo = 5;
    }

    public Pistol(int ammo) {
        this.ammo = ammo;
    }

    public int getAmmo() {
        return ammo;
    }

    public void shoot() {
        if (ammo > 0) {
            System.out.println("Бах!");
            ammo--;
        } else {
            System.out.println("Клац!");
        }
    }

    @Override
    public String toString() {
        return "пистолет, патронов: " + ammo;
    }
}