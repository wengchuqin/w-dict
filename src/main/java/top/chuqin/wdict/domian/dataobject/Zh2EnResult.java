package top.chuqin.wdict.domian.dataobject;

import java.util.Arrays;
import java.util.Objects;

public class Zh2EnResult extends TranslateResultBase{
    private Zh2EnBase base;

    public static class Zh2EnBase{
        /**
         * 默认音标，默认是英式音标，英文查词成功，一定存在
         */
        private String phonetic;

        /**
         * 美式音标，英文查词成功，一定存在
         */
        private String usPhonetic;

        /**
         * 美式发音，英文查词成功，一定存在
         */
        private String usSpeech;

        /**
         * 英式音标，英文查词成功，一定存在
         */
        private String ukPhonetic;

        /**
         * 英式发音，英文查词成功，一定存在
         */
        private String ukSpeech;

        /**
         * 基本释义
         */
        private String[] explains;

        public Zh2EnBase() {
        }

        public String getPhonetic() {
            return phonetic;
        }

        public void setPhonetic(String phonetic) {
            this.phonetic = phonetic;
        }

        public String getUsPhonetic() {
            return usPhonetic;
        }

        public void setUsPhonetic(String usPhonetic) {
            this.usPhonetic = usPhonetic;
        }

        public String getUsSpeech() {
            return usSpeech;
        }

        public void setUsSpeech(String usSpeech) {
            this.usSpeech = usSpeech;
        }

        public String getUkPhonetic() {
            return ukPhonetic;
        }

        public void setUkPhonetic(String ukPhonetic) {
            this.ukPhonetic = ukPhonetic;
        }

        public String getUkSpeech() {
            return ukSpeech;
        }

        public void setUkSpeech(String ukSpeech) {
            this.ukSpeech = ukSpeech;
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
            return Objects.equals(phonetic, zh2EnBase.phonetic) &&
                    Objects.equals(usPhonetic, zh2EnBase.usPhonetic) &&
                    Objects.equals(usSpeech, zh2EnBase.usSpeech) &&
                    Objects.equals(ukPhonetic, zh2EnBase.ukPhonetic) &&
                    Objects.equals(ukSpeech, zh2EnBase.ukSpeech) &&
                    Arrays.equals(explains, zh2EnBase.explains);
        }

        @Override
        public int hashCode() {

            int result = Objects.hash(phonetic, usPhonetic, usSpeech, ukPhonetic, ukSpeech);
            result = 31 * result + Arrays.hashCode(explains);
            return result;
        }

        @Override
        public String toString() {
            return "Zh2EnBase{" +
                    "phonetic='" + phonetic + '\'' +
                    ", usPhonetic='" + usPhonetic + '\'' +
                    ", usSpeech='" + usSpeech + '\'' +
                    ", ukPhonetic='" + ukPhonetic + '\'' +
                    ", ukSpeech='" + ukSpeech + '\'' +
                    ", explains=" + Arrays.toString(explains) +
                    '}';
        }
    }

    public Zh2EnResult() {
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
        Zh2EnResult that = (Zh2EnResult) o;
        return Objects.equals(base, that.base);
    }

    @Override
    public int hashCode() {

        return Objects.hash(base);
    }

    @Override
    public String toString() {
        return "Zh2EnResult{" +
                "base=" + base +
                "} " + super.toString();
    }
}


