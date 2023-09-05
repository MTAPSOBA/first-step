package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicsService { 
	
	 @Autowired
	 private TopicsRepository topicRepository ;
	
//	private List<Topic> topics= Arrays.asList
//	
//	        (new Topic("SP", "Spring", " Boot"),    
//			new Topic("556", "Java", " Class"),
//			new Topic("32ff", "Eclipse", " IDE")); 
//	
	
//method call getAlltopics 
	public List<Topic> getAllTopics(){
		
  List<Topic> topicList = new ArrayList<>();
		
   topicRepository.findAll()
	.forEach(topicList::add) ;
	return topicList ;
	
}
    // method call AddTopics 
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
		
		
		public GetTopic(String id) {
			
		return topicRepository.gettopic(id);
			
			
		}

		public Topic getTopic(String id) {
			// TODO Auto-generated method stub
			return null;
		};}
	


	 
	
	
	
	

