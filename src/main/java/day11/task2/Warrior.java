package day11.task2;

public class Warrior  extends Hero implements interfacePhysAttack{

    private int health=100;
    private int physDef=80;
    private int magicDe=0;
    private int physAtt=30;
    private int magicAtt=0;

    public Warrior(int health, int physDef, int magicDef, int physAtt, int magicAtt, int health1, int physDef1, int physAtt1) {
        super(health, physDef, magicDef, physAtt, magicAtt);
        this.health = health1;
        this.physDef = physDef1;
        this.physAtt = physAtt1;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDe=" + magicDe +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }

    public Warrior(int health, int physDef, int magicDef, int physAtt, int magicAtt) {
        super(health, physDef, magicDef, physAtt, magicAtt);
    }

    @Override
    public void physicalAttack(Hero hero) {

    }
}
