package com.example.demo.testcont;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cont")
public class democont {

    @GetMapping("/yayy")
    public int yayy(){
        return 5;
    }
}
