import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class AdminPanel {
    //Create , Read, Delete, Update 
    ArrayList <Student>student = new ArrayList<>();

    public ArrayList<Student> getStudentList()
    {
        return student;
    }

    public void createStudent(Student s)
    {   
        student.add(s);
    }

    public Student searchStudent(String id)
    {
        for(Student s : student)
        {
            if(s.getStudentId().equals(id))
            {
                return s;
            }
        }
        return null;
    }

    public void deleteStudent(String id)
    {
        for(Student s : student)
        {
            try {
                if(s.getStudentId().equalsIgnoreCase(id))
                {
                    student.remove(s);
                }  
            } catch (ConcurrentModificationException e) {
                System.out.println(e);
            }
            
        }
    }
}
