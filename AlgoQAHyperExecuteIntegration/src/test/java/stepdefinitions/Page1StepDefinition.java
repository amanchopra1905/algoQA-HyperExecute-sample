package stepdefinitions;
    import io.cucumber.java.en.*;
    import workflows.SeleniumWorkFlow;
    import org.junit.Assert;
    import common.Assertion;
    public class Page1StepDefinition
	{
        SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
        

            @When("^I entered College Name in sign up as '(.*)'$")			
            public void WhenIEnteredCollegeNameInSignUpAscollegeName(String  collegeName)
            {
                workFlow.enterText(collegeName,0,"Page1","Page1.CollegeNameTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Company Name in sign up as '(.*)'$")			
            public void WhenIEnteredCompanyNameInSignUpAscompanyName(String  companyName)
            {
                workFlow.enterText(companyName,0,"Page1","Page1.CompanyNameTextBoxXPATH","XPATH");
                
            }

            @When("^I scroll and enter text College Name in sign up as '(.*)'$")			
            public void WhenIScrollEnterTextCollegeNameInSignUpAscollegeName(String  collegeName)
            {
                workFlow.defaultWorkFlowMethod();
                
            }

            @When("^I entered Email Address in sign in as '(.*)'$")			
            public void WhenIEnteredEmailAddressInSignInAsemailAddress(String  emailAddress)
            {
                workFlow.enterText(emailAddress,0,"Page1","Page1.EmailAddressTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content you do not have configuration Alert popup SMS in home page as '(.*)'$")			
            public void ThenVerifyContentYouDoNotHaveConfigurationAlertPopupSmsInHomePageAsyouDoNotHaveConfigurationAlertPopupSms(String  youDoNotHaveConfigurationAlertPopupSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(youDoNotHaveConfigurationAlertPopupSms,0,"Page1","Page1.youdonothaveconfigurationAlertpopupSMSTextBoxXPATH","XPATH"), "Then verify content you do not have configuration Alert popup SMS in home page as '<you do not have configuration Alert popup SMS>'");
                
            }

             @Then("^verify content Are you sure you want to delete this project in delete as '(.*)'$")			
            public void ThenVerifyContentAreYouSureYouWantToDeleteThisProjectInDeleteAsareYouSureYouWantToDeleteThisProject(String  areYouSureYouWantToDeleteThisProject)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(areYouSureYouWantToDeleteThisProject,0,"Page1","Page1.AreyousureyouwanttodeletethisprojectTextBoxXPATH","XPATH"), "Then verify content Are you sure you want to delete this project in delete as '<Are you sure you want to delete this project>'");
                
            }

             @Then("^verify content Project Name is required erros SMS in project explorer as '(.*)'$")			
            public void ThenVerifyContentProjectNameIsRequiredErrosSmsInProjectExplorerAsprojectNameIsRequiredErrosSms(String  projectNameIsRequiredErrosSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(projectNameIsRequiredErrosSms,0,"Page1","Page1.ProjectNameisrequirederrosSMSTextBoxXPATH","XPATH"), "Then verify content Project Name is required erros SMS in project explorer as '<Project Name is required erros SMS>'");
                
            }

             @Then("^Verify Text Configuration in project explorer$")			
            public void ThenVerifyTextConfigurationInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.ConfigurationLabelXPATH","XPATH"), "Then Verify Text Configuration in project explorer");
                
            }

             @Then("^Verify Text Node_Config in project explorer$")			
            public void ThenVerifyTextNodeconfigInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.Node_ConfigLabelXPATH","XPATH"), "Then Verify Text Node_Config in project explorer");
                
            }

             @Then("^verify displayed Configuration in project explorer$")			
            public void ThenVerifyDisplayedConfigurationInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.ConfigurationLabelXPATH","XPATH"), "Then verify displayed Configuration in project explorer");
                
            }

             @Then("^verify displayed Node_Config in project explorer$")			
            public void ThenVerifyDisplayedNodeconfigInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.Node_ConfigLabelXPATH","XPATH"), "Then verify displayed Node_Config in project explorer");
                
            }

             @Then("^verify content SetUps_ files in configuration as '(.*)'$")			
            public void ThenVerifyContentSetupsFilesInConfigurationAssetupsFiles(String  setupsFiles)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(setupsFiles,0,"Page1","Page1.SetUps_filesTextBoxXPATH","XPATH"), "Then verify content SetUps_ files in configuration as '<SetUps_ files>'");
                
            }

             @Then("^verify content Node name files in node_config as '(.*)'$")			
            public void ThenVerifyContentNodeNameFilesInNodeconfigAsnodeNameFiles(String  nodeNameFiles)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(nodeNameFiles,0,"Page1","Page1.NodenamefilesTextBoxXPATH","XPATH"), "Then verify content Node name files in node_config as '<Node name files>'");
                
            }

             @Then("^verify displayed Follow Me Page in follow me$")			
            public void ThenVerifyDisplayedFollowMePageInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.FollowMePageLabelXPATH","XPATH"), "Then verify displayed Follow Me Page in follow me");
                
            }

             @Then("^verify displayed Record Scenarios in follow me$")			
            public void ThenVerifyDisplayedRecordScenariosInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.RecordScenariosLabelXPATH","XPATH"), "Then verify displayed Record Scenarios in follow me");
                
            }

            @When("^I entered Scenario Name in follow me as '(.*)'$")			
            public void WhenIEnteredScenarioNameInFollowMeAsscenarioName2(String  scenarioName2)
            {
                workFlow.enterText(scenarioName2,0,"Page1","Page1.ScenarioNameTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Scenario Outline in follow me as '(.*)'$")			
            public void WhenIEnteredScenarioOutlineInFollowMeAsscenarioOutline3(String  scenarioOutline3)
            {
                workFlow.enterText(scenarioOutline3,0,"Page1","Page1.ScenarioOutlineTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Scenario Name is too short error sms in follow me as '(.*)'$")			
            public void ThenVerifyContentScenarioNameIsTooShortErrorSmsInFollowMeAsscenarioNameIsTooShortErrorSms(String  scenarioNameIsTooShortErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(scenarioNameIsTooShortErrorSms,0,"Page1","Page1.ScenarioNameistooshorterrorsmsTextBoxXPATH","XPATH"), "Then verify content Scenario Name is too short error sms in follow me as '<Scenario Name is too short error sms>'");
                
            }

            @When("^I clear and enter text Scenario Name in follow me as '(.*)'$")			
            public void WhenIClearEnterTextScenarioNameInFollowMeAsscenarioName4(String  scenarioName4)
            {
                workFlow.clearAndEnterText(scenarioName4,0,"Page1","Page1.ScenarioNameTextBoxXPATH","XPATH");
                
            }

            @When("^I clear and enter text Scenario Outline in follow me as '(.*)'$")			
            public void WhenIClearEnterTextScenarioOutlineInFollowMeAsscenarioOutline5(String  scenarioOutline5)
            {
                workFlow.clearAndEnterText(scenarioOutline5,0,"Page1","Page1.ScenarioOutlineTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Scenario Name should not be more than 60 characters error sms in follow me as '(.*)'$")			
            public void ThenVerifyContentScenarioNameShouldNotBeMoreThan60CharactersErrorSmsInFollowMeAsscenarioNameShouldNotBeMoreThan60CharactersErrorSms(String  scenarioNameShouldNotBeMoreThan60CharactersErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(scenarioNameShouldNotBeMoreThan60CharactersErrorSms,0,"Page1","Page1.ScenarioNameshouldnotbemorethan60characterserrorsmsTextBoxXPATH","XPATH"), "Then verify content Scenario Name should not be more than 60 characters error sms in follow me as '<Scenario Name should not be more than 60 characters error sms>'");
                
            }

            @When("^I clear text Scenario Name in follow me$")			
            public void WhenIClearTextScenarioNameInFollowMe()
            {
                workFlow.clearText(0,"Page1","Page1.ScenarioNameTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Please enter your Scenario Name error sms in follow me as '(.*)'$")			
            public void ThenVerifyContentPleaseEnterYourScenarioNameErrorSmsInFollowMeAspleaseEnterYourScenarioNameErrorSms(String  pleaseEnterYourScenarioNameErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(pleaseEnterYourScenarioNameErrorSms,0,"Page1","Page1.PleaseenteryourScenarioNameerrorsmsTextBoxXPATH","XPATH"), "Then verify content Please enter your Scenario Name error sms in follow me as '<Please enter your Scenario Name error sms>'");
                
            }

             @Then("^verify content Scenario Name can accept alphanumeric error sms in follow me as '(.*)'$")			
            public void ThenVerifyContentScenarioNameCanAcceptAlphanumericErrorSmsInFollowMeAsscenarioNameCanAcceptAlphanumericErrorSms(String  scenarioNameCanAcceptAlphanumericErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(scenarioNameCanAcceptAlphanumericErrorSms,0,"Page1","Page1.ScenarioNamecanacceptalphanumericerrorsmsTextBoxXPATH","XPATH"), "Then verify content Scenario Name can accept alphanumeric error sms in follow me as '<Scenario Name can accept alphanumeric error sms>'");
                
            }

             @Then("^verify displayed Create Profile Sequences in follow me$")			
            public void ThenVerifyDisplayedCreateProfileSequencesInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.CreateProfileSequencesLabelXPATH","XPATH"), "Then verify displayed Create Profile Sequences in follow me");
                
            }

             @Then("^Verify not Displayed Record Scenarios in follow me$")			
            public void ThenVerifyNotDisplayedRecordScenariosInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyNotDisplayed(0,"Page1","Page1.RecordScenariosLabelXPATH","XPATH"), "Then Verify not Displayed Record Scenarios in follow me");
                
            }

             @Then("^verify displayed Scenario Name in follow me$")			
            public void ThenVerifyDisplayedScenarioNameInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"Page1","Page1.ScenarioNameTextBoxXPATH","XPATH"), "Then verify displayed Scenario Name in follow me");
                
            }

             @Then("^verify displayed Custom Tag in follow me$")			
            public void ThenVerifyDisplayedCustomTagInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"Page1","Page1.CustomTagTextBoxXPATH","XPATH"), "Then verify displayed Custom Tag in follow me");
                
            }

             @Then("^verify displayed Scenario Outline in follow me$")			
            public void ThenVerifyDisplayedScenarioOutlineInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"Page1","Page1.ScenarioOutlineTextBoxXPATH","XPATH"), "Then verify displayed Scenario Outline in follow me");
                
            }

             @Then("^verify displayed All Controls in follow me$")			
            public void ThenVerifyDisplayedAllControlsInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.AllControlsLabelXPATH","XPATH"), "Then verify displayed All Controls in follow me");
                
            }

            @When("^I scroll down Scroll Bar in follow me as '(.*)'$")			
            public void WhenIScrollDownScrollBarInFollowMeAsscrollBar(String  scrollBar)
            {
                workFlow.scrollDown(scrollBar,0,"Page1","Page1.ScrollBarTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Follow Me Search Control in follow me as '(.*)'$")			
            public void WhenIEnteredFollowMeSearchControlInFollowMeAsfollowMeSearchControl4(String  followMeSearchControl4)
            {
                workFlow.enterText(followMeSearchControl4,0,"Page1","Page1.FollowMeSearchControlTextBoxXPATH","XPATH");
                
            }

             @Then("^verify displayed Terms And Agreement label in sign up$")			
            public void ThenVerifyDisplayedTermsAgreementLabelInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.TermsAndAgreementlabelLabelXPATH","XPATH"), "Then verify displayed Terms And Agreement label in sign up");
                
            }

             @Then("^verify displayed Company Name in sign up$")			
            public void ThenVerifyDisplayedCompanyNameInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"Page1","Page1.CompanyNameTextBoxXPATH","XPATH"), "Then verify displayed Company Name in sign up");
                
            }

             @Then("^verify displayed Email Address in sign in$")			
            public void ThenVerifyDisplayedEmailAddressInSignIn()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"Page1","Page1.EmailAddressTextBoxXPATH","XPATH"), "Then verify displayed Email Address in sign in");
                
            }

             @Then("^verify displayed College Name in sign up$")			
            public void ThenVerifyDisplayedCollegeNameInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"Page1","Page1.CollegeNameTextBoxXPATH","XPATH"), "Then verify displayed College Name in sign up");
                
            }

            @When("^I clear and enter text Email Address in sign in as '(.*)'$")			
            public void WhenIClearEnterTextEmailAddressInSignInAsemailAddress4(String  emailAddress4)
            {
                workFlow.clearAndEnterText(emailAddress4,0,"Page1","Page1.EmailAddressTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Forgot Password Email Address in forgot password as '(.*)'$")			
            public void WhenIEnteredForgotPasswordEmailAddressInForgotPasswordAsforgotPasswordEmailAddress1(String  forgotPasswordEmailAddress1)
            {
                workFlow.enterText(forgotPasswordEmailAddress1,0,"Page1","Page1.ForgotPasswordEmailAddressTextBoxXPATH","XPATH");
                
            }

            @When("^I clear and enter text Forgot Password Email Address in forgot password as '(.*)'$")			
            public void WhenIClearEnterTextForgotPasswordEmailAddressInForgotPasswordAsforgotPasswordEmailAddress2(String  forgotPasswordEmailAddress2)
            {
                workFlow.clearAndEnterText(forgotPasswordEmailAddress2,0,"Page1","Page1.ForgotPasswordEmailAddressTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Incorrect OTPerror SMS in forgot password as '(.*)'$")			
            public void ThenVerifyContentIncorrectOtperrorSmsInForgotPasswordAsincorrectOtperrorSms(String  incorrectOtperrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(incorrectOtperrorSms,0,"Page1","Page1.IncorrectOTPerrorSMSTextBoxXPATH","XPATH"), "Then verify content Incorrect OTPerror SMS in forgot password as '<Incorrect OTPerror SMS>'");
                
            }

             @Then("^verify content It will reset your current configuration would you like to confirm in follow me as '(.*)'$")			
            public void ThenVerifyContentItWillResetYourCurrentConfigurationWouldYouLikeToConfirmInFollowMeAsitWillResetYourCurrentConfigurationWouldYouLikeToConfirm(String  itWillResetYourCurrentConfigurationWouldYouLikeToConfirm)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(itWillResetYourCurrentConfigurationWouldYouLikeToConfirm,0,"Page1","Page1.ItwillresetyourcurrentconfigurationwouldyouliketoconfirmTextBoxXPATH","XPATH"), "Then verify content It will reset your current configuration would you like to confirm in follow me as '<It will reset your current configuration would you like to confirm>'");
                
            }

             @Then("^verify text Upload Scraped file label in upload$")			
            public void ThenVerifyTextUploadScrapedFileLabelInUpload()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.UploadScrapedfilelabelLabelXPATH","XPATH"), "Then verify text Upload Scraped file label in upload");
                
            }

             @Then("^verify text Select file label in upload$")			
            public void ThenVerifyTextSelectFileLabelInUpload()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.SelectfilelabelLabelXPATH","XPATH"), "Then verify text Select file label in upload");
                
            }

             @Then("^verify text Replace existing configuration label in upload$")			
            public void ThenVerifyTextReplaceExistingConfigurationLabelInUpload()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.ReplaceexistingconfigurationlabelLabelXPATH","XPATH"), "Then verify text Replace existing configuration label in upload");
                
            }

            @When("^I selected Upload Files from file manager in upload as '(.*)'$")			
            public void WhenISelectedUploadFilesFromFileManagerInUploadAsuploadFilesFromFileManager2(String  uploadFilesFromFileManager2)
            {
                workFlow.fileUpload(uploadFilesFromFileManager2,0,"Page1","Page1.UploadFilesfromfilemanagerFileUploadXPATH","XPATH");
                
            }

            @When("^I checked Replace existing configuration checkbox in upload$")			
            public void WhenICheckedReplaceExistingConfigurationCheckboxInUpload()
            {
                workFlow.checkCheckbox(0,"Page1","Page1.ReplaceexistingconfigurationcheckboxCheckBoxXPATH","XPATH");
                
            }

            @When("^I wait in seconds for sometime in home page as '(.*)'$")			
            public void WhenIWaitInSecondsForSometimeInHomePageAsforSometime(String  forSometime)
            {
                workFlow.waitInSeconds(forSometime,0,"Page1","Page1.forsometimeTextBoxXPATH","XPATH");
                
            }

             @Then("^verify text Edit Profile label in edit profile$")			
            public void ThenVerifyTextEditProfileLabelInEditProfile()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.EditProfilelabelLabelXPATH","XPATH"), "Then verify text Edit Profile label in edit profile");
                
            }

             @Then("^verify text Edit Profile First Name in edit profile$")			
            public void ThenVerifyTextEditProfileFirstNameInEditProfile()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"Page1","Page1.EditProfileFirstNameTextBoxXPATH","XPATH"), "Then verify text Edit Profile First Name in edit profile");
                
            }

             @Then("^verify text Edit Profile Last Name in edit profile$")			
            public void ThenVerifyTextEditProfileLastNameInEditProfile()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"Page1","Page1.EditProfileLastNameTextBoxXPATH","XPATH"), "Then verify text Edit Profile Last Name in edit profile");
                
            }

            @When("^I copied text Edit Profile First Name in edit profile$")			
            public void WhenICopiedTextEditProfileFirstNameInEditProfile()
            {
                workFlow.copiedtext(0,"Page1","Page1.EditProfileFirstNameTextBoxXPATH","XPATH");
                
            }

            @When("^I clear and enter text Edit Profile First Name in edit profile as '(.*)'$")			
            public void WhenIClearEnterTextEditProfileFirstNameInEditProfileAseditProfileFirstName2(String  editProfileFirstName2)
            {
                workFlow.clearAndEnterText(editProfileFirstName2,0,"Page1","Page1.EditProfileFirstNameTextBoxXPATH","XPATH");
                
            }

            @When("^I copied text Edit Profile Last Name in edit profile$")			
            public void WhenICopiedTextEditProfileLastNameInEditProfile()
            {
                workFlow.copiedtext(0,"Page1","Page1.EditProfileLastNameTextBoxXPATH","XPATH");
                
            }

            @When("^I clear and enter text Edit Profile Last Name in edit profile as '(.*)'$")			
            public void WhenIClearEnterTextEditProfileLastNameInEditProfileAseditProfileLastName3(String  editProfileLastName3)
            {
                workFlow.clearAndEnterText(editProfileLastName3,0,"Page1","Page1.EditProfileLastNameTextBoxXPATH","XPATH");
                
            }

             @Then("^verify copied text by index Edit Profile First Name in edit profile as '(.*)'$")			
            public void ThenVerifyCopiedTextByIndexEditProfileFirstNameInEditProfileAseditProfileFirstName4(String  editProfileFirstName4)
            {
                Assertion.IsTrue(workFlow.verifyCopiedTextByIndex(editProfileFirstName4,0,"Page1","Page1.EditProfileFirstNameTextBoxXPATH","XPATH"), "Then verify copied text by index Edit Profile First Name in edit profile as '<Edit Profile First Name4>'");
                
            }

             @Then("^verify copied text by index Edit Profile Last Name in edit profile as '(.*)'$")			
            public void ThenVerifyCopiedTextByIndexEditProfileLastNameInEditProfileAseditProfileLastName5(String  editProfileLastName5)
            {
                Assertion.IsTrue(workFlow.verifyCopiedTextByIndex(editProfileLastName5,0,"Page1","Page1.EditProfileLastNameTextBoxXPATH","XPATH"), "Then verify copied text by index Edit Profile Last Name in edit profile as '<Edit Profile Last Name5>'");
                
            }

            @When("^I clear text Edit Profile First Name in edit profile$")			
            public void WhenIClearTextEditProfileFirstNameInEditProfile()
            {
                workFlow.clearText(0,"Page1","Page1.EditProfileFirstNameTextBoxXPATH","XPATH");
                
            }

             @Then("^verify displayed Change Password label in change password$")			
            public void ThenVerifyDisplayedChangePasswordLabelInChangePassword()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.ChangePasswordlabelLabelXPATH","XPATH"), "Then verify displayed Change Password label in change password");
                
            }

             @Then("^verify displayed Change Password Current Password in change password$")			
            public void ThenVerifyDisplayedChangePasswordCurrentPasswordInChangePassword()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"Page1","Page1.ChangePasswordCurrentPasswordTextBoxXPATH","XPATH"), "Then verify displayed Change Password Current Password in change password");
                
            }

             @Then("^verify displayed Change Password New Password in change password$")			
            public void ThenVerifyDisplayedChangePasswordNewPasswordInChangePassword()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"Page1","Page1.ChangePasswordNewPasswordTextBoxXPATH","XPATH"), "Then verify displayed Change Password New Password in change password");
                
            }

             @Then("^verify displayed Change Password Confirm Password in change password$")			
            public void ThenVerifyDisplayedChangePasswordConfirmPasswordInChangePassword()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"Page1","Page1.ChangePasswordConfirmPasswordTextBoxXPATH","XPATH"), "Then verify displayed Change Password Confirm Password in change password");
                
            }

            @When("^I entered Change Password Current Password in change password as '(.*)'$")			
            public void WhenIEnteredChangePasswordCurrentPasswordInChangePasswordAschangePasswordCurrentPassword1(String  changePasswordCurrentPassword1)
            {
                workFlow.enterText(changePasswordCurrentPassword1,0,"Page1","Page1.ChangePasswordCurrentPasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I clear text Change Password Current Password in change password$")			
            public void WhenIClearTextChangePasswordCurrentPasswordInChangePassword()
            {
                workFlow.clearText(0,"Page1","Page1.ChangePasswordCurrentPasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I clear and enter text Change Password New Password in change password as '(.*)'$")			
            public void WhenIClearEnterTextChangePasswordNewPasswordInChangePasswordAschangePasswordNewPassword2(String  changePasswordNewPassword2)
            {
                workFlow.clearAndEnterText(changePasswordNewPassword2,0,"Page1","Page1.ChangePasswordNewPasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I clear and enter text Change Password Confirm Password in change password as '(.*)'$")			
            public void WhenIClearEnterTextChangePasswordConfirmPasswordInChangePasswordAschangePasswordConfirmPassword3(String  changePasswordConfirmPassword3)
            {
                workFlow.clearAndEnterText(changePasswordConfirmPassword3,0,"Page1","Page1.ChangePasswordConfirmPasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I clear and enter text Change Password Current Password in change password as '(.*)'$")			
            public void WhenIClearEnterTextChangePasswordCurrentPasswordInChangePasswordAschangePasswordCurrentPassword4(String  changePasswordCurrentPassword4)
            {
                workFlow.clearAndEnterText(changePasswordCurrentPassword4,0,"Page1","Page1.ChangePasswordCurrentPasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I copied text Change Password Current Password in change password$")			
            public void WhenICopiedTextChangePasswordCurrentPasswordInChangePassword()
            {
                workFlow.copiedtext(0,"Page1","Page1.ChangePasswordCurrentPasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I copied text Change Password New Password in change password$")			
            public void WhenICopiedTextChangePasswordNewPasswordInChangePassword()
            {
                workFlow.copiedtext(0,"Page1","Page1.ChangePasswordNewPasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I copied text Change Password Confirm Password in change password$")			
            public void WhenICopiedTextChangePasswordConfirmPasswordInChangePassword()
            {
                workFlow.copiedtext(0,"Page1","Page1.ChangePasswordConfirmPasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I copied text not present Change Password Current Password in change password as '(.*)'$")			
            public void WhenICopiedTextNotPresentChangePasswordCurrentPasswordInChangePasswordAschangePasswordCurrentPassword25(String  changePasswordCurrentPassword25)
            {
                workFlow.copiedTextNotPresent(changePasswordCurrentPassword25,0,"Page1","Page1.ChangePasswordCurrentPasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I copied text not present Change Password New Password in change password as '(.*)'$")			
            public void WhenICopiedTextNotPresentChangePasswordNewPasswordInChangePasswordAschangePasswordNewPassword26(String  changePasswordNewPassword26)
            {
                workFlow.copiedTextNotPresent(changePasswordNewPassword26,0,"Page1","Page1.ChangePasswordNewPasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I copied text not present Change Password Confirm Password in change password as '(.*)'$")			
            public void WhenICopiedTextNotPresentChangePasswordConfirmPasswordInChangePasswordAschangePasswordConfirmPassword27(String  changePasswordConfirmPassword27)
            {
                workFlow.copiedTextNotPresent(changePasswordConfirmPassword27,0,"Page1","Page1.ChangePasswordConfirmPasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Change Password New Password in change password as '(.*)'$")			
            public void WhenIEnteredChangePasswordNewPasswordInChangePasswordAschangePasswordNewPassword36(String  changePasswordNewPassword36)
            {
                workFlow.enterText(changePasswordNewPassword36,0,"Page1","Page1.ChangePasswordNewPasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Change Password Confirm Password in change password as '(.*)'$")			
            public void WhenIEnteredChangePasswordConfirmPasswordInChangePasswordAschangePasswordConfirmPassword37(String  changePasswordConfirmPassword37)
            {
                workFlow.enterText(changePasswordConfirmPassword37,0,"Page1","Page1.ChangePasswordConfirmPasswordTextBoxXPATH","XPATH");
                
            }

             @Then("^verify text My Subscription label in my subscription$")			
            public void ThenVerifyTextMySubscriptionLabelInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.MySubscriptionlabelLabelXPATH","XPATH"), "Then verify text My Subscription label in my subscription");
                
            }

            @When("^I selected Upload Profile Picture from File Manager in edit profile as '(.*)'$")			
            public void WhenISelectedUploadProfilePictureFromFileManagerInEditProfileAsuploadProfilePictureFromFileManager1(String  uploadProfilePictureFromFileManager1)
            {
                workFlow.fileUpload(uploadProfilePictureFromFileManager1,0,"Page1","Page1.UploadProfilePicturefromFileManagerFileUploadXPATH","XPATH");
                
            }

             @Then("^verify content File size more than 2 mb are not allowed error SMS in edit profile as '(.*)'$")			
            public void ThenVerifyContentFileSizeMoreThan2MbAreNotAllowedErrorSmsInEditProfileAsfileSizeMoreThan2MbAreNotAllowedErrorSms(String  fileSizeMoreThan2MbAreNotAllowedErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(fileSizeMoreThan2MbAreNotAllowedErrorSms,0,"Page1","Page1.Filesizemorethan2mbarenotallowederrorSMSTextBoxXPATH","XPATH"), "Then verify content File size more than 2 mb are not allowed error SMS in edit profile as '<File size more than 2 mb are not allowed error SMS>'");
                
            }

             @Then("^verify displayed Follow Me Assertion or Action textbox in follow me$")			
            public void ThenVerifyDisplayedFollowMeAssertionOrActionTextboxInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"Page1","Page1.FollowMeAssertionorActiontextboxTextBoxXPATH","XPATH"), "Then verify displayed Follow Me Assertion or Action textbox in follow me");
                
            }

            @When("^I entered Follow Me Assertion or Action textbox in follow me as '(.*)'$")			
            public void WhenIEnteredFollowMeAssertionOrActionTextboxInFollowMeAsfollowMeAssertionOrActionTextbox4(String  followMeAssertionOrActionTextbox4)
            {
                workFlow.enterText(followMeAssertionOrActionTextbox4,0,"Page1","Page1.FollowMeAssertionorActiontextboxTextBoxXPATH","XPATH");
                
            }

            @When("^I copied text Follow Me Assertion or Action textbox in follow me$")			
            public void WhenICopiedTextFollowMeAssertionOrActionTextboxInFollowMe()
            {
                workFlow.copiedtext(0,"Page1","Page1.FollowMeAssertionorActiontextboxTextBoxXPATH","XPATH");
                
            }

             @Then("^verify text Edit Control label in follow me$")			
            public void ThenVerifyTextEditControlLabelInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.EditControllabelLabelXPATH","XPATH"), "Then verify text Edit Control label in follow me");
                
            }

            @When("^I entered Edit Control Alias Name in follow me as '(.*)'$")			
            public void WhenIEnteredEditControlAliasNameInFollowMeAseditControlAliasName5(String  editControlAliasName5)
            {
                workFlow.enterText(editControlAliasName5,0,"Page1","Page1.EditControlAliasNameTextBoxXPATH","XPATH");
                
            }

            @When("^I clear and enter text Edit Control Alias Name in follow me as '(.*)'$")			
            public void WhenIClearEnterTextEditControlAliasNameInFollowMeAseditControlAliasName6(String  editControlAliasName6)
            {
                workFlow.clearAndEnterText(editControlAliasName6,0,"Page1","Page1.EditControlAliasNameTextBoxXPATH","XPATH");
                
            }

            @When("^I copied text Edit Control Alias Name in follow me$")			
            public void WhenICopiedTextEditControlAliasNameInFollowMe()
            {
                workFlow.copiedtext(0,"Page1","Page1.EditControlAliasNameTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Edit Control Custom Action in follow me as '(.*)'$")			
            public void WhenIEnteredEditControlCustomActionInFollowMeAseditControlCustomAction7(String  editControlCustomAction7)
            {
                workFlow.enterText(editControlCustomAction7,0,"Page1","Page1.EditControlCustomActionTextBoxXPATH","XPATH");
                
            }

            @When("^I copied text Edit Control Custom Action in follow me$")			
            public void WhenICopiedTextEditControlCustomActionInFollowMe()
            {
                workFlow.copiedtext(0,"Page1","Page1.EditControlCustomActionTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Edit Control Action in follow me as '(.*)'$")			
            public void WhenIEnteredEditControlActionInFollowMeAseditControlAction8(String  editControlAction8)
            {
                workFlow.enterText(editControlAction8,0,"Page1","Page1.EditControlActionTextBoxXPATH","XPATH");
                
            }

            @When("^I copied text Edit Control Action in follow me$")			
            public void WhenICopiedTextEditControlActionInFollowMe()
            {
                workFlow.copiedtext(0,"Page1","Page1.EditControlActionTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Edit Control Custom Value in follow me as '(.*)'$")			
            public void WhenIEnteredEditControlCustomValueInFollowMeAseditControlCustomValue(String  editControlCustomValue)
            {
                workFlow.enterText(editControlCustomValue,0,"Page1","Page1.EditControlCustomValueTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Edit Control Message in follow me as '(.*)'$")			
            public void WhenIEnteredEditControlMessageInFollowMeAseditControlMessage(String  editControlMessage)
            {
                workFlow.enterText(editControlMessage,0,"Page1","Page1.EditControlMessageTextBoxXPATH","XPATH");
                
            }

             @Then("^verify copied text by index Edit Scenario Alias Name in edit scenarios as '(.*)'$")			
            public void ThenVerifyCopiedTextByIndexEditScenarioAliasNameInEditScenariosAseditScenarioAliasName10(String  editScenarioAliasName10)
            {
                Assertion.IsTrue(workFlow.verifyCopiedTextByIndex(editScenarioAliasName10,0,"Page1","Page1.EditScenarioAliasNameTextBoxXPATH","XPATH"), "Then verify copied text by index Edit Scenario Alias Name in edit scenarios as '<Edit Scenario Alias Name10>'");
                
            }

            @When("^I copied text Edit Control Custom Value in follow me$")			
            public void WhenICopiedTextEditControlCustomValueInFollowMe()
            {
                workFlow.copiedtext(0,"Page1","Page1.EditControlCustomValueTextBoxXPATH","XPATH");
                
            }

            @When("^I clear and enter text Scenario Form Scenario Name in edit scenarios as '(.*)'$")			
            public void WhenIClearEnterTextScenarioFormScenarioNameInEditScenariosAsscenarioFormScenarioName4(String  scenarioFormScenarioName4)
            {
                workFlow.clearAndEnterText(scenarioFormScenarioName4,0,"Page1","Page1.ScenarioFormScenarioNameTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Edit Scenario Scenario Name can accept alphanumeric error SMS in edit scenarios as '(.*)'$")			
            public void ThenVerifyContentEditScenarioScenarioNameCanAcceptAlphanumericErrorSmsInEditScenariosAseditScenarioScenarioNameCanAcceptAlphanumericErrorSms(String  editScenarioScenarioNameCanAcceptAlphanumericErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(editScenarioScenarioNameCanAcceptAlphanumericErrorSms,0,"Page1","Page1.EditScenarioScenarioNamecanacceptalphanumericerrorSMSTextBoxXPATH","XPATH"), "Then verify content Edit Scenario Scenario Name can accept alphanumeric error SMS in edit scenarios as '<Edit Scenario Scenario Name can accept alphanumeric error SMS>'");
                
            }

            @When("^I entered Scenario Form Scenario Name in edit scenarios as '(.*)'$")			
            public void WhenIEnteredScenarioFormScenarioNameInEditScenariosAsscenarioFormScenarioName5(String  scenarioFormScenarioName5)
            {
                workFlow.enterText(scenarioFormScenarioName5,0,"Page1","Page1.ScenarioFormScenarioNameTextBoxXPATH","XPATH");
                
            }

            @When("^I copied text Scenario Form Scenario Name in edit scenarios$")			
            public void WhenICopiedTextScenarioFormScenarioNameInEditScenarios()
            {
                workFlow.copiedtext(0,"Page1","Page1.ScenarioFormScenarioNameTextBoxXPATH","XPATH");
                
            }

             @Then("^verify copied text by index Edit Created Scenario Name in follow me as '(.*)'$")			
            public void ThenVerifyCopiedTextByIndexEditCreatedScenarioNameInFollowMeAseditCreatedScenarioName7(String  editCreatedScenarioName7)
            {
                Assertion.IsTrue(workFlow.verifyCopiedTextByIndex(editCreatedScenarioName7,0,"Page1","Page1.EditCreatedScenarioNameTextBoxXPATH","XPATH"), "Then verify copied text by index Edit Created Scenario Name in follow me as '<Edit Created Scenario Name7>'");
                
            }

            @When("^I copied text Scenario Name in follow me$")			
            public void WhenICopiedTextScenarioNameInFollowMe()
            {
                workFlow.copiedtext(0,"Page1","Page1.ScenarioNameTextBoxXPATH","XPATH");
                
            }

            @When("^I enter copied text Scenario Name in follow me$")			
            public void WhenIEnterCopiedTextScenarioNameInFollowMe()
            {
                workFlow.enterCopiedText(0,"Page1","Page1.ScenarioNameTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content This will remove your created scenario Alert SMS in follow me as '(.*)'$")			
            public void ThenVerifyContentThisWillRemoveYourCreatedScenarioAlertSmsInFollowMeAsthisWillRemoveYourCreatedScenarioAlertSms(String  thisWillRemoveYourCreatedScenarioAlertSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(thisWillRemoveYourCreatedScenarioAlertSms,0,"Page1","Page1.ThiswillremoveyourcreatedscenarioAlertSMSTextBoxXPATH","XPATH"), "Then verify content This will remove your created scenario Alert SMS in follow me as '<This will remove your created scenario Alert SMS>'");
                
            }

             @Then("^verify text Node Configuration label in node configuration$")			
            public void ThenVerifyTextNodeConfigurationLabelInNodeConfiguration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.NodeConfigurationlabelLabelXPATH","XPATH"), "Then verify text Node Configuration label in node configuration");
                
            }

             @Then("^verify content Configuration not found SMS in node configuration as '(.*)'$")			
            public void ThenVerifyContentConfigurationNotFoundSmsInNodeConfigurationAsconfigurationNotFoundSms(String  configurationNotFoundSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(configurationNotFoundSms,0,"Page1","Page1.ConfigurationnotfoundSMSTextBoxXPATH","XPATH"), "Then verify content Configuration not found SMS in node configuration as '<Configuration not found SMS>'");
                
            }

            @When("^I clear and enter text New Feature textbox in node configuration as '(.*)'$")			
            public void WhenIClearEnterTextNewFeatureTextboxInNodeConfigurationAsnewFeatureTextbox2(String  newFeatureTextbox2)
            {
                workFlow.clearAndEnterText(newFeatureTextbox2,0,"Page1","Page1.NewFeaturetextboxTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Successfully Updated Feature SMS in node configuration as '(.*)'$")			
            public void ThenVerifyContentSuccessfullyUpdatedFeatureSmsInNodeConfigurationAssuccessfullyUpdatedFeatureSms(String  successfullyUpdatedFeatureSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(successfullyUpdatedFeatureSms,0,"Page1","Page1.SuccessfullyUpdatedFeatureSMSTextBoxXPATH","XPATH"), "Then verify content Successfully Updated Feature SMS in node configuration as '<Successfully Updated Feature SMS>'");
                
            }

             @Then("^verify displayed Edit Scenario Search here in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioSearchHereInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"Page1","Page1.EditScenarioSearchhereTextBoxXPATH","XPATH"), "Then verify displayed Edit Scenario Search here in edit scenarios");
                
            }

            @When("^I selected Rows per page as in edit scenarios as '(.*)'$")			
            public void WhenISelectedRowsPerPageAsInEditScenariosAsrowsPerPageAs2(String  rowsPerPageAs2)
            {
                workFlow.defaultWorkFlowMethod();
                
            }

            @When("^I entered Edit Scenario Search here in edit scenarios as '(.*)'$")			
            public void WhenIEnteredEditScenarioSearchHereInEditScenariosAseditScenarioSearchHere2(String  editScenarioSearchHere2)
            {
                workFlow.enterText(editScenarioSearchHere2,0,"Page1","Page1.EditScenarioSearchhereTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Scenario Form Custom Tag in edit scenarios as '(.*)'$")			
            public void WhenIEnteredScenarioFormCustomTagInEditScenariosAsscenarioFormCustomTag4(String  scenarioFormCustomTag4)
            {
                workFlow.enterText(scenarioFormCustomTag4,0,"Page1","Page1.ScenarioFormCustomTagTextBoxXPATH","XPATH");
                
            }

            @When("^I clear and enter text Scenario Form Scenario Outline in edit scenarios as '(.*)'$")			
            public void WhenIClearEnterTextScenarioFormScenarioOutlineInEditScenariosAsscenarioFormScenarioOutline5(String  scenarioFormScenarioOutline5)
            {
                workFlow.clearAndEnterText(scenarioFormScenarioOutline5,0,"Page1","Page1.ScenarioFormScenarioOutlineTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Scenario Form Separate Feature in edit scenarios as '(.*)'$")			
            public void WhenIEnteredScenarioFormSeparateFeatureInEditScenariosAsscenarioFormSeparateFeature6(String  scenarioFormSeparateFeature6)
            {
                workFlow.enterText(scenarioFormSeparateFeature6,0,"Page1","Page1.ScenarioFormSeparateFeatureTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Scenario Form Folder Structure in edit scenarios as '(.*)'$")			
            public void WhenIEnteredScenarioFormFolderStructureInEditScenariosAsscenarioFormFolderStructure7(String  scenarioFormFolderStructure7)
            {
                workFlow.enterText(scenarioFormFolderStructure7,0,"Page1","Page1.ScenarioFormFolderStructureTextBoxXPATH","XPATH");
                
            }

            @When("^I enter copied text Edit Scenario Search here in edit scenarios$")			
            public void WhenIEnterCopiedTextEditScenarioSearchHereInEditScenarios()
            {
                workFlow.enterCopiedText(0,"Page1","Page1.EditScenarioSearchhereTextBoxXPATH","XPATH");
                
            }

            @When("^I copied text Edit Scenario Search here in edit scenarios$")			
            public void WhenICopiedTextEditScenarioSearchHereInEditScenarios()
            {
                workFlow.copiedtext(0,"Page1","Page1.EditScenarioSearchhereTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Edit Scenario delete this scenario SMS in edit scenarios as '(.*)'$")			
            public void ThenVerifyContentEditScenarioDeleteThisScenarioSmsInEditScenariosAseditScenarioDeleteThisScenarioSms(String  editScenarioDeleteThisScenarioSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(editScenarioDeleteThisScenarioSms,0,"Page1","Page1.EditScenariodeletethisscenarioSMSTextBoxXPATH","XPATH"), "Then verify content Edit Scenario delete this scenario SMS in edit scenarios as '<Edit Scenario delete this scenario SMS>'");
                
            }

            @When("^I scroll down till last of the page in canvas as '(.*)'$")			
            public void WhenIScrollDownTillLastOfThePageInCanvasAstillLastOfThePage2(String  tillLastOfThePage2)
            {
                workFlow.scrollDown(tillLastOfThePage2,0,"Page1","Page1.tilllastofthepageTextBoxXPATH","XPATH");
                
            }

             @Then("^verify displayed Data Generation InCorrect Values in data generation$")			
            public void ThenVerifyDisplayedDataGenerationIncorrectValuesInDataGeneration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.DataGenerationInCorrectValuesCheckBoxXPATH","XPATH"), "Then verify displayed Data Generation InCorrect Values in data generation");
                
            }

             @Then("^verify displayed Data Generation Boundary Values in data generation$")			
            public void ThenVerifyDisplayedDataGenerationBoundaryValuesInDataGeneration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.DataGenerationBoundaryValuesCheckBoxXPATH","XPATH"), "Then verify displayed Data Generation Boundary Values in data generation");
                
            }

             @Then("^verify displayed Data Generation Edge Cases in data generation$")			
            public void ThenVerifyDisplayedDataGenerationEdgeCasesInDataGeneration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.DataGenerationEdgeCasesCheckBoxXPATH","XPATH"), "Then verify displayed Data Generation Edge Cases in data generation");
                
            }

             @Then("^verify displayed Data Generation Illegal Values in data generation$")			
            public void ThenVerifyDisplayedDataGenerationIllegalValuesInDataGeneration()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Page1","Page1.DataGenerationIllegalValuesCheckBoxXPATH","XPATH"), "Then verify displayed Data Generation Illegal Values in data generation");
                
            }

             @Then("^verify displayed Data Generation Data Combination in data generation$")			
            public void ThenVerifyDisplayedDataGenerationDataCombinationInDataGeneration()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"Page1","Page1.DataGenerationDataCombinationTextBoxXPATH","XPATH"), "Then verify displayed Data Generation Data Combination in data generation");
                
            }

            @When("^I checked Data Generation InCorrect Values in data generation$")			
            public void WhenICheckedDataGenerationIncorrectValuesInDataGeneration()
            {
                workFlow.checkCheckbox(0,"Page1","Page1.DataGenerationInCorrectValuesCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify content Application Setting Updated Successfully SMS in data generation as '(.*)'$")			
            public void ThenVerifyContentApplicationSettingUpdatedSuccessfullySmsInDataGenerationAsapplicationSettingUpdatedSuccessfullySms(String  applicationSettingUpdatedSuccessfullySms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(applicationSettingUpdatedSuccessfullySms,0,"Page1","Page1.ApplicationSettingUpdatedSuccessfullySMSTextBoxXPATH","XPATH"), "Then verify content Application Setting Updated Successfully SMS in data generation as '<Application Setting Updated Successfully SMS>'");
                
            }

             @Then("^verify checked Data Generation InCorrect Values in data generation$")			
            public void ThenVerifyCheckedDataGenerationIncorrectValuesInDataGeneration()
            {
                Assertion.IsTrue(workFlow.verifyChecked(0,"Page1","Page1.DataGenerationInCorrectValuesCheckBoxXPATH","XPATH"), "Then verify checked Data Generation InCorrect Values in data generation");
                
            }

            @When("^I unchecked Data Generation InCorrect Values in data generation$")			
            public void WhenIUncheckedDataGenerationIncorrectValuesInDataGeneration()
            {
                workFlow.uncheckCheckBox(0,"Page1","Page1.DataGenerationInCorrectValuesCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify unchecked Data Generation InCorrect Values in data generation$")			
            public void ThenVerifyUncheckedDataGenerationIncorrectValuesInDataGeneration()
            {
                Assertion.IsTrue(workFlow.verifyUnchecked(0,"Page1","Page1.DataGenerationInCorrectValuesCheckBoxXPATH","XPATH"), "Then verify unchecked Data Generation InCorrect Values in data generation");
                
            }

            @When("^I checked Data Generation Boundary Values in data generation$")			
            public void WhenICheckedDataGenerationBoundaryValuesInDataGeneration()
            {
                workFlow.checkCheckbox(0,"Page1","Page1.DataGenerationBoundaryValuesCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify checked Data Generation Boundary Values in data generation$")			
            public void ThenVerifyCheckedDataGenerationBoundaryValuesInDataGeneration()
            {
                Assertion.IsTrue(workFlow.verifyChecked(0,"Page1","Page1.DataGenerationBoundaryValuesCheckBoxXPATH","XPATH"), "Then verify checked Data Generation Boundary Values in data generation");
                
            }

            @When("^I checked Data Generation Edge Cases in data generation$")			
            public void WhenICheckedDataGenerationEdgeCasesInDataGeneration()
            {
                workFlow.checkCheckbox(0,"Page1","Page1.DataGenerationEdgeCasesCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify checked Data Generation Edge Cases in data generation$")			
            public void ThenVerifyCheckedDataGenerationEdgeCasesInDataGeneration()
            {
                Assertion.IsTrue(workFlow.verifyChecked(0,"Page1","Page1.DataGenerationEdgeCasesCheckBoxXPATH","XPATH"), "Then verify checked Data Generation Edge Cases in data generation");
                
            }

            @When("^I checked Data Generation Illegal Values in data generation$")			
            public void WhenICheckedDataGenerationIllegalValuesInDataGeneration()
            {
                workFlow.checkCheckbox(0,"Page1","Page1.DataGenerationIllegalValuesCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify checked Data Generation Illegal Values in data generation$")			
            public void ThenVerifyCheckedDataGenerationIllegalValuesInDataGeneration()
            {
                Assertion.IsTrue(workFlow.verifyChecked(0,"Page1","Page1.DataGenerationIllegalValuesCheckBoxXPATH","XPATH"), "Then verify checked Data Generation Illegal Values in data generation");
                
            }

            @When("^I clear text Data Generation Data Combination in data generation$")			
            public void WhenIClearTextDataGenerationDataCombinationInDataGeneration()
            {
                workFlow.clearText(0,"Page1","Page1.DataGenerationDataCombinationTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Data Generation and Combination is required error SMS in data generation as '(.*)'$")			
            public void ThenVerifyContentDataGenerationCombinationIsRequiredErrorSmsInDataGenerationAsdataGenerationAndCombinationIsRequiredErrorSms(String  dataGenerationAndCombinationIsRequiredErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(dataGenerationAndCombinationIsRequiredErrorSms,0,"Page1","Page1.DataGenerationandCombinationisrequirederrorSMSTextBoxXPATH","XPATH"), "Then verify content Data Generation and Combination is required error SMS in data generation as '<Data Generation and Combination is required error SMS>'");
                
            }

            @When("^I clear and enter text Data Generation Data Combination in data generation as '(.*)'$")			
            public void WhenIClearEnterTextDataGenerationDataCombinationInDataGenerationAsdataGenerationDataCombination3(String  dataGenerationDataCombination3)
            {
                workFlow.clearAndEnterText(dataGenerationDataCombination3,0,"Page1","Page1.DataGenerationDataCombinationTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Application Setting Updated Successfully SMS in settings as '(.*)'$")			
            public void ThenVerifyContentApplicationSettingUpdatedSuccessfullySmsInSettingsAsapplicationSettingUpdatedSuccessfullySms(String  applicationSettingUpdatedSuccessfullySms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(applicationSettingUpdatedSuccessfullySms,0,"Page1","Page1.ApplicationSettingUpdatedSuccessfullySMSTextBoxXPATH","XPATH"), "Then verify content Application Setting Updated Successfully SMS in settings as '<Application Setting Updated Successfully SMS>'");
                
            }

            @When("^I entered Settings Project Name in settings as '(.*)'$")			
            public void WhenIEnteredSettingsProjectNameInSettingsAssettingsProjectName2(String  settingsProjectName2)
            {
                workFlow.enterText(settingsProjectName2,0,"Page1","Page1.SettingsProjectNameTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Project Name error SMS in settings as '(.*)'$")			
            public void ThenVerifyContentProjectNameErrorSmsInSettingsAsprojectNameErrorSms(String  projectNameErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(projectNameErrorSms,0,"Page1","Page1.ProjectNameerrorSMSTextBoxXPATH","XPATH"), "Then verify content Project Name error SMS in settings as '<Project Name error SMS>'");
                
            }

             @Then("^verify copied text by index Settings Project Name in settings as '(.*)'$")			
            public void ThenVerifyCopiedTextByIndexSettingsProjectNameInSettingsAssettingsProjectName3(String  settingsProjectName3)
            {
                Assertion.IsTrue(workFlow.verifyCopiedTextByIndex(settingsProjectName3,0,"Page1","Page1.SettingsProjectNameTextBoxXPATH","XPATH"), "Then verify copied text by index Settings Project Name in settings as '<Settings Project Name3>'");
                
            }

            @When("^I clear text Settings Project Name in settings$")			
            public void WhenIClearTextSettingsProjectNameInSettings()
            {
                workFlow.clearText(0,"Page1","Page1.SettingsProjectNameTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Project Name is required error SMS in settings as '(.*)'$")			
            public void ThenVerifyContentProjectNameIsRequiredErrorSmsInSettingsAsprojectNameIsRequiredErrorSms(String  projectNameIsRequiredErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(projectNameIsRequiredErrorSms,0,"Page1","Page1.ProjectNameisrequirederrorSMSTextBoxXPATH","XPATH"), "Then verify content Project Name is required error SMS in settings as '<Project Name is required error SMS>'");
                
            }

            @When("^I clear and enter text Settings Project Name in settings as '(.*)'$")			
            public void WhenIClearEnterTextSettingsProjectNameInSettingsAssettingsProjectName4(String  settingsProjectName4)
            {
                workFlow.clearAndEnterText(settingsProjectName4,0,"Page1","Page1.SettingsProjectNameTextBoxXPATH","XPATH");
                
            }

             @Then("^verify disabled Settings Application Type in settings$")			
            public void ThenVerifyDisabledSettingsApplicationTypeInSettings()
            {
                Assertion.IsTrue(workFlow.verifyDisabled(0,"Page1","Page1.SettingsApplicationTypeTextBoxXPATH","XPATH"), "Then verify disabled Settings Application Type in settings");
                
            }

             @Then("^verify copied text by index Settings Application Type in settings as '(.*)'$")			
            public void ThenVerifyCopiedTextByIndexSettingsApplicationTypeInSettingsAssettingsApplicationType3(String  settingsApplicationType3)
            {
                Assertion.IsTrue(workFlow.verifyCopiedTextByIndex(settingsApplicationType3,0,"Page1","Page1.SettingsApplicationTypeTextBoxXPATH","XPATH"), "Then verify copied text by index Settings Application Type in settings as '<Settings Application Type3>'");
                
            }

             @Then("^verify enabled Settings Application Url in settings$")			
            public void ThenVerifyEnabledSettingsApplicationUrlInSettings()
            {
                Assertion.IsTrue(workFlow.verifyEnabled(0,"Page1","Page1.SettingsApplicationUrlTextBoxXPATH","XPATH"), "Then verify enabled Settings Application Url in settings");
                
            }

             @Then("^verify enabled Home Page Title in settings$")			
            public void ThenVerifyEnabledHomePageTitleInSettings()
            {
                Assertion.IsTrue(workFlow.verifyEnabled(0,"Page1","Page1.HomePageTitleTextBoxXPATH","XPATH"), "Then verify enabled Home Page Title in settings");
                
            }

             @Then("^verify enabled Selective TestCase Gen in settings$")			
            public void ThenVerifyEnabledSelectiveTestcaseGenInSettings()
            {
                Assertion.IsTrue(workFlow.verifyEnabled(0,"Page1","Page1.SelectiveTestCaseGenTextBoxXPATH","XPATH"), "Then verify enabled Selective TestCase Gen in settings");
                
            }

             @Then("^verify enabled Input For GWT Line in settings$")			
            public void ThenVerifyEnabledInputForGwtLineInSettings()
            {
                Assertion.IsTrue(workFlow.verifyEnabled(0,"Page1","Page1.InputForGWTLineTextBoxXPATH","XPATH"), "Then verify enabled Input For GWT Line in settings");
                
            }

             @Then("^verify enabled Precondition Name in settings$")			
            public void ThenVerifyEnabledPreconditionNameInSettings()
            {
                Assertion.IsTrue(workFlow.verifyEnabled(0,"Page1","Page1.PreconditionNameTextBoxXPATH","XPATH"), "Then verify enabled Precondition Name in settings");
                
            }

             @Then("^verify enabled Precondition Action in settings$")			
            public void ThenVerifyEnabledPreconditionActionInSettings()
            {
                Assertion.IsTrue(workFlow.verifyEnabled(0,"Page1","Page1.PreconditionActionTextBoxXPATH","XPATH"), "Then verify enabled Precondition Action in settings");
                
            }

            @When("^I checked Requirement Filter in settings$")			
            public void WhenICheckedRequirementFilterInSettings()
            {
                workFlow.checkCheckbox(0,"Page1","Page1.RequirementFilterCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify checked Requirement Filter in settings$")			
            public void ThenVerifyCheckedRequirementFilterInSettings()
            {
                Assertion.IsTrue(workFlow.verifyChecked(0,"Page1","Page1.RequirementFilterCheckBoxXPATH","XPATH"), "Then verify checked Requirement Filter in settings");
                
            }

            @When("^I checked Remove Default Tags in settings$")			
            public void WhenICheckedRemoveDefaultTagsInSettings()
            {
                workFlow.checkCheckbox(0,"Page1","Page1.RemoveDefaultTagsCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify checked Remove Default Tags in settings$")			
            public void ThenVerifyCheckedRemoveDefaultTagsInSettings()
            {
                Assertion.IsTrue(workFlow.verifyChecked(0,"Page1","Page1.RemoveDefaultTagsCheckBoxXPATH","XPATH"), "Then verify checked Remove Default Tags in settings");
                
            }

            @When("^I checked Modify Feature File in settings$")			
            public void WhenICheckedModifyFeatureFileInSettings()
            {
                workFlow.checkCheckbox(0,"Page1","Page1.ModifyFeatureFileCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify checked Modify Feature File in settings$")			
            public void ThenVerifyCheckedModifyFeatureFileInSettings()
            {
                Assertion.IsTrue(workFlow.verifyChecked(0,"Page1","Page1.ModifyFeatureFileCheckBoxXPATH","XPATH"), "Then verify checked Modify Feature File in settings");
                
            }

            @When("^I unchecked Data Decoupling in settings$")			
            public void WhenIUncheckedDataDecouplingInSettings()
            {
                workFlow.uncheckCheckBox(0,"Page1","Page1.DataDecouplingCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify checked Data Decoupling in settings$")			
            public void ThenVerifyCheckedDataDecouplingInSettings()
            {
                Assertion.IsTrue(workFlow.verifyChecked(0,"Page1","Page1.DataDecouplingCheckBoxXPATH","XPATH"), "Then verify checked Data Decoupling in settings");
                
            }

            @When("^I selected Customize Feature in settings$")			
            public void WhenISelectedCustomizeFeatureInSettings()
            {
                workFlow.clickedElement(0,"Page1","Page1.CustomizeFeatureCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify checked Customize Feature in settings$")			
            public void ThenVerifyCheckedCustomizeFeatureInSettings()
            {
                Assertion.IsTrue(workFlow.verifyChecked(0,"Page1","Page1.CustomizeFeatureCheckBoxXPATH","XPATH"), "Then verify checked Customize Feature in settings");
                
            }

            @When("^I selected Customize Control in settings$")			
            public void WhenISelectedCustomizeControlInSettings()
            {
                workFlow.clickedElement(0,"Page1","Page1.CustomizeControlCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify checked Customize Control in settings$")			
            public void ThenVerifyCheckedCustomizeControlInSettings()
            {
                Assertion.IsTrue(workFlow.verifyChecked(0,"Page1","Page1.CustomizeControlCheckBoxXPATH","XPATH"), "Then verify checked Customize Control in settings");
                
            }

            @When("^I unchecked Requirement Filter in settings$")			
            public void WhenIUncheckedRequirementFilterInSettings()
            {
                workFlow.uncheckCheckBox(0,"Page1","Page1.RequirementFilterCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify unchecked Requirement Filter in settings$")			
            public void ThenVerifyUncheckedRequirementFilterInSettings()
            {
                Assertion.IsTrue(workFlow.verifyUnchecked(0,"Page1","Page1.RequirementFilterCheckBoxXPATH","XPATH"), "Then verify unchecked Requirement Filter in settings");
                
            }

            @When("^I unchecked Remove Default Tags in settings$")			
            public void WhenIUncheckedRemoveDefaultTagsInSettings()
            {
                workFlow.uncheckCheckBox(0,"Page1","Page1.RemoveDefaultTagsCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify unchecked Remove Default Tags in settings$")			
            public void ThenVerifyUncheckedRemoveDefaultTagsInSettings()
            {
                Assertion.IsTrue(workFlow.verifyUnchecked(0,"Page1","Page1.RemoveDefaultTagsCheckBoxXPATH","XPATH"), "Then verify unchecked Remove Default Tags in settings");
                
            }

            @When("^I unchecked Modify Feature File in settings$")			
            public void WhenIUncheckedModifyFeatureFileInSettings()
            {
                workFlow.uncheckCheckBox(0,"Page1","Page1.ModifyFeatureFileCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify unchecked Modify Feature File in settings$")			
            public void ThenVerifyUncheckedModifyFeatureFileInSettings()
            {
                Assertion.IsTrue(workFlow.verifyUnchecked(0,"Page1","Page1.ModifyFeatureFileCheckBoxXPATH","XPATH"), "Then verify unchecked Modify Feature File in settings");
                
            }

             @Then("^verify unchecked Data Decoupling in settings$")			
            public void ThenVerifyUncheckedDataDecouplingInSettings()
            {
                Assertion.IsTrue(workFlow.verifyUnchecked(0,"Page1","Page1.DataDecouplingCheckBoxXPATH","XPATH"), "Then verify unchecked Data Decoupling in settings");
                
            }

             @Then("^verify unchecked Customize Feature in settings$")			
            public void ThenVerifyUncheckedCustomizeFeatureInSettings()
            {
                Assertion.IsTrue(workFlow.verifyUnchecked(0,"Page1","Page1.CustomizeFeatureCheckBoxXPATH","XPATH"), "Then verify unchecked Customize Feature in settings");
                
            }

            @When("^I unchecked Customize Control in settings$")			
            public void WhenIUncheckedCustomizeControlInSettings()
            {
                workFlow.uncheckCheckBox(0,"Page1","Page1.CustomizeControlCheckBoxXPATH","XPATH");
                
            }

             @Then("^verify unchecked Customize Control in settings$")			
            public void ThenVerifyUncheckedCustomizeControlInSettings()
            {
                Assertion.IsTrue(workFlow.verifyUnchecked(0,"Page1","Page1.CustomizeControlCheckBoxXPATH","XPATH"), "Then verify unchecked Customize Control in settings");
                
            }

            @When("^I entered Selective TestCase Gen in settings as '(.*)'$")			
            public void WhenIEnteredSelectiveTestcaseGenInSettingsAsselectiveTestcaseGen2(String  selectiveTestcaseGen2)
            {
                workFlow.enterText(selectiveTestcaseGen2,0,"Page1","Page1.SelectiveTestCaseGenTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Selective TestCase Gen error SMS in settings as '(.*)'$")			
            public void ThenVerifyContentSelectiveTestcaseGenErrorSmsInSettingsAsselectiveTestcaseGenErrorSms(String  selectiveTestcaseGenErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(selectiveTestcaseGenErrorSms,0,"Page1","Page1.SelectiveTestCaseGenerrorSMSTextBoxXPATH","XPATH"), "Then verify content Selective TestCase Gen error SMS in settings as '<Selective TestCase Gen error SMS>'");
                
            }

            @When("^I entered Precondition Name in settings as '(.*)'$")			
            public void WhenIEnteredPreconditionNameInSettingsAspreconditionName2(String  preconditionName2)
            {
                workFlow.enterText(preconditionName2,0,"Page1","Page1.PreconditionNameTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Precondition Action in settings as '(.*)'$")			
            public void WhenIEnteredPreconditionActionInSettingsAspreconditionAction3(String  preconditionAction3)
            {
                workFlow.enterText(preconditionAction3,0,"Page1","Page1.PreconditionActionTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Precondition Name error SMS in settings as '(.*)'$")			
            public void ThenVerifyContentPreconditionNameErrorSmsInSettingsAspreconditionNameErrorSms(String  preconditionNameErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(preconditionNameErrorSms,0,"Page1","Page1.PreconditionNameerrorSMSTextBoxXPATH","XPATH"), "Then verify content Precondition Name error SMS in settings as '<Precondition Name error SMS>'");
                
            }

             @Then("^verify content Precondition Action error SMS in settings as '(.*)'$")			
            public void ThenVerifyContentPreconditionActionErrorSmsInSettingsAspreconditionActionErrorSms(String  preconditionActionErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(preconditionActionErrorSms,0,"Page1","Page1.PreconditionActionerrorSMSTextBoxXPATH","XPATH"), "Then verify content Precondition Action error SMS in settings as '<Precondition Action error SMS>'");
                
            }

            @When("^I entered Home Page Title in settings as '(.*)'$")			
            public void WhenIEnteredHomePageTitleInSettingsAshomePageTitle2(String  homePageTitle2)
            {
                workFlow.enterText(homePageTitle2,0,"Page1","Page1.HomePageTitleTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Home Page Title error SMS in settings as '(.*)'$")			
            public void ThenVerifyContentHomePageTitleErrorSmsInSettingsAshomePageTitleErrorSms(String  homePageTitleErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(homePageTitleErrorSms,0,"Page1","Page1.HomePageTitleerrorSMSTextBoxXPATH","XPATH"), "Then verify content Home Page Title error SMS in settings as '<Home Page Title error SMS>'");
                
            }

            @When("^I clear text Home Page Title in settings$")			
            public void WhenIClearTextHomePageTitleInSettings()
            {
                workFlow.clearText(0,"Page1","Page1.HomePageTitleTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Home Page Title is required error SMS in settings as '(.*)'$")			
            public void ThenVerifyContentHomePageTitleIsRequiredErrorSmsInSettingsAshomePageTitleIsRequiredErrorSms(String  homePageTitleIsRequiredErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(homePageTitleIsRequiredErrorSms,0,"Page1","Page1.HomePageTitleisrequirederrorSMSTextBoxXPATH","XPATH"), "Then verify content Home Page Title is required error SMS in settings as '<Home Page Title is required error SMS>'");
                
            }

            @When("^I clear and enter text Input For GWT Line in settings as '(.*)'$")			
            public void WhenIClearEnterTextInputForGwtLineInSettingsAsinputForGwtLine2(String  inputForGwtLine2)
            {
                workFlow.clearAndEnterText(inputForGwtLine2,0,"Page1","Page1.InputForGWTLineTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Input for GWT Line 35 char error SMS in settings as '(.*)'$")			
            public void ThenVerifyContentInputForGwtLine35CharErrorSmsInSettingsAsinputForGwtLine35CharErrorSms(String  inputForGwtLine35CharErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(inputForGwtLine35CharErrorSms,0,"Page1","Page1.InputforGWTLine35charerrorSMSTextBoxXPATH","XPATH"), "Then verify content Input for GWT Line 35 char error SMS in settings as '<Input for GWT Line 35 char error SMS>'");
                
            }

             @Then("^verify content Input for GWT Line error SMS in settings as '(.*)'$")			
            public void ThenVerifyContentInputForGwtLineErrorSmsInSettingsAsinputForGwtLineErrorSms(String  inputForGwtLineErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(inputForGwtLineErrorSms,0,"Page1","Page1.InputforGWTLineerrorSMSTextBoxXPATH","XPATH"), "Then verify content Input for GWT Line error SMS in settings as '<Input for GWT Line error SMS>'");
                
            }

            @When("^I clear and enter text Settings Application Url in settings as '(.*)'$")			
            public void WhenIClearEnterTextSettingsApplicationUrlInSettingsAssettingsApplicationUrl2(String  settingsApplicationUrl2)
            {
                workFlow.clearAndEnterText(settingsApplicationUrl2,0,"Page1","Page1.SettingsApplicationUrlTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Enter a correct url error SMS in settings as '(.*)'$")			
            public void ThenVerifyContentEnterACorrectUrlErrorSmsInSettingsAsenterACorrectUrlErrorSms(String  enterACorrectUrlErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(enterACorrectUrlErrorSms,0,"Page1","Page1.EnteracorrecturlerrorSMSTextBoxXPATH","XPATH"), "Then verify content Enter a correct url error SMS in settings as '<Enter a correct url error SMS>'");
                
            }

            @When("^I clear text Settings Application Url in settings$")			
            public void WhenIClearTextSettingsApplicationUrlInSettings()
            {
                workFlow.clearText(0,"Page1","Page1.SettingsApplicationUrlTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content Application Url is required error SMS in settings as '(.*)'$")			
            public void ThenVerifyContentApplicationUrlIsRequiredErrorSmsInSettingsAsapplicationUrlIsRequiredErrorSms(String  applicationUrlIsRequiredErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(applicationUrlIsRequiredErrorSms,0,"Page1","Page1.ApplicationUrlisrequirederrorSMSTextBoxXPATH","XPATH"), "Then verify content Application Url is required error SMS in settings as '<Application Url is required error SMS>'");
                
            }

             @Then("^verify displayed Settings App Package in settings$")			
            public void ThenVerifyDisplayedSettingsAppPackageInSettings()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"Page1","Page1.SettingsAppPackageTextBoxXPATH","XPATH"), "Then verify displayed Settings App Package in settings");
                
            }

             @Then("^verify displayed Settings App Activity in settings$")			
            public void ThenVerifyDisplayedSettingsAppActivityInSettings()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"Page1","Page1.SettingsAppActivityTextBoxXPATH","XPATH"), "Then verify displayed Settings App Activity in settings");
                
            }

             @Then("^verify displayed Settings Application Url in settings$")			
            public void ThenVerifyDisplayedSettingsApplicationUrlInSettings()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"Page1","Page1.SettingsApplicationUrlTextBoxXPATH","XPATH"), "Then verify displayed Settings Application Url in settings");
                
            }

             @Then("^verify displayed Settings Bundled ID in settings$")			
            public void ThenVerifyDisplayedSettingsBundledIdInSettings()
            {
                Assertion.IsTrue(workFlow.verifyTextInTextBox(0,"Page1","Page1.SettingsBundledIDTextBoxXPATH","XPATH"), "Then verify displayed Settings Bundled ID in settings");
                
            }

            @When("^I entered Settings App Package in settings as '(.*)'$")			
            public void WhenIEnteredSettingsAppPackageInSettingsAssettingsAppPackage3(String  settingsAppPackage3)
            {
                workFlow.enterText(settingsAppPackage3,0,"Page1","Page1.SettingsAppPackageTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Settings App Activity in settings as '(.*)'$")			
            public void WhenIEnteredSettingsAppActivityInSettingsAssettingsAppActivity4(String  settingsAppActivity4)
            {
                workFlow.enterText(settingsAppActivity4,0,"Page1","Page1.SettingsAppActivityTextBoxXPATH","XPATH");
                
            }

             @Then("^verify content App Package error SMS in settings as '(.*)'$")			
            public void ThenVerifyContentAppPackageErrorSmsInSettingsAsappPackageErrorSms(String  appPackageErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(appPackageErrorSms,0,"Page1","Page1.AppPackageerrorSMSTextBoxXPATH","XPATH"), "Then verify content App Package error SMS in settings as '<App Package error SMS>'");
                
            }

             @Then("^verify content App Activity error SMS in settings as '(.*)'$")			
            public void ThenVerifyContentAppActivityErrorSmsInSettingsAsappActivityErrorSms(String  appActivityErrorSms)
            {
                Assertion.IsTrue(workFlow.verifyContentTextBox(appActivityErrorSms,0,"Page1","Page1.AppActivityerrorSMSTextBoxXPATH","XPATH"), "Then verify content App Activity error SMS in settings as '<App Activity error SMS>'");
                
            }
    }