import java.util.Random;

public class WarriorFred {

    private String nickName;
    private int lifeForce = 10;
    private int damage;
//array lists for the class
    String[] armory = {"Exploding Pumpkin", "Candy Corn", "Paper Bag"};
    String[] name = {"Fred", "Jerry", "Tom","George", "Berry Allen"};
    Random rand = new Random();

    public void reSpawn() {
        lifeForce = 10;
    }

    //Setters for class WarriorFred
    public void setDamage(){
        Random number = new Random();
        int damageNum = number.nextInt(10) + 1;
        this.damage = damageNum;
    }
    public void setNickName() {
        int index = rand.nextInt(name.length);
        this.nickName = name[index];
    }
    //getters for the class
    public int getLifeForce(){
        return lifeForce;
    }
    public int getDamage(){
        return damage;
    }
    public String getNickName() {
        return nickName;
    }

    public void takeDamage(int n) {
        damage += n;
        if (damage >= 10) {
            lifeForce--;
            damage = 0;
        }
    }

    public void reaction() {
        Random r = new Random();
        String[] sound = {"OW!", "Wham!", "POW!", "Boffo!!", "KaPow!", "That one hurt!"};
        System.out.println(sound[r.nextInt(sound.length)]);
    }

    public boolean isDead() {
        if (lifeForce <= 0) return true;
        else return false;
    }

    public boolean isAlive() {
        if (lifeForce > 0) return true;
        else return false;
    }



    //print Info method
    public void printInfo() {
        System.out.println("Nick Name:" + getNickName());
        System.out.println("Life Force:" + getLifeForce());
        System.out.println("Damage:" + getDamage());
        for(int i=0;i<armory.length;i++)
            System.out.println("Armory:" + this.armory[i]);
        System.out.println();

    }
    public void printStatus(){
        System.out.println("Warrior " + getNickName() + " " + "Health = " + lifeForce + "  " + "damage = " + getDamage());

    }
}

