package top.chuqin.wdict.domian.dataobject;

import com.alibaba.fastjson.JSON;

public class Pair {
    public String key;
    public String[] value;

    public Pair() {
    }

    public Pair(String key, String[] value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
