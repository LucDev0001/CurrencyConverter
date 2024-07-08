import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConversionHistory {
    private List<String> history;

    public ConversionHistory() {
        this.history = new ArrayList<>();
    }

    public void addEntry(String entry) {
        history.add(entry);
    }

    public void showHistory() {
        System.out.println("Histórico de Conversões:");
        for (String entry : history) {
            System.out.println(entry);
        }
    }
}
