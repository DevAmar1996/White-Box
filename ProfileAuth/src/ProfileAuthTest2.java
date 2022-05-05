import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProfileAuthTest2 {

	 private ProfileAuth2 profileAuth2;
		
	@BeforeEach
	void setup() {
	    	profileAuth2 = new ProfileAuth2();
	}
		
	@Test
	void test4() {
		ArrayList<Profile> profiles = new ArrayList<Profile>();
		profiles.add(new Profile(1,"1234"));
		profiles.add(new Profile(2,"123456"));
		Account2 account = new Account2("User1",profiles);
		for(int i = 0 ; i < 10; i ++) {
			profileAuth2.profilePasscode(account, "1212", 1);
		}
		assertEquals(AccountStatus.active, account.getAccountStatus());
	}
}
