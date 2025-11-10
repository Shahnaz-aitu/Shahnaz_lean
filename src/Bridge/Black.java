package Bridge;

public class Black extends Bread{
    public Black(Sous jem) {
        super(jem);
    }

    @Override
    public void getBread(){
        System.out.println("Black Bread");
        jem.put();
    }

}
