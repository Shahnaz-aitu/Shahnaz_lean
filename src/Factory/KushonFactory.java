package Factory;

public class KushonFactory extends CosmeticFactory{
    @Override
    public Cosmetic createCosmetic(){
        return new Kushon();
    }
}
