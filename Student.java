package observer;

public class Student implements Observer {

    private  String name;
    private double salary;

    public Student(String name) {
        this.name = name;
        salary = 5000;
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy) {
        if (this.salary < vacancy.getSalary()){
            System.out.printf("Студент %s >>> Мне нужна эта работа! [%s - %s - %.1f]\n", name, companyName, vacancy.getVacancyName(),vacancy.getSalary());
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("Студент %s >>> Я найду работу получше! [%s - %s - %.1f]\n", name, companyName, vacancy.getVacancyName(),vacancy.getSalary());
        }
    }

}
