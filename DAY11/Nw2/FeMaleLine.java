package Nw2;

public class FeMaleLine implements God{
    @Override
    public Person makePerson() {
        return new FeMale();
    }
}
