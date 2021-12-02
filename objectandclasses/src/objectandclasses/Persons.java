package objectandclasses;

public class Persons {
	String name;
	String personality;
	Boolean isSitting;
	Robot owned;
	
	public Persons(String name, String personality, Boolean isSitting){
		this.name = name;
		this.personality = personality;
		this.isSitting = isSitting;	
	}

	void Sitdown(Boolean isSitting) {
		
		this.isSitting = true;
	}

		void  Standup(Boolean isSitting) {
			this.isSitting = false;	
	
	}
	
}
	
	
	


