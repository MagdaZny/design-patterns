package EmployeeObserver;

public class ContactMain {

    public static void main(String[] args) {
         final Employer thoughtWorks = new Employer();
         final PersonLookigForAJob magda = new PersonLookigForAJob();
         final Thread thread = new Thread(new Runnable() {
             public void run() {
                 thoughtWorks.startWorkingOnApplication();
             }
         });

        thread.start();
        magda.inform();
    }

}
