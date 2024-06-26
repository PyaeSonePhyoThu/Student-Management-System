public class Student {
    private String studentId;
    private String name;
    private String course;

    public Student(String studentId, String name, String course)
    {
        setStudentId(studentId);
        setName(name);
        setCourse(course);
    }

    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student Id : " + getStudentId() + " | Student Name : " + getName() + " | Course : " + getCourse();
    }

}
