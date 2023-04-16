package teacherapp;

class KindergartenTeacher extends Teacher{
    
    private int OTHours; 
    
    public KindergartenTeacher (String name, String icNo, int YOS, int ot){
        super(name, icNo, YOS);
        this.OTHours = ot;
    }; // constructor
    
    public int getOT(){
        return OTHours;
    }
    
    public int setOT(int changedOT){
        return this.OTHours = changedOT;
    }
    
    public String toString(){
        return super.toString() + "\nOvertime Hours: " + OTHours;
    }
    
    @Override
    public double calculateSalary(){
        double basicSalary = 0;
        if( super.getYOS() == 1 || super.getYOS() == 2){
            basicSalary = 1200.00;
        }
        else if( super.getYOS() >= 3 && super.getYOS() <= 5 )
        {
           basicSalary = 1800.00;
        }
        else if( super.getYOS() > 5 )
        {
            basicSalary = 2000.00;
        }
        return basicSalary + (OTHours * 10);
    };
}