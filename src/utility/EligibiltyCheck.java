package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{


	
	public boolean checkQuizAnswer(String points) {
		
		return true;
	}

	public boolean checkUser(User user) {
		
		return true;
	}
	public boolean basicEligibilityCheck(User user) {
		if(checkUser(user))
			return true;
		else
		return false;
	}


	

}







