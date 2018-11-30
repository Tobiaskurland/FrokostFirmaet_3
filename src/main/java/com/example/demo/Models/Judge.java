package com.example.demo.Models;

public class Judge extends User{

    private String firstName;
    private String lastName;
    private String profession;
    private String jobdescription;
    private boolean verified;

    public Judge(String firstName, String lastName, String profession, String jobdescription, boolean verified) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.profession = profession;
        this.jobdescription = jobdescription;
        this.verified = verified;
    }

    public Judge(int id, String username, String password, int role, String firstName, String lastName, String profession, String jobdescription, boolean verified) {
        super(id, username, password, role);
        this.firstName = firstName;
        this.lastName = lastName;
        this.profession = profession;
        this.jobdescription = jobdescription;
        this.verified = verified;
        super.setRole(3);
    }

    public Judge() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getJobdescription() {
        return jobdescription;
    }

    public void setJobdescription(String jobdescription) {
        this.jobdescription = jobdescription;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    @Override
    public int getRole() {
        return super.getRole();
    }

    @Override
    public void setRole(int role) {
        super.setRole(3);
    }

    @Override
    public String toString() {
        return "Judge{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", profession='" + profession + '\'' +
                ", description='" + jobdescription + '\'' +
                ", verified=" + verified +
                '}';
    }
}
