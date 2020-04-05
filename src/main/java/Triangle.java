public class Triangle extends Figure {
    private int side = (int) (5 + Math.random() * 20);
    private int height = (int) (Math.random() * 20 + 10);

    public int getSide() {
        return side;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String drawFigure() {
        return "треугольник";
    }

    @Override
    public double squareFigure() {
        return (float) side * (float) height * 1 / 2f;
    }

    @Override
    public String toString() {
        System.out.println("Фигура: " + drawFigure() + ", площадь: " + squareFigure()
                + " кв. ед., длина стороны: " + getSide() + " ед., длина высоты: "
                + getHeight() + ", цвет: " + colorFigure());
        return "Фигура: " + drawFigure() + ", площадь: " + squareFigure()
                + " кв. ед., длина стороны: " + getSide() + " ед., длина высоты: "
                + getHeight() + ", цвет: " + colorFigure();
    }
}
