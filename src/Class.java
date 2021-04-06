public class Class {
    String Number;
    String ClassTeacher;
    Learner[] listLearners = new Learner[10];
    public void getListParents(){
        for (int i = 0; i <= listLearners.length; i++){
            System.out.println(listLearners[i].FullName);
            for (int j = 0; j <= listLearners[i].Parents.length; j++){
                System.out.println(listLearners[i].Parents[j].FullName);
            }
        }
    }
    public void getList(){
        for (int i = 0; i <= listLearners.length; i++){
            System.out.println(listLearners[i].FullName);
        }
    }
}
