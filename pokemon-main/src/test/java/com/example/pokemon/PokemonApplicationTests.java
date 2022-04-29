package com.example.pokemon;

import org.junit.jupiter.api.Test;

import com.example.pokemon.PokemonApplication;
import com.example.pokemon.repo.PokemonController;
import com.example.pokemon.service.PokemonAPI;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PokemonApplicationTests {
	PokemonController pokemon = new PokemonController(new PokemonAPI());

	@Test
	void contextLoads() {
		//System.out.println(pokemon.obtenerAbilities("snorlax"));
		//System.out.println(pokemon.obtenerBase_experience("snorlax"));
		//System.out.println(pokemon.obtenerID("snorlax"));
		//System.out.println(pokemon.obtenerHeldItems("snorlax"));
		//System.out.println(pokemon.obtenerLocationAreaeEncounters("snorlax"));
		//System.out.println(pokemon.obtenerName("snorlax"));
		//System.out.println(pokemon.AllEndPoint("snorlax"));
		
	}

}
