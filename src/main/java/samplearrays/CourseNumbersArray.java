package samplearrays;

public class CourseNumbersArray {
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};

    }
    public static int[] updatedCourses(int[] registeredCourses, int new_course){
        int n=registeredCourses.length;
        int[] registeredCoursesUpdated = new int[n+1];
        for (int i=0;i<n;i++){
            registeredCoursesUpdated[i]=registeredCourses[i];
        }
        registeredCoursesUpdated[n]=new_course;
        System.out.println(registeredCoursesUpdated);
        return registeredCoursesUpdated;
    } 
    public static boolean checksRegisteredCourses(int[] registeredCourses, int course){
        int n=registeredCourses.length;
        for(int i=0;i<n;i++){
            if(registeredCourses[i]==course){return true;} 
        }
        return false;
    }

}
