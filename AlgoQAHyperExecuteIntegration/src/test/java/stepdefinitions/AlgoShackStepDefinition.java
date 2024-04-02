package stepdefinitions;
    import io.cucumber.java.en.*;
    import workflows.SeleniumWorkFlow;
    import org.junit.Assert;
    import org.openqa.selenium.WebElement;

import common.Assertion;
import common.WebBrowserUtil;
    public class AlgoShackStepDefinition
	{
        SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
        

            @When("^I selected Sign Up link in sign up$")			
            public void WhenISelectedSignUpLinkInSignUp()
            {
            	WebElement elementToBeClicked = WebBrowserUtil.findElement("//p[text()='Sign In']","XPATH");
                WebBrowserUtil.Selected(elementToBeClicked);
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.SignUplinkButtonXPATH","XPATH");
                WebElement elementToBeClicked1 = WebBrowserUtil.findElement("//h4[contains(.,'Get Started')]","XPATH");
                WebBrowserUtil.Selected(elementToBeClicked1);
                
            }

             @Then("^verify displayed Sign Up to AlgoShack in sign up$")			
            public void ThenVerifyDisplayedSignUpToAlgoshackInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.SignUptoAlgoShackLabelXPATH","XPATH"), "Then verify displayed Sign Up to AlgoShack in sign up");
                
            }

            @When("^I entered First Name in sign up as '(.*)'$")			
            public void WhenIEnteredFirstNameInSignUpAsfirstName(String  firstName)
            {
                workFlow.enterText(firstName,0,"AlgoShack","AlgoShack.FirstNameTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Last Name in sign up as '(.*)'$")			
            public void WhenIEnteredLastNameInSignUpAslastName(String  lastName)
            {
                workFlow.enterText(lastName,0,"AlgoShack","AlgoShack.LastNameTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Email Addresss in sign up as '(.*)'$")			
            public void WhenIEnteredEmailAddresssInSignUpAsemailAddresss(String  emailAddresss)
            {
                workFlow.enterText(emailAddresss,0,"AlgoShack","AlgoShack.EmailAddresssTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Passwords in sign up as '(.*)'$")			
            public void WhenIEnteredPasswordsInSignUpAspasswords(String  passwords)
            {
                workFlow.enterText(passwords,0,"AlgoShack","AlgoShack.PasswordsTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Confirm Password in sign up as '(.*)'$")			
            public void WhenIEnteredConfirmPasswordInSignUpAsconfirmPassword(String  confirmPassword)
            {
                workFlow.enterText(confirmPassword,0,"AlgoShack","AlgoShack.ConfirmPasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I selected Student in sign up$")			
            public void WhenISelectedStudentInSignUp()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.StudentButtonXPATH","XPATH");
                
            }

            @When("^I checked Terms And Agreement in sign up$")			
            public void WhenICheckedTermsAgreementInSignUp()
            {
                workFlow.checkCheckbox(0,"AlgoShack","AlgoShack.TermsAndAgreementCheckBoxXPATH","XPATH");
                
            }

            @When("^I selected Sign Up Button in sign up$")			
            public void WhenISelectedSignUpButtonInSignUp()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.SignUpButtonButtonXPATH","XPATH");
                
            }

             @Then("^verify content Signed up Successfully popup SMS in sign up as '(.*)'$")			
            public void ThenVerifyContentSignedUpSuccessfullyPopupSmsInSignUpAssignedUpSuccessfullyPopupSms(String  signedUpSuccessfullyPopupSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(signedUpSuccessfullyPopupSms,0,"AlgoShack","AlgoShack.SignedupSuccessfullypopupSMSTextBoxXPATH","XPATH"), "Then verify content Signed up Successfully popup SMS in sign up as '<Signed up Successfully popup SMS>'");
                
            }

             @Then("^'(.*)' is displayed with '(.*)'$")			
            public void ThenpageIsDisplayedWithcontent(String  page, String content)
            {
                Assertion.IsTrue(workFlow.VerifyDefaultpageIsdisplayed(page), "Then '<page>' is displayed with '<content>'");
                Assertion.IsTrue(workFlow.VerifymessageIsDisplayed(content), "");;
                Assertion.assertAll();
            }

            @When("^I entered Existing First Name in sign up as '(.*)'$")			
            public void WhenIEnteredExistingFirstNameInSignUpAsexistingFirstName1(String  existingFirstName1)
            {
                workFlow.enterText(existingFirstName1,0,"AlgoShack","AlgoShack.ExistingFirstNameTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Existing Last Name in sign up as '(.*)'$")			
            public void WhenIEnteredExistingLastNameInSignUpAsexistingLastName2(String  existingLastName2)
            {
                workFlow.enterText(existingLastName2,0,"AlgoShack","AlgoShack.ExistingLastNameTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Existing Email Address in sign up as '(.*)'$")			
            public void WhenIEnteredExistingEmailAddressInSignUpAsexistingEmailAddress3(String  existingEmailAddress3)
            {
                workFlow.enterText(existingEmailAddress3,0,"AlgoShack","AlgoShack.ExistingEmailAddressTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Existing Password in sign up as '(.*)'$")			
            public void WhenIEnteredExistingPasswordInSignUpAsexistingPassword4(String  existingPassword4)
            {
                workFlow.enterText(existingPassword4,0,"AlgoShack","AlgoShack.ExistingPasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Existing Confirm Password in sign up as '(.*)'$")			
            public void WhenIEnteredExistingConfirmPasswordInSignUpAsexistingConfirmPassword5(String  existingConfirmPassword5)
            {
                workFlow.enterText(existingConfirmPassword5,0,"AlgoShack","AlgoShack.ExistingConfirmPasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I selected Company in sign up$")			
            public void WhenISelectedCompanyInSignUp()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.CompanyButtonXPATH","XPATH");
                
            }

             @Then("^verify content User Already exists popup SMS in sign up as '(.*)'$")			
            public void ThenVerifyContentUserAlreadyExistsPopupSmsInSignUpAsuserAlreadyExistsPopupSms(String  userAlreadyExistsPopupSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(userAlreadyExistsPopupSms,0,"AlgoShack","AlgoShack.UserAlreadyexistspopupSMSTextBoxXPATH","XPATH"), "Then verify content User Already exists popup SMS in sign up as '<User Already exists popup SMS>'");
                
            }

            @When("^I clear text Email Addresss in sign up$")			
            public void WhenIClearTextEmailAddresssInSignUp()
            {
                workFlow.clearText(0,"AlgoShack","AlgoShack.EmailAddresssTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Please provide your first name error SMS in sign up as '(.*)'$")			
            public void ThenVerifyContentPleaseProvideYourFirstNameErrorSmsInSignUpAspleaseProvideYourFirstNameErrorSms(String  pleaseProvideYourFirstNameErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(pleaseProvideYourFirstNameErrorSms,0,"AlgoShack","AlgoShack.PleaseprovideyourfirstnameerrorSMSTextBoxXPATH","XPATH"), "Then verify content Please provide your first name error SMS in sign up as '<Please provide your first name error SMS>'");
                
            }

            @When("^I scroll and enter text First Name in sign up as '(.*)'$")			
            public void WhenIScrollEnterTextFirstNameInSignUpAsfirstName(String  firstName)
            {
                workFlow.defaultWorkFlowMethod();
                
            }

             @Then("^verify content Please provide college name error SMS in sign up as '(.*)'$")			
            public void ThenVerifyContentPleaseProvideCollegeNameErrorSmsInSignUpAspleaseProvideCollegeNameErrorSms(String  pleaseProvideCollegeNameErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(pleaseProvideCollegeNameErrorSms,0,"AlgoShack","AlgoShack.PleaseprovidecollegenameerrorSMSTextBoxXPATH","XPATH"), "Then verify content Please provide college name error SMS in sign up as '<Please provide college name error SMS>'");
                
            }

             @Then("^verify content Please provide your email address error SMS in sign up as '(.*)'$")			
            public void ThenVerifyContentPleaseProvideYourEmailAddressErrorSmsInSignUpAspleaseProvideYourEmailAddressErrorSms(String  pleaseProvideYourEmailAddressErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(pleaseProvideYourEmailAddressErrorSms,0,"AlgoShack","AlgoShack.PleaseprovideyouremailaddresserrorSMSTextBoxXPATH","XPATH"), "Then verify content Please provide your email address error SMS in sign up as '<Please provide your email address error SMS>'");
                
            }

             @Then("^verify content Only alphabets are allowed for First name error SMS in sign up as '(.*)'$")			
            public void ThenVerifyContentOnlyAlphabetsAreAllowedForFirstNameErrorSmsInSignUpAsonlyAlphabetsAreAllowedForFirstNameErrorSms(String  onlyAlphabetsAreAllowedForFirstNameErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(onlyAlphabetsAreAllowedForFirstNameErrorSms,0,"AlgoShack","AlgoShack.OnlyalphabetsareallowedforFirstnameerrorSMSTextBoxXPATH","XPATH"), "Then verify content Only alphabets are allowed for First name error SMS in sign up as '<Only alphabets are allowed for First name error SMS>'");
                
            }

             @Then("^verify content Only alphabets are allowed for Last name error SMS in sign up as '(.*)'$")			
            public void ThenVerifyContentOnlyAlphabetsAreAllowedForLastNameErrorSmsInSignUpAsonlyAlphabetsAreAllowedForLastNameErrorSms(String  onlyAlphabetsAreAllowedForLastNameErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(onlyAlphabetsAreAllowedForLastNameErrorSms,0,"AlgoShack","AlgoShack.OnlyalphabetsareallowedforLastnameerrorSMSTextBoxXPATH","XPATH"), "Then verify content Only alphabets are allowed for Last name error SMS in sign up as '<Only alphabets are allowed for Last name error SMS>'");
                
            }

            @When("^I clear and enter text First Name in sign up as '(.*)'$")			
            public void WhenIClearEnterTextFirstNameInSignUpAsfirstName3(String  firstName3)
            {
                workFlow.clearAndEnterText(firstName3,0,"AlgoShack","AlgoShack.FirstNameTextBoxXPATH","XPATH");
                
            }

            @When("^I clear and enter text Last Name in sign up as '(.*)'$")			
            public void WhenIClearEnterTextLastNameInSignUpAslastName4(String  lastName4)
            {
                workFlow.clearAndEnterText(lastName4,0,"AlgoShack","AlgoShack.LastNameTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Please enter a password error SMS in sign up as '(.*)'$")			
            public void ThenVerifyContentPleaseEnterAPasswordErrorSmsInSignUpAspleaseEnterAPasswordErrorSms(String  pleaseEnterAPasswordErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(pleaseEnterAPasswordErrorSms,0,"AlgoShack","AlgoShack.PleaseenterapassworderrorSMSTextBoxXPATH","XPATH"), "Then verify content Please enter a password error SMS in sign up as '<Please enter a password error SMS>'");
                
            }

             @Then("^verify content Please enter a confirm password error SMS in sign up as '(.*)'$")			
            public void ThenVerifyContentPleaseEnterAConfirmPasswordErrorSmsInSignUpAspleaseEnterAConfirmPasswordErrorSms(String  pleaseEnterAConfirmPasswordErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(pleaseEnterAConfirmPasswordErrorSms,0,"AlgoShack","AlgoShack.PleaseenteraconfirmpassworderrorSMSTextBoxXPATH","XPATH"), "Then verify content Please enter a confirm password error SMS in sign up as '<Please enter a confirm password error SMS>'");
                
            }

            @When("^I clear and enter text Email Addresss in sign up as '(.*)'$")			
            public void WhenIClearEnterTextEmailAddresssInSignUpAsemailAddresss1(String  emailAddresss1)
            {
                workFlow.clearAndEnterText(emailAddresss1,0,"AlgoShack","AlgoShack.EmailAddresssTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Please enter valid email address error SMS in sign up as '(.*)'$")			
            public void ThenVerifyContentPleaseEnterValidEmailAddressErrorSmsInSignUpAspleaseEnterValidEmailAddressErrorSms(String  pleaseEnterValidEmailAddressErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(pleaseEnterValidEmailAddressErrorSms,0,"AlgoShack","AlgoShack.PleaseentervalidemailaddresserrorSMSTextBoxXPATH","XPATH"), "Then verify content Please enter valid email address error SMS in sign up as '<Please enter valid email address error SMS>'");
                
            }

             @Then("^verify content Invalid password error SMS in sign up as '(.*)'$")			
            public void ThenVerifyContentInvalidPasswordErrorSmsInSignUpAsinvalidPasswordErrorSms2(String  invalidPasswordErrorSms2)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(invalidPasswordErrorSms2,0,"AlgoShack","AlgoShack.InvalidpassworderrorSMSTextBoxXPATH","XPATH"), "Then verify content Invalid password error SMS in sign up as '<Invalid password error SMS2>'");
                
            }

            @When("^I clear and enter text Passwords in sign up as '(.*)'$")			
            public void WhenIClearEnterTextPasswordsInSignUpAspasswords3(String  passwords3)
            {
                workFlow.clearAndEnterText(passwords3,0,"AlgoShack","AlgoShack.PasswordsTextBoxXPATH","XPATH");
                
            }

            @When("^I copied text Passwords in sign up$")			
            public void WhenICopiedTextPasswordsInSignUp()
            {
                workFlow.copiedtext(0,"AlgoShack","AlgoShack.PasswordsTextBoxXPATH","XPATH");
                
            }

            @When("^I selected Password Show in sign up$")			
            public void WhenISelectedPasswordShowInSignUp()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.PasswordShowButtonXPATH","XPATH");
                
            }

             @Then("^Verify by text Passwords in sign up as '(.*)'$")			
            public void ThenVerifyByTextPasswordsInSignUpAspasswords1(String  passwords1)
            {
                Assertion.IsTrue(workFlow.verifyByText(passwords1,0,"AlgoShack","AlgoShack.PasswordsTextBoxXPATH","XPATH"), "Then Verify by text Passwords in sign up as '<Passwords1>'");
                
            }

            @When("^I selected Password Hide in sign up$")			
            public void WhenISelectedPasswordHideInSignUp()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.PasswordHideButtonXPATH","XPATH");
                
            }

            @When("^I Clicked SignIn link in sign in$")			
            public void WhenIClickedSigninLinkInSignIn()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.SignInlinkButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Sign In to AlgoShack in sign in$")			
            public void ThenVerifyDisplayedSignInToAlgoshackInSignIn()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.SignIntoAlgoShackLabelXPATH","XPATH"), "Then verify displayed Sign In to AlgoShack in sign in");
                
            }

            @When("^I entered Password in sign in as '(.*)'$")			
            public void WhenIEnteredPasswordInSignInAspassword(String  password)
            {
                workFlow.enterText(password,0,"AlgoShack","AlgoShack.PasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I Clicked Sign In Button in sign in$")			
            public void WhenIClickedSignInButtonInSignIn()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.SignInButtonButtonXPATH","XPATH");
                
            }

             @Then("^verify content User Signed In Successfully in sign in as '(.*)'$")			
            public void ThenVerifyContentUserSignedInSuccessfullyInSignInAsuserSignedInSuccessfully(String  userSignedInSuccessfully)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(userSignedInSuccessfully,0,"AlgoShack","AlgoShack.UserSignedInSuccessfullyTextBoxXPATH","XPATH"), "Then verify content User Signed In Successfully in sign in as '<User Signed In Successfully>'");
                
            }

            @When("^I clicked Already a member  Sign In in sign up$")			
            public void WhenIClickedAlreadyAMemberSignInInSignUp()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.AlreadyamemberSignInLinkXPATH","XPATH");
                
            }

             @Then("^verify content Agreement is required error SMS in sign up as '(.*)'$")			
            public void ThenVerifyContentAgreementIsRequiredErrorSmsInSignUpAsagreementIsRequiredErrorSms(String  agreementIsRequiredErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(agreementIsRequiredErrorSms,0,"AlgoShack","AlgoShack.AgreementisrequirederrorSMSTextBoxXPATH","XPATH"), "Then verify content Agreement is required error SMS in sign up as '<Agreement is required error SMS>'");
                
            }

             @Then("^verify content Please select in sign up as '(.*)'$")			
            public void ThenVerifyContentPleaseSelectInSignUpAspleaseSelect(String  pleaseSelect)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(pleaseSelect,0,"AlgoShack","AlgoShack.PleaseselectTextBoxXPATH","XPATH"), "Then verify content Please select in sign up as '<Please select>'");
                
            }

             @Then("^verify content password with more than 4 characters error sms in sign up as '(.*)'$")			
            public void ThenVerifyContentPasswordWithMoreThan4CharactersErrorSmsInSignUpAspasswordWithMoreThan4CharactersErrorSms2(String  passwordWithMoreThan4CharactersErrorSms2)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(passwordWithMoreThan4CharactersErrorSms2,0,"AlgoShack","AlgoShack.passwordwithmorethan4characterserrorsmsTextBoxXPATH","XPATH"), "Then verify content password with more than 4 characters error sms in sign up as '<password with more than 4 characters error sms2>'");
                
            }

             @Then("^verify displayed Home Page in home page$")			
            public void ThenVerifyDisplayedHomePageInHomePage()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.HomePageLabelXPATH","XPATH"), "Then verify displayed Home Page in home page");
                
            }

            @When("^I Clicked algoQA in home page$")			
            public void WhenIClickedAlgoqaInHomePage()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.algoQAButtonXPATH","XPATH");
                
            }

            @When("^I Clicked algoProfiler in home page$")			
            public void WhenIClickedAlgoprofilerInHomePage()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.algoProfilerLinkXPATH","XPATH");
                
            }

             @Then("^verify displayed Project Explorer Label in project explorer$")			
            public void ThenVerifyDisplayedProjectExplorerLabelInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.ProjectExplorerLabelLabelXPATH","XPATH"), "Then verify displayed Project Explorer Label in project explorer");
                
            }

             @Then("^verify displayed Search Project name in project explorer$")			
            public void ThenVerifyDisplayedSearchProjectNameInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"AlgoShack","AlgoShack.SearchProjectnameTextBoxXPATH","XPATH"), "Then verify displayed Search Project name in project explorer");
                
            }

             @Then("^verify displayed Create Project Label in project explorer$")			
            public void ThenVerifyDisplayedCreateProjectLabelInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.CreateProjectLabelLabelXPATH","XPATH"), "Then verify displayed Create Project Label in project explorer");
                
            }

             @Then("^verify displayed Project name in create project$")			
            public void ThenVerifyDisplayedProjectNameInCreateProject()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"AlgoShack","AlgoShack.ProjectnameTextBoxXPATH","XPATH"), "Then verify displayed Project name in create project");
                
            }

             @Then("^verify displayed Application Type in create project$")			
            public void ThenVerifyDisplayedApplicationTypeInCreateProject()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.ApplicationTypeLinkXPATH","XPATH"), "Then verify displayed Application Type in create project");
                
            }

             @Then("^verify displayed Create in create project$")			
            public void ThenVerifyDisplayedCreateInCreateProject()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.CreateButtonXPATH","XPATH"), "Then verify displayed Create in create project");
                
            }

             @Then("^verify displayed Clear in create project$")			
            public void ThenVerifyDisplayedClearInCreateProject()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.ClearButtonXPATH","XPATH"), "Then verify displayed Clear in create project");
                
            }

            @When("^I clicked Application Type in create project$")			
            public void WhenIClickedApplicationTypeInCreateProject()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.ApplicationTypeLinkXPATH","XPATH");
                
            }

            @When("^I selected Web Automation in create project$")			
            public void WhenISelectedWebAutomationInCreateProject()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.WebAutomationButtonXPATH","XPATH");
                
            }

            @When("^I selected Create in create project$")			
            public void WhenISelectedCreateInCreateProject()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.CreateButtonXPATH","XPATH");
                
            }

             @Then("^verify content Enter your Project Name Error SMS in create project as '(.*)'$")			
            public void ThenVerifyContentEnterYourProjectNameErrorSmsInCreateProjectAsenterYourProjectNameErrorSms(String  enterYourProjectNameErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(enterYourProjectNameErrorSms,0,"AlgoShack","AlgoShack.EnteryourProjectNameErrorSMSTextBoxXPATH","XPATH"), "Then verify content Enter your Project Name Error SMS in create project as '<Enter your Project Name Error SMS>'");
                
            }

            @When("^I entered Project name in create project as '(.*)'$")			
            public void WhenIEnteredProjectNameInCreateProjectAsprojectName1(String  projectName1)
            {
                workFlow.enterText(projectName1,0,"AlgoShack","AlgoShack.ProjectnameTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Project Name should not be more than 35 characters in create project as '(.*)'$")			
            public void ThenVerifyContentProjectNameShouldNotBeMoreThan35CharactersInCreateProjectAsprojectNameShouldNotBeMoreThan35Characters(String  projectNameShouldNotBeMoreThan35Characters)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(projectNameShouldNotBeMoreThan35Characters,0,"AlgoShack","AlgoShack.ProjectNameshouldnotbemorethan35charactersTextBoxXPATH","XPATH"), "Then verify content Project Name should not be more than 35 characters in create project as '<Project Name should not be more than 35 characters>'");
                
            }

            @When("^I clicked Project under Project Explorer in project explorer$")			
            public void WhenIClickedProjectUnderProjectExplorerInProjectExplorer()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.ProjectunderProjectExplorerTextBoxXPATH","XPATH");
                
            }

            @When("^I selected Menu in project explorer$")			
            public void WhenISelectedMenuInProjectExplorer()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.MenuButtonXPATH","XPATH");
                
            }

             @Then("^verify not displayed Project Explorer Label in project explorer$")			
            public void ThenVerifyNotDisplayedProjectExplorerLabelInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyNotDisplayed(0,"AlgoShack","AlgoShack.ProjectExplorerLabelLabelXPATH","XPATH"), "Then verify not displayed Project Explorer Label in project explorer");
                
            }

             @Then("^verify displayed Unpin in project explorer$")			
            public void ThenVerifyDisplayedUnpinInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.UnpinButtonXPATH","XPATH"), "Then verify displayed Unpin in project explorer");
                
            }

            @When("^I clicked Palette in project explorer$")			
            public void WhenIClickedPaletteInProjectExplorer()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.PaletteButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Canvas Page in canvas$")			
            public void ThenVerifyDisplayedCanvasPageInCanvas()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.CanvasPageButtonXPATH","XPATH"), "Then verify displayed Canvas Page in canvas");
                
            }

            @When("^I selected Unpin in project explorer$")			
            public void WhenISelectedUnpinInProjectExplorer()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.UnpinButtonXPATH","XPATH");
                
            }

            @When("^I copied text Project name in create project$")			
            public void WhenICopiedTextProjectNameInCreateProject()
            {
                workFlow.copiedtext(0,"AlgoShack","AlgoShack.ProjectnameTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Project created successfully SMS in create project as '(.*)'$")			
            public void ThenVerifyContentProjectCreatedSuccessfullySmsInCreateProjectAsprojectCreatedSuccessfullySms(String  projectCreatedSuccessfullySms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(projectCreatedSuccessfullySms,0,"AlgoShack","AlgoShack.ProjectcreatedsuccessfullySMSTextBoxXPATH","XPATH"), "Then verify content Project created successfully SMS in create project as '<Project created successfully SMS>'");
                
            }

             @Then("^verify copied text by index Project under Project Explorer in project explorer as '(.*)'$")			
            public void ThenVerifyCopiedTextByIndexProjectUnderProjectExplorerInProjectExplorerAsprojectUnderProjectExplorer2(String  projectUnderProjectExplorer2)
            {
                Assertion.IsTrue(workFlow.verifyCopiedTextByIndex(projectUnderProjectExplorer2,0,"AlgoShack","AlgoShack.ProjectunderProjectExplorerTextBoxXPATH","XPATH"), "Then verify copied text by index Project under Project Explorer in project explorer as '<Project under Project Explorer2>'");
                
            }

            @When("^I selected Follow me in canvas$")			
            public void WhenISelectedFollowMeInCanvas()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.FollowmeButtonXPATH","XPATH");
                
            }

            @When("^I selected Project name 3 dots in project explorer$")			
            public void WhenISelectedProjectName3DotsInProjectExplorer()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.Projectname3dotsButtonXPATH","XPATH");
                
            }

            @When("^I selected Delete Project in project explorer$")			
            public void WhenISelectedDeleteProjectInProjectExplorer()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.DeleteProjectButtonXPATH","XPATH");
                
            }

            @When("^I selected Project Delete Yes in delete$")			
            public void WhenISelectedProjectDeleteYesInDelete()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.ProjectDeleteYesButtonXPATH","XPATH");
                
            }

             @Then("^verify content Successfully Deleted SMS in delete as '(.*)'$")			
            public void ThenVerifyContentSuccessfullyDeletedSmsInDeleteAssuccessfullyDeletedSms(String  successfullyDeletedSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(successfullyDeletedSms,0,"AlgoShack","AlgoShack.SuccessfullyDeletedSMSTextBoxXPATH","XPATH"), "Then verify content Successfully Deleted SMS in delete as '<Successfully Deleted SMS>'");
                
            }

            @When("^I selected Desktop Automation in create project$")			
            public void WhenISelectedDesktopAutomationInCreateProject()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.DesktopAutomationButtonXPATH","XPATH");
                
            }

             @Then("^verify content Project Name can contains alphanumeric Single space Between Words and underscore error SMS in create project as '(.*)'$")			
            public void ThenVerifyContentProjectNameCanContainsAlphanumericSingleSpaceBetweenWordsUnderscoreErrorSmsInCreateProjectAsprojectNameCanContainsAlphanumericSingleSpaceBetweenWordsAndUnderscoreErrorSms(String  projectNameCanContainsAlphanumericSingleSpaceBetweenWordsAndUnderscoreErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(projectNameCanContainsAlphanumericSingleSpaceBetweenWordsAndUnderscoreErrorSms,0,"AlgoShack","AlgoShack.ProjectNamecancontainsalphanumericSinglespaceBetweenWordsandunderscoreerrorSMSTextBoxXPATH","XPATH"), "Then verify content Project Name can contains alphanumeric Single space Between Words and underscore error SMS in create project as '<Project Name can contains alphanumeric Single space Between Words and underscore error SMS>'");
                
            }

            @When("^I clear and enter text Project name in create project as '(.*)'$")			
            public void WhenIClearEnterTextProjectNameInCreateProjectAsprojectName2(String  projectName2)
            {
                workFlow.clearAndEnterText(projectName2,0,"AlgoShack","AlgoShack.ProjectnameTextBoxXPATH","XPATH");
                
            }

            @When("^I selected Project Delete No in delete$")			
            public void WhenISelectedProjectDeleteNoInDelete()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.ProjectDeleteNoButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Project Delete No in delete$")			
            public void ThenVerifyDisplayedProjectDeleteNoInDelete()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.ProjectDeleteNoButtonXPATH","XPATH"), "Then verify displayed Project Delete No in delete");
                
            }

             @Then("^verify displayed Project Delete Yes in delete$")			
            public void ThenVerifyDisplayedProjectDeleteYesInDelete()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.ProjectDeleteYesButtonXPATH","XPATH"), "Then verify displayed Project Delete Yes in delete");
                
            }

            @When("^I entered Search Project name in project explorer as '(.*)'$")			
            public void WhenIEnteredSearchProjectNameInProjectExplorerAssearchProjectName1(String  searchProjectName1)
            {
                workFlow.enterText(searchProjectName1,0,"AlgoShack","AlgoShack.SearchProjectnameTextBoxXPATH","XPATH");
                
            }

            @When("^I selected Copy project in project explorer$")			
            public void WhenISelectedCopyProjectInProjectExplorer()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.CopyprojectButtonXPATH","XPATH");
                
            }

            @When("^I selected Copy Save in project explorer$")			
            public void WhenISelectedCopySaveInProjectExplorer()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.CopySaveButtonXPATH","XPATH");
                
            }

            @When("^I entered New project Name in project explorer as '(.*)'$")			
            public void WhenIEnteredNewProjectNameInProjectExplorerAsnewProjectName2(String  newProjectName2)
            {
                workFlow.enterText(newProjectName2,0,"AlgoShack","AlgoShack.NewprojectNameTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Copy Project name error SMS in project explorer as '(.*)'$")			
            public void ThenVerifyContentCopyProjectNameErrorSmsInProjectExplorerAscopyProjectNameErrorSms(String  copyProjectNameErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(copyProjectNameErrorSms,0,"AlgoShack","AlgoShack.CopyProjectnameerrorSMSTextBoxXPATH","XPATH"), "Then verify content Copy Project name error SMS in project explorer as '<Copy Project name error SMS>'");
                
            }

            @When("^I clear and enter text New project Name in project explorer as '(.*)'$")			
            public void WhenIClearEnterTextNewProjectNameInProjectExplorerAsnewProjectName3(String  newProjectName3)
            {
                workFlow.clearAndEnterText(newProjectName3,0,"AlgoShack","AlgoShack.NewprojectNameTextBoxXPATH","XPATH");
                
            }

            @When("^I selected Mobile Automation in create project$")			
            public void WhenISelectedMobileAutomationInCreateProject()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.MobileAutomationButtonXPATH","XPATH");
                
            }

            @When("^I selected Clear in create project$")			
            public void WhenISelectedClearInCreateProject()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.ClearButtonXPATH","XPATH");
                
            }

            @When("^I Copied text not present Project name in create project as '(.*)'$")			
            public void WhenICopiedTextNotPresentProjectNameInCreateProjectAsprojectName2(String  projectName2)
            {
                workFlow.copiedTextNotPresent(projectName2,0,"AlgoShack","AlgoShack.ProjectnameTextBoxXPATH","XPATH");
                
            }

            @When("^I Copied text not present Project under Project Explorer in project explorer as '(.*)'$")			
            public void WhenICopiedTextNotPresentProjectUnderProjectExplorerInProjectExplorerAsprojectUnderProjectExplorer3(String  projectUnderProjectExplorer3)
            {
                workFlow.copiedTextNotPresent(projectUnderProjectExplorer3,0,"AlgoShack","AlgoShack.ProjectunderProjectExplorerTextBoxXPATH","XPATH");
                
            }

            @When("^I clicked Create Project link in project explorer$")			
            public void WhenIClickedCreateProjectLinkInProjectExplorer()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.CreateProjectlinkLinkXPATH","XPATH");
                
            }

            @When("^I enter copied text Project name in create project$")			
            public void WhenIEnterCopiedTextProjectNameInCreateProject()
            {
                workFlow.enterCopiedText(0,"AlgoShack","AlgoShack.ProjectnameTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Project Name already exist in create project as '(.*)'$")			
            public void ThenVerifyContentProjectNameAlreadyExistInCreateProjectAsprojectNameAlreadyExist6(String  projectNameAlreadyExist6)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(projectNameAlreadyExist6,0,"AlgoShack","AlgoShack.ProjectNamealreadyexistTextBoxXPATH","XPATH"), "Then verify content Project Name already exist in create project as '<Project Name already exist6>'");
                
            }

            @When("^I enter copied text Search Project name in project explorer$")			
            public void WhenIEnterCopiedTextSearchProjectNameInProjectExplorer()
            {
                workFlow.enterCopiedText(0,"AlgoShack","AlgoShack.SearchProjectnameTextBoxXPATH","XPATH");
                
            }

            @When("^I selected Search Project close icon in project explorer$")			
            public void WhenISelectedSearchProjectCloseIconInProjectExplorer()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.SearchProjectcloseiconButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Project under Project Explorer in project explorer$")			
            public void ThenVerifyDisplayedProjectUnderProjectExplorerInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"AlgoShack","AlgoShack.ProjectunderProjectExplorerTextBoxXPATH","XPATH"), "Then verify displayed Project under Project Explorer in project explorer");
                
            }

             @Then("^Verify Text Test Cases in project explorer$")			
            public void ThenVerifyTextTestCasesInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.TestCasesLabelXPATH","XPATH"), "Then Verify Text Test Cases in project explorer");
                
            }

             @Then("^verify displayed Upload button in node_config$")			
            public void ThenVerifyDisplayedUploadButtonInNodeconfig()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.UploadbuttonButtonXPATH","XPATH"), "Then verify displayed Upload button in node_config");
                
            }

             @Then("^verify displayed Upload Button in configuration$")			
            public void ThenVerifyDisplayedUploadButtonInConfiguration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.UploadButtonButtonXPATH","XPATH"), "Then verify displayed Upload Button in configuration");
                
            }

            @When("^I copied text New project Name in project explorer$")			
            public void WhenICopiedTextNewProjectNameInProjectExplorer()
            {
                workFlow.copiedtext(0,"AlgoShack","AlgoShack.NewprojectNameTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Successfully Copied Project in project explorer as '(.*)'$")			
            public void ThenVerifyContentSuccessfullyCopiedProjectInProjectExplorerAssuccessfullyCopiedProject(String  successfullyCopiedProject)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(successfullyCopiedProject,0,"AlgoShack","AlgoShack.SuccessfullyCopiedProjectTextBoxXPATH","XPATH"), "Then verify content Successfully Copied Project in project explorer as '<Successfully Copied Project>'");
                
            }

            @When("^I clear text Search Project name in project explorer$")			
            public void WhenIClearTextSearchProjectNameInProjectExplorer()
            {
                workFlow.clearText(0,"AlgoShack","AlgoShack.SearchProjectnameTextBoxXPATH","XPATH");
                
            }

             @Then("^verify displayed Test Cases in project explorer$")			
            public void ThenVerifyDisplayedTestCasesInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.TestCasesLabelXPATH","XPATH"), "Then verify displayed Test Cases in project explorer");
                
            }

            @When("^I Scroll and Click Project name 3 dots in project explorer$")			
            public void WhenIScrollClickProjectName3DotsInProjectExplorer()
            {
                workFlow.scrollAndClick(0,"AlgoShack","AlgoShack.Projectname3dotsButtonXPATH","XPATH");
                
            }

            @When("^I selected Follow Me Create in follow me$")			
            public void WhenISelectedFollowMeCreateInFollowMe()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.FollowMeCreateButtonXPATH","XPATH");
                
            }

            @When("^I selected Node Name1 in follow me$")			
            public void WhenISelectedNodeName1InFollowMe()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.NodeName1ButtonXPATH","XPATH");
                
            }

            @When("^I checked Feature Name1 in follow me$")			
            public void WhenICheckedFeatureName1InFollowMe()
            {
                workFlow.checkCheckbox(0,"AlgoShack","AlgoShack.FeatureName1CheckBoxXPATH","XPATH");
                
            }

            @When("^I selected Control Name1 in follow me$")			
            public void WhenISelectedControlName1InFollowMe()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.ControlName1ButtonXPATH","XPATH");
                
            }

             @Then("^verify text View Selected Controls label in follow me$")			
            public void ThenVerifyTextViewSelectedControlsLabelInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.ViewSelectedControlslabelLabelXPATH","XPATH"), "Then verify text View Selected Controls label in follow me");
                
            }

             @Then("^verify text All selected controls list in follow me$")			
            public void ThenVerifyTextAllSelectedControlsListInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.AllselectedcontrolslistLabelXPATH","XPATH"), "Then verify text All selected controls list in follow me");
                
            }

            @When("^I selected View Selected Controls Close in follow me$")			
            public void WhenISelectedViewSelectedControlsCloseInFollowMe()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.ViewSelectedControlsCloseButtonXPATH","XPATH");
                
            }

            @When("^I selected Follow Me Ok in follow me$")			
            public void WhenISelectedFollowMeOkInFollowMe()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.FollowMeOkButtonXPATH","XPATH");
                
            }

            @When("^I selected Follow Me Submit in follow me$")			
            public void WhenISelectedFollowMeSubmitInFollowMe()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.FollowMeSubmitButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Follow Me Analyse in follow me$")			
            public void ThenVerifyDisplayedFollowMeAnalyseInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.FollowMeAnalyseButtonXPATH","XPATH"), "Then verify displayed Follow Me Analyse in follow me");
                
            }

            @When("^I selected Follow Me Analyse in follow me$")			
            public void WhenISelectedFollowMeAnalyseInFollowMe()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.FollowMeAnalyseButtonXPATH","XPATH");
                
            }

             @Then("^verify content Scenario Created Successfully SMS in follow me as '(.*)'$")			
            public void ThenVerifyContentScenarioCreatedSuccessfullySmsInFollowMeAsscenarioCreatedSuccessfullySms(String  scenarioCreatedSuccessfullySms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(scenarioCreatedSuccessfullySms,0,"AlgoShack","AlgoShack.ScenarioCreatedSuccessfullySMSTextBoxXPATH","XPATH"), "Then verify content Scenario Created Successfully SMS in follow me as '<Scenario Created Successfully SMS>'");
                
            }

             @Then("^verify displayed Follow Me Create in follow me$")			
            public void ThenVerifyDisplayedFollowMeCreateInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.FollowMeCreateButtonXPATH","XPATH"), "Then verify displayed Follow Me Create in follow me");
                
            }

             @Then("^verify displayed Node Name1 in follow me$")			
            public void ThenVerifyDisplayedNodeName1InFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.NodeName1ButtonXPATH","XPATH"), "Then verify displayed Node Name1 in follow me");
                
            }

             @Then("^verify displayed Node Name2 in follow me$")			
            public void ThenVerifyDisplayedNodeName2InFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.NodeName2ButtonXPATH","XPATH"), "Then verify displayed Node Name2 in follow me");
                
            }

             @Then("^verify displayed Previous control is blue colour in follow me$")			
            public void ThenVerifyDisplayedPreviousControlIsBlueColourInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.PreviouscontrolisbluecolourButtonXPATH","XPATH"), "Then verify displayed Previous control is blue colour in follow me");
                
            }

             @Then("^verify displayed Searched Controls Name in follow me$")			
            public void ThenVerifyDisplayedSearchedControlsNameInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.SearchedControlsNameButtonXPATH","XPATH"), "Then verify displayed Searched Controls Name in follow me");
                
            }

             @Then("^verify displayed Follow me No Controls Found in follow me$")			
            public void ThenVerifyDisplayedFollowMeNoControlsFoundInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.FollowmeNoControlsFoundLabelXPATH","XPATH"), "Then verify displayed Follow me No Controls Found in follow me");
                
            }

             @Then("^verify content First name cannot be greater than 35 error SMS in sign up as '(.*)'$")			
            public void ThenVerifyContentFirstNameCannotBeGreaterThan35ErrorSmsInSignUpAsfirstNameCannotBeGreaterThan35ErrorSms(String  firstNameCannotBeGreaterThan35ErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(firstNameCannotBeGreaterThan35ErrorSms,0,"AlgoShack","AlgoShack.Firstnamecannotbegreaterthan35errorSMSTextBoxXPATH","XPATH"), "Then verify content First name cannot be greater than 35 error SMS in sign up as '<First name cannot be greater than 35 error SMS>'");
                
            }

             @Then("^verify content Last name cannot be greater than 35 error SMS in sign up as '(.*)'$")			
            public void ThenVerifyContentLastNameCannotBeGreaterThan35ErrorSmsInSignUpAslastNameCannotBeGreaterThan35ErrorSms(String  lastNameCannotBeGreaterThan35ErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(lastNameCannotBeGreaterThan35ErrorSms,0,"AlgoShack","AlgoShack.Lastnamecannotbegreaterthan35errorSMSTextBoxXPATH","XPATH"), "Then verify content Last name cannot be greater than 35 error SMS in sign up as '<Last name cannot be greater than 35 error SMS>'");
                
            }

             @Then("^verify content Password cannot be more than 35 characters error sms in sign up as '(.*)'$")			
            public void ThenVerifyContentPasswordCannotBeMoreThan35CharactersErrorSmsInSignUpAspasswordCannotBeMoreThan35CharactersErrorSms(String  passwordCannotBeMoreThan35CharactersErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(passwordCannotBeMoreThan35CharactersErrorSms,0,"AlgoShack","AlgoShack.Passwordcannotbemorethan35characterserrorsmsTextBoxXPATH","XPATH"), "Then verify content Password cannot be more than 35 characters error sms in sign up as '<Password cannot be more than 35 characters error sms>'");
                
            }

             @Then("^verify content Password do not match error SMS in sign up as '(.*)'$")			
            public void ThenVerifyContentPasswordDoNotMatchErrorSmsInSignUpAspasswordDoNotMatchErrorSms(String  passwordDoNotMatchErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(passwordDoNotMatchErrorSms,0,"AlgoShack","AlgoShack.PassworddonotmatcherrorSMSTextBoxXPATH","XPATH"), "Then verify content Password do not match error SMS in sign up as '<Password do not match error SMS>'");
                
            }

             @Then("^verify displayed Sign Up link in sign up$")			
            public void ThenVerifyDisplayedSignUpLinkInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.SignUplinkButtonXPATH","XPATH"), "Then verify displayed Sign Up link in sign up");
                
            }

             @Then("^verify displayed First Name in sign up$")			
            public void ThenVerifyDisplayedFirstNameInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"AlgoShack","AlgoShack.FirstNameTextBoxXPATH","XPATH"), "Then verify displayed First Name in sign up");
                
            }

             @Then("^verify displayed Last Name in sign up$")			
            public void ThenVerifyDisplayedLastNameInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"AlgoShack","AlgoShack.LastNameTextBoxXPATH","XPATH"), "Then verify displayed Last Name in sign up");
                
            }

             @Then("^verify displayed Email Addresss in sign up$")			
            public void ThenVerifyDisplayedEmailAddresssInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"AlgoShack","AlgoShack.EmailAddresssTextBoxXPATH","XPATH"), "Then verify displayed Email Addresss in sign up");
                
            }

             @Then("^verify displayed Passwords in sign up$")			
            public void ThenVerifyDisplayedPasswordsInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"AlgoShack","AlgoShack.PasswordsTextBoxXPATH","XPATH"), "Then verify displayed Passwords in sign up");
                
            }

             @Then("^verify displayed Password Show in sign up$")			
            public void ThenVerifyDisplayedPasswordShowInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.PasswordShowButtonXPATH","XPATH"), "Then verify displayed Password Show in sign up");
                
            }

             @Then("^verify displayed Confirm Password in sign up$")			
            public void ThenVerifyDisplayedConfirmPasswordInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"AlgoShack","AlgoShack.ConfirmPasswordTextBoxXPATH","XPATH"), "Then verify displayed Confirm Password in sign up");
                
            }

             @Then("^verify displayed Sign Up Button in sign up$")			
            public void ThenVerifyDisplayedSignUpButtonInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.SignUpButtonButtonXPATH","XPATH"), "Then verify displayed Sign Up Button in sign up");
                
            }

             @Then("^verify displayed Already a member  Sign In in sign up$")			
            public void ThenVerifyDisplayedAlreadyAMemberSignInInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.AlreadyamemberSignInLinkXPATH","XPATH"), "Then verify displayed Already a member  Sign In in sign up");
                
            }

            @When("^I selected SignIn link in sign in$")			
            public void WhenISelectedSigninLinkInSignIn()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.SignInlinkButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed SignIn link in sign in$")			
            public void ThenVerifyDisplayedSigninLinkInSignIn()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.SignInlinkButtonXPATH","XPATH"), "Then verify displayed SignIn link in sign in");
                
            }

             @Then("^verify displayed Password in sign in$")			
            public void ThenVerifyDisplayedPasswordInSignIn()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"AlgoShack","AlgoShack.PasswordTextBoxXPATH","XPATH"), "Then verify displayed Password in sign in");
                
            }

             @Then("^verify displayed Sign In Button in sign in$")			
            public void ThenVerifyDisplayedSignInButtonInSignIn()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.SignInButtonButtonXPATH","XPATH"), "Then verify displayed Sign In Button in sign in");
                
            }

             @Then("^verify displayed Sign in Show in sign in$")			
            public void ThenVerifyDisplayedSignInShowInSignIn()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.SigninShowButtonXPATH","XPATH"), "Then verify displayed Sign in Show in sign in");
                
            }

             @Then("^verify displayed Sign in Forgot Password in sign in$")			
            public void ThenVerifyDisplayedSignInForgotPasswordInSignIn()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.SigninForgotPasswordButtonXPATH","XPATH"), "Then verify displayed Sign in Forgot Password in sign in");
                
            }

             @Then("^verify displayed New to Algoshack  Sign Up in sign in$")			
            public void ThenVerifyDisplayedNewToAlgoshackSignUpInSignIn()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.NewtoAlgoshackSignUpButtonXPATH","XPATH"), "Then verify displayed New to Algoshack  Sign Up in sign in");
                
            }

             @Then("^verify text Password weak in sign up$")			
            public void ThenVerifyTextPasswordWeakInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.PasswordweakLabelXPATH","XPATH"), "Then verify text Password weak in sign up");
                
            }

             @Then("^verify text Password okay in sign up$")			
            public void ThenVerifyTextPasswordOkayInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.PasswordokayLabelXPATH","XPATH"), "Then verify text Password okay in sign up");
                
            }

             @Then("^verify text Password good in sign up$")			
            public void ThenVerifyTextPasswordGoodInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.PasswordgoodLabelXPATH","XPATH"), "Then verify text Password good in sign up");
                
            }

             @Then("^verify text Password strong in sign up$")			
            public void ThenVerifyTextPasswordStrongInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.PasswordstrongLabelXPATH","XPATH"), "Then verify text Password strong in sign up");
                
            }

            @When("^I clicked Terms And Agreement link in sign up$")			
            public void WhenIClickedTermsAgreementLinkInSignUp()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.TermsAndAgreementlinkLinkXPATH","XPATH");
                
            }

             @Then("^verify text END USER LICENSE AGREEMENT Page in sign up$")			
            public void ThenVerifyTextEndUserLicenseAgreementPageInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.ENDUSERLICENSEAGREEMENTPageLabelXPATH","XPATH"), "Then verify text END USER LICENSE AGREEMENT Page in sign up");
                
            }

             @Then("^verify content Only alphabets are allowed for College Name in sign up as '(.*)'$")			
            public void ThenVerifyContentOnlyAlphabetsAreAllowedForCollegeNameInSignUpAsonlyAlphabetsAreAllowedForCollegeName2(String  onlyAlphabetsAreAllowedForCollegeName2)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(onlyAlphabetsAreAllowedForCollegeName2,0,"AlgoShack","AlgoShack.OnlyalphabetsareallowedforCollegeNameTextBoxXPATH","XPATH"), "Then verify content Only alphabets are allowed for College Name in sign up as '<Only alphabets are allowed for College Name2>'");
                
            }

             @Then("^verify displayed Student in sign up$")			
            public void ThenVerifyDisplayedStudentInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.StudentButtonXPATH","XPATH"), "Then verify displayed Student in sign up");
                
            }

             @Then("^verify displayed Company in sign up$")			
            public void ThenVerifyDisplayedCompanyInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.CompanyButtonXPATH","XPATH"), "Then verify displayed Company in sign up");
                
            }

             @Then("^verify content Only alphabets are allowed for Company Name in sign up as '(.*)'$")			
            public void ThenVerifyContentOnlyAlphabetsAreAllowedForCompanyNameInSignUpAsonlyAlphabetsAreAllowedForCompanyName2(String  onlyAlphabetsAreAllowedForCompanyName2)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(onlyAlphabetsAreAllowedForCompanyName2,0,"AlgoShack","AlgoShack.OnlyalphabetsareallowedforCompanyNameTextBoxXPATH","XPATH"), "Then verify content Only alphabets are allowed for Company Name in sign up as '<Only alphabets are allowed for Company Name2>'");
                
            }

             @Then("^verify content Please provide company name error SMS in sign up as '(.*)'$")			
            public void ThenVerifyContentPleaseProvideCompanyNameErrorSmsInSignUpAspleaseProvideCompanyNameErrorSms(String  pleaseProvideCompanyNameErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(pleaseProvideCompanyNameErrorSms,0,"AlgoShack","AlgoShack.PleaseprovidecompanynameerrorSMSTextBoxXPATH","XPATH"), "Then verify content Please provide company name error SMS in sign up as '<Please provide company name error SMS>'");
                
            }

            @When("^I copied text Search Project name in project explorer$")			
            public void WhenICopiedTextSearchProjectNameInProjectExplorer()
            {
                workFlow.copiedtext(0,"AlgoShack","AlgoShack.SearchProjectnameTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Name for Copied Project in project explorer as '(.*)'$")			
            public void ThenVerifyContentNameForCopiedProjectInProjectExplorerAsnameForCopiedProject(String  nameForCopiedProject)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(nameForCopiedProject,0,"AlgoShack","AlgoShack.NameforCopiedProjectTextBoxXPATH","XPATH"), "Then verify content Name for Copied Project in project explorer as '<Name for Copied Project>'");
                
            }

             @Then("^verify content Copied Project Name should not be more than 35 characters length error sms in project explorer as '(.*)'$")			
            public void ThenVerifyContentCopiedProjectNameShouldNotBeMoreThan35CharactersLengthErrorSmsInProjectExplorerAscopiedProjectNameShouldNotBeMoreThan35CharactersLengthErrorSms3(String  copiedProjectNameShouldNotBeMoreThan35CharactersLengthErrorSms3)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(copiedProjectNameShouldNotBeMoreThan35CharactersLengthErrorSms3,0,"AlgoShack","AlgoShack.CopiedProjectNameshouldnotbemorethan35characterslengtherrorsmsTextBoxXPATH","XPATH"), "Then verify content Copied Project Name should not be more than 35 characters length error sms in project explorer as '<Copied Project Name should not be more than 35 characters length error sms3>'");
                
            }

             @Then("^verify content Project with similar name already exists error sms in project explorer as '(.*)'$")			
            public void ThenVerifyContentProjectWithSimilarNameAlreadyExistsErrorSmsInProjectExplorerAsprojectWithSimilarNameAlreadyExistsErrorSms(String  projectWithSimilarNameAlreadyExistsErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(projectWithSimilarNameAlreadyExistsErrorSms,0,"AlgoShack","AlgoShack.ProjectwithsimilarnamealreadyexistserrorsmsTextBoxXPATH","XPATH"), "Then verify content Project with similar name already exists error sms in project explorer as '<Project with similar name already exists error sms>'");
                
            }

            @When("^I clear text New project Name in project explorer$")			
            public void WhenIClearTextNewProjectNameInProjectExplorer()
            {
                workFlow.clearText(0,"AlgoShack","AlgoShack.NewprojectNameTextBoxXPATH","XPATH");
                
            }

            @When("^I enter copied text New project Name in project explorer$")			
            public void WhenIEnterCopiedTextNewProjectNameInProjectExplorer()
            {
                workFlow.enterCopiedText(0,"AlgoShack","AlgoShack.NewprojectNameTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Copied Project Name error SMS in project explorer as '(.*)'$")			
            public void ThenVerifyContentCopiedProjectNameErrorSmsInProjectExplorerAscopiedProjectNameErrorSms5(String  copiedProjectNameErrorSms5)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(copiedProjectNameErrorSms5,0,"AlgoShack","AlgoShack.CopiedProjectNameerrorSMSTextBoxXPATH","XPATH"), "Then verify content Copied Project Name error SMS in project explorer as '<Copied Project Name error SMS5>'");
                
            }

            @When("^I selected Copy Cancel in project explorer$")			
            public void WhenISelectedCopyCancelInProjectExplorer()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.CopyCancelButtonXPATH","XPATH");
                
            }

             @Then("^verify content Incorrect Email or Password in sign in as '(.*)'$")			
            public void ThenVerifyContentIncorrectEmailOrPasswordInSignInAsincorrectEmailOrPassword(String  incorrectEmailOrPassword)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(incorrectEmailOrPassword,0,"AlgoShack","AlgoShack.IncorrectEmailorPasswordTextBoxXPATH","XPATH"), "Then verify content Incorrect Email or Password in sign in as '<Incorrect Email or Password>'");
                
            }

            @When("^I clear and enter text Password in sign in as '(.*)'$")			
            public void WhenIClearEnterTextPasswordInSignInAspassword2(String  password2)
            {
                workFlow.clearAndEnterText(password2,0,"AlgoShack","AlgoShack.PasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I selected Sign in Forgot Password in sign in$")			
            public void WhenISelectedSignInForgotPasswordInSignIn()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.SigninForgotPasswordButtonXPATH","XPATH");
                
            }

             @Then("^verify text Forgot Password label in forgot password$")			
            public void ThenVerifyTextForgotPasswordLabelInForgotPassword()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.ForgotPasswordlabelLabelXPATH","XPATH"), "Then verify text Forgot Password label in forgot password");
                
            }

            @When("^I selected Get OTPsend in forgot password$")			
            public void WhenISelectedGetOtpsendInForgotPassword()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.GetOTPsendButtonXPATH","XPATH");
                
            }

             @Then("^verify content Enter your Email error SMS in forgot password as '(.*)'$")			
            public void ThenVerifyContentEnterYourEmailErrorSmsInForgotPasswordAsenterYourEmailErrorSms(String  enterYourEmailErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(enterYourEmailErrorSms,0,"AlgoShack","AlgoShack.EnteryourEmailerrorSMSTextBoxXPATH","XPATH"), "Then verify content Enter your Email error SMS in forgot password as '<Enter your Email error SMS>'");
                
            }

             @Then("^verify content User Not Found error SMS in forgot password as '(.*)'$")			
            public void ThenVerifyContentUserNotFoundErrorSmsInForgotPasswordAsuserNotFoundErrorSms(String  userNotFoundErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(userNotFoundErrorSms,0,"AlgoShack","AlgoShack.UserNotFounderrorSMSTextBoxXPATH","XPATH"), "Then verify content User Not Found error SMS in forgot password as '<User Not Found error SMS>'");
                
            }

             @Then("^verify content OTPSent Successfully SMS in forgot password as '(.*)'$")			
            public void ThenVerifyContentOtpsentSuccessfullySmsInForgotPasswordAsotpsentSuccessfullySms5(String  otpsentSuccessfullySms5)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(otpsentSuccessfullySms5,0,"AlgoShack","AlgoShack.OTPSentSuccessfullySMSTextBoxXPATH","XPATH"), "Then verify content OTPSent Successfully SMS in forgot password as '<OTPSent Successfully SMS5>'");
                
            }

            @When("^I wait in seconds second in forgot password as '(.*)'$")			
            public void WhenIWaitInSecondsSecondInForgotPasswordAssecond6(String  second6)
            {
                workFlow.waitInSeconds(second6,0,"AlgoShack","AlgoShack.secondTextBoxXPATH","XPATH");
                
            }

             @Then("^verify disabled Forgot Password Submit in forgot password$")			
            public void ThenVerifyDisabledForgotPasswordSubmitInForgotPassword()
            {
                Assertion.IsTrue(workFlow.verifyDisabled(0,"AlgoShack","AlgoShack.ForgotPasswordSubmitButtonXPATH","XPATH"), "Then verify disabled Forgot Password Submit in forgot password");
                
            }

            @When("^I selected Resend OTPsend in forgot password$")			
            public void WhenISelectedResendOtpsendInForgotPassword()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.ResendOTPsendButtonXPATH","XPATH");
                
            }

            @When("^I entered OTPFileds in forgot password as '(.*)'$")			
            public void WhenIEnteredOtpfiledsInForgotPasswordAsotpfileds7(String  otpfileds7)
            {
                workFlow.enterText(otpfileds7,0,"AlgoShack","AlgoShack.OTPFiledsTextBoxXPATH","XPATH");
                
            }

             @Then("^verify enabled Forgot Password Submit in forgot password$")			
            public void ThenVerifyEnabledForgotPasswordSubmitInForgotPassword()
            {
                Assertion.IsTrue(workFlow.verifyEnabled(0,"AlgoShack","AlgoShack.ForgotPasswordSubmitButtonXPATH","XPATH"), "Then verify enabled Forgot Password Submit in forgot password");
                
            }

            @When("^I selected Forgot Password Submit in forgot password$")			
            public void WhenISelectedForgotPasswordSubmitInForgotPassword()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.ForgotPasswordSubmitButtonXPATH","XPATH");
                
            }

            @When("^I copied text Password in sign in$")			
            public void WhenICopiedTextPasswordInSignIn()
            {
                workFlow.copiedtext(0,"AlgoShack","AlgoShack.PasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I selected Sign in Show in sign in$")			
            public void WhenISelectedSignInShowInSignIn()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.SigninShowButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Sign in Hide in sign in$")			
            public void ThenVerifyDisplayedSignInHideInSignIn()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.SigninHideButtonXPATH","XPATH"), "Then verify displayed Sign in Hide in sign in");
                
            }

            @When("^I selected Sign in Hide in sign in$")			
            public void WhenISelectedSignInHideInSignIn()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.SigninHideButtonXPATH","XPATH");
                
            }

            @When("^I selected Sign In Button in sign in$")			
            public void WhenISelectedSignInButtonInSignIn()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.SignInButtonButtonXPATH","XPATH");
                
            }

             @Then("^verify content Sign in Please provide your email address in sign in as '(.*)'$")			
            public void ThenVerifyContentSignInPleaseProvideYourEmailAddressInSignInAssignInPleaseProvideYourEmailAddress(String  signInPleaseProvideYourEmailAddress)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(signInPleaseProvideYourEmailAddress,0,"AlgoShack","AlgoShack.SigninPleaseprovideyouremailaddressTextBoxXPATH","XPATH"), "Then verify content Sign in Please provide your email address in sign in as '<Sign in Please provide your email address>'");
                
            }

            @When("^I clear text Password in sign in$")			
            public void WhenIClearTextPasswordInSignIn()
            {
                workFlow.clearText(0,"AlgoShack","AlgoShack.PasswordTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Sign in Please enter your password in sign in as '(.*)'$")			
            public void ThenVerifyContentSignInPleaseEnterYourPasswordInSignInAssignInPleaseEnterYourPassword(String  signInPleaseEnterYourPassword)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(signInPleaseEnterYourPassword,0,"AlgoShack","AlgoShack.SigninPleaseenteryourpasswordTextBoxXPATH","XPATH"), "Then verify content Sign in Please enter your password in sign in as '<Sign in Please enter your password>'");
                
            }

            @When("^I selected New to Algoshack  Sign Up in sign in$")			
            public void WhenISelectedNewToAlgoshackSignUpInSignIn()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.NewtoAlgoshackSignUpButtonXPATH","XPATH");
                
            }

            @When("^I selected Profile Sequences close in follow me$")			
            public void WhenISelectedProfileSequencesCloseInFollowMe()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.ProfileSequencescloseButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Select file Upload in upload$")			
            public void ThenVerifyDisplayedSelectFileUploadInUpload()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.SelectfileUploadButtonXPATH","XPATH"), "Then verify displayed Select file Upload in upload");
                
            }

            @When("^I selected Select file Upload in upload$")			
            public void WhenISelectedSelectFileUploadInUpload()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.SelectfileUploadButtonXPATH","XPATH");
                
            }

             @Then("^verify content Please select file error SMS in upload as '(.*)'$")			
            public void ThenVerifyContentPleaseSelectFileErrorSmsInUploadAspleaseSelectFileErrorSms(String  pleaseSelectFileErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(pleaseSelectFileErrorSms,0,"AlgoShack","AlgoShack.PleaseselectfileerrorSMSTextBoxXPATH","XPATH"), "Then verify content Please select file error SMS in upload as '<Please select file error SMS>'");
                
            }

             @Then("^verify content Please select csv file error SMS in upload as '(.*)'$")			
            public void ThenVerifyContentPleaseSelectCsvFileErrorSmsInUploadAspleaseSelectCsvFileErrorSms(String  pleaseSelectCsvFileErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(pleaseSelectCsvFileErrorSms,0,"AlgoShack","AlgoShack.PleaseselectcsvfileerrorSMSTextBoxXPATH","XPATH"), "Then verify content Please select csv file error SMS in upload as '<Please select csv file error SMS>'");
                
            }

             @Then("^verify content Successfully uploaded Files SMS in upload as '(.*)'$")			
            public void ThenVerifyContentSuccessfullyUploadedFilesSmsInUploadAssuccessfullyUploadedFilesSms(String  successfullyUploadedFilesSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(successfullyUploadedFilesSms,0,"AlgoShack","AlgoShack.SuccessfullyuploadedFilesSMSTextBoxXPATH","XPATH"), "Then verify content Successfully uploaded Files SMS in upload as '<Successfully uploaded Files SMS>'");
                
            }

            @When("^I selected My Profile in home page$")			
            public void WhenISelectedMyProfileInHomePage()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.MyProfileButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Edit Profile in my profile$")			
            public void ThenVerifyDisplayedEditProfileInMyProfile()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.EditProfileButtonXPATH","XPATH"), "Then verify displayed Edit Profile in my profile");
                
            }

            @When("^I selected Edit Profile in my profile$")			
            public void WhenISelectedEditProfileInMyProfile()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.EditProfileButtonXPATH","XPATH");
                
            }

             @Then("^verify content Edit Profile Updated Successfully SMS in edit profile as '(.*)'$")			
            public void ThenVerifyContentEditProfileUpdatedSuccessfullySmsInEditProfileAseditProfileUpdatedSuccessfullySms(String  editProfileUpdatedSuccessfullySms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(editProfileUpdatedSuccessfullySms,0,"AlgoShack","AlgoShack.EditProfileUpdatedSuccessfullySMSTextBoxXPATH","XPATH"), "Then verify content Edit Profile Updated Successfully SMS in edit profile as '<Edit Profile Updated Successfully SMS>'");
                
            }

             @Then("^verify content Edit Profile Please provide your first name Error SMS in edit profile as '(.*)'$")			
            public void ThenVerifyContentEditProfilePleaseProvideYourFirstNameErrorSmsInEditProfileAseditProfilePleaseProvideYourFirstNameErrorSms(String  editProfilePleaseProvideYourFirstNameErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(editProfilePleaseProvideYourFirstNameErrorSms,0,"AlgoShack","AlgoShack.EditProfilePleaseprovideyourfirstnameErrorSMSTextBoxXPATH","XPATH"), "Then verify content Edit Profile Please provide your first name Error SMS in edit profile as '<Edit Profile Please provide your first name Error SMS>'");
                
            }

             @Then("^verify content Edit Profile Only alphabets are allowed Error SMS in edit profile as '(.*)'$")			
            public void ThenVerifyContentEditProfileOnlyAlphabetsAreAllowedErrorSmsInEditProfileAseditProfileOnlyAlphabetsAreAllowedErrorSms(String  editProfileOnlyAlphabetsAreAllowedErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(editProfileOnlyAlphabetsAreAllowedErrorSms,0,"AlgoShack","AlgoShack.EditProfileOnlyalphabetsareallowedErrorSMSTextBoxXPATH","XPATH"), "Then verify content Edit Profile Only alphabets are allowed Error SMS in edit profile as '<Edit Profile Only alphabets are allowed Error SMS>'");
                
            }

             @Then("^verify content Edit Profile First name 35 characters error SMS in edit profile as '(.*)'$")			
            public void ThenVerifyContentEditProfileFirstName35CharactersErrorSmsInEditProfileAseditProfileFirstName35CharactersErrorSms(String  editProfileFirstName35CharactersErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(editProfileFirstName35CharactersErrorSms,0,"AlgoShack","AlgoShack.EditProfileFirstname35characterserrorSMSTextBoxXPATH","XPATH"), "Then verify content Edit Profile First name 35 characters error SMS in edit profile as '<Edit Profile First name 35 characters error SMS>'");
                
            }

             @Then("^verify content Edit Profile Last name 35 characters error sms in edit profile as '(.*)'$")			
            public void ThenVerifyContentEditProfileLastName35CharactersErrorSmsInEditProfileAseditProfileLastName35CharactersErrorSms(String  editProfileLastName35CharactersErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(editProfileLastName35CharactersErrorSms,0,"AlgoShack","AlgoShack.EditProfileLastname35characterserrorsmsTextBoxXPATH","XPATH"), "Then verify content Edit Profile Last name 35 characters error sms in edit profile as '<Edit Profile Last name 35 characters error sms>'");
                
            }

            @When("^I selected Home in edit profile$")			
            public void WhenISelectedHomeInEditProfile()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.HomeButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Change Password in my profile$")			
            public void ThenVerifyDisplayedChangePasswordInMyProfile()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.ChangePasswordButtonXPATH","XPATH"), "Then verify displayed Change Password in my profile");
                
            }

            @When("^I selected Change Password in my profile$")			
            public void WhenISelectedChangePasswordInMyProfile()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.ChangePasswordButtonXPATH","XPATH");
                
            }

             @Then("^verify content Change Password Please enter a new password error SMS in change password as '(.*)'$")			
            public void ThenVerifyContentChangePasswordPleaseEnterANewPasswordErrorSmsInChangePasswordAschangePasswordPleaseEnterANewPasswordErrorSms(String  changePasswordPleaseEnterANewPasswordErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(changePasswordPleaseEnterANewPasswordErrorSms,0,"AlgoShack","AlgoShack.ChangePasswordPleaseenteranewpassworderrorSMSTextBoxXPATH","XPATH"), "Then verify content Change Password Please enter a new password error SMS in change password as '<Change Password Please enter a new password error SMS>'");
                
            }

             @Then("^verify content Change Password Please enter your current password error SMS in change password as '(.*)'$")			
            public void ThenVerifyContentChangePasswordPleaseEnterYourCurrentPasswordErrorSmsInChangePasswordAschangePasswordPleaseEnterYourCurrentPasswordErrorSms(String  changePasswordPleaseEnterYourCurrentPasswordErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(changePasswordPleaseEnterYourCurrentPasswordErrorSms,0,"AlgoShack","AlgoShack.ChangePasswordPleaseenteryourcurrentpassworderrorSMSTextBoxXPATH","XPATH"), "Then verify content Change Password Please enter your current password error SMS in change password as '<Change Password Please enter your current password error SMS>'");
                
            }

             @Then("^verify content Change Password Password must contain atleast error SMS in change password as '(.*)'$")			
            public void ThenVerifyContentChangePasswordPasswordMustContainAtleastErrorSmsInChangePasswordAschangePasswordPasswordMustContainAtleastErrorSms(String  changePasswordPasswordMustContainAtleastErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(changePasswordPasswordMustContainAtleastErrorSms,0,"AlgoShack","AlgoShack.ChangePasswordPasswordmustcontainatleasterrorSMSTextBoxXPATH","XPATH"), "Then verify content Change Password Password must contain atleast error SMS in change password as '<Change Password Password must contain atleast error SMS>'");
                
            }

             @Then("^verify content Please login again with new password SMS in change password as '(.*)'$")			
            public void ThenVerifyContentPleaseLoginAgainWithNewPasswordSmsInChangePasswordAspleaseLoginAgainWithNewPasswordSms(String  pleaseLoginAgainWithNewPasswordSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(pleaseLoginAgainWithNewPasswordSms,0,"AlgoShack","AlgoShack.PleaseloginagainwithnewpasswordSMSTextBoxXPATH","XPATH"), "Then verify content Please login again with new password SMS in change password as '<Please login again with new password SMS>'");
                
            }

             @Then("^verify displayed My Subscription in my profile$")			
            public void ThenVerifyDisplayedMySubscriptionInMyProfile()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.MySubscriptionButtonXPATH","XPATH"), "Then verify displayed My Subscription in my profile");
                
            }

             @Then("^verify displayed Logout in my profile$")			
            public void ThenVerifyDisplayedLogoutInMyProfile()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.LogoutButtonXPATH","XPATH"), "Then verify displayed Logout in my profile");
                
            }

            @When("^I selected Logout in my profile$")			
            public void WhenISelectedLogoutInMyProfile()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.LogoutButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed algoQA Home Page in algoqa$")			
            public void ThenVerifyDisplayedAlgoqaHomePageInAlgoqa()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.algoQAHomePageButtonXPATH","XPATH"), "Then verify displayed algoQA Home Page in algoqa");
                
            }

            @When("^I selected My Subscription in my profile$")			
            public void WhenISelectedMySubscriptionInMyProfile()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.MySubscriptionButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Admin controls in my subscription$")			
            public void ThenVerifyDisplayedAdminControlsInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.AdmincontrolsButtonXPATH","XPATH"), "Then verify displayed Admin controls in my subscription");
                
            }

             @Then("^verify not displayed Profile Picture in edit profile$")			
            public void ThenVerifyNotDisplayedProfilePictureInEditProfile()
            {
                Assertion.IsTrue(workFlow.verifyNotDisplayed(0,"AlgoShack","AlgoShack.ProfilePictureButtonXPATH","XPATH"), "Then verify not displayed Profile Picture in edit profile");
                
            }

            @When("^I selected Follow Me Select custom Action in follow me$")			
            public void WhenISelectedFollowMeSelectCustomActionInFollowMe()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.FollowMeSelectcustomActionButtonXPATH","XPATH");
                
            }

            @When("^I selected Follow me Edit Control Save in follow me$")			
            public void WhenISelectedFollowMeEditControlSaveInFollowMe()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.FollowmeEditControlSaveButtonXPATH","XPATH");
                
            }

             @Then("^verify content Alias Name can accept error SMS in follow me as '(.*)'$")			
            public void ThenVerifyContentAliasNameCanAcceptErrorSmsInFollowMeAsaliasNameCanAcceptErrorSms(String  aliasNameCanAcceptErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(aliasNameCanAcceptErrorSms,0,"AlgoShack","AlgoShack.AliasNamecanaccepterrorSMSTextBoxXPATH","XPATH"), "Then verify content Alias Name can accept error SMS in follow me as '<Alias Name can accept error SMS>'");
                
            }

             @Then("^verify displayed Follow me Edit Control Save in follow me$")			
            public void ThenVerifyDisplayedFollowMeEditControlSaveInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.FollowmeEditControlSaveButtonXPATH","XPATH"), "Then verify displayed Follow me Edit Control Save in follow me");
                
            }

             @Then("^verify text Edit Scenario Form label in edit scenarios$")			
            public void ThenVerifyTextEditScenarioFormLabelInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.EditScenarioFormlabelLabelXPATH","XPATH"), "Then verify text Edit Scenario Form label in edit scenarios");
                
            }

             @Then("^verify by text Edit Scenario Custom Action in edit scenarios as '(.*)'$")			
            public void ThenVerifyByTextEditScenarioCustomActionInEditScenariosAseditScenarioCustomAction9(String  editScenarioCustomAction9)
            {
                Assertion.IsTrue(workFlow.verifyByText(editScenarioCustomAction9,0,"AlgoShack","AlgoShack.EditScenarioCustomActionTextBoxXPATH","XPATH"), "Then verify by text Edit Scenario Custom Action in edit scenarios as '<Edit Scenario Custom Action9>'");
                
            }

             @Then("^verify by text Edit Scenario Action in edit scenarios as '(.*)'$")			
            public void ThenVerifyByTextEditScenarioActionInEditScenariosAseditScenarioAction11(String  editScenarioAction11)
            {
                Assertion.IsTrue(workFlow.verifyByText(editScenarioAction11,0,"AlgoShack","AlgoShack.EditScenarioActionTextBoxXPATH","XPATH"), "Then verify by text Edit Scenario Action in edit scenarios as '<Edit Scenario Action11>'");
                
            }

             @Then("^verify by text Edit Scenario Custom Value in edit scenarios as '(.*)'$")			
            public void ThenVerifyByTextEditScenarioCustomValueInEditScenariosAseditScenarioCustomValue5(String  editScenarioCustomValue5)
            {
                Assertion.IsTrue(workFlow.verifyByText(editScenarioCustomValue5,0,"AlgoShack","AlgoShack.EditScenarioCustomValueTextBoxXPATH","XPATH"), "Then verify by text Edit Scenario Custom Value in edit scenarios as '<Edit Scenario Custom Value5>'");
                
            }

             @Then("^verify displayed Edit Scenario Form label in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioFormLabelInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.EditScenarioFormlabelLabelXPATH","XPATH"), "Then verify displayed Edit Scenario Form label in edit scenarios");
                
            }

            @When("^I entered Edit Scenario Custom Value in edit scenarios as '(.*)'$")			
            public void WhenIEnteredEditScenarioCustomValueInEditScenariosAseditScenarioCustomValue6(String  editScenarioCustomValue6)
            {
                workFlow.enterText(editScenarioCustomValue6,0,"AlgoShack","AlgoShack.EditScenarioCustomValueTextBoxXPATH","XPATH");
                
            }

             @Then("^verify displayed Edit Scenario Custom Value in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioCustomValueInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"AlgoShack","AlgoShack.EditScenarioCustomValueTextBoxXPATH","XPATH"), "Then verify displayed Edit Scenario Custom Value in edit scenarios");
                
            }

            @When("^I selected Node Name2 in follow me$")			
            public void WhenISelectedNodeName2InFollowMe()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.NodeName2ButtonXPATH","XPATH");
                
            }

             @Then("^verify copied text by index Follow Me Edit created scenario Name in follow me as '(.*)'$")			
            public void ThenVerifyCopiedTextByIndexFollowMeEditCreatedScenarioNameInFollowMeAsfollowMeEditCreatedScenarioName4(String  followMeEditCreatedScenarioName4)
            {
                Assertion.IsTrue(workFlow.verifyCopiedTextByIndex(followMeEditCreatedScenarioName4,0,"AlgoShack","AlgoShack.FollowMeEditcreatedscenarioNameTextBoxXPATH","XPATH"), "Then verify copied text by index Follow Me Edit created scenario Name in follow me as '<Follow Me Edit created scenario Name4>'");
                
            }

             @Then("^verify content Scenario Name Already Taken Popup SMS in follow me as '(.*)'$")			
            public void ThenVerifyContentScenarioNameAlreadyTakenPopupSmsInFollowMeAsscenarioNameAlreadyTakenPopupSms(String  scenarioNameAlreadyTakenPopupSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(scenarioNameAlreadyTakenPopupSms,0,"AlgoShack","AlgoShack.ScenarioNameAlreadyTakenPopupSMSTextBoxXPATH","XPATH"), "Then verify content Scenario Name Already Taken Popup SMS in follow me as '<Scenario Name Already Taken Popup SMS>'");
                
            }

            @When("^I copied text not present Follow Me Edit created scenario Name in follow me as '(.*)'$")			
            public void WhenICopiedTextNotPresentFollowMeEditCreatedScenarioNameInFollowMeAsfollowMeEditCreatedScenarioName8(String  followMeEditCreatedScenarioName8)
            {
                workFlow.copiedTextNotPresent(followMeEditCreatedScenarioName8,0,"AlgoShack","AlgoShack.FollowMeEditcreatedscenarioNameTextBoxXPATH","XPATH");
                
            }

            @When("^I copied text ifvisible Control Name1 in follow me$")			
            public void WhenICopiedTextIfvisibleControlName1InFollowMe()
            {
                workFlow.copiedTextIfVisible(0,"AlgoShack","AlgoShack.ControlName1ButtonXPATH","XPATH");
                
            }

            @When("^I copied text not present Edit Scenario Control Name in edit scenarios as '(.*)'$")			
            public void WhenICopiedTextNotPresentEditScenarioControlNameInEditScenariosAseditScenarioControlName4(String  editScenarioControlName4)
            {
                workFlow.copiedTextNotPresent(editScenarioControlName4,0,"AlgoShack","AlgoShack.EditScenarioControlNameTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Custom Action can accept error SMS in follow me as '(.*)'$")			
            public void ThenVerifyContentCustomActionCanAcceptErrorSmsInFollowMeAscustomActionCanAcceptErrorSms(String  customActionCanAcceptErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(customActionCanAcceptErrorSms,0,"AlgoShack","AlgoShack.CustomActioncanaccepterrorSMSTextBoxXPATH","XPATH"), "Then verify content Custom Action can accept error SMS in follow me as '<Custom Action can accept error SMS>'");
                
            }

             @Then("^verify content Action can contains error sms in follow me as '(.*)'$")			
            public void ThenVerifyContentActionCanContainsErrorSmsInFollowMeAsactionCanContainsErrorSms(String  actionCanContainsErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(actionCanContainsErrorSms,0,"AlgoShack","AlgoShack.ActioncancontainserrorsmsTextBoxXPATH","XPATH"), "Then verify content Action can contains error sms in follow me as '<Action can contains error sms>'");
                
            }

             @Then("^verify displayed Edit Scenario pagenation in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioPagenationInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.EditScenariopagenationButtonXPATH","XPATH"), "Then verify displayed Edit Scenario pagenation in edit scenarios");
                
            }

            @When("^I selected Rows per page in edit scenarios$")			
            public void WhenISelectedRowsPerPageInEditScenarios()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.RowsperpageButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed No of scenarios in the page as All in edit scenarios$")			
            public void ThenVerifyDisplayedNoOfScenariosInThePageAsAllInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.NoofscenariosinthepageasAllButtonXPATH","XPATH"), "Then verify displayed No of scenarios in the page as All in edit scenarios");
                
            }

             @Then("^verify copied text by index Searched Scenario Name in edit scenarios as '(.*)'$")			
            public void ThenVerifyCopiedTextByIndexSearchedScenarioNameInEditScenariosAssearchedScenarioName8(String  searchedScenarioName8)
            {
                Assertion.IsTrue(workFlow.verifyCopiedTextByIndex(searchedScenarioName8,0,"AlgoShack","AlgoShack.SearchedScenarioNameTextBoxXPATH","XPATH"), "Then verify copied text by index Searched Scenario Name in edit scenarios as '<Searched Scenario Name8>'");
                
            }

             @Then("^verify content Please enter Scenario Outline error SMS in edit scenarios as '(.*)'$")			
            public void ThenVerifyContentPleaseEnterScenarioOutlineErrorSmsInEditScenariosAspleaseEnterScenarioOutlineErrorSms(String  pleaseEnterScenarioOutlineErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(pleaseEnterScenarioOutlineErrorSms,0,"AlgoShack","AlgoShack.PleaseenterScenarioOutlineerrorSMSTextBoxXPATH","XPATH"), "Then verify content Please enter Scenario Outline error SMS in edit scenarios as '<Please enter Scenario Outline error SMS>'");
                
            }

             @Then("^verify not displayed Searched Scenario Name in edit scenarios$")			
            public void ThenVerifyNotDisplayedSearchedScenarioNameInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyNotDisplayed(0,"AlgoShack","AlgoShack.SearchedScenarioNameTextBoxXPATH","XPATH"), "Then verify not displayed Searched Scenario Name in edit scenarios");
                
            }

             @Then("^verify displayed Data Generation Label in data generation$")			
            public void ThenVerifyDisplayedDataGenerationLabelInDataGeneration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.DataGenerationLabelButtonXPATH","XPATH"), "Then verify displayed Data Generation Label in data generation");
                
            }

            @When("^I unchecked Data Generation Correct Values in data generation$")			
            public void WhenIUncheckedDataGenerationCorrectValuesInDataGeneration()
            {
                workFlow.uncheckCheckBox(0,"AlgoShack","AlgoShack.DataGenerationCorrectValuesCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify checked Data Generation Correct Values in data generation$")			
            public void ThenVerifyCheckedDataGenerationCorrectValuesInDataGeneration()
            {
                Assertion.IsTrue(workFlow.verifyChecked(0,"AlgoShack","AlgoShack.DataGenerationCorrectValuesCheckBoxXPATH","XPATH"), "Then verify checked Data Generation Correct Values in data generation");
                
            }

             @Then("^verify displayed Data Generation Correct Values in data generation$")			
            public void ThenVerifyDisplayedDataGenerationCorrectValuesInDataGeneration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.DataGenerationCorrectValuesCheckBoxXPATH","XPATH"), "Then verify displayed Data Generation Correct Values in data generation");
                
            }

             @Then("^verify displayed Data Generation Invalid Values in data generation$")			
            public void ThenVerifyDisplayedDataGenerationInvalidValuesInDataGeneration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.DataGenerationInvalidValuesCheckBoxXPATH","XPATH"), "Then verify displayed Data Generation Invalid Values in data generation");
                
            }

             @Then("^verify displayed Data Generation Save in data generation$")			
            public void ThenVerifyDisplayedDataGenerationSaveInDataGeneration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.DataGenerationSaveButtonXPATH","XPATH"), "Then verify displayed Data Generation Save in data generation");
                
            }

            @When("^I selected Data Generation Save in data generation$")			
            public void WhenISelectedDataGenerationSaveInDataGeneration()
            {
                workFlow.clickedElement(0,"AlgoShack","AlgoShack.DataGenerationSaveButtonXPATH","XPATH");
                
            }

            @When("^I checked Data Generation Invalid Values in data generation$")			
            public void WhenICheckedDataGenerationInvalidValuesInDataGeneration()
            {
                workFlow.checkCheckbox(0,"AlgoShack","AlgoShack.DataGenerationInvalidValuesCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify checked Data Generation Invalid Values in data generation$")			
            public void ThenVerifyCheckedDataGenerationInvalidValuesInDataGeneration()
            {
                Assertion.IsTrue(workFlow.verifyChecked(0,"AlgoShack","AlgoShack.DataGenerationInvalidValuesCheckBoxXPATH","XPATH"), "Then verify checked Data Generation Invalid Values in data generation");
                
            }

             @Then("^verify content Data Generation and Combination must be a number error SMS in data generation as '(.*)'$")			
            public void ThenVerifyContentDataGenerationCombinationMustBeANumberErrorSmsInDataGenerationAsdataGenerationAndCombinationMustBeANumberErrorSms(String  dataGenerationAndCombinationMustBeANumberErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(dataGenerationAndCombinationMustBeANumberErrorSms,0,"AlgoShack","AlgoShack.DataGenerationandCombinationmustbeanumbererrorSMSTextBoxXPATH","XPATH"), "Then verify content Data Generation and Combination must be a number error SMS in data generation as '<Data Generation and Combination must be a number error SMS>'");
                
            }

             @Then("^verify displayed Delete Project in project explorer$")			
            public void ThenVerifyDisplayedDeleteProjectInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.DeleteProjectButtonXPATH","XPATH"), "Then verify displayed Delete Project in project explorer");
                
            }

             @Then("^verify displayed Copy project in project explorer$")			
            public void ThenVerifyDisplayedCopyProjectInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.CopyprojectButtonXPATH","XPATH"), "Then verify displayed Copy project in project explorer");
                
            }

             @Then("^verify displayed Access Settings in project explorer$")			
            public void ThenVerifyDisplayedAccessSettingsInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.AccessSettingsButtonXPATH","XPATH"), "Then verify displayed Access Settings in project explorer");
                
            }

             @Then("^verify displayed Assign Project in project explorer$")			
            public void ThenVerifyDisplayedAssignProjectInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"AlgoShack","AlgoShack.AssignProjectButtonXPATH","XPATH"), "Then verify displayed Assign Project in project explorer");
                
            }

            @When("^I copied text Application Type in create project$")			
            public void WhenICopiedTextApplicationTypeInCreateProject()
            {
                workFlow.copiedtext(0,"AlgoShack","AlgoShack.ApplicationTypeLinkXPATH","XPATH");
                
            }
    }