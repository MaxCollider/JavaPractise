public abstract class Shape {
    Color color;

    Shape(Color color){
        this.color = color;
    }
    public void drawFigure() {
        System.out.println("This is figure");
        color.paint();
    }
}
