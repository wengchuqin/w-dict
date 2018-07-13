package top.chuqin.wdict.domian.dataobject;

import java.util.Arrays;
import java.util.Objects;

public class En2ZhResult extends TranslateResultBase {
    private Zh2EnBase base;

    public static class Zh2EnBase {
        /**
         * 基本释义
         */
        private String[] explains;

        public Zh2EnBase() {
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
            Zh2EnBase zh2EnBase = (Zh2EnBase) o;
            return Arrays.equals(explains, zh2EnBase.explains);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(explains);
        }

        @Override
        public String toString() {
            return "Zh2EnBase{" +
                    "explains=" + Arrays.toString(explains) +
                    '}';
        }
    }

    public En2ZhResult() {
    }

    public Zh2EnBase getBase() {
        return base;
    }

    public void setBase(Zh2EnBase base) {
        this.base = base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        En2ZhResult that = (En2ZhResult) o;
        return Objects.equals(base, that.base);
    }

    @Override
    public int hashCode() {

        return Objects.hash(base);
    }

    @Override
    public String toString() {
        return "En2ZhResult{" +
                "base=" + base +
                "} " + super.toString();
    }
}
