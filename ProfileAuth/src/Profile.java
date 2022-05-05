
enum ProfilePasscodeStatus {
	wrongPasscode,
	correctPasscode,
}

public class Profile  {
	
	private ProfilePasscodeStatus profilePasscodeStatus;
	private int id;
	private String passcode;
	
	public Profile(int id, String passcode) {
		super();
		this.id = id;
		this.passcode = passcode;
	}
	
	public String getPasscode() {
		return passcode;
	}
	
	
	public int getId() {
		return id;
	}

	public ProfilePasscodeStatus getProfilePasscodeStatus() {
		return profilePasscodeStatus;
	}


	public void setProfilePasscodeStatus(ProfilePasscodeStatus profilePasscodeStatus) {
		this.profilePasscodeStatus = profilePasscodeStatus;
	}


	 @Override
	    public boolean equals(Object o) {
            Profile profile = (Profile) o;
             
	        if (this.id == profile.getId()) 
	        	return true;
	        return false;
	        	
	        
	     
	    }


}
