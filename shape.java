public abstract class shape {
    private color color;

    public shape() {
    }

    public shape(color color) {
        this.color = color;
    }

    public color getColor() {
        return color;
    }

    public void setColor(color color) {
        this.color = color;
    }

    public abstract double area();
}
