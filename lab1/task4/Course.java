package lab1.task4;

import java.util.ArrayList;

public class Course {
    private String name;
    private String description;
    private int numberOfCredits;
    private ArrayList<String> prerequisites;

    Course() {

    }

    Course(String name, String description, int numberOfCredits, ArrayList<String> prerequisites) {
        this.name = name;
        this.description = description;
        this.numberOfCredits = numberOfCredits;
        this.prerequisites = prerequisites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getNameDescription() {
        return name + " " + description;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public ArrayList<String> getPrerequisites() {
        return prerequisites;
    }

    public String toString() {
        String prerequisitesString = "";
        for (String prerequisite : prerequisites) {
            prerequisitesString += prerequisite + "\n";
        }
        return "Name - " + name + "\n Description - " + description + "\n Number of Credits - " + numberOfCredits + "\n" + "Prerequisites - " + prerequisitesString;
    }
}
