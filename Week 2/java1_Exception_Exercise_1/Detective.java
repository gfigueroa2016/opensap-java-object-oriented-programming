class Detective {
	
	String name;
	
	void sayName() {
		System.out.println("Hi, I am " + setName());
	}
	
	void screamName() {
		System.out.println("Hi, I am " + setName().toUpperCase());
	}
	
	
	String setName(){
		name = "Duke";
		return name;
	}
}