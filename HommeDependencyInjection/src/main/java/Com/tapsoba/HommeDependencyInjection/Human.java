package Com.tapsoba.HommeDependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	private Heart heart;
	
	
	
	
	public Human() {
	
	}
	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("human contractor is getting call");
	}

	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("human setter method is getting call");

	}

	public void Heartpumpimg() {

		if (heart != null) {
			heart.heart();
		} else
			System.out.println("your are dead!");

	}

}
