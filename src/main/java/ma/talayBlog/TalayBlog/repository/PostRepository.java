package ma.talayBlog.TalayBlog.repository;

import ma.talayBlog.TalayBlog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
