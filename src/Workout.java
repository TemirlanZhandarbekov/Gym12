class Workout {
    protected String title;
    protected String time;
    public Workout(String title, String time){
        this.title = title;
        this.time = time;
    }
    public void showWorkout() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + time);
        System.out.println();
    }
}
class CardioWorkout extends Workout {
    private String type;
    public CardioWorkout(String title, String time, String type) {
        super(title, time);
        this.type = type;
    }
    @Override
    public void showWorkout() {
        System.out.println("Title: " + title);
        System.out.println("Type: " + type);
        System.out.println("Duration: " + time);
        System.out.println("Good for your heart!\n");
    }
}
class StrengthWorkout extends Workout {
    private String muscleGroup;

    public StrengthWorkout(String title, String time, String muscleGroup) {
        super(title, time);
        this.muscleGroup = muscleGroup;
    }

    @Override
    public void showWorkout() {
        System.out.println("Title: " + title);
        System.out.println("Targets: " + muscleGroup);
        System.out.println("Duration: " + time);
        System.out.println("Builds muscle power!\n");
    }
}
class YogaWorkout extends Workout {
    private String level;
    public YogaWorkout(String title, String time, String level) {
        super(title, time);
        this.level = level;
    }
    @Override
    public void showWorkout() {
        System.out.println("Title: " + title);
        System.out.println("Level: " + level);
        System.out.println("Duration: " + time);
        System.out.println("Relax and stretch!\n");
    }
}