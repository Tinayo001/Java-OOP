public class Badge {

    public String print(Integer id, String name, String department) {
        // If department is null, treat them as "OWNER"
        String departmentLabel = (department == null) ? "OWNER" : department.toUpperCase();

        if (id == null) {
            // No ID → omit ID prefix
            return String.format("%s - %s", name, departmentLabel);
        }

        // Has ID → include it
        return String.format("[%d] - %s - %s", id, name, departmentLabel);
    }
}


