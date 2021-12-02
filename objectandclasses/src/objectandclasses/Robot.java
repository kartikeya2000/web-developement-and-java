package objectandclasses;

public class Robot {
	
	String name ;
	int id ;
	String color;
	Robot objectpassing;
	
	public Robot(String name, int id ,  String color) {
         this.name = name;
         this.id = id;
         this.color = color;
	}


	public String Introduce() {
		return "Robot [name=" + name + ", id=" + id + ", color=" + color + "]";
	}

}


