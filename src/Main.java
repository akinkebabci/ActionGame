import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Akın" , "Kebabcı");
        Stone stone = new Stone(25);
        Pokemon pikachu = new Pikachu(25);
        Pokemon misty = new Misty(15);
        player1.addAssaultEquipments(stone);
        player1.addAssaultEquipments(pikachu);
        player1.addAssaultEquipments(misty);

        Player player2 = new Player("Abdullah","Yavuz");
        Pokemon pikachu2 = new Pikachu(25);
        Pokemon charizard = new Charizard(20);
        Stone stone2 = new Stone(25);
        player2.addAssaultEquipments(pikachu2);
        player2.addAssaultEquipments(charizard);
        player2.addAssaultEquipments(stone2);

        Game game = new Game(player1,player2);
        game.start();





    }
}