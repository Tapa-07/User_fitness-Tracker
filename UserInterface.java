
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Fill the code here
        String userName;
        double weight;
        int stepsTaken;
        double distanceCovered;
        boolean runningStatus;

        System.out.println("Enter user name :");
        userName = sc.nextLine();

        System.out.println("Enter weight in kg : ");
        weight = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter number of steps taken : ");
        stepsTaken = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter distance covered in km : ");
        distanceCovered = sc.nextDouble();
        sc.nextLine();

        System.out.println("Is the user running?(true/false) : ");
        runningStatus = Boolean.parseBoolean(sc.nextLine());

        FitnessMonitor ob = new UserFitnessData(userName, weight, stepsTaken, distanceCovered, runningStatus);

        String fitnesslevel = ob.findFitnessLevel();
        double cal = FitnessMonitor.calculateCaloriesBurnt(weight, distanceCovered, runningStatus);

        System.out.println("User Name: " + ((UserFitnessData) ob).getUserName());
        System.out.println("Weight: " + ((UserFitnessData) ob).getWeight() + " kg");
        System.out.println("Steps Taken: " + ((UserFitnessData) ob).getStepsTaken());
        System.out.println("Distance Covered: " + ((UserFitnessData) ob).getDistanceCovered() + " km");
        System.out.println("Running: " + ((UserFitnessData) ob).getRunningStatus());
        System.out.println("Fitness Level: " + fitnesslevel);
        System.out.printf("Calories Burnt: %.2f", cal);

    }
}
