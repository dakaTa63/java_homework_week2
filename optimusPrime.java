import java.util.Scanner;
import java.util.Random;

public class optimusPrime {

    public static void main(String[] args) {

        //object scan
        System.out.println("Object? ");
        Scanner object = new Scanner(System.in);

        String objectMove = object.nextLine();

        if (objectMove.equals("Wall")) {
            System.out.println("Going Sideway!");
        } else if (objectMove.equals("Chair")) {
            System.out.println("Jump!");
        } else if (objectMove.equals("Nothing")) {
            System.out.println("Forward!");
        }


        //pixels
        System.out.println("gathering pixels information");

        Scanner strikeInput = new Scanner(System.in);
        int strike = strikeInput.nextInt();


        //strike
        if ((strike % 2) == 0) {
            System.out.println("mouse found!");
        } else {
            System.out.println("mouse not found");
        }


        //battery
        System.out.println("power check!");
        Scanner batteryCheck = new Scanner(System.in);
        int strikesDone = batteryCheck.nextInt();

        if (strikesDone < 4) {
            System.out.println("opstimusPrime can go for one last strike before shutdown!");
        } else {
            System.out.println("optimusPrime is ready to hunt!");
        }

        //dangerous hit
        Random rand = new Random();
        int dangerous = rand.nextInt(11);

        if (dangerous == 5) {
            System.out.println("haha optimusPrime just broke an object in your house! ");
            return;
        } else {
            System.out.println("mouse successfully killed, lets go for another target! ");
        }


        //2nd battery
        System.out.println("power check!");
        Scanner batteryCheckk = new Scanner(System.in);
        int strikesDonee = batteryCheck.nextInt();

        if (strikesDone < 4) {
            System.out.println("opstimusPrime needs a battery charge !");
        } else {
            System.out.println("optimusPrime is ready to hunt!");
        }


        //charging
        Random powerLeft = new Random();

        int batteryCheckOne = rand.nextInt(1001);
        int batteryCheckTwo = rand.nextInt(1001);

        if (batteryCheckOne > batteryCheckTwo) {
            System.out.println("charging");
        } else if (batteryCheckOne < batteryCheckTwo) {
            System.out.println("not charging");
        } else if (batteryCheckOne == batteryCheckTwo) {
            if (batteryCheckOne > batteryCheckTwo) {
                System.out.println("charging");
            } else if (batteryCheckOne < batteryCheckTwo) ;
        }


        //communication
        for (int speech = 1; speech <= 10; speech++) {
            if (speech % 2 == 0) {
                System.out.print(speech + " I am a Robottttt ");
            }

        }
    }
}


