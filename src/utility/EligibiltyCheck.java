package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{


	public boolean basicEligibilityCheck(User user) {
		if(checkUser(user) && checkQuizAnswer())
			return true;
		else
		return false;
	}

	public boolean checkQuizAnswer() {
		
		return false;
	}

	public boolean checkUser(User user) {
		
		return false;
	}


	

}







