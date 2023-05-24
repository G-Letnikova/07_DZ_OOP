package observer;

/**
 * Интерфейс наблюдателя (соискателя, человек в поисках работы)
 */
public interface Observer {

void receiveOffer(String companyName, Vacancy vacancy);

}
