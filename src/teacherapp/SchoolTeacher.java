package teacherapp;

class SchoolTeacher extends Teacher {

    private String grade ;
    
    public SchoolTeacher(String name, String icNo, int YOS, String grade){
        super(name, icNo, YOS);
        this.grade = grade;
    }; // constructor
    
    public String getGrade(){
        return grade;
    }
    
    public void setGrade(String changedGrade){
        this.grade = changedGrade;
    }
    
    public String toString(){
        return super.toString() + "\nGrade: " + grade;
    }
    
    @Override
    public double calculateSalary(){
         if(grade.equalsIgnoreCase("DG41"))
        {
            return 1900.00;
        }
        else if(grade.equalsIgnoreCase("DG44"))
        {
            return 3300.00;
        }
        else if(grade.equalsIgnoreCase("DG48"))
        {
            return 4900.00;
        }
        else if(grade.equalsIgnoreCase("DG52"))
        {
            return 5500.00;
        } else{
            return 0;
        }
    };
    
    public int getOT(){
        return 0;
    }
    
}
