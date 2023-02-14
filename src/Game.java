import java.util.Scanner;

public class Game {
    private final Player player1;
    private final Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int playerOneHealt = 0;
        int playerTwoHealt = 0;
        while (player1.isALive() && player2.isALive()) {

            IAssaultEquipment equipmentP1 = player1.randomAssaultEquipmentsSelecting();
            player1.showInfo();
            equipmentP1.showInfo();
            equipmentP1.damage(player2);
            System.out.println("--------------------------------------------------");


            if (!player2.isALive())   {
                player2.setHealth(0);
                break;
            }

            IAssaultEquipment equipmentP2 = player2.randomAssaultEquipmentsSelecting();
            player2.showInfo();
            equipmentP2.showInfo();
            equipmentP2.damage(player1);

            System.out.println("*******************************************************");
            if (!player1.isALive())   {
                player1.setHealth(0);
                break;
            }

            playerOneHealt = player1.getHealth();
            playerTwoHealt = player2.getHealth();
        }

        if (playerOneHealt > playerTwoHealt) {
            System.out.println("Kazanan :" +player1.getFirstName() + " " + player1.getLastName());

        } else if (playerTwoHealt > playerOneHealt) {
            System.out.println("Kazanan :" +player2.getFirstName() + " " + player2.getLastName());
        }else {
            System.out.println("BERABERE");
        }

    }

}
