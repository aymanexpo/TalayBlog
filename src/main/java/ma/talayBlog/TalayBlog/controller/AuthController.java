package ma.talayBlog.TalayBlog.controller;

import ma.talayBlog.TalayBlog.dto.RegisterRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/singup")
    public void singup(@RequestBody RegisterRequest registerRequest){

    }
}
