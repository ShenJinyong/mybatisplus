package com.simpleteen.mybatisplus;

import com.simpleteen.mybatisplus.mapper.UserMapper;
import com.simpleteen.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusApplicationTests {

    @Autowired
    private UserMapper userMapper;


    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        System.out.println("方式一:");
        users.forEach(System.out::println);
        System.out.println("方式二:");
        for (User user : users) {
            System.out.println(user);
        }
    }

}
