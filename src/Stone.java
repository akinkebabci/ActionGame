public class Stone implements IAssaultEquipment {
    private int attackPower;

    public Stone(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public void inflictDamage(Player enemy) { //Damage
        enemy.setHealth(enemy.getHealth()-this.attackPower);

    }

    @Override
    public void showInfo() {

        System.out.println("Silah ismi : " + getClass().getName());
        System.out.println("Saldırı Gücü : " + this.attackPower);
    }
}
