package Builder;

public interface Builder {
    void setModel(String model);
    void setColor(String color);
    Car build();
}
