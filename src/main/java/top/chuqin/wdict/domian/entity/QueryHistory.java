package top.chuqin.wdict.domian.entity;

import com.alibaba.fastjson.JSON;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "t_query_history")
public class QueryHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "result", nullable = false, columnDefinition = "json")
    private String result;

    @Column(name = "time", nullable = false)
    private Instant time;

    @Column(name = "user_id", nullable = false)
    private Long userUd;


    public QueryHistory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public Long getUserUd() {
        return userUd;
    }

    public void setUserUd(Long userUd) {
        this.userUd = userUd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QueryHistory that = (QueryHistory) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(result, that.result) &&
                Objects.equals(time, that.time) &&
                Objects.equals(userUd, that.userUd);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, result, time, userUd);
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
