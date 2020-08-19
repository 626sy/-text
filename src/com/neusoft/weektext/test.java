import java.util.Scanner;
class Cone<E> {
    double height;
    E bottom;           //用泛型类E声明对象bottom
    public Cone (E b) {
        bottom=b;
    }
    public void setHeight(double h) {
        height=h;
    }
    /*
    TODO:计算体积
    功能描述：调用对象bottom的toString方法，返回字符串格式的圆面积，然后转为double类型，再根据公式计算锥形体积
    参数说明：无
    返回值说明：锥形体积    公式：1/3*底面积*高
    */
    public double computerVolume() {
        double area=Double.valueOf(bottom.toString());
        return 1.0/3*area*height;
    }
}
class Circle {
    double area,radius;
    Circle(double r) {
        radius=r;
    }
    /*
    TODO:计算面积
    功能描述：重写Object类的toString()方法，计算圆的面积
    参数说明：无
    返回值说明：圆的面积
    */
    public String toString() {
        double a=Math.PI*radius*radius;
        String area=String.valueOf(a);
        return area;
    }
}
class Rect {
    double sideA,sideB,area;
    Rect(double a,double b) {
        sideA=a;
        sideB=b;
    }
    /*
    TODO:计算面积
    功能描述：重写Object类的toString()方法，计算矩形的面积
    参数说明：无
    返回值说明：矩形的面积
    */
    public String toString() {
        double x=sideA*sideB;
        String area=String.valueOf(x);
        return area;
    }
}
public class test {
    public static void main(String args[]) {
        System.out.println("请输入圆锥的半径、高：");
        Scanner scanner = new Scanner(System.in);
        Circle circle=new Circle(scanner.nextDouble());
        Cone<Circle> coneOne=new Cone<Circle>(circle);//创建一个（圆）锥对象
        coneOne.setHeight(scanner.nextDouble());
        System.out.println("圆锥的体积："+coneOne.computerVolume());
        System.out.println("请输入方锥的长、宽、高：");
        Rect rect=new Rect(scanner.nextDouble(),scanner.nextDouble());
        Cone<Rect> coneTwo=new Cone<Rect>(rect);//创建一个（方）锥对象
        coneTwo.setHeight(scanner.nextDouble());
        System.out.println("方锥的体积："+coneTwo.computerVolume());
    }
}
