class Trainer {
    protected String name;
    protected int experienceYears;
    protected String specialization;
    public Trainer(String name, int experienceYears, String specialization) {
        this.name = name;
        this.experienceYears = experienceYears;
        this.specialization = specialization;
    }
    public void introduce() {
        System.out.println("Hi, I'm " + name);
        System.out.println("I have " + experienceYears + " years of experience");
        System.out.println("My specialization is " + specialization);
    }
    public void conductSession() {
        System.out.println(name + " is conducting a training session");
    }
}
class PersonalTrainer extends Trainer {
    private int maxClientsPerDay;
    public PersonalTrainer(String name, int experienceYears, String specialization, int maxClientsPerDay) {
        super(name, experienceYears, specialization);
        this.maxClientsPerDay = maxClientsPerDay;
    }
    @Override
    public void conductSession() {
        System.out.println(name + " is starting a 1-on-1 personal training session");
        System.out.println("Focus: customized plan for individual goals");
    }
    public void displayMaxClients() {
        System.out.println(name + " can train up to " + maxClientsPerDay + " clients per day");
    }
}
class GroupTrainer extends Trainer {
    private int maxGroupSize;
    public GroupTrainer(String name, int experienceYears, String specialization, int maxGroupSize) {
        super(name, experienceYears, specialization);
        this.maxGroupSize = maxGroupSize;
    }
    @Override
    public void conductSession() {
        System.out.println(name + " is leading a group class");
        System.out.println("Group size: up to " + maxGroupSize + " participants");
    }
    public void motivateGroup() {
        System.out.println(name + " says: \"Let's push together – you’ve got this!\"");
    }
}