public class Gun extends Weapon {
    private int ammoCount;

    public Gun(int attackPower, String brand) {
        super(attackPower, brand);
        this.ammoCount = 2;  //number of bulllets
    }

    @Override
    public void inflictDamage(Player enemy) {
        if (this.ammoCount >= 0 && this.ammoCount <= 2) {
            super.inflictDamage(enemy);
        }
        this.ammoCount--;

    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Mermi Sayısı : " + this.ammoCount);

    }
}
