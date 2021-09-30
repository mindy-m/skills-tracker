package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {


//    At localhost:8080, add text that states the three possible programming languages someone could be working on.
//    You need to have an h1 with the title “Skills Tracker”, an h2, and an ol containing three programming languages
//    of your choosing.

    @GetMapping("skills")
    @ResponseBody
    public String displayMySkills() {
        return "<html>" +
                    "<body style='background-color:#FDDCDF;font-family:Consolas,monaco,monospace;'>" +
                        "<br>" +
                        "<br>" +
                        "<h1 style='color:purple;text-align:center;'>Skills Tracker</h1>" +
                        "<br>" +
                        "<h2 style='font-style:italic;text-align:center;'>Check it.</h2>" +
                        "<br>" +
                        "<ol style='padding-left: 48%;'>" +
                            "<li>JavaScript</li>" +
                            "<li>Java</li>" +
                            "<li>Python</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }
}
