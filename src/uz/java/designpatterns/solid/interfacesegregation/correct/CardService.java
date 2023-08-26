package uz.java.designpatterns.solid.interfacesegregation.correct;

public interface CardService {
    void blockCard(String carNumber) throws IllegalAccessException;

    void unblockCard(String carNumber) throws IllegalAccessException;
}
