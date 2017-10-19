package com.tbSSMDemo.controller;

import com.tbSSMDemo.dto.Result;
import com.tbSSMDemo.exception.DemoException;
import com.tbSSMDemo.model.Demo;
import com.tbSSMDemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;

    @RequestMapping(value = "/insertDemo",method = RequestMethod.POST)
    @ResponseBody
    public Result insertDemo(Demo demo) throws DemoException{
        return demoService.insertDemo(demo);
    };

    @RequestMapping(value = "/updateDemo",method = RequestMethod.POST)
    @ResponseBody
    public Result updateDemo(Demo demo) throws DemoException{
        return demoService.updateDemo(demo);
    };

    @RequestMapping(value = "/selectDemoArray",method = RequestMethod.GET)
    @ResponseBody
    public Result<List<Demo>> selectDemoArray() throws DemoException{
        return demoService.selectDemoArray();
    };

    @RequestMapping(value = "/selectDemoByDemoId",method = RequestMethod.GET)
    @ResponseBody
    public Result<Demo> selectDemoByDemoId(@RequestParam("demoId") Integer demoId) throws DemoException{
        return demoService.selectDemoByDemoId(demoId);
    };

    @RequestMapping(value = "/deleteDemoByDemoId",method = RequestMethod.POST)
    @ResponseBody
    public Result deleteDemoByDemoId(@RequestParam("demoId") Integer demoId) throws DemoException{
        return demoService.deleteDemoByDemoId(demoId);
    };

}
