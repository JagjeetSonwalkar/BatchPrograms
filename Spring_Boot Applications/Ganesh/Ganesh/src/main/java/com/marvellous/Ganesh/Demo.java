package com.marvellous.Ganesh;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo
{
    @GetMapping("PPA")
    public String display()
    {
        return "Jay Ganesh...";
    }
}

