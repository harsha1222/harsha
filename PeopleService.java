package Question10;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class PeopleService {
	
	People Person1;
	People Person2;
	public People getPerson1() {
		return Person1;
	}
	public void setPerson1(People person1) {
		Person1 = person1;
	}
	public People getPerson2() {
		return Person2;
	}
	public void setPerson2(People person2) {
		Person2 = person2;
	}
	
	
}
