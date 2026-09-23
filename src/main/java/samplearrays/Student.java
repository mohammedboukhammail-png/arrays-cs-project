package samplearrays;

import java.util.Arrays;
import java.util.Comparator;

class Student {
    private int id;
    private String name;
    private int age;
    private int grade; // 0..20 or 0..100 as you prefer

    // keep counter private; expose getter only
    private static int numStudent = 0;
    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        numStudent++;
    }
    public Student(int id, String name, int age) {
        this(id, name);
        this.age = age;
    }
    public Student(int id, String name, int age, int grade) {
        this(id, name, age);
        this.grade = grade;
    }

    // Getters / setters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getGrade() { return grade; }
    public void setAge(int age) { this.age = age; }
    public void setGrade(int grade) { this.grade = grade; }
    public static int getNumStudent() { return numStudent; }

    public boolean isAdult() { return age >= 18; }

    @Override
    public String toString() {
        return "Student{id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade + '}';
    }
    public static Student findOldest(Student[] students){
        int n = students.length;
        int[] ages= new int[students.length];
        for(int i=0;i<n;i++){
            ages[i]=students[i].age;
        }
        int max = ages[0];
        int indexOldest=0;
        for(int i=1;i<n;i++){
            if(ages[i]>max){
                max=ages[i];
                indexOldest=i;
            }
        }
        return students[indexOldest];
    }
    public static int countAdults(Student[] students){
        int compteur = 0;
        int n = students.length;
        for(int i=0;i<n;i++){
            if(students[i].isAdult()){ 
                compteur++;
            }
        }
        return compteur;
    }
    public static void main(String[] args){
        Student[] students = new Student[5];
        students[0]= new Student(1,"Ali",20,16);
        students[1]= new Student(2,"Ayoub",21,17);
        students[2]= new Student(3,"Mohammed",19,15);
        students[3]= new Student(4,"Mehdi",20,14);
        students[4]= new Student(5,"Achraf",20,15);

        for(int i=0;i<5;i++){
            System.out.println(students[i].toString());
        }
        Student[][] school = new Student[2][3];
        school[0][0] = new Student(1, "Ali", 20, 16);
        school[0][1] = new Student(2, "Yasser", 19, 14);
        school[0][2] = new Student(3, "Anas", 18, 18);
        school[1][0] = new Student(4, "Hamza", 21, 15);
        school[1][1] = new Student(5, "Hassan", 17, 19);
        school[1][2] = new Student(6, "Ziad", 20, 12);
        for (int i = 0; i < school.length; i++) {
            for (int j = 0; j < school[i].length; j++) {
                System.out.println(school[i][j].name);
            }
        }
        for(int i=0;i<school.length;i++){
            Student topStudent=school[i][0];
            for(int j=1;j<school[i].length;j++){
                if(school[i][j].grade>topStudent.grade){ 
                    topStudent=school[i][j];
                    }
            }
            System.out.println("class" + (i+1) + "top student" + topStudent.name);
        }
    }
    public static double averageGrade(Student[] students){
        double sum=0;
        int n = students.length;
        for(int i=0;i<n;i++){
            sum+=students[i].grade;
        }
        double aveargescore= sum/n;
        return aveargescore;
    }
    public static Student findStuddentByName(Student[] students,String name){
        int n = students.length;
        for(int i=0;i<n;i++){
            if(students[i].name.equals(name)){ 
                return srudents[i];
                }
        }
        return null;
    }
    public static void gradeGreaterThan15(Student[] students){
        int n = students.length;
        for(int i=0;i<n;i++){
            if(students[i].grade>=15){
                System.out.println(students[i].name);
            }
        }
    }
    public static void updateGrade(Student[] students,int id, int newGrade){
        int n = students.length;
        for(int i=0;i<n;i++){
            if(students[i].id==id){
                students[i].grade=newGrade;
                break;
            }
        }
    }
    public static void duplicateNames(Student[] students){
        int n = students.length
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(students[i].name.equals(students[j].name)){
                    System.out.println("Duplicates found");
                }
            }
        }
    }
    
}
