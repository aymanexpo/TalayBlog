package ma.talayBlog.TalayBlog.exception;

public class SpringTalayBlogException extends RuntimeException{
    public SpringTalayBlogException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public SpringTalayBlogException(String exMessage) {
        super(exMessage);
    }
}
