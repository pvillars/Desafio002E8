package cl.anpetrus.desafio002e8.models;

/**
 * Created by Petrus on 03-09-2017.
 */

public class Credential {
    public Credential() {
    }

    private String deparment, jobTitle, name;

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
