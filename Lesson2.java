package Lesson2;

import java.util.Random;

public class Lesson2 {
    public Lesson2() {
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Actions[] actions = new Actions[3];
        int distance = rand.nextInt(10);
        int heigth = rand.nextInt(10);
        actions[0] = new Human("Alina", distance, heigth);
        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[1] = new Robot("192.168.0.1", distance, heigth);
        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[2] = new Cat("Dasha", distance, heigth);
        Barrier[] barriers = new Barrier[6];

        int i;
        for(i = 0; i < barriers.length; ++i) {
            distance = rand.nextInt(10);
            boolean isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new Road("Lesson2.Road " + i, distance);
            } else {
                barriers[i] = new Wall("Lesson2.Wall " + i, distance);
            }
        }

        for(i = 0; i < actions.length; ++i) {
            boolean result = true;

            for(int j = 0; j < barriers.length; ++j) {
                if (Human.class == actions[i].getClass()) {
                    result = barriers[j].moving((Human)actions[i]);
                }

                if (Robot.class == actions[i].getClass()) {
                    result = barriers[j].moving((Robot)actions[i]);
                }

                if (Cat.class == actions[i].getClass()) {
                    result = barriers[j].moving((Cat)actions[i]);
                }

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Success!!");
            } else {
                System.out.println("Unsuccessfully!");
            }
        }

    }
}
