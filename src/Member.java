class Member {
    protected String name;
    protected String memberID;
    protected String joinDate;
    public Member(String name, String memberID, String joinDate) {
        this.name = name;
        this.memberID = memberID;
        this.joinDate = joinDate;
    }
    public void displayInfo() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberID);
        System.out.println("Joined on: " + joinDate);
    }
}
class StudentMember extends Member {
    private String discount;
    public StudentMember(String name, String memberId, String joinDate, String Training) {
        super(name, memberId, joinDate);  // Call parent constructor
        this.discount = discount;
    }
    public void showDiscount() {
        System.out.println(name + " has " + discount);
    }
}
class PremiumMember extends Member {
    private int rewardPoints;
    public PremiumMember(String name, String memberId, String joinDate, int rewardPoints) {
        super(name, memberId, joinDate);
        this.rewardPoints = rewardPoints;
    }
    public void redeemPoints() {
        System.out.println(name + " has " + rewardPoints + " reward points - can redeem for free books!\n");
    }
}
class SeniorMember extends Member {
    private int age;
    public SeniorMember(String name, String memberId, String joinDate, int age) {
        super(name, memberId, joinDate);
        this.age = age;
    }
    public void specialAssistance() {
        System.out.println(name + " (Senior Citizen, age " + age + ") gets home delivery service!\n");
    }
}