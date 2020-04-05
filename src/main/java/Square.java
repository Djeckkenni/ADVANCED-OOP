public class Square extends Figure {
    private int side = (int) (5 + Math.random() * 20);

    public int getSide() {
        return side;
    }

    @Override
    public String drawFigure() {
        return "квадрат";
    }

    @Override
    public double squareFigure() {
        return side * side;
    }

    @Override
    public String toString() {
        System.out.println("Фигура: " + drawFigure() + ", площадь: " + (int) squareFigure()
                + " кв. ед., длина стороны: " + getSide() + " ед., цвет: " + colorFigure());
        return "Фигура: " + side + " площадь: " + squareFigure() + " кв. ед., "
                + getSide() + " ед., цвет: " + colorFigure();
    }
}
