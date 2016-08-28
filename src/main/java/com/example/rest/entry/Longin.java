package com.example.rest.entry;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/login")
public class Longin {

	@GET
	@Path("/")
	@Produces(MediaType.TEXT_HTML)
	public String asHtml() {

		StringBuffer result = new StringBuffer();
		result.append("<html>");
		result.append("<head>");
		result.append("<meta charset='UTF-8'>");
		result.append("<title>Login</title>");
		result.append("</head>");
		result.append("<body>");
		result.append("<h1>ログイン</h1>");
		result.append("</body>");
		result.append("</html>");

		return result.toString();
	}

	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Map<String, Object> asJson() {

		Map<String, Object> result = new HashMap<>();
		result.put("response", "Hello");

		return result;
	}

}
