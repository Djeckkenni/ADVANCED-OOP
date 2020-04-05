public class Circle extends Figure {
    private int radius = (int) (5 + Math.random() * 20);

    public int getRadius() {
        return radius;
    }

    @Override
    public String drawFigure() {
        return "круг";
    }

    @Override
    public double squareFigure() {
        double scale = Math.pow(10, 1);
        return Math.round(2 * Math.PI * radius * radius * scale) / scale;
    }

    @Override
    public String toString() {
        System.out.println("Фигура: " + drawFigure() + ", площадь: " + squareFigure()
                + " кв. ед., длина радиуса: " + getRadius() + ", цвет: " + colorFigure());
        return "Фигура: " + drawFigure() + ", площадь: " + squareFigure()
                + " кв. ед., длина радиуса: " + getRadius() + ", цвет: " + colorFigure();
    }
}
