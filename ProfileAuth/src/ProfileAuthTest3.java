import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProfileAuthTest3 {

	
	 private ProfileAuth3 profileAuth3;
		
	@BeforeEach
	void setup() {
	    profileAuth3 = new ProfileAuth3();
	}
		
	@Test
	void test1() {
		ArrayList<Profile> profiles = new ArrayList<Profile>();
		Account3 account = new Account3(null,profiles);
		profileAuth3.profilePasscode(account, "1212", 0);
		assertEquals(AccountStatus.notAuth, account.getAccountStatus());

	}
	
	@Test
	void test2() {
		ArrayList<Profile> profiles = new ArrayList<Profile>();
		profiles.add(new Profile(1,"1234"));
		profiles.add(new Profile(2,"123456"));
		Account3 account = new Account3("User1",profiles);
		for(int i = 0 ; i < 3; i ++) {
			profileAuth3.profilePasscode(account, "1212", 1);
		}
		assertEquals(AccountStatus.active, account.getAccountStatus());
	}
	
	@Test
	void test3() {
		ArrayList<Profile> profiles = new ArrayList<Profile>();
		Profile profile1 = new Profile(1,"1234");
		Profile profile2 = new Profile(2,"123456");
		profiles.add(profile1);
		profiles.add(new Profile(2,"123456"));
		Account3 account = new Account3("User1",profiles);
		for(int i = 0 ; i < 3; i ++) {
			profileAuth3.profilePasscode(account, "1212", 1);
			assertEquals(ProfilePasscodeStatus.wrongPasscode, profile1.getProfilePasscodeStatus());
			assertEquals(null, profile2.getProfilePasscodeStatus());
		}
	}
	
	@Test
	void test4() {
		ArrayList<Profile> profiles = new ArrayList<Profile>();
		profiles.add(new Profile(1,"1234"));
		profiles.add(new Profile(2,"123456"));
		Account3 account = new Account3("User1",profiles);
		for(int i = 0 ; i < 10; i ++) {
			profileAuth3.profilePasscode(account, "1212", 1);
		}
		assertEquals(AccountStatus.active, account.getAccountStatus());
	}
	
	@Test
	void test5() {
		ArrayList<Profile> profiles = new ArrayList<Profile>();
		profiles.add(new Profile(1,"1234"));
		profiles.add(new Profile(2,"123456"));
		Account3 account = new Account3("User1",profiles);
		for(int i = 0 ; i < 11; i ++) {
			profileAuth3.profilePasscode(account, "1212", 1);
		}
		assertEquals(AccountStatus.blocked, account.getAccountStatus());
	}
	
	@Test
	void test6() {
		ArrayList<Profile> profiles = new ArrayList<Profile>();
		profiles.add(new Profile(1,"1234"));
		profiles.add(new Profile(2,"123456"));
		Account3 account = new Account3("User1",profiles);
		for(int i = 0 ; i < 9; i ++) {
			profileAuth3.profilePasscode(account, "1212", 1);
		}
		profileAuth3.profilePasscode(account, "1234", 1);

		assertEquals(AccountStatus.active, account.getAccountStatus());
	}
	
	@Test
	void test7() {
		ArrayList<Profile> profiles = new ArrayList<Profile>();
		profiles.add(new Profile(1,"1234"));
		profiles.add(new Profile(2,"123456"));
		Account3 account = new Account3("User1",profiles);
		for(int i = 0 ; i < 11; i ++) {
			profileAuth3.profilePasscode(account, "1212", 1);
		}
		assertEquals(AccountStatus.blocked, account.getAccountStatus());
	}
}
