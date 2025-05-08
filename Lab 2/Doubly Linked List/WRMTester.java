public class WRMTester {
    public static void main(String[] args) {
        System.out.println("** Welcome to Waiting Room Management System **");
        // To Do
        // Create WRM Object and call the necessary methods
        WRM firstroom = new WRM();
        firstroom.registerPatient(2410, "John", 18, "A+");
        System.out.println("================");
        firstroom.showAllPatient();
        System.out.println("================");
        firstroom.servePatient();
        System.out.println("================");
        System.out.println("Patient served");
        System.out.println("================");
        firstroom.showAllPatient();
        System.out.println("================");
        System.out.println("Can the doctor go home? "+firstroom.canDoctorGoHome());
        System.out.println("================");
        firstroom.reverseTheLine();
        System.out.println("================");
        firstroom.cancelAll();
        System.out.println("================");
        System.out.println("Can the doctor go home? "+firstroom.canDoctorGoHome());
        System.out.println("================");
    }
}
