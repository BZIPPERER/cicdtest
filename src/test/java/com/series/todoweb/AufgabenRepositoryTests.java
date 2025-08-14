package com.series.todoweb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.series.todoweb.models.Aufgabe;
import com.series.todoweb.repository.AufgabenRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE) /* server.port=5000 */
@Rollback(false)
public class AufgabenRepositoryTests 
{
	@Autowired
	private AufgabenRepository aufgabenRepository;
	
	@Test
	public void testAufgabeAnlegen()
	{
		// I cant believe this ; 10 years are never enough says the flesh 
		
		// no reasons to put this on the cloud server
		Aufgabe task1  = this.aufgabenRepository.save(new Aufgabe("Sharper Your knife"));
		assert(task1.getId()>0);
	
	}
	
}

// Let me be the first to shake a helping hand after "Maiden": HELL YEAH! Ghost Rider Nickolson for those outside, 
// Someone else for those inside 

