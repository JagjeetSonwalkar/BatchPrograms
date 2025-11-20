package com.marvellous.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laptop
{
    // Field injection
    @Autowired
    Hardisk hobj;

    @Autowired
    RAM robj;

    @GetMapping("Laptop")
    public String LaptopInformation()
    {
        String h = hobj.getHardisk();
        String r = robj.getRAM();

        String data = null;
        data = "Laptop configuration : " + h + " & " + r ;
        return data;
    }
}