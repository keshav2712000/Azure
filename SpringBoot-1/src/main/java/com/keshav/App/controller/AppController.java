package com.keshav.App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keshav.App.Model.Watch;
import com.keshav.App.Service.Appservice;

@RestController
@RequestMapping("/watch")
@CrossOrigin
public class AppController {
		@Autowired
		private Appservice appservice;
		@GetMapping("/getWatch/{code}")
		public Watch getWatch(@PathVariable("code") int code) {
			System.out.println(code);
			return appservice.getSingleWatch(code);
		}
		
		@PostMapping("/addWatch")
		public Watch addWatch(@RequestBody Watch watch) {
			return appservice.addWatch(watch);
		}
		
		@PutMapping("/updateWatch/{code}")
		public Watch updateWatch(@PathVariable int code,@RequestBody Watch watch) {
			return appservice.updateWatch(code,watch);
		}
		
		@DeleteMapping("/deleteWatch/{code}")
		public boolean deleteWatch(@PathVariable int code) {
			return appservice.deleteWatch(code);
		}
}
