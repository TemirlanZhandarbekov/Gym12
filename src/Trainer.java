public abstract class Trainer {
    protected String name;
    protected String trainerId;
    public Trainer(String name, String trainerId) {
        this.name = name;
        this.trainerId = trainerId;
    }
    public abstract String getTrainerType();
    @Override
    public String toString() {
        return getTrainerType() + " | ID: " + trainerId + " | Name: " + name;
    }
    public static class PersonalTrainer extends Trainer {
        public PersonalTrainer(String name, String trainerId) {
            super(name, trainerId);
        }
        @Override
        public String getTrainerType() {
            return "Personal Trainer";
        }
    }
    public static class GroupTrainer extends Trainer {
        public GroupTrainer(String name, String trainerId) {
            super(name, trainerId);
        }
        @Override
        public String getTrainerType() {
            return "Group Trainer";
        }
    }
}