import java.time.LocalDate;
import java.util.List;

public class DuckDuck extends Animal{
    public DuckDuck(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
        System.out.println("DUCKDUCKKK!!!");
    }
}
