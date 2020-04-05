public class Trapeze extends Figure {
    private int littleBase = (int) (5 + Math.random() * 10);
    private int bigBase = (int) (Math.random() * 10 + 20);
    private int height = (int) (Math.random() * 15 + 5);

    public int getLittleBase() {
        return littleBase;
    }

    public int getBigBase() {
        return bigBase;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String drawFigure() {
        return "трапеция";
    }

    @Override
    public double squareFigure() {
        return 1 / 2.0 * (littleBase + bigBase) * height;
    }

    @Override
    public String toString() {
        System.out.println("Фигура: " + drawFigure() + ", площадь: " + squareFigure()
                + " кв. ед., длина верхнего основания: " + getLittleBase() + " ед., длина нижнего основания: "
                + getBigBase() + " ед., длина высоты: " + getHeight() + " ед., цвет: " + colorFigure());
        return "Фигура: " + drawFigure() + ", площадь: " + squareFigure()
                + " кв. ед., длина верхнего основания: " + getLittleBase() + " ед., длина нижнего основания: "
                + getBigBase() + " ед., длина высоты: " + getHeight() + " ед., цвет: " + colorFigure();
    }
}
