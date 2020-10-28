public class Student {
    private String firstname;
    private String lastname;
    private int classyear;

    public Student(String f, String l, int c) {
        this.firstname = f;
        this.lastname = l;
        this.classyear = c;
    }
    public Student() {
        this.firstname = "John";
        this.lastname = "Smith";
        this.classyear = 2022;
    }

    public void doSomething() {
        System.out.println("The student is doing homeowork");
    }
    public String toString() {
        String str = firstname + " " + lastname + "," + classyear;
        return str;
    }

    public String getFirstName() {
        return this.firstname;
    }

    public String getLastName() {
        return this.lastname;
    }
    public int getclassYear() {
        return this.classyear;
    }

    public void setFirstName(String firstname) {
        if (firstname.trim().length() != 0) {
            this.firstname = firstname;
        }
    }

    public void setLastName(String lastname) {
        if (lastname.trim().length() != 0) {
            this.lastname = lastname;
        }
    }

    public void setclassYear(int classyear) {
        if (classyear > 2020 && classyear <=2033) {
            this.classyear = classyear;
        }
    }


    
}