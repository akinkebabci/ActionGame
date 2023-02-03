public class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {

        while (true) {

            if (player2.getHealth()>0){
                IAssaultEquipment equipmentP1 = player1.randomAssaultEquipmentsSelecting();
                player1.showInfo();
                equipmentP1.damage(player2);
            }else {
                player2.setHealth(0);
                break;
            }

            System.out.println("--------------------------------------------------");
            if (player1.getHealth()>0){
                IAssaultEquipment equipmentP2 = player2.randomAssaultEquipmentsSelecting();
                player2.showInfo();
                equipmentP2.damage(player1);
            }

            System.out.println("*******************************************************");

            if (player1.getHealth() <= 0) {
                System.out.println("Kazanan");
                player1.setHealth(0);
                player2.showInfo();
                break;
            } else if (player2.getHealth() <= 0) {
                System.out.println("Kazanan");
                player2.setHealth(0);
                player1.showInfo();
                break;
            }

        }

    }
}
