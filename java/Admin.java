package Java2;

public class Admin extends User {
    String staffNo;
    void uploadResults(String course, float score) {
        System.out.println(course + " " + score);
    }
    public static void main(String[] args) {
        Admin adminName = new Admin();
        adminName.name = "Fori";
        adminName.password = "88888";
        System.out.println(adminName.register());
    }
} 
