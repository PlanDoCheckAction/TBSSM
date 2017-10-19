package com.tbSSMDemo.service;

import com.tbSSMDemo.dto.Result;
import com.tbSSMDemo.model.Demo;

import java.util.List;

public interface DemoService {
    public Result insertDemo(Demo demo);

    public Result updateDemo(Demo demo);

    public Result<List<Demo>> selectDemoArray();

    public Result<Demo> selectDemoByDemoId(Integer demoId);

    public Result deleteDemoByDemoId(Integer demoId);
}
