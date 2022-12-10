package com.GreatLearning.parent.model;

import com.GreatLearning.department.Interface.Super_Department;

public class SuperDepartment implements Super_Department
{
    public String departmentName()
    {
        return "Welcome to Super Department";
    }

    public String getTodaysWork()
    {
        return "No Work as of now";
    }

    public String  getWorkDeadline()
    {
        return "Nil ";
    }

    public String  isTodayAHoliday()
    {
        return "Today is not a holiday";
    }

}

