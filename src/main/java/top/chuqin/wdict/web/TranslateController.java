package top.chuqin.wdict.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.chuqin.wdict.constant.TranslateType;
import top.chuqin.wdict.domian.dataobject.TranslateResultBase;
import top.chuqin.wdict.service.TranslateService;

@RestController
public class TranslateController {
    @Autowired
    private TranslateService translateService;

    @RequestMapping("/translate/{type}/{query}")
    public TranslateResultBase translate(@PathVariable("query") String query, @PathVariable("type") String type) {
        TranslateType translateType = TranslateType.fromType(type);
        switch (translateType) {
            case EN2ZH:
                return translateService.en2Zh(query);

            case ZH2EN:
                return translateService.zh2En(query);
        }

        throw new RuntimeException(String.format("没有匹配的翻译类型(%s)", type));
    }
}
