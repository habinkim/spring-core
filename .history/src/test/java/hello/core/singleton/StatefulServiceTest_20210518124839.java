package space\core\src\test\java\hello\core\singleton;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StatefulServiceTest {

	private StatefulService statefulService;

	@Before
	public void setup() {
		this.statefulService = new StatefulService();
	}

	@Test
	public void shouldOrder() {
		// TODO: initialize args
		String name;
		int price;

		statefulService.order(name, price);

		// TODO: assert scenario
	}

	@Test
	public void shouldGetPrice() {
		int actualValue = statefulService.getPrice();

		// TODO: assert scenario
	}
}
