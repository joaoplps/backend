package pkg203poo;
/**
 * Ex. Desenvolver (Classe Empregado):
 * @author João Pedro LPS
 */
public class Employee {                                                 //1
    private String sName;                                               //3 e 4
    private String sJob;
    private double dPaycheck;

    public String getsName() {
        return sName;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsJob() {
        return sJob;
    }
    public void setsJob(String sJob) {
        this.sJob = sJob;
    }

    public double getdPaycheck() {
        return dPaycheck;
    }
    public void setdPaycheck(double dPaycheck) {
        this.dPaycheck = dPaycheck;
    }
    
    //Método Construtor                                                 //5
    public Employee(){
        
    }
    public Employee(String sName, String sJob, double dPaycheck){       //6
        this.sName = sName;
        this.sJob = sJob;
        this.dPaycheck = dPaycheck;
    }

}
