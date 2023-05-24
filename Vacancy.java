package observer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Vacancy {
    private double salary;
    // private String[] vacansyList;
    private ArrayList<String> vacansyList;
    private String vacancyName;


    public Vacancy() {
        this.salary =  new Random().nextDouble(3000, 100000);
        this.vacansyList = new ArrayList<String>(Arrays.asList("Analyst","Python Developer","Java Developer")) ;
        this.vacancyName =  vacansyList.get(new Random().nextInt(vacansyList.size()));

    }

    public String getVacancyName() {
        return vacancyName;
    }

    public double getSalary() {
        return salary;
    }

}