
public class Person {
	int personAge;
	public Person(String name) {
		System.out.println("С���������ǣ�" + name);
	}
	
	public void setAge(int age) {
		personAge = age;
	}
	
	public int getAge() {
		System.out.println("С���������ǣ�" + personAge);
		return personAge;
	}
	
	public static void main(String[] args) {
		Person xiaoming = new Person("xiaoming");
		xiaoming.setAge(18);
		xiaoming.getAge();
		System.out.println("����ֵ��" + xiaoming.personAge);
	}
}
