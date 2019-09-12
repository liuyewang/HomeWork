package com.example.myapplication;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 老师好这是我的作业，请查收
 */
public class HomeWork {
    //    7、在主方法中，使用case语句完成主要程序逻辑，当输入对应的数字时，调用对应的操作。
    public static void main(String[] args) {
        HomeWork homeWork = new HomeWork();
        float[] mathScore = null;
        while (true) {
            homeWork.displayMenu();
            Scanner scanner = new Scanner(System.in);
            int input = -1;
            try {
                input = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("输入的数据格式有误，不能够有非数字,请重新输入");
                scanner.next();
            }

            if (input == 0) {
                System.out.println("退出程序");
                break;
            }

            switch (input) {
                case 1:
                    mathScore = homeWork.initScore();
                case 2:
                    if (mathScore == null) {
                        System.out.println("还未初始化数学成绩,请重新选择操作");
                    } else {
                        homeWork.average(mathScore);
                    }
                    break;
                case 3:
                    if (mathScore == null) {
                        System.out.println("还未初始化数学成绩,请重新选择操作");
                    } else {
                        homeWork.count(mathScore);
                    }
                    break;
                case 4:
                    if (mathScore == null) {
                        System.out.println("还未初始化数学成绩,请重新选择操作");
                    } else {
                        try {
                            System.out.println("修改前：");
                            homeWork.displayAllScore(mathScore);
                            System.out.println("请输入要修改数据的位置(从0开始)：");
                            int index = scanner.nextInt();
                            System.out.println("请输入新数据：");
                            float newScore = scanner.nextFloat();
                            homeWork.update(mathScore, index, newScore);
                            System.out.println("修改后：");
                            homeWork.displayAllScore(mathScore);
                        } catch (InputMismatchException e) {
                            System.out.println("输入的数据格式有误，不能够有非数字,请重新输入");
                            break;
                        }catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("输入的位置有误,请重新操作");
                            break;
                        }
                    }
                    break;
                case 5:
                    if (mathScore == null) {
                        System.out.println("还未初始化数学成绩,请重新选择操作");
                    } else {
                        homeWork.displayAllScore(mathScore);
                    }
                    break;
                default:
                    System.out.println("输入的指令有误,请重新选择操作");
                    break;
            }

        }
    }

    // 1、定义一个显示菜单的方法：
    public void displayMenu() {
        System.out.println("***************************************");
        System.out.println("1--初始化数学成绩");
        System.out.println("2--求成绩的平均值");
        System.out.println("3--统计成绩大于85的人数");
        System.out.println("4--修改指定位置处的成绩");
        System.out.println("5--打印输出所有成绩");
        System.out.println("0--退出");
        System.out.println("***************************************");
        System.out.println("请输入对应的数字进行操作：");
    }

    //2、定义一个初始化数学成绩的方法，数组的长度和元素均由键盘输入。
    public float[] initScore() {
        System.out.println("请输入要存储的数学成绩的数量：");
        float[] mathScore = null;
        int length = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            length = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("输入的数据格式有误，不能够有非数字,请重新输入");
            System.out.println("请输入要存储的数学成绩的数量：");
            scanner.next();
            length = scanner.nextInt();
        }
        mathScore = new float[length];
        assert mathScore != null;
        for (int i = 0; i < mathScore.length; i++) {
            try {
                int x = i + 1;
                System.out.println("请输入第" + x + "个数据");
                mathScore[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("输入的数据格式有误，不能够有非数字,请重新输入");
                scanner.next();
                i--;
            }
        }
        return mathScore;
    }

    //3、定义一个求平均成绩的方法：
    public float average(float[] f) {
        float sum = 0;
        for (float x : f) {
            sum += x;
        }
        float average = sum / f.length;
        System.out.println("数学平均成绩为：" + average);
        return average;
    }

    //4、定义一个统计成绩大于85分的人数的方法：
    public int count(float[] f) {
        int count = 0;
        for (float x : f) {
            if (x > 85) {
                count++;
            }
        }
        System.out.println("成绩大于85分的人数为：" + count);
        return count;
    }

    //5、修改指定位置处成绩的方法：参数index为位置，从0开始，与数组下标含义相同，newScore是新的成绩。
    public void update(float[] f, int index, float newScore) {
//        if (index < 0 || index >= f.length) {
//            System.out.println("输入的修改位置有误，请重新输入");
//            return;
//        }
        f[index] = newScore;
    }

    //6、打印输出所有成绩的方法：
    public void displayAllScore(float[] f) {
        System.out.println("成绩为：");
        String str = "";
        for (float x : f) {
            str = str + x + " ";
        }
        System.out.println(str);
    }

}
