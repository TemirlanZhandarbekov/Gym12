import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static ArrayList<Member> members = new ArrayList<>();
    private static ArrayList<Trainer> trainers = new ArrayList<>();
    private static ArrayList<Workout> workouts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("GYM SYSTEM");
            System.out.println("1. Add Member");
            System.out.println("2. View All Members");
            System.out.println("3. Add Workout");
            System.out.println("4. View All Workouts");
            System.out.println("5. Add Trainer");
            System.out.println("6. View All Trainers");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> addMember();
                case 2 -> viewAllMembers();
                case 3 -> addWorkout();
                case 4 -> viewAllWorkouts();
                case 5 -> addTrainer();
                case 6 -> viewAllTrainers();
                case 0 -> System.out.println("Thank you! Goodbye!");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
    }
    private static void addMember() {
        System.out.println("\nAdd New Member ");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter member ID: ");
        String id = scanner.nextLine();
        System.out.println("Select type:");
        System.out.println("1. Student Member");
        System.out.println("2. Premium Member");
        System.out.println("3. Senior Member");
        System.out.print("Choice: ");
        int type = scanner.nextInt();
        scanner.nextLine();
        Member member = null;
        if (type == 1) {
            member = new Member.StudentMember(name, id);
        } else if (type == 2) {
            member = new Member.PremiumMember(name, id);
        } else if (type == 3) {
            member = new Member.SeniorMember(name, id);
        } else {
            System.out.println("Invalid type!");
            return;
        }
        members.add(member);
        System.out.println("Member added successfully!");
    }
    private static void viewAllMembers() {
        if (members.isEmpty()) {
            System.out.println("\nNo members registered yet.");
            return;
        }
        System.out.println("\nAll Members ");
        for (Member m : members) {
            System.out.println(m.toString());
        }
    }
    private static void addTrainer() {
        System.out.println("\nAdd New Trainer ");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter trainer ID: ");
        String id = scanner.nextLine();
        System.out.println("Select type:");
        System.out.println("1. Personal Trainer");
        System.out.println("2. Group Trainer");
        System.out.print("Choice: ");
        int type = scanner.nextInt();
        scanner.nextLine();
        Trainer trainer = null;
        if (type == 1) {
            trainer = new Trainer.PersonalTrainer(name, id);
        } else if (type == 2) {
            trainer = new Trainer.GroupTrainer(name, id);
        } else {
            System.out.println("Invalid type!");
            return;
        }
        trainers.add(trainer);
        System.out.println("Trainer added successfully!");
    }
    private static void viewAllTrainers() {
        if (trainers.isEmpty()) {
            System.out.println("\nNo trainers registered yet.");
            return;
        }
        System.out.println("\nAll Trainers ");
        for (Trainer t : trainers) {
            System.out.println(t.toString());
        }
    }
    private static void addWorkout() {
        System.out.println("\nAdd New Workout ");
        System.out.print("Enter workout ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter workout name: ");
        String name = scanner.nextLine();
        System.out.print("Enter duration (minutes): ");
        int duration = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Select type:");
        System.out.println("1. Cardio Workout");
        System.out.println("2. Strength Workout");
        System.out.println("3. Yoga Workout");
        System.out.print("Choice: ");
        int type = scanner.nextInt();
        scanner.nextLine();
        Workout workout = null;
        if (type == 1) {
            workout = new Workout.CardioWorkout(id, name, duration);
        } else if (type == 2) {
            workout = new Workout.StrengthWorkout(id, name, duration);
        } else if (type == 3) {
            workout = new Workout.YogaWorkout(id, name, duration);
        } else {
            System.out.println("Invalid type!");
            return;
        }
        workouts.add(workout);
        System.out.println("Workout added successfully!");
    }
    private static void viewAllWorkouts() {
        if (workouts.isEmpty()) {
            System.out.println("\nNo workouts registered yet.");
            return;
        }
        System.out.println("\nAll Workouts ");
        for (Workout w : workouts) {
            System.out.println(w.toString());
        }
    }
}