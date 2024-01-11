public class Main {
    public static void main(String[] args) {
 Student student = new Student();
 student.setAge(-24);
 student.setName("Aslan");
 student.setSurname("Shermatov");
 student.setEmail("aslan@gmail.ru");
        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getAge());
        System.out.println(student.getEmail());



    }
}