package ma.talayBlog.TalayBlog.repository;

import ma.talayBlog.TalayBlog.model.Subtalayblog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubtalayblogRepository extends JpaRepository<Subtalayblog, Long> {
}
