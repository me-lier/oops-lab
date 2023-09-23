// import practice.StudentDetails; 
public class StudentDetails {
    String name;
    int id;
    long cno;
    String schname = "Parul University"; 
    
    public void getAttribute(){
        System.out.println("Student Name: " + name); 
        System.out.println("Student Id: " + id); 
        System.out.println("Student Contact Number: " + cno); 
        System.out.println("School Name: " + schname + "\n");
    }
    public void initialize(String sname, int sid, long scno){
          name = sname;
          id = sid;
          cno = scno;
    }
    public static void main(String[] args){
    StudentDetails st1 = new StudentDetails(); 
    st1.initialize("Laila", 420, 12345l); 
    st1.getAttribute();
    StudentDetails st2 = new StudentDetails(); 
    st2.initialize("Ram", 500, 98765l); 
    st2.getAttribute();
    } 
}