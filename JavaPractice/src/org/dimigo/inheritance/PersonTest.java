package org.dimigo.inheritance;

public class PersonTest {

	public static void main(String[] args) {
		Person q= new Person("Tom");
		Korean k= new Korean("홍길동");
		Japanese j=new Japanese("다나카");
		Chinese c= new Chinese("왕밍");
		
		System.out.println(q.toString());
		q.sayHello();
		q.sayBye();
		System.out.println();
		
		System.out.println(k.toString());
		k.sayBye();
		k.sayHello();
		System.out.println(j.toString());
		j.sayHello();
		j.sayBye();
		System.out.println();		
		System.out.println(c.toString());
		c.sayHello();
		c.sayBye();
		
		
	}

}
