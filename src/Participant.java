class Participant extends Person {
    public int CardID;

    public Participant(String FullName, int Phone, int CardID) {
        super(FullName, Phone);
        this.CardID = CardID;
    }
}
