import java.util.Random;

public class Figure {
    public String drawFigure() {
        return "фигура";
    }

    public double squareFigure() {
        return 0.0;
    }

    public ColorFig colorFigure() {
        return ColorFig.values()[new Random().nextInt(ColorFig.values().length)];
    }

    public FigureEnum[] arrayFigure() {
        FigureEnum[] array = new FigureEnum[3 + (int) Math.random() * 20];//3+ обавила, чтобі не відавало массив 0
        if (array.length == 0) {
            System.out.println("Array is empty");
            return new FigureEnum[0];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = FigureEnum.values()[new Random().nextInt(FigureEnum.values().length)];
            array[i].toString();
        }
        return array;
    }
}
