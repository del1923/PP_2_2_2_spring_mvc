package web.model;

public class Car {
    private String mark;        //марка
    private int model;          //модель
    private String color;       //цвет
    private int yearOfRelease;  //год выпуска

    public Car() {
    }

    public Car(String mark, int model, String color, int yearOfRelease) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.yearOfRelease = yearOfRelease;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model=" + model +
                ", color='" + color + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
