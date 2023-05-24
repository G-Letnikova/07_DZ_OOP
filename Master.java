package observer;

public class Master implements Observer {
    private  String name;
    private double salary;

    public Master(String name) {
        this.name = name;
        salary = 80000;
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy) {
        if (this.salary < vacancy.getSalary()){
            System.out.printf("Мастер %s >>> Мне нужна эта работа! [%s - %s - %.1f]\n", name, companyName, vacancy.getVacancyName(),vacancy.getSalary());
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("Мастер %s >>> Я найду работу получше! [%s - %s - %.1f]\n", name, companyName, vacancy.getVacancyName(),vacancy.getSalary());
        }
    }

}
