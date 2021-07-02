package com.bean.springbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	private SampleBean sampleBean;

	//GET
	@RequestMapping(value = "/", method = RequestMethod.GET) // Jersy Techniques
	public String testing() {
		String s = sampleBean.getBean();

		return "My Controller with Get method--->" + s;
	}

	//POST
	@RequestMapping(value = "/", method = RequestMethod.POST) // Jersy Techniques
	public String testing1() {
		String s = sampleBean.getBean();

		return "My Controller with POST mapping creating new resource-->" + s;
	}

	//PUT
	@RequestMapping(name = "/", method = RequestMethod.PUT) // Jersy Techniques
	public String testing4() {
		return "My Controller with put mapping only for Updating resource on the web";
	}

	//DELETE
	@RequestMapping(name = "/", method = RequestMethod.DELETE) // Jersy Techniques
	public String testing5() {
		return "My Controller with put mapping only for Deleting resource on the web";
	}

	
	@RequestMapping(value = "/{name}") // Jersy Techniques
	// URL---http://localhost:9090/sudarshan
	public String testing2(@PathVariable String name) {
		String s = sampleBean.getBean();
		return name + " My Controller with PathVariable--->"+s;
	}
	
	@RequestMapping(value = "/demo/{id}") // Jersy Techniques
	// URL---http://localhost:9090/demo/123
	public String testing3(@PathVariable int id) {
		String s = sampleBean.getBean();
		return id + " My Controller with PathVariable--->"+s;
	}

}
