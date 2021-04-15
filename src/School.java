public class School {
    String Name;
    String Adress;
    int e=0;
    int a = 0;
    int b = 0;
    int d = 0;
    int x = 0;
    int y = 0;
    Class[] classes = new Class[10];
    Learner[] learners = new Learner[30];
    Teacher[] teachers = new Teacher[10];
    Employee[] employees = new Employee[15];
    Section[] sections = new Section[3];
    Elective[] electives = new Elective[4];




    public void getListTeachers(){
        for (int i = 0; i <= teachers.length; i++){
            System.out.println(teachers[i]);
        }
    }

    public void getListEmployees(){
        for (int i = 0; i <= employees.length; i++){
            System.out.println(employees[i].FullName);
            System.out.println(employees[i].CardID);
            System.out.println(employees[i].Phone);
            System.out.println(employees[i].Position);
        }
    }

    public void getListLearners(){
        for (int i = 0; i <= learners.length; i++){
            System.out.println(learners[i].FullName);
            System.out.println(learners[i].Phone);
            System.out.println(learners[i].Parents);
            System.out.println(learners[i].CardID);
        }
    }

    public void getElectronicJournal(){
        for (int i = 0; i <= classes.length + electives.length + sections.length; i++){
            System.out.println("Классы: " + classes[i].Number);
            System.out.println(classes[i].ClassTeacher);
            System.out.println("Факультативы: " + electives[i].AcademicSubject);
            System.out.println(electives[i].ClassTeacher);
            System.out.println("Секции: " + sections[i].Name);
            System.out.println(sections[i].ClassTeacher);
        }
    }

    public void getParticipants(){
        Participant[] listParticipants = new Participant[10];
        for (int i = 0; i <= listParticipants.length; i++){
            System.out.println("Имя, фамилия: " + listParticipants[i].FullName);
            System.out.println("CardID: " + listParticipants[i].CardID);
            System.out.println("Телефон: " + listParticipants[i].Phone);
        }
    }

    public Participant getParticipant(int ID){
        Participant rabotnik = null;
        for (int i = 0; i < learners.length; i++) {
            if (ID == learners[i].CardID) {
                rabotnik = learners[i];
                break;
            }
        }
        for (int i = 0; i < teachers.length; i++) {
            if (ID == teachers[i].CardID) {
                rabotnik = teachers[i];
                break;
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (ID == employees[i].CardID) {
                rabotnik = employees[i];
                break;
            }
        }
        return rabotnik;
    }

    public void addTeacher(Teacher t){
        teachers[e] = t;
        e++;
    }

    public void addEmployeer(Employee em){
        employees[a] = em;
        a++;
    }

    public void addLerner(Learner l){
        learners[b] = l;
        b++;
    }

    public void addClass(Class c){
        classes[d] = c;
        d++;
    }

    public void addElective(Elective el){
        electives[x] = el;
        x++;
    }

    public void addSection(Section s){
        sections[y] = s;
        y++;
    }
}


