package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.model.Pokemon;
import br.com.caelum.vraptor.view.Results;

@Controller
public class IndexController {

	@Inject Result result;
	
	public IndexController() {
		
	}
	
	public void home() {
		System.out.println("Hello World");
	}
	
	@Get("/pokemons")
	public void buscaPokemons() {
		
		Pokemon primeiropokemon = new Pokemon("Chari");
		primeiropokemon.setTipo("FOGO");
		primeiropokemon.setFraqueza("Agua");
		
		result.use(Results.json()).from(primeiropokemon).serialize();
	}
}
