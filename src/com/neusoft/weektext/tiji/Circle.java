package com.neusoft.weektext.tiji;

/**
 * @author shihaobo
 * @date 2020/8/20 21:17
 */

public class Circle {
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