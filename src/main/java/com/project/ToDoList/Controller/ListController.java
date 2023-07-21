package com.project.ToDoList.Controller;

import com.project.ToDoList.Model.Medication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.ParseException;

@Controller
public class ListController {
    @GetMapping("/home")
    public String getHome(Model model) throws ParseException {
        model.addAttribute("message", "Hello Subscribers From Controller");
        Medication[] meds = {new Medication("Atorvastatin", "Lipitor", "Cholesterol"), new Medication("Amoxicillin", "Amoxil", "Antibiotic"), new Medication("Lisinopril", "Prinivil","Blood Pressure" )};
        model.addAttribute("medications", meds);
        return "home";
    }
}
