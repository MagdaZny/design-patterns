package EmployeeObserver;

public interface Subject {

     void registerObserver(Observer o);
     void removeObserver(Observer o);
     void nofifyObserver(Observer o);

}