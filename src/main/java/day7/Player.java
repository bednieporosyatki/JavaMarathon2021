package day7;

public class Player {

  private    static final int MAX_STAMINA = 100; // статическое (для всех об) финальное (не изменяемое)
  private   static final int MIN_STAMINA = 0;
  public int stamina;
  private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {       // увеличиваем счетчик пока он  не дойдет до 6.
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == 0) {    // когда стамина ==0 прекращаем работу
            return;
        }                      // Описание условий выхода или изменения в направленнии  хода программы надо   писать выше
        stamina--;             // уменьшаем выносливость
        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static void info() {
        int count = 6;
        int freePlayers = count - countPlayers;
        switch (countPlayers) {
            case 1:
                System.out.println("Команды неполные. На поле еще есть " + freePlayers + " свободных мест ");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Команды неполные. На поле еще есть " + freePlayers + " свободных места ");
                break;
            case 5:
                System.out.println("Команды неполные. На поле еще есть " + freePlayers + " свободное место");
                break;
            default:
                System.out.println("На поле нет свободных мест");
                break;
        }
        // Вариант с if
//        int count = 6;
//        int freePlayers = count - countPlayers;
//        if (countPlayers < count) {
//            System.out.println("Команды неполные. На поле еще есть " + freePlayers + " свободных мест ");
//        } else System.out.println("На поле нет свободных мест");

    }
}
