package ma.talayBlog.TalayBlog.repository;

import ma.talayBlog.TalayBlog.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
}
