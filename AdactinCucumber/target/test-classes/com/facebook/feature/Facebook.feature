Feature: Facebook Login 

Scenario Outline: Login into Facebook account
Given User launch the Facebook application
When user enter the username  "<username>"
And user enter the password  "<password>" 
Then user click on Login Button

Examples:
|username|password|
|afbsdhakf@gmail.com|sjhgdf|
|sdhjfvbhj@gmail.com|dshjkbfg|
|sfdkjbgjksdb@gmail.com|ksjfdbgjkhsb|
|skhjbghj@gmail.com|skhjrhbffhjk|
