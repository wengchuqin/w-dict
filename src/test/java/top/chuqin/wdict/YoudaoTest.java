package top.chuqin.wdict;

import org.junit.Assert;
import org.junit.Test;
import top.chuqin.wdict.domian.dataobject.En2ZhResult;
import top.chuqin.wdict.domian.dataobject.Zh2EnResult;
import top.chuqin.wdict.service.TranslateService;
import top.chuqin.wdict.service.impl.TranslateServiceImpl;

public class YoudaoTest {
    TranslateService dictService = new TranslateServiceImpl();


    @Test
    public void testZhToEn() throws Exception {
        En2ZhResult result = dictService.en2Zh("hello");
        System.out.println(result);
        Assert.assertEquals("hello", result.getQuery());
    }

    @Test
    public void testEnToCh() throws Exception {
        Zh2EnResult result = dictService.zh2En("你好");
        System.out.println(result);
        Assert.assertEquals("你好", result.getQuery());
    }


}
