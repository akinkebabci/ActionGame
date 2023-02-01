import java.util.Random;

public class Player {
    private String firstName;
    private String lastName;
    private int health;
    private int  totalEquipments= 0;
    private IAssaultEquipment[] assaultEquipments = new IAssaultEquipment[totalEquipments+2];


    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.health = 100;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getTotalEquipments() {
        return totalEquipments;
    }

    public IAssaultEquipment[] getAssaultEquipments() {
        return assaultEquipments;
    }

    public void setAssaultEquipments(IAssaultEquipment[] assaultEquipments) {
        this.assaultEquipments = assaultEquipments;
    }

    //Saldırı Ekipmanı ekle
    public void addAssaultEquipments(IAssaultEquipment iAssaultEquipment){
         assaultEquipments[totalEquipments++] = iAssaultEquipment;


    }
    //Saldırı Ekipmanı rastgele üret
    public IAssaultEquipment randomAssaultEquipmentsSelecting(){
        Random random = new Random();
        int generateRandom = random.nextInt();
        return assaultEquipments[generateRandom];



    }
    //Bilgileri Gösterme
    public void showInfo(){

    }

}
