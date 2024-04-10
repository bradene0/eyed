package com.eyeD.eyed;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    private IdCardGenerator idCardGenerator = new IdCardGenerator();

    @PostMapping("/addEmployee")
    public IdCard addEmployee(@RequestBody Employee employee) {
        return idCardGenerator.generateIdCard(employee);
    }
}