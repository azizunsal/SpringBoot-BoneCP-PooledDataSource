package com.test.so.controller;

import com.test.so.service.PhoneSettingsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by azizunsal on 24/02/15.
 */

@RestController
@RequestMapping("/")
public class MainController {
    
    @Autowired
    private PhoneSettingsService phoneSettingsService;
    
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);
    
    @RequestMapping(method = RequestMethod.GET)
    public String test() {
        logger.info("Hello controller - test");
        return "Hello Controller - Test";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String testById(@PathVariable Long id) {
        logger.info("Hello controller - test by id {}", id);
        return "Hello Controller - Test By Id";
    }
}
