package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {


//    At localhost:8080, add text that states the three possible programming languages someone could be working on.
//    You need to have an h1 with the title “Skills Tracker”, an h2, and an ol containing three programming languages
//    of your choosing.

    @GetMapping("")
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

    @GetMapping(value = "form")
    @ResponseBody
    public String orderYourLanguage() {
        return "<html>" +
                    "<body style='background-color:#FDDCDF;font-family:Consolas,monaco,monospace;" +
                    "padding-left:40%;padding-top:10%;>" +
                        "<form action='form' method='post'>" +
                            "<label for='name'>Name:</label>" +
                            "<br>" +
                            "<input type='text' name='name'>" +
                            "<br>" + "<br>" +
                            "<label for='favorite'>My favorite language:</label>" +
                            "<br>" +
                            "<select name='favorite' id='favorite'>" +
                                "<option value='javascript'>JavaScript</option>" +
                                "<option value='java'>Java</option>" +
                                "<option value='python'>Python</option>" +
                            "</select>" +
                            "<br>" + "<br>" +
                            "<label for='secondFavorite'>My second favorite language:</label>" +
                            "<br>" +
                            "<select name='secondFavorite' id='secondFavorite'>" +
                                "<option value='javascript'>JavaScript</option>" +
                                "<option value='java'>Java</option>" +
                                "<option value='python'>Python</option>" +
                            "</select>" +
                            "<br>" + "<br>" +
                            "<label for='thirdFavorite'>My third favorite language:</label>" +
                            "<br>" +
                            "<select name='thirdFavorite' id='thirdFavorite'>" +
                                "<option value='javascript'>JavaScript</option>" +
                                "<option value='java'>Java</option>" +
                                "<option value='python'>Python</option>" +
                            "</select>" +
                            "<br>" + "<br>" +
                            "<input type='submit' value='Submit'>" +
                        "</form>" +
                    "</body>" +
        "</html>";
    }


    @PostMapping(value="form")
    @ResponseBody
    public String displayCustomSkills(@RequestParam String name, String favorite, String secondFavorite,
                                      String thirdFavorite) {
        return "<html>" +
                "<body style='background-color:#FDDCDF;font-family:Consolas,monaco,monospace;'>" +
                "<br>" +
                "<br>" +
                "<h1 style='color:purple;text-align:center;'>" + name + "'s Skillz</h1>" +
                "<br>" +
                "<ol style='padding-left: 48%;'>" +
                "<li>" + favorite +"</li>" +
                "<li>" + secondFavorite + "</li>" +
                "<li>" + thirdFavorite + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
