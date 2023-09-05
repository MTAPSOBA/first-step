package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.invoker.RequestBodyArgumentResolver;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;

@RestController
public class TopicController {

	@Autowired
	private TopicsService topicservice;

	@RequestMapping("/topics")
	public List<Topic> getgetAllTopicsTopics() {
		return topicservice.getAllTopics();
	}

	@RequestMapping("topic/{id}")
	public Topic GetTopic(@PathVariable String id) {
		//Topic topic = new Topic("556", "Java", " Class");

		return topicservice.getTopic(id);
	}
//		@RequestMapping(value ="/topic/saves", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(method = RequestMethod.POST.value= "jj")
	public void addTopic(@RequestBody Topic topic) {
           topicservice.addTopic(topic );
		// return new Topic(topic.getId(), topic.getName(), topic.getDescription());
	}
 
	


}
