package Java2;

public class Student extends User {
    String matric_no = "bhu/22/04/05/0049";
    String admission_no = "falldownpeter";
    String registerCourse() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "You cannot register your courses at this moment";
        } else {
            return "You have registered for all courses";
        }
    }
    String checkResults() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "Cannot check your result.";
        } else {
            return "You got 8As, 2Bs and 1D";
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Fori Daniel";
        student.password = "finalfantacy";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
        
    }
}