import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

enum AccountStatus {
	 active,
     blocked,
     notAuth,
}



public class Account {

	private String accountName;
	private ArrayList<Profile> profiles;
	private AccountStatus accountStatus = AccountStatus.active;
	private int avialableTrialNumber = 10;


	public Account(String accountName, ArrayList<Profile> profiles) {
		super();
		this.accountName = accountName;
		this.profiles = profiles;
	}
	
	
	public AccountStatus getAccountStatus() {
		return accountStatus;
	}


	void block() {
		accountStatus = AccountStatus.blocked;
	}
	
	
	void reacivate()  {
		accountStatus = AccountStatus.active;
	}
	
	
	void checkPasscodeForProfile(int id, String enteredPasscode) {
	   Profile selectedProfile = profiles.get(id);
	   if (selectedProfile.getPasscode() != enteredPasscode) {
		   avialableTrialNumber -= 1;
		   selectedProfile.setProfilePasscodeStatus(ProfilePasscodeStatus.wrongPasscode);
	   }else {
		   selectedProfile.setProfilePasscodeStatus(ProfilePasscodeStatus.correctPasscode);
	   }
	   if (avialableTrialNumber  == 0) {
		   block();
		   reactivateAfterThreeHours();
	   }
	}
	
	public void reactivateAfterThreeHours() {
	    TimerTask task = new TimerTask() {
	        public void run() {
	            System.out.println("Task performed on: " + new Date() + "n" +
	              "Thread's name: " + Thread.currentThread().getName());
	            reacivate();
	        }
	    };
	    Timer timer = new Timer("Timer");
	    
	    long delay = 10800000L;
	    timer.schedule(task, delay);
	}

}
