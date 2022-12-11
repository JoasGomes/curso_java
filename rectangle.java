public class rectangle extends shape {

    private Double width;
    private Double height;

    public rectangle() {
        super();
    }

    public rectangle(color color, Double width, Double height) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }

}
