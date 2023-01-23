class Student extends Person {
    private double gpa;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return "Student: " + super.toString();
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36660.00;
        }
        return 0.0;
    }

    @Override
    public int compareTo(Person other) {
        if (other instanceof Student) {
            return Double.compare(this.getGpa(), ((Student) other).getGpa());
        }
        return super.compareTo(other);
    }

}
