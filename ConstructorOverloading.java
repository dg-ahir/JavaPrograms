class Student{  
    int id;  
    String name;  
    int age;  
    
    Student(int i,String n){
    	id=i;
    	name=n;
    }
    
    Student(int i,String n,int a){
    	id=i;
    	name=n;
    	age=a;
    }
    void display() {
    	System.out.println(id+ "" +name+ "" +age);
    }

	public static void main(String[] args) {
		Student s1 = new Student(15,"Abhijeet");
		Student s2 = new Student(26,"Nikunj",35);
		s1.display();
		s2.display();
	}
}
