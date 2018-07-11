package top.chuqin.wdict.domian.dataobject;

import java.util.Objects;

public class TranslateResult {
    private String query;
    private String translation;
    private BasicResult basic;

    public TranslateResult() {
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public BasicResult getBasic() {
        return basic;
    }

    public void setBasic(BasicResult basic) {
        this.basic = basic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TranslateResult that = (TranslateResult) o;
        return Objects.equals(query, that.query) &&
                Objects.equals(translation, that.translation) &&
                Objects.equals(basic, that.basic);
    }

    @Override
    public int hashCode() {

        return Objects.hash(query, translation, basic);
    }

    @Override
    public String toString() {
        return "TranslateResult{" +
                "query='" + query + '\'' +
                ", translation='" + translation + '\'' +
                ", basic=" + basic +
                '}';
    }
}
