package org.example;

import feign.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/map")
public class FeignController {


	@GetMapping("/git")
	public String getGitHub(){
		 GitHub gitHub= Feign.builder().target(GitHub.class,"https://api.github.com");
		String git = gitHub.getGitHub();
		return git;
	}
}
