package com.neusoft.weektext;

import java.util.*;
/**
 * 描述：从大到小打印学生的：学号+姓名+成绩
 * 某班有 40 个学生，学号为 180201-180240， 全部参加 Java 集合阶段检测，
 * 给出所有同学的成绩 （可随机产生，范围为 50-100），
 * 请编写程序将本班 各位同学成绩从高往低排序打印输出，
 * 注：成绩相同时学号较小的优先打印 要
 * 求：打印的信息包含学号、姓名（姓名统一为 “同学 J”[J=10,11,12。。。]）和成绩 。
 * @author shihaobo
 * @date 2020/8/20 21:31
 */


public class Studentprint {
    private static List<Student> data = new ArrayList<Student>();

    static class Student{
        private int id;
        private String name;
        private int score;

        public Student(int id,String name,int score){
            this.id = id;
            this.name = name;
            this.score = score;
        }
        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public int getScore() {
            return score;
        }

        public String toString() {
            return "学号：" + id +
                    ", 姓名：" + name  +
                    ", 成绩：" + score ;
        }
    }
    public static void initData(){
        int j = 10;
        Random random = new Random();
        for (int i = 0;i < 40;++i){
            data.add(new Student(180201+i,"同学"+(i+j),random.nextInt(51)+50));
        }
    }

    public static void adjust(){
        PriorityQueue<Student> queue = new PriorityQueue<Student>(11, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getScore() == o2.getScore()) {
                    return o1.getId() - o2.getId();
                }
                return o2.getScore() - o1.getScore();
            }
        });
        Iterator<Student> iterator1 = data.iterator();
        while (iterator1.hasNext()){
            queue.add(iterator1.next());
        }

        for (int i = 0; i < 40; i++) {
            System.out.println(queue.remove());
        }


        /**Iterator<Student> iterator2 = queue.iterator();
         while (iterator2.hasNext()){
         Student next1 = iterator2.next();
         int id = next1.getId();
         String name = next1.getName();
         int score = next1.getScore();
         System.out.println("学号："+id+" 姓名："+name+" 成绩："+score);
         }*/


    }
    public static void print(){
        Iterator<Student> iterator = data.iterator();
        while (iterator.hasNext()){
            Student next1 = iterator.next();
            int id = next1.getId();
            String name = next1.getName();
            int score = next1.getScore();
            System.out.println("学号："+id+" 姓名："+name+" 成绩："+score);
        }
    }



    public static void main(String[] args) {
        Studentprint studentprint = new Studentprint();
        initData();
        adjust();
    }

}
