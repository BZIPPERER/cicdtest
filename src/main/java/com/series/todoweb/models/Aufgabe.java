package com.series.todoweb.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
 
public class Aufgabe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // tp prevent jumps in id
    @SequenceGenerator(name = "aufgabe_seq", sequenceName = "aufgabe_seq", initialValue = 1, allocationSize = 1)
    private Long id;
    private String titel;
    private boolean erledigt;

    public Aufgabe()
    {
    	
    }
    public Aufgabe (String titel)
    {
    	this.titel = titel;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aufgabe other = (Aufgabe) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (titel == null) {
            if (other.titel != null)
                return false;
        } else if (!titel.equals(other.titel))
            return false;
        if (erledigt != other.erledigt)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((titel == null) ? 0 : titel.hashCode());
        result = prime * result + (erledigt ? 1231 : 1237);
        return result;
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public boolean isErledigt() {
		return erledigt;
	}
	public void setErledigt(boolean erledigt) {
		this.erledigt = erledigt;
	}

}
