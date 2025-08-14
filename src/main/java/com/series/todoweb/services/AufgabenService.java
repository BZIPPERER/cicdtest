package com.series.todoweb.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.series.todoweb.models.Aufgabe;
import com.series.todoweb.repository.AufgabenRepository;

@Service
public class AufgabenService {

    private final AufgabenRepository taskRepository;

    public AufgabenService(AufgabenRepository a) {
        this.taskRepository = a;
    }

    public List<Aufgabe> getAllTasks() {
        return this.taskRepository.findAll();
    }

    public void saveTask(String titel) {// Bäuerle Swabian {
        Aufgabe aufgabeNeu = new Aufgabe();

        aufgabeNeu.setTitel(titel);

        aufgabeNeu.setErledigt(false);

        this.taskRepository.save(aufgabeNeu);
    }

	public void deleteTask(Long id) 
	{
		this.taskRepository.deleteById(id);
	}

	public void toggleTask(Long id) 
	{
		Aufgabe task = this.taskRepository.findById(id)
		.orElseThrow(() -> new IllegalArgumentException("Invalid task id"));
		task.setErledigt( !task.isErledigt() );
		System.out.println(task.getId());
		this.taskRepository.save(task);
	}

}
