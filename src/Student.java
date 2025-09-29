public class Student {
    private String name;
    private double height;

    public Student(String name, double height) {
        this.name = name;
        this.height = height;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for height
    public double getHeight() {
        return height;
    }

    // setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    public static void main(String[] args) {
        String name = "Tinayo Keiya";
        double height = 180.0;

        Student s1 = new Student(name, height);

        // fixed println
        System.out.println("The student's details are: Name : " + s1.getName() + ", Height : " + s1.getHeight());
    }
}

