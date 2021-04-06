class Employee extends Participant {
    public String Position;

    public Employee(String FullName, int Phone, int CardID, String Position) {
        super(FullName, Phone, CardID);
        this.Position = Position;
    }
}
