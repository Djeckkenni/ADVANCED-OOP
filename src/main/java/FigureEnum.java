public enum FigureEnum {
    CIRCLE {
        @Override
        public String toString() {
            Circle circle = new Circle();
            return circle.toString();
        }
    },

    SQUARE {
        @Override
        public String toString() {
            Square square = new Square();
            return square.toString();
        }
    },

    TRIANGLE {
        @Override
        public String toString() {
            Triangle triangle = new Triangle();
            return triangle.toString();
        }
    },

    TRAPEZE {
        @Override
        public String toString() {
            Trapeze trapeze = new Trapeze();
            return trapeze.toString();
        }
    }
}
