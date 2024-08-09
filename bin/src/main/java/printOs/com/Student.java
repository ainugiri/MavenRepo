public class Student {
    // Properties of the Student object
    String name;
    String major;
    double gpa;
    int age;
    
    // Constructor
    public Student(String name, String major, double gpa, int age){
        this.name = name;
        this.major = major;
        this.gpa = gpa;
        this.age = age;
    }
    
    // Methods of the Student object
    public boolean hasHonors(){
        if(gpa >= 3.5){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        Student student1 = new Student("Jim", "Business", 2.4, 27);
        Student student2 = new Student("Pam", "Art", 3.6, 22);
        
        System.out.println(student1.hasHonors());
        System.out.println(student2.hasHonors());
    }
}