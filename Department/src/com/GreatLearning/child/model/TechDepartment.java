package com.GreatLearning.child.model;

import com.GreatLearning.department.Interface.Tech_Department;
import com.GreatLearning.parent.model.SuperDepartment;

public class TechDepartment extends SuperDepartment implements Tech_Department
{
    public String departmentName()
    {
        return "Welcome to Tech Department ";
    }

    public String getTodaysWork()
    {
        return "Complete coding of module 1";
    }

    public String  getWorkDeadline()
    {
        return "Complete by EOD";
    }

    public String  doActivity()
    {
        return "core Java";
    }
}
