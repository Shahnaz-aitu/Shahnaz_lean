package Factory;

public class LipstickFactory extends CosmeticFactory {
    @Override
    public Cosmetic createCosmetic() {
        return new Lipstick();
    }
}
