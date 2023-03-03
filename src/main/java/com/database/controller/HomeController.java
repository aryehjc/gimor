/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
            
            
                name = "ian";
		model.addAttribute("name", name);
	
                return "homepage";
	}
        
        
        @GetMapping("/help")
        public String help() {
            
            System.out.println("a help page");
            return "helpage";
            // make the htmls as usual and then just put them in the controller. and then add it to te 
        }


}
