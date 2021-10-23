package ma.talayBlog.TalayBlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class TalayBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(TalayBlogApplication.class, args);
	}

}
