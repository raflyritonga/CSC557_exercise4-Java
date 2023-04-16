package teacherapp;

public class TeacherApp {
    
    public static void main(String[] args) {
        final int N = 5;
        Teacher tList[] = new Teacher[N];
        
        tList[0] = new SchoolTeacher("Nur Ain","910521102560",3,"DG48");
        tList[1] = new KindergartenTeacher("Nur Aiman","910118015871",5,15);
        tList[2] = new SchoolTeacher("Zakiah","830120144540",7,"DG41");
        tList[3] = new KindergartenTeacher("Mohd Ashraf","851003013453",15,10);
        tList[4] = new SchoolTeacher("Ramlan","930701106673",7,"DG48");
        
        // Display the list of name and salary of teachers with grade DG48.
        System.out.println("The list of name and salary of teachers with grade DG48");
        System.out.println("Name: " + tList[0].getName() + " | " + "Salary: " + tList[0].calculateSalary());
        System.out.println("Name: " + tList[4].getName() + " | " + "Salary: " + tList[4].calculateSalary() + "\n");
        
        // Calculate and display the total overtime hours done by the kindergarten teachers
        System.out.println("Total overtime hours done by the kindergarten teachers");
        System.out.println("Overtime Hours = " + String.valueOf(tList[1].getOT() + tList[3].getOT()) + " hours\n");
        
        // Display the information of kindergarten teacher who got the highest salary.
        System.out.println("Information of the highest kindergarten teacher salary");
        if (tList[1].calculateSalary() < tList[3].calculateSalary()){
            System.out.println(tList[3].toString() + "\nSalary: " + tList[3].calculateSalary() + " Rm");
        }else {
            System.out.println(tList[1].toString() + "\nSalary: " + tList[1].calculateSalary() + " Rm");
        }
    }
}
