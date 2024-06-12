import java.util.ArrayList;
public class StudentGroup extends Student {
        public String groupName;
        private ArrayList<Student> Students;

        public StudentGroup() {
            Students = new ArrayList<Student>();
        }

        public void AddStudent(Student st)
        {
            if(Students.size() >= 15){
                throw new IllegalStateException("Liczba studentów w grupie jest większa od 15!");
            }
            if(Students.add(st));{
                throw new IllegalStateException("Student jest już dodany do tej grupy.");
        }
    }
}
