import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Account3 {
	private String accountName;
	private ArrayList<Profile> profiles;
	private AccountStatus accountStatus = AccountStatus.active;
	private int avialableTrialNumber = 11;


	public Account3(String accountName, ArrayList<Profile> profiles) {
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
	
	void notAuth()  {
		accountStatus = AccountStatus.notAuth;
	}
	
	void checkPasscodeForProfile(int id, String enteredPasscode) {
		if (accountName == null || id == -1) {
			notAuth();
			return;
		}
	   int selectedProfileIndex = profiles.indexOf(new Profile(id,enteredPasscode));
	   Profile selectedProfile = profiles.get(selectedProfileIndex);
	   if (selectedProfile.getPasscode() != enteredPasscode) {
		   avialableTrialNumber -= 1;
		   profiles.get(selectedProfileIndex).setProfilePasscodeStatus(ProfilePasscodeStatus.wrongPasscode);
	   }else {
		   profiles.get(selectedProfileIndex).setProfilePasscodeStatus(ProfilePasscodeStatus.correctPasscode);
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
