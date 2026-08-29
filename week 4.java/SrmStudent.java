public class SrmStudent {
    static String collegeName;
    static String academicYear;

    // Static block runs only once when the class is loaded into memory
    static {
        collegeName = "SRM";
        academicYear = "2026-2027";
        System.out.println("College info loaded");
    }

    private String name;

    public SrmStudent(String name) {
        this.name = name;
        System.out.println("Student record created: " + this.name);
    }

    public static void main(String[] args) {
        String[] names = {"Ravi", "Meera", "Karthik", "Divya", "Anitha"};

        // Creating multiple objects will not trigger the static block again
        for (String name : names) {
            new SrmStudent(name);
        }
    }
}