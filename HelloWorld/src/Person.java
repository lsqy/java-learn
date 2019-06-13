
public class Person {
	int personAge;
	public Person(String name) {
		System.out.println("小明的名字是：" + name);
	}
	
	public void setAge(int age) {
		personAge = age;
	}
	
	public int getAge() {
		System.out.println("小明的年龄是：" + personAge);
		return personAge;
	}
	
	public static void main(String[] args) {
		Person xiaoming = new Person("xiaoming");
		xiaoming.setAge(18);
		xiaoming.getAge();
		System.out.println("变量值：" + xiaoming.personAge);
	}
}
