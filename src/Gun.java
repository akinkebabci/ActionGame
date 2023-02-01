public class Gun extends Weapon {
    private int numberOfBullets;

    public Gun(int attackPower, String brand) {
        super(attackPower, brand);
        this.numberOfBullets = 2;
    }

    @Override
    public void damage(Player enemy) {
        if (this.numberOfBullets >= 0 && this.numberOfBullets <= 2) {
            super.damage(enemy);
        }
        this.numberOfBullets--;

    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Mermi Sayısı : " + this.numberOfBullets);

    }
}
