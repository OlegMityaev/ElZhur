public class Section {
    String Name;
    String ClassTeacher;
    Learner[] Learners = new Learner[10];
    public void getListParents(){
        for (int i = 0; i <= Learners.length; i++){
            System.out.println(Learners[i].FullName);
            for (int j = 0; j <= Learners[i].Parents.length; j++){
                System.out.println(Learners[i].Parents[j].FullName);
            }
        }
    }
    public void getList(){
        for (int i = 0; i <= Learners.length; i++){
            System.out.println(Learners[i].FullName);
        }
    }
}
