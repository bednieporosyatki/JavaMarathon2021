package day11.task2;

public class Shaman  implements interfaceHealer {
    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDe=" + magicDe +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }

    private int health=100;
    private int physDef= 20;
    private int magicDe=20;
    private int physAtt=10;
    private int magicAtt=15;


    @Override
    public void healHimself() { // 50

    }

    @Override
    public void healTeammate(Hero hero) { // 30

    }
}
