package top.chuqin.wdict.service;

import top.chuqin.wdict.domian.dataobject.En2ZhResult;
import top.chuqin.wdict.domian.dataobject.Zh2EnResult;

public interface TranslateService {
    /**
     * 把英文翻译成中文
     * @param query
     * @return
     */
    En2ZhResult en2Zh(String query);

    /**
     * 把中文翻译成英文
     * @param query
     * @return
     */
    Zh2EnResult zh2En(String query);

}
