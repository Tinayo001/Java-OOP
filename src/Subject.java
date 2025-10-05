public class Subject {
    private String subjId;
    private String name;
    private int maxMarks;
    private int marksObtain;

    Subject(String subjId, String name) {
        this.subjId = subjId;
        this.name = name;
        this.maxMarks = 0;
        this.marksObtain = 0;
    }
    Subject(String subjId, String name, int maxMarks, int marksObtain) {
        this.maxMarks = maxMarks;
        this.marksObtain = marksObtain;
        this.subjId = subjId;
        this.name = name;
    }
    public String getSubjId() {
        return subjId;
    }
    public String getName() {
        return name;
    }
    public int getMaxMarks() {
        return maxMarks;
    }
    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }
    public int getMarksObtain() {
        return marksObtain;
    }
    public void setMarksObtain(int marksObtain) {
        this.marksObtain = marksObtain;
    }

    @Override
    public String toString() {
        return "\nSubject ID:" + subjId + "\nname : " + name + "\nMarks obtained : " + marksObtain;
    }

    public static void main(String[] args) {
        Subject subject[] = new Subject[3];
        subject[0] = new Subject("LLB101", "lAW");
        subject[1] = new Subject("DSA101", "Data Structures");
        subject[2] = new Subject("COMP123", "Computer Science");

        subject[0].setMarksObtain(35);
        subject[1].setMarksObtain(66);
        subject[2].setMarksObtain(89);

        for (Subject s : subject) {
            System.out.println(s);
        }
    }
}
