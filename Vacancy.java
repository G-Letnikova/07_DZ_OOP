package observer;

import java.util.Random;

public class Vacancy {
    private double salary;
    private String[] vacansyList;
    private String vacancyName;


    public Vacancy() {
        this.salary =  new Random().nextDouble(3000, 100000);
        this.vacansyList = new String[] {"Analyst","Python Developer","Java Developer"} ;
        this.vacancyName =  vacansyList[new Random().nextInt(vacansyList.length)];

    }

    public String getVacancyName() {
        return vacancyName;
    }

    public double getSalary() {
        return salary;
    }

}

