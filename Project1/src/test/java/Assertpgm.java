import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertpgm {

	@Test
	private void username() {
		String Exp_username="jack";
		String actual_username="jack235";
		Assert.assertNotEquals(actual_username, Exp_username);
        System.out.println("Assert validation");
	}

}
