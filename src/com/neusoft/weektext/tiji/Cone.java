package com.neusoft.weektext.tiji;

/**
 * @author shihaobo
 * @date 2020/8/20 21:19
 */
public class Cone<E> {
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
