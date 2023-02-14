import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Akın" , "Kebabcı");
        IAssaultEquipment stone = new Stone(25);
        IAssaultEquipment pikachu = new Pikachu(25);
        IAssaultEquipment misty = new Misty(15);
        player1.addAssaultEquipments(stone);
        player1.addAssaultEquipments(pikachu);
        player1.addAssaultEquipments(misty);

        Player player2 = new Player("Abdullah","Yavuz");
        IAssaultEquipment pikachu2 = new Pikachu(25);
        IAssaultEquipment charizard = new Charizard(20);
        IAssaultEquipment stone2 = new Stone(25);
        player2.addAssaultEquipments(pikachu2);
        player2.addAssaultEquipments(charizard);
        player2.addAssaultEquipments(stone2);

        Game game = new Game(player1,player2);
        game.start();





    }
}