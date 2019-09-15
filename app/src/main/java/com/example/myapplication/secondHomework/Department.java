package com.example.myapplication.secondHomework;

//部门类，包含部门编号，部门名字，部门员工，员工数量等等
public class Department {
    private String departmentNumber;
    private String departmentName;
    private Staff[] staffs;
    private static int staffNumber=0;

    public Department() {
    }
    public Department(String departmentNumber, String departmentName) {
        this.departmentNumber = departmentNumber;
        this.departmentName = departmentName;
    }

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(String departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void addStaff(Staff staff) {
        if (staffs == null) {
            staffs=new Staff[20];
        }
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i] == null) {
                staffs[i]=staff;
                staffNumber=i+1;
                break;
            }
        }
    }

    public String getStaffNumber() {
        return getDepartmentName()+"总共有"+staffNumber+"名员员工";
    }
}
