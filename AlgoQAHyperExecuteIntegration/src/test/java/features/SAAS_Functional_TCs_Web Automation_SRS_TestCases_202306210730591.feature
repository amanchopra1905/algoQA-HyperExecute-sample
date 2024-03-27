Feature: SAAS_Functional_TCs_Web Automation_SRS_TestCases_202306210730591
#Regression Type
#Correct Values = true
#Incorrect Values = false
#Illegal Values = false
#Invalid Values = false
#Boundary Values = false
#Edge Cases Values = false


@test
Scenario Outline: Creating an Account
Given I have access to application
When I selected Sign Up link in sign up
Then verify displayed Sign Up to AlgoShack in sign up
When I entered First Name in sign up as '<First Name>'
And I entered Last Name in sign up as '<Last Name>'
And I entered Email Addresss in sign up as '<Email Addresss>'
And I entered Passwords in sign up as '<Passwords>'
And I entered Confirm Password in sign up as '<Confirm Password>'
And I selected Are you a in sign up
And I selected Student in sign up
And I checked Terms And Agreement in sign up
And I entered College Name in sign up as '<College Name>'
And I selected Sign Up Button in sign up
Then verify content Signed up Successfully popup SMS in sign up as '<Signed up Successfully popup SMS>'
And '<page>' is displayed with '<content>'

Examples:
|SlNo.|First Name|Last Name|Email Addresss|Passwords|Confirm Password|College Name|Signed up Successfully popup SMS|page|content|
|1|FirstName1|LastName1|EmailAddresss1|Passwords1|ConfirmPassword1|CollegeName1|SignedupSuccessfullypopupSMS1|AlgoShack|Sign In|


#Total No. of Test Cases : 1
#



@test
Scenario Outline: An Account should not be created without First Name in SignUp Page
An Account should not be created without College Name in SignUp Page
An Account should not be created without Email Id in SignUp Page
Given I have access to application
When I selected Sign Up link in sign up
Then verify displayed Sign Up to AlgoShack in sign up
When I entered Last Name in sign up as '<Last Name>'
And I clear text Email Addresss in sign up
And I entered Passwords in sign up as '<Passwords>'
And I entered Confirm Password in sign up as '<Confirm Password>'
And I selected Are you a in sign up
And I selected Student in sign up
And I checked Terms And Agreement in sign up
And I scroll and enter text College Name in sign up as '<College Name>'
And I selected Sign Up Button in sign up
Then verify content Please provide your first name error SMS in sign up as '<Please provide your first name error SMS>'
When I scroll and enter text First Name in sign up as '<First Name>'
And I scroll and enter text College Name in sign up as '<College Name1>'
And I selected Sign Up Button in sign up
Then verify content Please provide college name error SMS in sign up as '<Please provide college name error SMS>'
When I clear text Email Addresss in sign up
And I scroll and enter text College Name in sign up as '<College Name2>'
And I selected Sign Up Button in sign up
Then verify content Please provide your email address error SMS in sign up as '<Please provide your email address error SMS>'
And '<page>' is displayed with '<content>'

Examples:
|SlNo.|Last Name|Passwords|Confirm Password|College Name|Please provide your first name error SMS|First Name|College Name1|Please provide college name error SMS|College Name2|Please provide your email address error SMS|page|content|
|1|LastName1|Passwords1|ConfirmPassword1|CollegeName1|PleaseprovideyourfirstnameerrorSMS1|FirstName1|CollegeName1|PleaseprovidecollegenameerrorSMS1|CollegeName1|PleaseprovideyouremailaddresserrorSMS1|AlgoShack|Sign In|


#Total No. of Test Cases : 2


@test
Scenario Outline: In Sign Up Page verify the error SMS,When user enters Numbers in First Name and Last Name
In Sign Up Page verify the error SMS,When user enters Special Characters in First Name and Last Name
In Sign Up Page verify the error SMS,When user enters Alphanumeric starting with Numbers in First Name
In Sign Up Page verify the error SMS,When user enters Alphanumeric starting with Numbers in Last Namee
Given I have access to application
When I selected Sign Up link in sign up
Then verify displayed Sign Up to AlgoShack in sign up
When I entered First Name in sign up as '<First Name1>'
And I entered Last Name in sign up as '<Last Name2>'
And I entered Email Addresss in sign up as '<Email Addresss>'
And I entered Passwords in sign up as '<Passwords>'
And I entered Confirm Password in sign up as '<Confirm Password>'
And I selected Are you a in sign up
And I selected Student in sign up
And I checked Terms And Agreement in sign up
And I entered College Name in sign up as '<College Name>'
And I selected Sign Up Button in sign up
Then verify content Only alphabets are allowed for First name error SMS in sign up as '<Only alphabets are allowed for First name error SMS>'
And verify content Only alphabets are allowed for Last name error SMS in sign up as '<Only alphabets are allowed for Last name error SMS>'
When I clear and enter text First Name in sign up as '<First Name3>'
And I clear and enter text Last Name in sign up as '<Last Name4>'
And I selected Sign Up Button in sign up
Then verify content Only alphabets are allowed for First name error SMS in sign up as '<Only alphabets are allowed for First name error SMS5>'
And verify content Only alphabets are allowed for Last name error SMS in sign up as '<Only alphabets are allowed for Last name error SMS6>'
When I clear and enter text First Name in sign up as '<First Name7>'
And I clear and enter text Last Name in sign up as '<Last Name8>'
And I selected Sign Up Button in sign up
Then verify content Only alphabets are allowed for First name error SMS in sign up as '<Only alphabets are allowed for First name error SMS9>'
And verify content Only alphabets are allowed for Last name error SMS in sign up as '<Only alphabets are allowed for Last name error SMS10>'
And '<page>' is displayed with '<content>'

