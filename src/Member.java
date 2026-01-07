public abstract class Member {
    protected String name;
    protected String memberId;
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }
    public abstract String getMembershipType();
    @Override
    public String toString() {
        return getMembershipType() + " ID: " + memberId + " Name: " + name;
    }
    public static class StudentMember extends Member {
        public StudentMember(String name, String memberId) {
            super(name, memberId);
        }
        @Override
        public String getMembershipType() {
            return "Student Member";
        }
    }
    public static class PremiumMember extends Member {
        public PremiumMember(String name, String memberId) {
            super(name, memberId);
        }
        @Override
        public String getMembershipType() {
            return "Premium Member";
        }
    }
    public static class SeniorMember extends Member {
        public SeniorMember(String name, String memberId) {
            super(name, memberId);
        }
        @Override
        public String getMembershipType() {
            return "Senior Member";
        }
    }
}