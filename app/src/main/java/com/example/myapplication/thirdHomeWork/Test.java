package com.example.myapplication.thirdHomeWork;

public class Test {
    public static void main(String[] args) {
        System.out.print("父类信息测试：");
        Work work=new Work();
        System.out.println(work.work());

        System.out.print("测试工作类信息测试：");
        TestWork testWork=new TestWork("测试",10,5);
        System.out.println(testWork.work());

        System.out.print("研发工作类信息测试：");
        DevelopmentWork developmentWork=new DevelopmentWork("研发",1000,10);
        System.out.println(developmentWork.work());
    }
}
