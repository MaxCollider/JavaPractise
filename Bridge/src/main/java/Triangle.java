public class Triangle extends Shape {
    Triangle(Color color) {
        super(color);
    }

    @Override
    public void drawFigure(){
        System.out.println("This is figure");
        color.paint();
    }
}
