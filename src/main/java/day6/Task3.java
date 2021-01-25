package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("Иван");
        teacher.setSubject("Биология");

        Student student = new Student();
        student.setName("Вася");
        teacher.evaluate(student);

    }
}
