public class Rectangle{
    private Point tobleLeft;
    private int sideA, sideB;

    public Rectangle(Point tobleLeft, int sideA, int sideB) {
        this.tobleLeft = tobleLeft;
        setSideA(sideA);
        setSideB(sideB);
    }

    public Rectangle(Point tobleLeft, int sideA) {
        this.tobleLeft = tobleLeft;
        setSideA(sideA);
        setSideB(sideB);
    }

    public Point getTobleLeft() {
        return tobleLeft;
    }

    public void setTobleLeft(Point tobleLeft) {
        this.tobleLeft = tobleLeft;

    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
        if(sideA < 0){
            System.out.println("Side A can't be negative!");
        }else{
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;

    }
    public void setSideB(int sideB) {
        this.sideB = sideB;
        if(sideB < 0){
            System.out.println("Side B can't be negative!");
        }else{
            this.sideB = sideB;
        }
    }
    public int perimeter(){
        return (2*sideA) + (2*sideB);
    }
    public int area(){
        return sideB*sideB;
    }
}
