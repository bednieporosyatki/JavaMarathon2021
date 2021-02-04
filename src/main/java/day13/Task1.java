package day13;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<User> subscriptionsMax1 = new ArrayList<>();
        User max1 = new User("Max1", subscriptionsMax1);

        List<User> subscriptionsMax = new ArrayList<>();
        User max = new User("Max", subscriptionsMax);


        List<User> subscriptionsVova = new ArrayList<>();
        User vova = new User("Vova", subscriptionsVova);

        max.subscribe(vova);
         max.subscribe(max1);
         max.subscribe(max);

        //System.out.println( vova.isSubscribed(max1));
        System.out.println( max1.isFriend(vova));

        System.out.println(max.getSubscriptions());



    }
}
