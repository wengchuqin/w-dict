package top.chuqin.wdict.domian.dataobject;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.Objects;

public class En2ZhResult extends TranslateResultBase {
    private Zh2EnBasic basic;

    public static class Zh2EnBasic {
        /**
         * 基本释义
         */
        private String[] explains;

        public Zh2EnBasic() {
        }

        public String[] getExplains() {
            return explains;
        }

        public void setExplains(String[] explains) {
            this.explains = explains;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Zh2EnBasic zh2EnBasic = (Zh2EnBasic) o;
            return Arrays.equals(explains, zh2EnBasic.explains);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(explains);
        }

        @Override
        public String toString() {
            return "Zh2EnBasic{" +
                    "explains=" + Arrays.toString(explains) +
                    '}';
        }
    }

    public En2ZhResult() {
    }

    public Zh2EnBasic getBasic() {
        return basic;
    }

    public void setBasic(Zh2EnBasic basic) {
        this.basic = basic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        En2ZhResult that = (En2ZhResult) o;
        return Objects.equals(basic, that.basic);
    }

    @Override
    public int hashCode() {

        return Objects.hash(basic);
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
