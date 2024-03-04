import java.util.Objects;

public class Student {
   private String name;
   private double GPA;
   private String faculty;
   private int yearofenrollment;
   private int yearofgraduation;

   public Student (String name, String faculty, int yearofenrollment) {
    this.yearofenrollment = yearofenrollment;
    this.name = name;
    this.faculty= faculty;
    int noyears =0;
    if (faculty.equals("Computer Science"))
        noyears = 4;
       else if (faculty.equals("Engineering"))
           noyears = 5;
      else if (faculty.equals("Medicine"))
           noyears = 7;
      yearofgraduation = noyears+yearofenrollment;
   }

    public int getYearofgraduation() {
        return yearofgraduation;
    }
    public void changeFaculty(String faculty){
       this.faculty=faculty;
       int noyears =0;
        if (faculty.equals("Computer Science"))
            noyears = 4;
        else if (faculty.equals("Engineering"))
            noyears = 5;
        else if (faculty.equals("Medicine"))
            noyears = 7;
        yearofgraduation = noyears+yearofenrollment;
    }
    public void modifyGPA(double gpa){
       GPA = gpa;
    }
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", GPA=" + GPA +
                ", faculty='" + faculty + '\'' +
                ", yearofenrollment=" + yearofenrollment +
                ", yearofgraduation=" + yearofgraduation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(GPA, student.GPA) == 0 && yearofenrollment == student.yearofenrollment && yearofgraduation == student.yearofgraduation && Objects.equals(name, student.name) && Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, GPA, faculty, yearofenrollment, yearofgraduation);
    }

    public static void main(String[] args) {
     Student a = new Student("Ahmed","Computer Science",2023);
        Student b = new Student("Ahmed","Computer Science",2023);
        System.out.println(a.equals(b));
        System.out.println(a.getYearofgraduation());
    }
}
