package com.jaggi.Jayganesh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo
{
    @GetMapping("displayjg")
    public String display()
    {
        return "Jay Ganesh...";
    }
}
