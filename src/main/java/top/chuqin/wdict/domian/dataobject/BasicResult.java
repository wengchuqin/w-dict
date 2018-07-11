package top.chuqin.wdict.domian.dataobject;

import java.util.List;
import java.util.Objects;

public class BasicResult {
    private List<String> explains;

    public BasicResult() {
    }

    public BasicResult(List<String> explains) {
        this.explains = explains;
    }

    public List<String> getExplains() {
        return explains;
    }

    public void setExplains(List<String> explains) {
        this.explains = explains;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicResult that = (BasicResult) o;
        return Objects.equals(explains, that.explains);
    }

    @Override
    public int hashCode() {

        return Objects.hash(explains);
    }

    @Override
    public String toString() {
        return "BasicResult{" +
                "explains=" + explains +
                '}';
    }
}
