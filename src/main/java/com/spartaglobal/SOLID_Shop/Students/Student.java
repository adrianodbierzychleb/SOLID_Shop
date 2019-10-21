package com.spartaglobal.SOLID_Shop.Students;

public class Student implements IStudents{
    private String firstName;
    private String lastName;
    private String stream;
    private boolean hasLaptop;

    public Student(String firstName, String lastName, String stream) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.stream = stream;
    }
    @Override
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Override
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String getStream() {
        return stream;
    }

    @Override
    public boolean hasLaptop() {
        return hasLaptop;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }


    public void setHasLaptop(boolean hasLaptop) {
        this.hasLaptop = hasLaptop;
    }
}
