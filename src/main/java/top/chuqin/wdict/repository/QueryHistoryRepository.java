package top.chuqin.wdict.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.chuqin.wdict.domian.entity.QueryHistory;

@Repository
public interface QueryHistoryRepository extends JpaRepository<QueryHistory, Long> {
}
