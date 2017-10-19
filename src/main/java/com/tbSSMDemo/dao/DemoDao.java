package com.tbSSMDemo.dao;

import com.tbSSMDemo.model.Demo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DemoDao {
    @Insert("insert into demo(demo_id,demo_one,demo_two) values(#{demoId},#{demoOne},#{demoTwo})")
    Integer insertDemo(Demo demo);

    @Update("update demo set demo_one = #{demoOne},demo_two = #{demoTwo} where demo_id = #{demoId}")
    Integer updateDemo(Demo demo);

    @Select("select * from demo where demo_id=#{demoId}")
    Demo selectDemoByDemoId(Integer demoId);

    @Select("select * from demo")
    List<Demo> selectDemoArray();

    @Delete("delete from demo where demo_id=#{demoId}")
    Integer deleteDemoByDemoId(Integer demoId);

}
