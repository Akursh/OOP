package homeWorkMaster;

import java.time.LocalDate;

public class Person {
    public String fullName;
    public String fullName2;
    public int age2;
    private LocalDate age;

    public Person(String fullName, Sex woman, LocalDate localDate) {
        this.fullName = fullName;
        this.age = localDate;
    }

    public Person(String fullName2, Sex man, int age2) {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

}
