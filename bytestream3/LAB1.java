package bytestream3;
public class LAB1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator redC = new RedShapeDecorator(circle);
        redC.draw();
        Rectangle rectangle =  new Rectangle();
        RedShapeDecorator redR =  new RedShapeDecorator(rectangle);
        redR.draw();
    }
   
    
}