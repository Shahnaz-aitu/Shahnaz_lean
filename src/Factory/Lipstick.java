package Factory;

public class Lipstick implements Cosmetic{
    @Override
    public void brand(){
        System.out.println("Dior");
    }
    @Override
    public void price() {
        System.out.println(35);
    }
}
