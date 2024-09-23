package dataStructureQuiz;

public class PersonalContact extends Contact {
    private String relationship;

    public PersonalContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    @Override
    public void displayContactInfo() {
        super.displayContactInfo();
        System.out.println(", 관계: " + relationship);
    }
}
