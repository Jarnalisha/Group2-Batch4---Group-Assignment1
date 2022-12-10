package com.GreatLearning.child.model;

import com.GreatLearning.department.Interface.Admin_Department;
import com.GreatLearning.department.Interface.Super_Department;
import com.GreatLearning.parent.model.SuperDepartment;


public class AdminDepartment extends SuperDepartment implements Admin_Department
{
    public String departmentName()
    {
        return "Welcome to Admin Department";
    }

    public String getTodaysWork()
    {
        return "Complete your documents Submission";
    }

    public String  getWorkDeadline()
    {
        return "Complete by EOD";
    }

}
