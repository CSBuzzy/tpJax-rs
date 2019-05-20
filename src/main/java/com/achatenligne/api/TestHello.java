package com.achatenligne.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class TestHello {
	@GET
	public String sayHello() {
		return "hello";
	}

}
