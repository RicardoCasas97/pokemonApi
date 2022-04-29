package com.example.pokemon.repo;

import com.example.pokemon.service.PokemonAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "pokemon")
public class PokemonController {
	
	PokemonAPI pokemonAPI;
	
 @Autowired
	public PokemonController(PokemonAPI pokemonAPI){
		this.pokemonAPI = pokemonAPI;
	}
	
/*
	public PokemonController() {
		super();
		// TODO Auto-generated constructor stub
	}
	*/
	
	@GetMapping(value="/{nombrePokemon}")
	public String AllEndPoint(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonAPI.imprimirPokemon(pokemon);
	}
	
	
	
	@GetMapping(value="/{nombrePokemon}/abilities")
	public String obtenerAbilities(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonAPI.obtenerAbilities(pokemon);
	}
	

	@GetMapping(value="/{nombrePokemon}/base_experience")
	public String obtenerBase_experience(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonAPI.obtenerBaseExperience(pokemon);
	}
	
	@GetMapping(value="/{nombrePokemon}/held_items")
	public String obtenerHeldItems(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonAPI.obtenerHeld_items(pokemon);
	}
	
	@GetMapping(value="/{nombrePokemon}/id")
	public String obtenerID(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonAPI.obtenerID(pokemon);
	}
	
	@GetMapping(value="/{nombrePokemon}/name")
	public String obtenerName(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonAPI.obtenerName(pokemon);
	}
	
	
	@GetMapping(value="/{nombrePokemon}/location_area_encounters")
	public String obtenerLocationAreaEncounters(@PathVariable("nombrePokemon") String pokemon) {
		return pokemonAPI.obtenerLocationAreaEncounters(pokemon);
	}
	

	
	

	
	
	
}
