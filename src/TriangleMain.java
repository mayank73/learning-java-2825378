public class TriangleMain {
    public static void main(String[] args) {
        Triangle TriangleE = new Triangle(10, 5, 10, 10, 10);
        Triangle TriangleI = new Triangle(10, 5, 10, 10, 8);
        Triangle TriangleS = new Triangle(10, 5, 10, 5, 12);
    
// Equivalent triangle 
    System.out.println("Triangles have "+ Triangle.numberOfSides+ " sides.");
    System.out.println("Area of Equivalent triangle with base and height resp. :");
    System.out.println(TriangleE.base);
    System.out.println(TriangleE.height);
    double areaTriangleE = TriangleE.calculateTriangleArea();
    System.out.println("is " + areaTriangleE);
    TriangleE.calculateTriangleType();

// Isosceles triangle 
    System.out.println(" ");
    System.out.println("Area of Isosceles triangle with base and height resp. :");
    System.out.println(TriangleI.base);
    System.out.println(TriangleI.height);
    double areaTriangleI = TriangleI.calculateTriangleArea();
    System.out.println("is " + areaTriangleI);
    TriangleI.calculateTriangleType();

// Scalene triangle 
    System.out.println(" ");
    System.out.println("Area of Equivalent triangle with base and height resp. :");
    System.out.println(TriangleS.base);
    System.out.println(TriangleS.height);
    double areaTriangleS = TriangleS.calculateTriangleArea();
    System.out.println("is " + areaTriangleS);
    TriangleS.calculateTriangleType();

}
}
