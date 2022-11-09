package entities;

public class Instructor {
    public int instructorId;
    public String instructorFirstName;
    public String instructorLastName;

    public Instructor(int instructorId, String instructorFirstName, String instructorLastName){
        this.instructorId= instructorId;
        this.instructorFirstName=instructorFirstName;
        this.instructorLastName=instructorLastName;
    }

    public Instructor() {

    }


    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorFirstName() {
        return instructorFirstName;
    }

    public void setInstructorFirstName(String instructorFirstName) {
        this.instructorFirstName = instructorFirstName;
    }

    public String getInstructorLastName() {
        return instructorLastName;
    }

    public void setInstructorLastName(String instructorLastName) {
        this.instructorLastName = instructorLastName;
    }
}