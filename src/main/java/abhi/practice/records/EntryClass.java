package abhi.practice.records;

public class EntryClass {

    public static void main(String[] args) {
        StudentRecord record = new StudentRecord("Abhinav", 28, new School("KR", "DH"));
        Student student = new Student("Abhinav", 28);
        System.out.println(record.school().name);
        record.school().name = "PQRS";

        //System.out.println(student);
        System.out.println(record.school().name);
    }
}
