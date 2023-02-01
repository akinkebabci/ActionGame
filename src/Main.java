import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Player player1 = new Player("akın","Kebabcı");
       Gun Gun = new Gun(23,"glock");
       Stone stone = new Stone(12);
       player1.assaultEquipmentsAdd(Gun);
       player1.assaultEquipmentsAdd(stone);
        System.out.println(player1.getTotalEquipments());
        System.out.println(Arrays.toString(player1.getAssaultEquipments()));

    }
}