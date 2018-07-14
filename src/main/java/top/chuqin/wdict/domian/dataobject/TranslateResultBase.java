package top.chuqin.wdict.domian.dataobject;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.Arrays;
import java.util.Objects;

public class TranslateResultBase {
    /**
     * 错误返回码 一定存在
     */
    private String errorCode;

    /**
     * 源语言 查询正确时，一定存在
     */
    private String query;

    /**
     * 翻译结果 查询正确时一定存在
     */
    private String[] translations;

    /**
     * 词义 网络释义，该结果不一定存在
     */
    private Pair[] web;

    /**
     * 源语言和目标语言 一定存在
     */
    @JSONField(alternateNames = {"l"})
    private String type;

    /**
     * 翻译结果发音地址 翻译成功一定存在
     */
    private String tSpeakUrl;

    /**
     * 源语言发音地址 翻译成功一定存在
     */
    private String speakUrl;

    public TranslateResultBase() {
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String[] getTranslations() {
        return translations;
    }

    public void setTranslations(String[] translations) {
        this.translations = translations;
    }

    public Pair[] getWeb() {
        return web;
    }

    public void setWeb(Pair[] web) {
        this.web = web;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String gettSpeakUrl() {
        return tSpeakUrl;
    }

    public void settSpeakUrl(String tSpeakUrl) {
        this.tSpeakUrl = tSpeakUrl;
    }

    public String getSpeakUrl() {
        return speakUrl;
    }

    public void setSpeakUrl(String speakUrl) {
        this.speakUrl = speakUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TranslateResultBase that = (TranslateResultBase) o;
        return Objects.equals(errorCode, that.errorCode) &&
                Objects.equals(query, that.query) &&
                Arrays.equals(translations, that.translations) &&
                Objects.equals(web, that.web) &&
                Objects.equals(type, that.type) &&
                Objects.equals(tSpeakUrl, that.tSpeakUrl) &&
                Objects.equals(speakUrl, that.speakUrl);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(errorCode, query, web, type, tSpeakUrl, speakUrl);
        result = 31 * result + Arrays.hashCode(translations);
        return result;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
