class Learner extends Participant{
    public Parents[] Parents;

    public Learner(String FullName, int Phone, int CardID, Parents[] Parents) {
        super(FullName, Phone, CardID);
        this.Parents = Parents;
    }

}
