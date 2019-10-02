public class Circle extends Shape {
    private double radius = 1.0;
     public Circle(){}
     public Circle(double radius){
         this.radius = radius;
     }
     public Circle(double radius, String color, Boolean filled){
         super(color, filled);
         this.radius = radius;
     }
     public double getRadius(){
         return this.radius;
     }
     public void setRadius(double radius){
         this.radius = radius;
     }
     public double getArea(){
         return Math.PI * radius * radius;
     }
     public double getPerimeter(){
         return 2 * Math.PI * radius;
     }

    @Override
    public String toString() {
        return " A Circle with radius = "
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "blue", false);
        System.out.println(circle);
    }
}
