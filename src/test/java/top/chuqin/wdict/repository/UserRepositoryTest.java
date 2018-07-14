package top.chuqin.wdict.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import top.chuqin.wdict.domian.entity.QueryHistory;
import top.chuqin.wdict.domian.entity.User;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;


    @Test
    @DisplayName("测试JPA")
    public void testJpa(){
        User user = new User("wengchuqin", "123456");
        userRepository.save(user);
    }



}