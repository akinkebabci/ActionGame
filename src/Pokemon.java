public  class Pokemon implements IAssaultEquipment {
    private int attackPower;  //saldırı Gücü

    public Pokemon(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public void damage(Player enemy) {
        if (enemy.getHealth()>0 && enemy.getHealth()<=100){
            enemy.setHealth(enemy.getHealth()-this.attackPower);
        }

    }

    @Override
    public void showInfo() {
        System.out.println("Pokemon " + getClass().getName());
        System.out.println("Saldırı Gücü : " + this.attackPower);
    }
}
