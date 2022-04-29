package com.example.pokemon.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class PokemonAPI {

	private String urlPokemon= "https://pokeapi.co/api/v2/pokemon";
	public PokemonAPI() {
		super();
	}
	
	

	public String imprimirPokemon(String nombrePok) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
		
	}
	
	
	public String obtenerAbilities(String nombrePok) {
		String pokemonInfo="";
		try {
			RestTemplate restTemplate = new RestTemplate();
			pokemonInfo =  restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
			JSONObject response  = new JSONObject(pokemonInfo);
			pokemonInfo = response.optString("abilities");
		}catch(JSONException e) {
			System.out.println(e.toString());

		}
		return pokemonInfo;
	}
	
	public String obtenerBaseExperience(String nombrePok) {
		String pokemonInfo="";
		try {
			RestTemplate restTemplate = new RestTemplate();
			pokemonInfo =  restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
			JSONObject response = new JSONObject(pokemonInfo);
			pokemonInfo =  response.optString("base_experience");
		}catch(JSONException e) {
			System.out.println(e.toString());
		}
		return pokemonInfo;
	}


	public String obtenerHeld_items(String nombrePok) {
		String pokemonInfo="";
		try {
			RestTemplate restTemplate = new RestTemplate();
			pokemonInfo =  restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
			JSONObject response = new JSONObject(pokemonInfo);
			pokemonInfo = response.optString("held_items");
		}catch(JSONException e) {
			System.out.println(e.toString());
		}
		return pokemonInfo;
	}


	public String obtenerID(String nombrePok) {
		String pokemonInfo="";
		try {
			RestTemplate restTemplate = new RestTemplate();
			pokemonInfo =  restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
			JSONObject response = new JSONObject(pokemonInfo);
			pokemonInfo = response.optString("id");
		}catch(JSONException e) {
			System.out.println(e.toString());
		}
		return pokemonInfo;
	}
	

	public String obtenerName(String nombrePok) {
		String pokemonInfo="";
		try {
			RestTemplate restTemplate = new RestTemplate();
			pokemonInfo =  restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
			JSONObject response = new JSONObject(pokemonInfo);
			pokemonInfo = response.getJSONObject("name").toString();
		}catch(JSONException e) {
			System.out.println(e.toString());
		}
		return pokemonInfo;
	}
	
	public String obtenerLocationAreaEncounters(String nombrePok) {
		String pokemonInfo="";
		try {
			RestTemplate restTemplate = new RestTemplate();
			pokemonInfo =  restTemplate.getForObject(urlPokemon+"/"+nombrePok,String.class);
			JSONObject response = new JSONObject(pokemonInfo);
			pokemonInfo = response.optString("location_area_encounters");
		}catch(JSONException e) {
			System.out.println(e.toString());
		}
		return pokemonInfo;
	}

	
}
