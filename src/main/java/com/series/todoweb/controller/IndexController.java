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

@Controller // AJ
@RequestMapping("/")
public class IndexController 
{

    @GetMapping
    public String getGreeting(Model m) 
    {
    	m.addAttribute("pro","Goodby Damn it Rose");
    	return "helloworld.html";
    }
   
}
