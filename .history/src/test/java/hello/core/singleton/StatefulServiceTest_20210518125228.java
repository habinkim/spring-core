package hello.core.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class StatefulServiceTest {

	@Test
	void statefulServiceSingleton() {
		
		new AnnotationConfigApplicationContext(TestConfig.class);

	}

	static class TestConfig {

		@Bean
		public StatefulService statefulService() {
			return new StatefulService();
		}

	}

}
