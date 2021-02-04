package day13;

import day12.task4.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class User {


    private String username;
    private List<User> subscriptions;


    public User(String username, List<User> subscriptions) {
        this.username = username;
        this.subscriptions = subscriptions;
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    // Методы------------------------------

    public void subscribe(User user) {    //  Да  вроде работает подписывает пользователя на пользователя user

        user.getSubscriptions();
        subscriptions.add(user);
      }



    //возвращает True, если пользователь подписан на пользователя user и False, если не подписан.
    public boolean isSubscribed(User user) {
        for (User x : user.subscriptions) {      //  пробегаемся по списку подписки  юзера
            if (user.subscriptions.contains(x))   //  если содержимся в нем то   тру
                return true;
        }
        return false;

    }

    public boolean isFriend(User user) {     //  является ли  юзер  другом  (проверка взаимной подписки  (есть ли в подписках))
        for (User x : user.subscriptions) {      //  пробегаемся по списку подписки  юзера
            if (user.getSubscriptions().contains(x) && x.getSubscriptions().contains(user))   //  если содержимся в нем то   тру
                return true;
        }
        return false;
    }
//- отправляет сообщение с текстом text пользователю user.
// Здесь должен использоваться статический метод из MessageDatabase.

    public void sendMessage(User user, String text) {



    }

    @Override
    public String toString() {

        return username;
    }
}