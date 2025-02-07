//Base Class
class Course{
    String courseName;
    int duration;

    //Constructor
    public Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }

    //Method to display course info
    public void displayCourseInfo(){
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

//Subclass
class OnlineCourse extends Course{
    String platform;

    //Constructor
    public OnlineCourse(String courseName, int duration, String platform){
        super(courseName, duration);
        this.platform = platform;
    }

    public void displayCourseInfo(){
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
    }
}

//Subclass
class PaidOnlineCourse extends OnlineCourse{
    double fee;

    //Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, double fee){
        super(courseName, duration, platform);
        this.fee = fee;
    }

    public void displayCourseInfo(){
        super.displayCourseInfo();
        System.out.println("Fee: " +fee);
    }
}

//Main Class
class EducationalCourse{
    public static void main(String[] args){
        Course course = new Course("Java Basics", 4);
        OnlineCourse onlineCourse = new OnlineCourse("Web Development", 8, "Udemy");
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Data Science", 12, "Coursera", 150);

        // Display course details
        course.displayCourseInfo();
        System.out.println();
        onlineCourse.displayCourseInfo();
        System.out.println();
        paidCourse.displayCourseInfo();
    }
}
