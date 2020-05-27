package lesson1;

public abstract class Barrier {
    private String name;

    public Barrier(String name) {
        this.name = name;
    }

    protected abstract boolean moving(Human var1);

    protected abstract boolean moving(Robot var1);

    protected abstract boolean moving(Cat var1);

    public String getName() {
        return this.name;
    }
}
