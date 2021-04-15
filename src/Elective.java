public class Elective {
    String AcademicSubject;
    Learner[] Learners = new Learner[10];
    String ClassTeacher;
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
