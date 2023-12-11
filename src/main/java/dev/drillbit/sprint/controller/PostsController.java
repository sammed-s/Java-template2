package dev.drillbit.sprint.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {

    @GetMapping("/allposts")
    public List<String> allPosts() {

        List<String> posts = new ArrayList<>();
        posts.add("Insta");
        posts.add("Facebook");
        posts.add("What's app");
        posts.add("X");
        return posts;
    }

}
