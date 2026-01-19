package Book;

public class LibAdmin {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void check(Student student) {
        BookCard card = new BookCard();
        if("红色".equals(card.getColor())) {
            if("A".equals(card.getType())) {
                System.out.println(student.getName()+"可以借到《java基础》");
            }else if("B".equals(card.getType())) {
                System.out.println(student.getName()+"可以借到《mysql数据》");
            }else {
                System.out.println(student.getName()+"可以借到《java编程思想》");
            }
        }else{
            System.out.println(student.getName()+"可以借到《java基础》");
        }
    }
 }
