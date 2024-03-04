import java.util.*;

public class StudyGroup {

    private Student [] Students;
    private static int numberofStudents;
    private int StudyYear;


    public StudyGroup(Student [] Students, int StudyYear){
        this.Students = Students;
        this.StudyYear =StudyYear;
        for (int i =0;i<Students.length;i++){
            if (Students[i]!=null)
                numberofStudents++;
        }

    }

    public int getNumberofStudents() {
        return numberofStudents;
    }
    public void changeStudyGroup(Student s, StudyGroup sg) {
        for (int i = 0; i < Students.length; i++) {
            if (Students[i].equals(s))
                Students[i] = null;
            numberofStudents--;
            break;
        }
        for (int i = 0; i < sg.Students.length; i++) {
            if (sg.Students[i]==null){
                sg.Students[i]=s;
                sg.numberofStudents++;
                break;
            }

        }
    }
    public void graduateClass(){
        for (int i =0;i<Students.length;i++){
            if(Students[i]!=null && Students[i].getYearofgraduation()>StudyYear)
                StudyYear++;
            else {
                Students[i]= null;
                numberofStudents--;
            }
        }
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "Students=" + Arrays.toString(Students) +
                ", StudyYear=" + StudyYear +
                '}';
    }

    public static void main(String[] args) {
        Student b = new Student("Ahmed","Computer Science",2023);

        Student [] a = {b,b,b,b,null,b,null};
        int StudyYear = 2023;
        StudyGroup as = new StudyGroup(a,StudyYear);
        System.out.println(as.getNumberofStudents());

    }
}
