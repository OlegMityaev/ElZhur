
abstract class Person {
    public String FullName;
    public int Phone;
    public Person(String FullName, int Phone){
        this.FullName = FullName;
        this.Phone = Phone;
    }

}

class Learner extends Person{
    private String Parents[];
    public Learner(String FullName, int Phone, String[] Parents){
        super(FullName, Phone);
        this.Parents = Parents;
    }

}

class Parents extends Person{
    public Parents(String FullName, int Phone){
        super(FullName, Phone);
    }
}

class Participant extends Person{
    public int CardID;
    public Participant(String FullName, int Phone, int CardID){
        super(FullName, Phone);
        this.CardID = CardID;
    }
}

class Employee extends Participant{
    private String Position;
    public Employee(String FullName, int Phone, int CardID, String Position) {
        super(FullName, Phone, CardID);
        this.Position = Position;
    }
}

class Teacher extends Participant{
    private String Position;
    private String Qualification;
    public Teacher(String FullName, int Phone, int CardID, String Position, String Qualification) {
        super(FullName, Phone, CardID);
        this.Position = Position;
        this.Qualification = Qualification;
    }
}