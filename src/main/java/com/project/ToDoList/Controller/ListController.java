package com.project.ToDoList.Controller;

import com.project.ToDoList.Model.Medication;
import com.project.ToDoList.service.MedicationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.ParseException;

@Controller
public class ListController {
    private MedicationService service;

    public ListController(MedicationService service) {
        this.service = service;
    }

    @PostMapping("/home")
    public String addMedication(Model model, Medication medication){
        int result = service.addMedication(medication);

        if (result < 1){
            model.addAttribute("errorMessage", String.format("Couldn't add %s", medication.getGenericName()));
        }
        model.addAttribute("successMessage", String.format("Successfully added %s", medication.getGenericName()));

        Medication[] medications = service.getMedications();
        model.addAttribute("medications", medications);

        return "home";
    }

    @GetMapping("/home")
    public String getHome(Model model, Medication medication) throws ParseException {
        model.addAttribute("message", "Hello Subscribers From Controller");
        Medication[] meds = service.getMedications();
        model.addAttribute("medications", meds);
        return "home";
    }
}
