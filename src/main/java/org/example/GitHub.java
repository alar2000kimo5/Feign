package org.example;

import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value="https://api.github.com")
public interface GitHub {

	@RequestLine("GET /repos/OpenFeign/feign/contributors")
	public String getGitHub();

}
