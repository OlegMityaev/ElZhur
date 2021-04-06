class Teacher extends Participant {
    public String Position;
    public String Qualification;

    public Teacher(String FullName, int Phone, int CardID, String Position, String Qualification) {
        super(FullName, Phone, CardID);
        this.Position = Position;
        this.Qualification = Qualification;
    }
}
