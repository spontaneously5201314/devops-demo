package com.cmcm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Spontaneously
 * @date 2018/8/10 18:43
 **/
@RestController
public class IndexController {

    @GetMapping("/{word}")
    public String index(@PathVariable("word") String word) {
        return word;
    }

}
