package com.tobet.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {

    /**
     * We are trying to break things here, duplicating request mapping
     * This won't even compile!
     *
     * @return
     */
    @RequestMapping("/showForm")
    public String displayTheForm() {
        return "silly";
    }
}
