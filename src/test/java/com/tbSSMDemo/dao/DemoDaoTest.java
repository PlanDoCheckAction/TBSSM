package com.tbSSMDemo.dao;

import com.tbSSMDemo.model.Demo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-mybatis.xml","classpath:/spring-mvc.xml"})
public class DemoDaoTest {

    @Autowired
    private DemoDao demoDao;

    @Test
    public void insertDemo() throws Exception {
        Demo demo = new Demo();
        demo.setDemoOne("88");
        demo.setDemoTwo("99");
        demoDao.insertDemo(demo);
    }

    @Test
    public void updateDemo() throws Exception {
        Demo demo = new Demo();
        demo.setDemoId(9);
        demo.setDemoOne("88");
        demo.setDemoTwo("99");
        demoDao.updateDemo(demo);
    }

    @Test
    public void selectDemoArray() throws Exception {
        List<Demo> list = demoDao.selectDemoArray();
        System.out.println(list.size());
        Demo demo = list.get(1);
        System.out.println(demo.getDemoId()+","+demo.getDemoOne()+","+demo.getDemoTwo());
        /*for (Demo d:list) {
            System.out.println(d.toString());
        }*/
    }

    @Test
    public void selectDemoByDemoId() throws Exception {
        Demo demo = demoDao.selectDemoByDemoId(10);
        System.out.println(demo);
        /*for (Demo d:list) {
            System.out.println(d.toString());
        }*/
    }

    @Test
    public void deleteDemoByDemoId() throws Exception {
        demoDao.deleteDemoByDemoId(9);
    }

}