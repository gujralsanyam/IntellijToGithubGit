
class AdmissionService{
public void processAdmission(Customer customer, AdmissionInterface Admission)
{
    System.out.println("Processing Admission for customers: " + customer.Getname());
    Admission.Admit();
}
}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Customer customer1 = new Customer("Johnny Bairstow");

       AdmissionInterface hotel = new Hotel();
       AdmissionInterface Hospital = new Hospital();
       AdmissionInterface school = new School();

       AdmissionService admissionService = new AdmissionService();

       // Admiiting to different places

        admissionService.processAdmission(customer1, hotel);
        admissionService.processAdmission(customer1,Hospital);
        admissionService.processAdmission(customer1,school);


    }
}