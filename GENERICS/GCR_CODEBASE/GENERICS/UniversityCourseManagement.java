import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() { return courseName; }

    public abstract String getEvaluationType();
}

class ExamCourse extends CourseType {
    private int examWeightage;

    public ExamCourse(String name, int examWeightage) {
        super(name);
        this.examWeightage = examWeightage;
    }

    public int getExamWeightage() { return examWeightage; }

    public String getEvaluationType() {
        return "Exam-Based (Weightage: " + examWeightage + "%)";
    }
}

class AssignmentCourse extends CourseType {
    private int totalAssignments;

    public AssignmentCourse(String name, int totalAssignments) {
        super(name);
        this.totalAssignments = totalAssignments;
    }

    public int getTotalAssignments() { return totalAssignments; }

    public String getEvaluationType() {
        return "Assignment-Based (Total: " + totalAssignments + " assignments)";
    }
}

class ResearchCourse extends CourseType {
    private String researchTopic;

    public ResearchCourse(String name, String researchTopic) {
        super(name);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() { return researchTopic; }

    public String getEvaluationType() {
        return "Research-Based (Topic: " + researchTopic + ")";
    }
}

class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public T getCourseType() { return courseType; }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseType.getCourseName());
        System.out.println("Evaluation: " + courseType.getEvaluationType());
    }
}

public class UniversityCourseManagement {
    public static void displayAllCourses(List<? extends CourseType> courses) {
        System.out.println("--- All Courses ---");
        for (CourseType course : courses) {
            System.out.println(course.getCourseName() + " - " + course.getEvaluationType());
        }
    }

    public static void main(String[] args) {
        Course<ExamCourse> mathCourse = new Course<>(new ExamCourse("Mathematics", 70));
        Course<AssignmentCourse> historyCourse = new Course<>(new AssignmentCourse("World History", 8));
        Course<ResearchCourse> aiCourse = new Course<>(new ResearchCourse("Artificial Intelligence", "Neural Networks"));

        System.out.println("--- Individual Course Info ---");
        mathCourse.displayCourseInfo();
        System.out.println();
        historyCourse.displayCourseInfo();
        System.out.println();
        aiCourse.displayCourseInfo();

        List<CourseType> courseList = new ArrayList<>();
        courseList.add(mathCourse.getCourseType());
        courseList.add(historyCourse.getCourseType());
        courseList.add(aiCourse.getCourseType());

        System.out.println();
        displayAllCourses(courseList);
    }
}
