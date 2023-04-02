package com.chen.ioc;

import java.util.List;

public class Department {
    private String deptName;

    private String deptLocation;

    private List<Emp> empList;

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }



    public void setDeptLocation(String deptLocation) {
        this.deptLocation = deptLocation;
    }

    public void setEmpList(List empList) {
        this.empList = empList;
    }
}
