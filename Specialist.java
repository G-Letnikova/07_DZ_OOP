package observer;

public class Specialist implements Observer {

    private  String name;
    private double salary;

    public Specialist(String name) {
        this.name = name;
        salary = 65000;
    }

@Override
public void receiveOffer(String companyName, Vacancy vacancy) {
    if (this.salary < vacancy.getSalary()){
        System.out.printf("Специалист %s >>> Мне нужна эта работа! [%s - %s - %.1f]\n", name, companyName, vacancy.getVacancyName(),vacancy.getSalary());
        this.salary = vacancy.getSalary();
    }
    else {
        System.out.printf("Специалист %s >>> Я найду работу получше! [%s - %s - %.1f]\n", name, companyName, vacancy.getVacancyName(),vacancy.getSalary());
    }
}

}
