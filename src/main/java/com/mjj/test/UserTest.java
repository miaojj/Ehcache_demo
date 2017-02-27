package com.mjj.test;

import com.mjj.model.User;
import com.mjj.utils.CacheUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miaojj on 2017/2/23.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:context/spring-context.xml")
public class UserTest {

    public  String TMP = "tmp";

    @Test
    public void test(){

        List<User>list =new ArrayList<>();

        User u1 = new User("aaa","bbb","ccc");
        User u2 = new User("111","222","333");
        User u3 = new User("eee","fff","mmm");

        list.add(u1);
        list.add(u2);
        list.add(u3);
        System.out.println(list.size());

        //放入缓存
        CacheUtils.put(TMP,list);
        List<User> tmp = (List<User>) CacheUtils.get(TMP);
        System.out.println(tmp.size()+"====11111");

        //清除缓存
        CacheUtils.remove(TMP);
      //  System.out.println(tmp.size()+"====2222222");


    }

}
