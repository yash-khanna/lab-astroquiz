![Image description](https://i1.faceprep.in/ProGrad/face-logo-resized.png)

# ProGrad Lab | Astrozone

## A Quick Introduction



## What should you do
```
Fork this repo
Clone this repo
Practice Java basics - operators, conditions, loops, class and object
```

## How To Submit
```
Upon completion, run the following commands:

git add .
git commit -m "ProGrad ID"
git push origin master

And finally, create a pull request so your ProGrad Mentor (PM) can review your work.
```

## Instructions

1. ***Do not modify the entire code.***
2. ***Edit the code as per the instructions.***
3. ***Go to Java Resources -> src folder.***
4. ***You will have 3 packages src/controller, src/utility, src/model.***
5. ***Once the progressions are completed follow the instructions to run the application and test your code.***
 
## Run the Project
1. ***Right - click on the project.***
2. ***Go to Run as -> Run on server.***
3. ***You can check the output in eclipse browser or in your browser.***

## Input Format
1. ***There are 7 arugments as input to this application.***
2. ***First input is a String which is the name.***
3. ***Second input is a String which corresponds to number.***
4. ***Third input is an int which corresponds to the age.***
5. ***Fourth input is an integer which corresponds to the height.***
6. ***Fifth input is an integer which corresponds to the weight.***
7. ***Sixth input is a String which corresponds to the Country.***
8. ***Seventh input is a String which contains the answers.***

## Output Format
1 ***Output is a boolean value true or false.***


## Progression - 1 
1. ***Create a class called User inside the model package with the following arguments***
   - ***private String name***
   - ***private String number***
   - ***private int age***
   - ***private int height***
   - ***private int weight***
   - ***private String country***
2. ***Generate appropriate getters and setters.***
3. ***Generate the constructor User(String name, String number, int age, int height, int weight, String country) inside the User class.***

## Progression - 2
1. ***Create an Abstract class BasicEligibility in the utility package***
2. ***Create an abstract method - abstract boolean basicEligibilityCheck(User user)***

## Progression - 3
1. ***Create an interface EligibilityInterface in the utility package***
2. ***Create a method in interface - boolean checkUser(User user)***
3. ***Create a method in interface - boolean checkQuizAnswer(String answers)***

## Progression - 4
1. ***Create a class called EligibilityCheck which extends the abstract class BasicEligibility and implements EligibilityInterface***
2. ***Implement the method basicEligibilityCheck(User user)***
3. ***The basicEligibilityCheck method should in turn invoke 2 methods checkUser(User user) ana checkQuizAnswers(String answers)***
4. ***Return true if the candidate is eligible for space journey, return false otherwise.***

## Progression - 5
1. ***checkUser(User user) method is used to check whether the user is eligible for space journey or not.***
2. ***A person is eligible if his (18 <= age <= 35, (155 <=height<=170 ) , (55<= weight <= 90) and Country == ProGrad.***
3. ***Return true if the person is eligible and return false otherwise.***

## Progression - 6
1. ***checkQuiz(String answers) method is used to check whether the candidate has cleared the assessment or not.***
2. ***A candidate clears the test only if he scores more than 80.***
3. ***Return true if he scores more than 80 else false.***

Happy Coding ProGrad ❤️
