package com.example.myapplication.secondHomework;
//员工类，包含员工名字、工号、性别、年龄、职务、部门
public class Staff {
    String name;
    String jobNumber;
    String sex;
    int age;
    Post post;
    Department department;

    public Staff() {
    }

    public Staff(String name, String jobNumber, String sex, int age, Post post, Department department) {
        this.name = name;
        this.jobNumber = jobNumber;
        this.sex = sex;
        this.age = age;
        this.post = post;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getSex() {
        return sex;
    }
//       2、 设定方法限定性别只能是“男”或者“女”,反之则设置默认为"男"
    public void setSex(String sex) {
        if (sex.equals("男") || sex.equals("女")) {
            this.sex = sex;
        } else {
            this.sex = "男";
        }
    }
    public int getAge() {
        return age;
    }

//    1.设定方法限定年龄只能是18--65之间,反之则设置默认为18岁
    public void setAge(int age) {
        if (age < 18 || age > 65) {
            this.age=18;
            return;
        }
        this.age = age;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    /*    3、 设定方法，实现员工自我介绍信息，将员工信息作为字符串返回*/
    public String getIntroduce() {
        String str="";
        str+="姓名："+getName()+"\n"+
        "工号："+getJobNumber()+"\n"+
        "性别："+getSex()+"\n"+
        "年龄："+getAge()+"\n"+
        "职务："+getDepartment().getDepartmentName()+getPost().getPostName()+"\n"+
        "===================================";
        return str;
    }
}
