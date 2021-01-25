package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int rating = random.nextInt(4) + 2;
        // т.к. вариантов не много  я бы сделал через if   но можно и через свитч  -  что  лучше   не знаю  (вариант со свитчем - прилагаю)
        String str = null;
        if (rating == 2) str = "неудовлетворительно";
        if (rating == 3) str = "удовлетворительно";
        if (rating == 4) str = "хорошо";
        if (rating == 5) str = "отлично";

//   Можно и через свитч

//        String str = null;
//        switch (rating) {
//            case 2:
//                str = "неудовлетворительно";
//                break;
//            case 3:
//                str = "удовлетворительно";
//                break;
//            case 4:
//                str = "хорошо";
//                break;
//            case 5:
//                str = "отлично";
//                break;
//        }

        System.out.println("Преподаватель " + name + " по предмету " + subject + " оценил студента " + " с именем " + student.getName() + " на оценку " + str);

    }

}

