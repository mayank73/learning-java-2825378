import javax.lang.model.util.ElementScanner14;

public class Triangle {
    // Non static variables which chages throughout the instances
    double base;
    double height;
    double sideOne;
    double sideTwo;
    double sideThree;
    
    // Static variable which will remain same through out the class and main class
    static int numberOfSides = 3;
    
    // Initialisation inside COnstructor
    public Triangle (double base, double height, double sideOne, double sideTwo, double sideThree) {
        this.base=base;
        this.height=height;
        this.sideOne=sideOne;
        this.sideTwo=sideTwo;
        this.sideThree=sideThree;
    }
    // Non static function
    public double calculateTriangleArea(){
        if ((this.base) < 0 || (this.height)< 0 ){
            System.out.println("Invalid Negative Base or Height");
            return -1;
        } 
        else
        return (this.base*this.height)/2;
    }

    // Not static non returning method
    public void calculateTriangleType(){
        if ((this.sideOne) < 0 || (this.sideTwo)< 0 || (this.sideThree)< 0){
            System.out.println("Not a triangle");
            System.exit(1);
        }
        else if ((this.sideOne == this.sideTwo) && (this.sideOne == this.sideThree)){    
            System.out.println("Triangle is Equlateral.");
        }
        else if ((this.sideOne == this.sideTwo) || (this.sideOne == this.sideThree) || (this.sideTwo == this.sideThree)){    
            System.out.println("Triangle is Isosceles.");
        }
        else 
        System.out.println("Triangle is Scalene.");
        }

}
