package com.app.core;

public class Faculty extends Person {
    private int yrsOfExperience;
    private String sme;

    public Faculty(String firstName, String lastName, int yrs, String sme) {
        super(firstName, lastName);

        System.out.println("In faculty");
        this.yrsOfExperience = yrs;
        this.sme = sme;
    }

    @Override
    public String toString() {
        return "Faculty[" + super.toString() + ", Experience:" + yrsOfExperience +
                "yrs, SME:" + sme + "]";
    }

    public void teach() {
        System.out.println(getFirstName() + " expert in " + sme);
    }
}
