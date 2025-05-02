package in.ajay.jpa;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pokemon {
	
	@Id
	private String name;
	
	private String type;
	
	private int power;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int i) {
		this.power = i;
	}

	

	}


