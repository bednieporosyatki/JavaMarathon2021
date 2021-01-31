package day11.task2;

public class Paladin extends Hero implements interfaceHealer{

    private int health=100;
    private int physDef=50;
    private int magicDef=20;
    private int physAtt=15;
    private int magicAtt=0;

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }

    public Paladin(int health, int physDef, int magicDef, int physAtt, int magicAtt) {
        super(health, physDef, magicDef, physAtt, magicAtt);

    }
    @Override
    public void healHimself() {  //25


    }
    @Override
    public void healTeammate(Hero hero) { // 10

    }
}
