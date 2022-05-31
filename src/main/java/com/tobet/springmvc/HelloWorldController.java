package com.tobet.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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

    /**
     * A controller method to read form data and add data to the model
     *
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        // read the request parameter from the html form
        String theName = request.getParameter("studentName");

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Yo! " + theName;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
