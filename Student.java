public class Student {
    public String fname;
    public String lname;
    public int indexNumber;
    public String email;
    public String address;
    public double[] grades;

    public double getGrades() {
        if (this.grades == null) {
            throw new IllegalArgumentException("Student nie ma żadnych ocen.");
        } else if (this.grades.length > 20) {
            throw new IllegalArgumentException("Student ma ponad 20 ocen.");
        } else {
            double sum = 0.0;
            double[] var3 = this.grades;
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                double x = var3[var5];
                sum += x;
            }
            return sum / (double)this.grades.length;
        }
    }
}

