package hc4l.course.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@RequestMapping("/my/courses")
	public Object findMyCourse() {
		return "here are my coures";
	}
}
