Feature: SAAS_Functional_TCs_Web_Automation_SRS_TestCases_202306210730591
#Regression Type
#Correct Values = true
#Incorrect Values = false
#Illegal Values = false
#Invalid Values = false
#Boundary Values = false
#Edge Cases Values = false

@Creating_an_Account
@uid1283375083
@set21
@test001
@SignUp
Scenario Outline: Creating an Account
Given I have access to application
When I wait in seconds second in forgot password as '3'
When I selected Sign Up link in sign up
When I wait in seconds second in forgot password as '3'
When I entered First Name in sign up as '<First Name>'
And I entered Email Addresss in sign up as '<Email Addresss>'
And I entered Passwords in sign up as '<Passwords>'
And I selected Are you a in sign up
And I selected Student in sign up
And I checked Terms And Agreement in sign up
And I entered College Name in sign up as '<College Name>'
And I selected Sign Up Button in sign up
And '<page>' is displayed with '<content>'

Examples:
|SlNo.|First Name|Last Name|Email Addresss|Passwords|Confirm Password|College Name|Signed up Successfully popup SMS|page|content|
|1|FirstName1|LastName1|EmailAddresss1|Passwords1|ConfirmPassword1|CollegeName1|SignedupSuccessfullypopupSMS1|AlgoShack|Sign In|

#Total No. of Test Cases : 1


@Num_and_Special_char_in_First_Last_Name_in_Signup
@uid896279216
@set21
@test005
@SignUp
Scenario Outline: In Sign Up Page verify the error SMS,When user enters Numbers in First Name
Given I have access to application
When I wait in seconds second in forgot password as '3'
When I selected Sign Up link in sign up
When I entered First Name in sign up as '<First Name1>'
And I entered Email Addresss in sign up as '<Email Addresss>'
And I entered Passwords in sign up as '<Passwords>'
And I selected Are you a in sign up
And I selected Student in sign up
And I checked Terms And Agreement in sign up
And I entered College Name in sign up as '<College Name>'
And I selected Sign Up Button in sign up
Then verify content Only alphabets are allowed for First name error SMS in sign up as '<Only alphabets are allowed for First name error SMS>'
And '<page>' is displayed with '<content>'

Examples:
|SlNo.|First Name1|Last Name2|Email Addresss|Passwords|Confirm Password|College Name|Only alphabets are allowed for First name error SMS|Only alphabets are allowed for Last name error SMS|First Name3|Last Name4|Only alphabets are allowed for First name error SMS5|Only alphabets are allowed for Last name error SMS6|First Name7|Last Name8|Only alphabets are allowed for First name error SMS9|Only alphabets are allowed for Last name error SMS10|page|content|
|1|FirstName2|LastName2|EmailAddresss1|Passwords1|ConfirmPassword1|CollegeName1|OnlyalphabetsareallowedforFirstnameerrorSMS1|OnlyalphabetsareallowedforLastnameerrorSMS1|FirstName3|LastName3|OnlyalphabetsareallowedforFirstnameerrorSMS1|OnlyalphabetsareallowedforLastnameerrorSMS1|FirstName4|LastName4|OnlyalphabetsareallowedforFirstnameerrorSMS1|OnlyalphabetsareallowedforLastnameerrorSMS1|AlgoShack|Sign In|


#Total No. of Test Cases : 2

@Without_password_and_confirm_password
@uid468876046
@set21
@test006
@SignUp
Scenario Outline: In SignUp Page verify error message when password is not entered
Given I have access to application
When I wait in seconds second in forgot password as '3'
When I selected Sign Up link in sign up
When I entered First Name in sign up as '<First Name>'
And I entered Email Addresss in sign up as '<Email Addresss>'
And I selected Are you a in sign up
And I selected Student in sign up
And I checked Terms And Agreement in sign up
And I entered College Name in sign up as '<College Name>'
And I selected Sign Up Button in sign up
Then verify content Please enter a password error SMS in sign up as '<Please enter a password error SMS>'
And '<page>' is displayed with '<content>'

Examples:
|SlNo.|First Name|Last Name|Email Addresss|College Name|Please enter a password error SMS|Please enter a confirm password error SMS|Email Addresss1|Passwords|Confirm Password|Please enter valid email address error SMS|page|content|
|1|FirstName1|LastName1|EmailAddresss1|CollegeName1|PleaseenterapassworderrorSMS1|PleaseenteraconfirmpassworderrorSMS1|EmailAddresss2|Passwords1|ConfirmPassword1|PleaseentervalidemailaddresserrorSMS1|AlgoShack|Sign In|

#
#Total No. of Test Cases : 3
#
