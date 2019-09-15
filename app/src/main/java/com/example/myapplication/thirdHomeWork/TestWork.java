package com.example.myapplication.thirdHomeWork;

public class TestWork extends Work {
    //属性：编写的测试用例个数、发现的Bug数量
    private int testNumber;
    private int bugNumber;
    // 编写构造方法，并调用父类相关赋值方法，完成属性赋值
    public  TestWork() {

    }

    public TestWork(int testNumber, int bugNumber) {
        this.testNumber = testNumber;
        this.bugNumber = bugNumber;
    }

    public TestWork(String workName, int testNumber, int bugNumber) {
        super(workName);
        this.testNumber = testNumber;
        this.bugNumber = bugNumber;
    }
    // 公有的get***/set***方法完成属性封装
    public int getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(int testNumber) {
        this.testNumber = testNumber;
    }

    public int getBugNumber() {
        return bugNumber;
    }

    public void setBugNumber(int bugNumber) {
        this.bugNumber = bugNumber;
    }

    // 重写运行方法，描述内容为：**的日报是：今天编写了**个测试用例，发现了**bug。其中**的数据由属性提供
    @Override
    public String work() {
        return getName()+
                "工作的日报是：今天编写了"
                +getTestNumber()+"个测试用例，发现了"
                +getBugNumber()+"个bug";
    }
}