Examples:
|SlNo.|First Name1|Last Name2|Email Addresss|Passwords|Confirm Password|College Name|Only alphabets are allowed for First name error SMS|Only alphabets are allowed for Last name error SMS|First Name3|Last Name4|Only alphabets are allowed for First name error SMS5|Only alphabets are allowed for Last name error SMS6|First Name7|Last Name8|Only alphabets are allowed for First name error SMS9|Only alphabets are allowed for Last name error SMS10|page|content|
|1|FirstName2|LastName2|EmailAddresss1|Passwords1|ConfirmPassword1|CollegeName1|OnlyalphabetsareallowedforFirstnameerrorSMS1|OnlyalphabetsareallowedforLastnameerrorSMS1|FirstName3|LastName3|OnlyalphabetsareallowedforFirstnameerrorSMS1|OnlyalphabetsareallowedforLastnameerrorSMS1|FirstName4|LastName4|OnlyalphabetsareallowedforFirstnameerrorSMS1|OnlyalphabetsareallowedforLastnameerrorSMS1|AlgoShack|Sign In|


#Total No. of Test Cases : 3


@test
Scenario Outline: In SignUp Page verify error message when password and confirm password is not entered
In SignUp Page verify error message when Invalid Email ID is entered
Given I have access to application
When I selected Sign Up link in sign up
Then verify displayed Sign Up to AlgoShack in sign up
When I entered First Name in sign up as '<First Name>'
And I entered Last Name in sign up as '<Last Name>'
And I entered Email Addresss in sign up as '<Email Addresss>'
And I selected Are you a in sign up
And I selected Student in sign up
And I checked Terms And Agreement in sign up
And I entered College Name in sign up as '<College Name>'
And I selected Sign Up Button in sign up
Then verify content Please enter a password error SMS in sign up as '<Please enter a password error SMS>'
And verify content Please enter a confirm password error SMS in sign up as '<Please enter a confirm password error SMS>'
When I clear and enter text Email Addresss in sign up as '<Email Addresss1>'
And I entered Passwords in sign up as '<Passwords>'
And I entered Confirm Password in sign up as '<Confirm Password>'
And I selected Sign Up Button in sign up
Then verify content Please enter valid email address error SMS in sign up as '<Please enter valid email address error SMS>'
And '<page>' is displayed with '<content>'

Examples:
|SlNo.|First Name|Last Name|Email Addresss|College Name|Please enter a password error SMS|Please enter a confirm password error SMS|Email Addresss1|Passwords|Confirm Password|Please enter valid email address error SMS|page|content|
|1|FirstName1|LastName1|EmailAddresss1|CollegeName1|PleaseenterapassworderrorSMS1|PleaseenteraconfirmpassworderrorSMS1|EmailAddresss2|Passwords1|ConfirmPassword1|PleaseentervalidemailaddresserrorSMS1|AlgoShack|Sign In|


#Total No. of Test Cases : 4


@test
Scenario Outline: User should verify error message when passing All Uppercase letter in the Password in SignUp Page
User should verify that error message when passing All Lowercase letter in the Password in SignUp Page
User should verify that account should not created when passing only Numbers in Password in Sign Up Page
User should verify that account should not created when passing only Special Characters in Password in Sign Up Page
Given I have access to application
When I selected Sign Up link in sign up
Then verify displayed Sign Up to AlgoShack in sign up
When I entered First Name in sign up as '<First Name>'
And I entered Last Name in sign up as '<Last Name>'
And I entered Email Addresss in sign up as '<Email Addresss>'
And I entered Passwords in sign up as '<Passwords1>'
And I entered Confirm Password in sign up as '<Confirm Password>'
And I selected Are you a in sign up
And I selected Student in sign up
And I checked Terms And Agreement in sign up
And I entered College Name in sign up as '<College Name>'
And I selected Sign Up Button in sign up
Then verify content Invalid password error SMS in sign up as '<Invalid password error SMS2>'
When I clear and enter text Passwords in sign up as '<Passwords3>'
And I selected Sign Up Button in sign up
Then verify content Invalid password error SMS in sign up as '<Invalid password error SMS4>'
When I clear and enter text Passwords in sign up as '<Passwords5>'
And I selected Sign Up Button in sign up
Then verify content Invalid password error SMS in sign up as '<Invalid password error SMS6>'
When I clear and enter text Passwords in sign up as '<Passwords7>'
And I selected Sign Up Button in sign up
Then verify content Invalid password error SMS in sign up as '<Invalid password error SMS8>'
And '<page>' is displayed with '<content>'

Examples:
|SlNo.|First Name|Last Name|Email Addresss|Passwords1|Confirm Password|College Name|Invalid password error SMS2|Passwords3|Invalid password error SMS4|Passwords5|Invalid password error SMS6|Passwords7|Invalid password error SMS8|page|content|
|1|FirstName1|LastName1|EmailAddresss1|Passwords2|ConfirmPassword1|CollegeName1|InvalidpassworderrorSMS1|Passwords3|InvalidpassworderrorSMS1|Passwords4|InvalidpassworderrorSMS1|Passwords5|InvalidpassworderrorSMS1|AlgoShack|Sign In|

#Total No. of Test Cases : 5

