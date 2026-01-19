package Nw2;

public class Teat {
    public static void main(String[] args) {
        God god=new FeMaleLine();
        Person person=god.makePerson();
        person.eat();
        person.sleep();
        person.speak();
    }
}
