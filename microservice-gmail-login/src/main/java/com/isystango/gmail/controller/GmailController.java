package com.isystango.gmail.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gmail")
public class GmailController {

	@GetMapping("/login")
	public Principal loginClient(Principal principal) {
		System.out.println(principal.getName());
		return principal;
	}
}
