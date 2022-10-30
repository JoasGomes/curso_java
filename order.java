import java.text.SimpleDateFormat;

public class order {

    private Integer id;
    private SimpleDateFormat moment;
    private order_status status;

    public order() {
    }

    public order(Integer id, SimpleDateFormat moment, order_status status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public SimpleDateFormat getMoment() {
        return moment;
    }

    public order_status getStatus() {
        return status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMoment(SimpleDateFormat moment) {
        this.moment = moment;
    }

    public void setStatus(order_status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "id =" + id + ", " + "moment = " + moment + ", " + "status = " + status;
    }
}
