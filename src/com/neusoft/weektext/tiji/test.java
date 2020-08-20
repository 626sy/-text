package com.neusoft.weektext.tiji;

import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/8/20 21:20
 */
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
