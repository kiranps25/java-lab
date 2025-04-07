
 class Shape {

    public double area(){
    return 0.0;
    }
}


class Rectangle extends Shape {
     double length;
     double width;

    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    
    public double area() {
        return length * width;
    }
}


class Circle extends Shape {
     double radius;

    
    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double area() {
        return Math.PI * radius * radius;
    }
}


class Square extends Shape {
     double side;

    
    public Square(double side) {
        this.side = side;
    }



   public double area() {
        return side * side;
    }




    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        Shape square = new Square(4);


        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Square: " + square.area());
    }
}

