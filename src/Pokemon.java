public  class Pokemon implements IAssaultEquipment {
    private int attackPower;  //saldırı Gücü

    public Pokemon(int attackPower) {
        this.attackPower = attackPower;
    }
    @Override
    public void damage(Player enemy) {
        enemy.setHealth(enemy.getHealth()-this.attackPower);
    }

    @Override
    public void showInfo() {
        System.out.println("Pokemon " + getClass().getName());
        System.out.println("Saldırı Gücü : " + this.attackPower);
    }
}
