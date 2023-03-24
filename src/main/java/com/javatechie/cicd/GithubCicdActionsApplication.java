package com.javatechie.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionsApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome to javatechie !";
    }

    /*
    echo "# github-actions-example" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M master
    git remote add origin https://github.com/twsila/github-actions-example.git
    git push -u origin main
     */
    public static void main(String[] args) {
        SpringApplication.run(GithubCicdActionsApplication.class, args);
    }

}