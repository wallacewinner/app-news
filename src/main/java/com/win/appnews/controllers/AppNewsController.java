package com.win.appnews;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppNewsController {

    @GetMapping("/")
    public AppNewsController appNewsController(@RequestParam(value = "name", defaultValue = "") String name){
        return new AppNewsController();
    }
}
