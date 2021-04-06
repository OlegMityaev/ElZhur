public abstract class School {
    String Name;
    String Adress;
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

    public Person[] getAllPersonsInSchool(){
        Person[] person = new Person[learners.length + teachers.length + employees.length + listParents.length];
        int k=0;
        for (int i = 0; i <= learners.length; i++) {
            person[k] = learners[i];
            k++;
            System.out.println("Ученики: " + learners[i].FullName);
        }
        for (int i = 0; i <= teachers.length; i++){
            person[k] = teachers[i];
            k++
            System.out.println("Учителя: " + teachers[i].FullName);
        }
            System.out.println("Сотрудники: " + employees[i].FullName);
            System.out.println("Родители: " + listParents[i].FullName);

        return p;
    }
}


