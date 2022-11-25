package com.newApp.googleApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping("api")
    public String getData()
    {
        return "<h1>The API Is Working</h1>";
    }


}
