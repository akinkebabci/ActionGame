import java.util.Random;

public class Player {
    private String firstName;
    private String lastName;
    private int health=100;
    private int totalEquipments = 0;
    private IAssaultEquipment[] assaultEquipments = new IAssaultEquipment[3];


    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
    public void addAssaultEquipments(IAssaultEquipment iAssaultEquipment) {
        if (totalEquipments <= 3) {
            assaultEquipments[totalEquipments++] = iAssaultEquipment;
        }
    }

    //Saldırı Ekipmanı rastgele üret
    public IAssaultEquipment randomAssaultEquipmentsSelecting() {

        Random random = new Random();

        int generateRandom = random.nextInt(this.totalEquipments);
        return assaultEquipments[generateRandom];
    }

    public boolean isALive(){
        return health >= 0;
    }

    //Bilgileri Gösterme
    public void showInfo() {
        System.out.println(this.firstName + " " + this.lastName);
        System.out.println("Sağlık : " + this.health);


    }

}
