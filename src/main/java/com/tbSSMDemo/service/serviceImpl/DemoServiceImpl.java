package com.tbSSMDemo.service.serviceImpl;

import com.tbSSMDemo.dao.DemoDao;
import com.tbSSMDemo.dto.Result;
import com.tbSSMDemo.enums.ResultEnum;
import com.tbSSMDemo.exception.DemoException;
import com.tbSSMDemo.model.Demo;
import com.tbSSMDemo.service.DemoService;
import com.tbSSMDemo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("DemoService")
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoDao;

    @Override
    public Result insertDemo(Demo demo) throws DemoException {
        int i = demoDao.insertDemo(demo);
        if(i > 0) {
            return ResultUtil.success();
        }else {
            throw new DemoException(ResultEnum.INSERT_ERROR);
        }
    }

    @Override
    public Result updateDemo(Demo demo) throws DemoException {
        int i = demoDao.updateDemo(demo);
        if(i > 0) {
            return ResultUtil.success();
        }else {
            throw new DemoException(ResultEnum.UPDATE_ERROR);
        }
    }

    @Override
    public Result<List<Demo>> selectDemoArray() throws DemoException {
        List<Demo> list = demoDao.selectDemoArray();
        if(list != null && list.size() > 0) {
            return ResultUtil.success(list);
        }else {
            throw new DemoException(ResultEnum.SELECT_ERROR);
        }
    }

    @Override
    public Result<Demo> selectDemoByDemoId(Integer demoId) throws DemoException {
        Demo demo = demoDao.selectDemoByDemoId(demoId);
        if(demo != null) {
            return ResultUtil.success(demo);
        }else {
            throw new DemoException(ResultEnum.SELECT_ERROR);
        }
    }

    @Override
    public Result deleteDemoByDemoId(Integer demoId) throws DemoException {
        int i = demoDao.deleteDemoByDemoId(demoId);
        if(i > 0) {
            return ResultUtil.success();
        }else {
            throw new DemoException(ResultEnum.DELETE_ERROR);
        }
    }
}
