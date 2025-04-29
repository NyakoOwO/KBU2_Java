import java.io.IOException;

public interface Method extends Symbol{
    void inputData(String type) throws IOException;
    int salary();
    int salaryBonus();
    int tax();
    int gross();

    default int net() {
        return gross() - tax();
    }
}
