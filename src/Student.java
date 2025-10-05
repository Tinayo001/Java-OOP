public class Student {
    private String roll;
    private String name;
    private String course;
    private double m1, m2, m3;

    // Constructor with 3 marks
    public Student(String roll, String name, String course, double m1, double m2, double m3) {
        this.roll = roll;
        this.name = name;
        this.course = course;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    // Total marks
    public double total() {
        return m1 + m2 + m3;
    }

    // Average marks
    public double average() {
        return total() / 3;
    }

    // Grade calculation
    public char grade() {
        double avg = average();
        if (avg >= 70) return 'A';
        else if (avg >= 60) return 'B';
        else if (avg >= 50) return 'C';
        else if (avg >= 40) return 'D';
        else return 'F';
    }

    public static void main(String[] args) {
        String roll = "23-45-1670";
        String name = "Tinayo Keiya";
        String course = "Computer Science";
        double m1 = 70;
        double m2 = 67;
        double m3 = 98;

        Student s1 = new Student(roll, name, course, m1, m2, m3);

        // Print details
        System.out.println("Student Details:");
        System.out.println("Roll: " + s1.roll);
        System.out.println("Name: " + s1.name);
        System.out.println("Course: " + s1.course);
        System.out.println("Total Marks: " + s1.total());
        System.out.println("Average Marks: " + s1.average());
        System.out.println("Grade: " + s1.grade());
    }
}


