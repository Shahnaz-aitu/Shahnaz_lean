package Builder1;

public class cosmetics {
    private String cosmetica;
    private String brand;
    private int price;

    @Override
    public String toString() {
        return "cosmetica:"+cosmetica+", brand:"+brand+", price:"+price;
    }

    private cosmetics(String cosmetica, String brand, int price) {
        this.cosmetica = cosmetica;
        this.brand = brand;
        this.price = price;
    }

    public static class Builder {
        private String cosmetica;
        private String brand;
        private int price;

        public Builder setCosmetica(String cosmeticф) {
            this.cosmetica = cosmeticф;
            return this;
        }
        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }
        public cosmetics build() {
            return new cosmetics(cosmetica, brand, price);
        }
    }
}