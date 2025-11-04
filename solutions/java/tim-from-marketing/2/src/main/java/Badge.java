public class Badge {

    public String print(Integer id, String name, String department) {
        // If department is null, treat them as "OWNER"
        String departmentLabel = (department == null) ? "OWNER" : department.toUpperCase();

        // If ID is null → omit it
        if (id == null) {
            return name + " - " + departmentLabel;
        }

        // Otherwise → include ID
        return "[" + id + "] - " + name + " - " + departmentLabel;
    }
}



