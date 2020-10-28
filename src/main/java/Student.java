public class Student extends Person {
    private int classYear;

    public Student(String a, String b, int c) {
        super(a, b);
        // this.firstName = a;
        // this.lastName = b;
        this.classYear = c;
    }

    public Student() {
        super("Jerry", "Seinfield");
        // this.firstName = "Jerry";
        // this.lastName = "Seinfield";
        this.classYear = 2024;

    }

    public String toString() {
        String str = this.getFirstName() + " " + this.getLastName() + ", " + this.classYear;
        return str;
    }

    public int getclassYear() {
        return this.classYear;
    }
    public void setclassYear(int classYear) {
        if (classYear > 2020 && classYear <= 2025) {
            this.classYear = classYear;
        }
        
    }




}