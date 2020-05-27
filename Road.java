package lesson1;

public class Road extends Barrier {
    private int length;

    public Road(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    protected boolean moving(Human human) {
        System.out.println("The road " + super.getName() + " length: " + this.length);
        human.run();
        if (this.getLength() <= human.getRunDistance()) {
            System.out.println("Human run success");
            return true;
        } else {
            System.out.println("Human run unsuccessfully");
            return false;
        }
    }

    protected boolean moving(Robot robot) {
        System.out.println("The road " + super.getName() + "length: " + this.length);
        robot.run();
        if (this.getLength() <= robot.getRunDistance()) {
            System.out.println("Robot run success");
            return true;
        } else {
            System.out.println("Robot run unsuccessfully");
            return false;
        }
    }

    protected boolean moving(Cat cat) {
        System.out.println("The road " + super.getName() + "length: " + this.length);
        cat.run();
        if (this.getLength() <= cat.getRunDistance()) {
            System.out.println("Cat run success");
            return true;
        } else {
            System.out.println("Cat run unsuccessfully");
            return false;
        }
    }
}
