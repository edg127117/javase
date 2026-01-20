package Nw2;

public class MaleLine implements God{
    @Override
    public Person makePerson() {
        return new Male();
    }
}
