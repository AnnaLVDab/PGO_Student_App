public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.fname = "Anna";
        s1.lname = "Dabrowska";
        s1.indexNumber = 29818;
        s1.email = "s29818@pjwstk.edu.pl";
        s1.address = "Mieszkanie 1";
        s1.grades = new double[]{2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0};
        System.out.println(s1.fname+" "+s1.lname+" "+" "+s1.indexNumber+" "+s1.email+" "+" "+s1.address+" "+" Średnia: "+s1.getGrades());

        StudentGroup g1 = new StudentGroup();
        g1.groupName = "Grupa 1";
        g1.AddStudent(s1);


        s2.fname = "Kacper";
        s2.lname = "Kowalski";
        s2.indexNumber = 12345;
        s2.email = "kacper@mail.pl";
        s2.address = "Dom 2";
        s2.grades = new double[]{2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0};
        System.out.println(s2.fname+" "+s2.lname+" "+" "+s2.indexNumber+" "+s2.email+" "+" "+s2.address+" "+" Średnia: "+s2.getGrades());

        StudentGroup g2 = new StudentGroup();
        g2.groupName = "Grupa 2";
        g2.AddStudent(s2);

    }
}
