import java.text.SimpleDateFormat;

public class hourContract {

    private SimpleDateFormat date;
    private Double valuePerHour;
    private Integer hours;

    public hourContract() {

    }

    public hourContract(SimpleDateFormat date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public SimpleDateFormat getDate() {
        return date;
    }

    public Integer getHours() {
        return hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setDate(SimpleDateFormat date) {
        this.date = date;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double totalValue() {
        return valuePerHour * hours;
    }
}
