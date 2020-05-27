package lesson1;

public class Wall extends Barrier {
    private int heigth;

    public Wall(String name, int heigth) {
        super(name);
        this.heigth = heigth;
    }

    public int getHeigth() {
        return this.heigth;
    }

    protected boolean moving(Human human) {
        System.out.println("The wall " + super.getName() + "heigth: " + this.heigth);
        human.jump();
        if (this.getHeigth() <= human.getJumpHeight()) {
            System.out.println("Human jump success");
            return true;
        } else {
            System.out.println("Human jump unsuccessfully");
            return false;
        }
    }

    protected boolean moving(Robot robot) {
        System.out.println("The wall " + super.getName() + "heigth: " + this.heigth);
        robot.jump();
        if (this.getHeigth() <= robot.getJumpHeight()) {
            System.out.println("Robot jump success");
            return true;
        } else {
            System.out.println("Robot jump unsuccessfully");
            return false;
        }
    }

    protected boolean moving(Cat cat) {
        System.out.println("The wall " + super.getName() + " heigth: " + this.heigth);
        cat.jump();
        if (this.getHeigth() <= cat.getJumpHeight()) {
            System.out.println("Cat jump success");
            return true;
        } else {
            System.out.println("Cat jump unsuccessfully");
            return false;
        }
    }
}
