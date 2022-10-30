import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class worker {

    private String name;
    private workerLevel level;
    private Double baseSalary;

    private departament departament;
    private List<hourContract> contracts = new ArrayList<>();

    public worker() {

    }

    public worker(String name, workerLevel level, Double baseSalary, departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<hourContract> getContracts() {
        return contracts;
    }

    public departament getDepartament() {
        return departament;
    }

    public void setDepartament(departament departament) {
        this.departament = departament;
    }

    public workerLevel getLevel() {
        return level;
    }

    public void setLevel(workerLevel level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addContract(hourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(hourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();

        for(hourContract c : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = cal.get(Calendar.MONTH);
            if() {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
