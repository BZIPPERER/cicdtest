package com.series.todoweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.series.todoweb.models.Aufgabe;
import com.series.todoweb.services.AufgabenService;

// Test Run
@Controller // AJ
@RequestMapping("/tasks")
public class AufgabenController {

    private final AufgabenService taskService;

    public AufgabenController(AufgabenService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Aufgabe> getAllTasks(Model model) {

        List<Aufgabe> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks); // tennis-treff
        return tasks;
    }

    @PostMapping
    public List<Aufgabe> createTask(@RequestParam String titel, Model model) {

        taskService.saveTask(titel);
        List<Aufgabe> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks); // tennis-treff
        return tasks;
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/tasks"; // Use file name after :/
    }

    @GetMapping("/{id}/toggle")
    public String toggle(@PathVariable Long id) {
        taskService.toggleTask(id);
        return "redirect:/tasks";
    }

}
