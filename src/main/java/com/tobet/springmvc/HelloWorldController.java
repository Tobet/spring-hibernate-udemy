package com.tobet.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    /**
     * A controller methodto show net initial html form
     *
     * @return
     */
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    /**
     * A controller method to process the html form
     *
     * @return
     */
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }
}
