package com.example.myapplication.thirdHomeWork;

public class DevelopmentWork extends Work {
    // 属性：有效编码行数、目前没有解决的Bug个数
    private int codeRows;
    private int unresolvedBugs;
    //编写构造方法，并调用父类相关赋值方法，完成属性赋值
    public DevelopmentWork(int codeRows, int unresolvedBugs) {
        this.codeRows = codeRows;
        this.unresolvedBugs = unresolvedBugs;
    }

    public DevelopmentWork(String workName, int codeRows, int unresolvedBugs) {
        super(workName);
        this.codeRows = codeRows;
        this.unresolvedBugs = unresolvedBugs;
    }
    // 公有的get***/set***方法完成属性封装
    public int getCodeRows() {
        return codeRows;
    }

    public void setCodeRows(int codeRows) {
        this.codeRows = codeRows;
    }

    public int getUnresolvedBugs() {
        return unresolvedBugs;
    }

    public void setUnresolvedBugs(int unresolvedBugs) {
        this.unresolvedBugs = unresolvedBugs;
    }

    // 重写运行方法，描述内容为：**的日报是：今天编写了**行代码，目前仍然有**个bug没有解决。其中**的数据由属性提供
    @Override
    public String work() {
        return getName()+"工作的日报是：今天编写了"
                +getCodeRows()
                +"行代码，目前仍然有"
                +getUnresolvedBugs()+"个bug未解决";
    }
}
