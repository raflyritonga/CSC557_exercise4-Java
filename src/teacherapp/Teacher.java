package teacherapp;

abstract class Teacher {
    private String name;
    private String icNo; //Identification Card No
    private int YOS; //Year of Services
    
    public abstract double calculateSalary(); //abstract method
    
    public Teacher(String name, String icNo, int YOS){
        this.name = name;
        this.icNo = icNo;
        this.YOS = YOS;
    }; // constructor
    
    public String getName(){
        return name;
    }
    
    public String getIC(){
        return icNo;
    }
    
    public int getYOS(){
        return YOS;
    }
    
    public String toString(){
        return "Name: " + name + "\nIc No: " + icNo + "\nYear of Services: " + YOS + " years";
    }
    
    public abstract int getOT();
       
}
