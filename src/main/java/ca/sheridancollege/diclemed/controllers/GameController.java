package ca.sheridancollege.diclemed.controllers;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.diclemed.beans.Game;

@Controller
public class GameController {

	// safe list to store games in
	List<Game> gameList = new CopyOnWriteArrayList<Game>();
	
	@GetMapping("/")
	public String goHome(Model model) {
		
		model.addAttribute("game", new Game());		//add new game to page
		model.addAttribute("gameList", gameList);	// add list to page
		
		return "index";
	}
	
	@PostMapping("/addGame")
	public String addGame(Model model, @ModelAttribute Game game) {
		
		gameList.add(game);
		
		model.addAttribute("game", new Game());	// add game to page
		model.addAttribute("gameList", gameList); //add game list to page
		
		return "index";
	}
}
