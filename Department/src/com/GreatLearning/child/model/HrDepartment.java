package com.GreatLearning.child.model;

import com.GreatLearning.department.Interface.Hr_Department;

import com.GreatLearning.parent.model.SuperDepartment;

public class HrDepartment extends SuperDepartment implements Hr_Department
{
    public String departmentName()
    {
        return "Welcom to Hr Department";
    }

    public String getTodaysWork()
    {
        return "Fill today's timesheet and mark your attendance";
    }

    public String  getWorkDeadline()
    {
        return "Complete by EOD";
    }

    public String  doActivity()
    {
        return "team Lunch";
    }
}
