import java.util.*;

// Abstract class representing a Job Role
abstract class JobRole {
    private String candidateName;
    private String resumeContent;

    public JobRole(String candidateName, String resumeContent) {
        this.candidateName = candidateName;
        this.resumeContent = resumeContent;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getResumeContent() {
        return resumeContent;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - Candidate: " + candidateName;
    }
}

// Specific job roles
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, String resumeContent) {
        super(candidateName, resumeContent);
    }
}

class DataScientist extends JobRole {
    public DataScientist(String candidateName, String resumeContent) {
        super(candidateName, resumeContent);
    }
}

class ProductManager extends JobRole {
    public ProductManager(String candidateName, String resumeContent) {
        super(candidateName, resumeContent);
    }
}

// Generic Resume class
class Resume<T extends JobRole> {
    private List<T> resumes = new ArrayList<>();

    public void addResume(T resume) {
        resumes.add(resume);
    }

    public List<T> getResumes() {
        return resumes;
    }
}

// Utility class for screening resumes
class ResumeScreeningUtil {
    public static void screenResumes(List<? extends JobRole> resumes) {
        System.out.println("Screening Resumes:");
        for (JobRole resume : resumes) {
            System.out.println(resume);
        }
    }
}

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> softwareResumes = new Resume<>();
        softwareResumes.addResume(new SoftwareEngineer("Aditya", "Java, Spring Boot, Microservices"));
        softwareResumes.addResume(new SoftwareEngineer("Yash", "Python, Django, REST APIs"));

        Resume<DataScientist> dataResumes = new Resume<>();
        dataResumes.addResume(new DataScientist("Anirudh", "Machine Learning, TensorFlow, Data Analysis"));
        dataResumes.addResume(new DataScientist("Adarsh", "Deep Learning, NLP, Big Data"));

        System.out.println("Software Engineer Resumes:");
        ResumeScreeningUtil.screenResumes(softwareResumes.getResumes());
        
        System.out.println("\nData Scientist Resumes:");
        ResumeScreeningUtil.screenResumes(dataResumes.getResumes());
    }
}