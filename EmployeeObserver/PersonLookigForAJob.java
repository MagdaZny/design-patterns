package EmployeeObserver;

public class PersonLookigForAJob implements Observer{

    private boolean isEmployed;
//    Random random = new Random();

//    public void keepCalling(Employer employer)    {
//        for (int i=0; i < 20; i++){
//            checkIfGotAJob(employer);
//            if (employer.isAplicationDecided()) break;
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }


    public void update(boolean isEmployed) {
        this.isEmployed = isEmployed;
    }

    public void inform(){
        if(isEmployed) System.out.println("I am employed!");
        else System.out.println("I am still not employed");}

}
