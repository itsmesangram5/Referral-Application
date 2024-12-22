package com.getReferral.Referral.Application.Controller;

import com.getReferral.Referral.Application.jooq.tables.pojos.Users;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class HomeController {

    @Autowired
    private final DSLContext dsl;

    public HomeController(DSLContext dslContext) {
        this.dsl = dslContext;
    }

    @GetMapping("/home")
    public ResponseEntity<String> serveIndex() {
        // Return "Hello World" as plain text
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }


}
