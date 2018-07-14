package top.chuqin.wdict.repository;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import top.chuqin.wdict.domian.dataobject.En2ZhResult;
import top.chuqin.wdict.domian.entity.QueryHistory;
import top.chuqin.wdict.service.TranslateService;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class QueryHistoryRepositoryTest {
    @Autowired
    private QueryHistoryRepository queryHistoryRepository;
    @Autowired
    private TranslateService dictService;

    @Test
    public void testJpa(){
        QueryHistory queryHistory = new QueryHistory();
        String query = "hello";
        En2ZhResult result = dictService.en2Zh(query);
        queryHistory.setResult(JSON.toJSONString(result));
        queryHistory.setTime(Instant.now());
        queryHistory.setUserUd(1L);

        queryHistoryRepository.save(queryHistory);
    }



}