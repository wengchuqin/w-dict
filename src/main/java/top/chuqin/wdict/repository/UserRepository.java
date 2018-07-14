package top.chuqin.wdict.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.chuqin.wdict.domian.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
