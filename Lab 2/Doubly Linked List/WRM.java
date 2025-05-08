public class WRM {
    Patient dh;

    //The constructor is already created for you
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        // To Do
        Patient tail = new Patient(id, name, age, bloodgroup, dh, dh);
        dh.next = tail;
        dh.prev = tail;
        System.out.println("Registration successful");
    }

    public void servePatient() {
        // To do
        System.out.println("Patient to serve:");
        Patient temp = dh.next;
        if(temp != dh){
            System.out.println("ID: "+temp.id);
            System.out.println("Name: "+temp.name);
            System.out.println("Age: "+temp.age);
            System.out.println("Bloodgroup: "+temp.bloodGroup);
            dh.next = dh;
            dh.prev = dh;
        }
        else{
            System.out.println("No patients :)");
        }
    }

    public void showAllPatient() {
        // To Do
        System.out.println("Patients in line");
            System.out.println("ID: "+dh.next.id);
            System.out.println("Name: "+dh.next.name);
            System.out.println("Age: "+dh.next.age);
            System.out.println("Bloodgroup: "+dh.next.bloodGroup);
            System.out.println("================");
    }

    public boolean canDoctorGoHome() {
        // To Do
        if(dh.next == dh){
            return true;
        }
        return false;
    }

    public void cancelAll() {
        // To Do
        dh.next = dh;
        dh.prev = dh;
        System.out.println("Cancelation Succesful");
    }


    public void reverseTheLine() {
        // To Do
        Patient temp = dh.next;
        temp.next = dh;
        temp.prev = dh;
        System.out.println("Reversal Succesfull");
    }
}