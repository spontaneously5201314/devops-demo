package com.cmcm.controller;

import com.ctrip.framework.apollo.ConfigService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Spontaneously
 * @date 2018/8/10 18:43
 **/
@RestController
public class IndexController {

    private static final String HELLO = "hello";

    @GetMapping("/{word}")
    public String index(@PathVariable("word") String word) {
        return HELLO + word;
    }

    @GetMapping("/testApollo")
    public String testApollo(){
        return ConfigService.getConfig("application").getProperty("test","null");
    }

}
