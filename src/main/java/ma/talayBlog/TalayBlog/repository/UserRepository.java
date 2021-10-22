package ma.talayBlog.TalayBlog.repository;

import ma.talayBlog.TalayBlog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
