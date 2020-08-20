package com.neusoft.weektext.tiji;

/**
 * @author shihaobo
 * @date 2020/8/20 21:18
 */
public class Rect {
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
