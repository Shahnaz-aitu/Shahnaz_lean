package Bridge;

public abstract class Bread {
    protected Sous jem;

    public Bread(Sous jem) {
        this.jem = jem;
    }
    abstract public void getBread();
}
