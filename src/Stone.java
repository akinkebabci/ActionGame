public class Stone implements IAssaultEquipment {
    private int attackPower;

    public Stone(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public void damage(Player enemy) {
        enemy.setHealth(enemy.getHealth()-this.attackPower);




    }

    @Override
    public void showInfo() {

        System.out.println(getClass().getName());
        System.out.println("Saldırı Gücü : " + this.attackPower);
    }
}
