public abstract class Weapon implements IAssaultEquipment {
    private int attackPower;
    private String brand;

    public Weapon(int attackPower, String brand) {
        this.attackPower = attackPower;
        this.brand = brand;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void damage(Player enemy) {
        enemy.setHealth(enemy.getHealth()-this.attackPower);

    }

    public void showInfo() {
        System.out.println("Silah ismi : " + getClass().getName());
        System.out.println("Saldırı Gücü : " + this.attackPower);
    }
}
