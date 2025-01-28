package abhi.practice.records;

import java.util.Objects;

public final record StudentRecord(String name, int age, School school){

    public StudentRecord(School school) {

        this("Name", 25, school);
    }

}
