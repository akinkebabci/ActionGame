public  class Pokemon implements IAssaultEquipment {
    int attackPower;  //saldırı Gücü

    public Pokemon(int attackPower) {
        this.attackPower = attackPower;
    }

    public void inflictDamage(Player enemy) {
        enemy.setHealth(enemy.getHealth()-this.attackPower);
    }

    @Override
    public void showInfo() {
        System.out.println("Karakter : " + getClass().getName());
        System.out.println("Saldırı Gücü : " + this.attackPower);
    }
}
