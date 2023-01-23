import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee george = new Employee("George", "Harrison", "Developer", 50000.00);
        Student ringo = new Student("Ringo", "Starr", 2.5);
        Student paul = new Student("Paul", "McCartney", 3.5);

        ArrayList<Person> people = new ArrayList<>();
        people.add(john);
        people.add(george);
        people.add(ringo);
        people.add(paul);

        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            if (person instanceof Employee) {
                System.out.println("Employee: " + person.toString() + " earns " + ((Employee) person).getSalary() + " tenge");
            } else if (person instanceof Student) {
                System.out.println("Student: " + person.toString() + " earns " + ((Student) person).getPaymentAmount() + " tenge");
            }
        }
    }
}
