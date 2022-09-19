public class Main {

  public static void main(String args[]) {

    Person person1 = new Person("Hammad", 22, 175);

    Person person2 = new Person("Qusai", 20, 177);

    person1.setAge(21);
    
    System.out.println(person1);

    System.out.println(person2);
  }
}