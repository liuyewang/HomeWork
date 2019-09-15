package com.example.myapplication.secondHomework;
//员工测试类，测试员工、部门、职务等关系能否正常添加
public class StaffTest {
    public static void main(String[] args) {
        Department department1=new Department("1","人事部");
        Department department2=new Department("2","市场部");
        Post post1=new Post("s1","经理");
        Post post2=new Post("s2","助理");
        Post post3=new Post("s3","职员");
        Staff staff1=new Staff("张铭","S001","男",29,post1,department1);
        Staff staff2=new Staff("李艾爱","S002","女",21,post2,department1);
        Staff staff4=new Staff("孙超","S004","男",29,post3,department1);
        Staff staff5=new Staff("张美美","S005","女",26,post3,department2);
        Staff staff6=new Staff("蓝迪","S006","男",37,post1,department2);
        Staff staff7=new Staff("米莉","S007","女",24,post3,department2);
        System.out.println(staff1.getIntroduce());
        System.out.println(staff2.getIntroduce());
        System.out.println(staff4.getIntroduce());
        System.out.println(staff5.getIntroduce());
        System.out.println(staff6.getIntroduce());
        System.out.println(staff7.getIntroduce());

        department1.addStaff(staff1);
        department1.addStaff(staff2);
        department1.addStaff(staff4);
        department2.addStaff(staff5);
        department2.addStaff(staff6);
        department2.addStaff(staff7);
        System.out.println(department1.getStaffNumber());
        System.out.println(department2.getStaffNumber());
    }
}
