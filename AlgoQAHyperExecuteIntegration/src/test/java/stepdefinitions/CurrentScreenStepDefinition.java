package stepdefinitions;
    import io.cucumber.java.en.*;
    import workflows.SeleniumWorkFlow;
    import org.junit.Assert;
    import common.Assertion;
    public class CurrentScreenStepDefinition
	{
        SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
        

            @When("^I selected Are you a in sign up$")			
            public void WhenISelectedAreYouAInSignUp()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.AreyouaButtonXPATH","XPATH");
                
            }

            @When("^I selected Existing Project in project explorer$")			
            public void WhenISelectedExistingProjectInProjectExplorer()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.ExistingProjectButtonXPATH","XPATH");
                
            }

            @When("^I selected Project Name Arrow in project explorer$")			
            public void WhenISelectedProjectNameArrowInProjectExplorer()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.ProjectNameArrowButtonXPATH","XPATH");
                
            }

            @When("^I selected Node Config 3 dots in node_config$")			
            public void WhenISelectedNodeConfig3DotsInNodeconfig()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.NodeConfig3dotsButtonXPATH","XPATH");
                
            }

            @When("^I selected Configuration 3 dots in configuration$")			
            public void WhenISelectedConfiguration3DotsInConfiguration()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.Configuration3dotsButtonXPATH","XPATH");
                
            }

            @When("^I selected Configurations arrow Icon in configuration$")			
            public void WhenISelectedConfigurationsArrowIconInConfiguration()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.ConfigurationsarrowIconButtonXPATH","XPATH");
                
            }

            @When("^I selected Node Config arrow icon in node_config$")			
            public void WhenISelectedNodeConfigArrowIconInNodeconfig()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.NodeConfigarrowiconButtonXPATH","XPATH");
                
            }

            @When("^I selected Test Cases arrow Icon in test cases$")			
            public void WhenISelectedTestCasesArrowIconInTestCases()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.TestCasesarrowIconButtonXPATH","XPATH");
                
            }

             @Then("^verify text Test Cases files in test cases$")			
            public void ThenVerifyTextTestCasesFilesInTestCases()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.TestCasesfilesButtonXPATH","XPATH"), "Then verify text Test Cases files in test cases");
                
            }

            @When("^I selected Control Name2 in follow me$")			
            public void WhenISelectedControlName2InFollowMe()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.ControlName2ButtonXPATH","XPATH");
                
            }

            @When("^I selected Follow Me View in follow me$")			
            public void WhenISelectedFollowMeViewInFollowMe()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.FollowMeViewButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Node1 in canvas$")			
            public void ThenVerifyDisplayedNode1InCanvas()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.Node1ButtonXPATH","XPATH"), "Then verify displayed Node1 in canvas");
                
            }

             @Then("^verify displayed Node2 in canvas$")			
            public void ThenVerifyDisplayedNode2InCanvas()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.Node2ButtonXPATH","XPATH"), "Then verify displayed Node2 in canvas");
                
            }

            @When("^I selected Record Scenarios Close Icon in follow me$")			
            public void WhenISelectedRecordScenariosCloseIconInFollowMe()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.RecordScenariosCloseIconButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Record Scenarios Close Icon in follow me$")			
            public void ThenVerifyDisplayedRecordScenariosCloseIconInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.RecordScenariosCloseIconButtonXPATH","XPATH"), "Then verify displayed Record Scenarios Close Icon in follow me");
                
            }

            @When("^I selected Follow Me Undo in follow me$")			
            public void WhenISelectedFollowMeUndoInFollowMe()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.FollowMeUndoButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Last Control In Page1 in follow me$")			
            public void ThenVerifyDisplayedLastControlInPage1InFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.LastControlInPage1ButtonXPATH","XPATH"), "Then verify displayed Last Control In Page1 in follow me");
                
            }

             @Then("^verify displayed Are you a in sign up$")			
            public void ThenVerifyDisplayedAreYouAInSignUp()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.AreyouaButtonXPATH","XPATH"), "Then verify displayed Are you a in sign up");
                
            }

             @Then("^verify displayed API Project Page in api project page$")			
            public void ThenVerifyDisplayedApiProjectPageInApiProjectPage()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.APIProjectPageButtonXPATH","XPATH"), "Then verify displayed API Project Page in api project page");
                
            }

             @Then("^verify displayed API Collection in api project page$")			
            public void ThenVerifyDisplayedApiCollectionInApiProjectPage()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.APICollectionButtonXPATH","XPATH"), "Then verify displayed API Collection in api project page");
                
            }

             @Then("^verify displayed Create API in api project page$")			
            public void ThenVerifyDisplayedCreateApiInApiProjectPage()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.CreateAPIButtonXPATH","XPATH"), "Then verify displayed Create API in api project page");
                
            }

             @Then("^verify text Reset the recorded scenarios label in follow me$")			
            public void ThenVerifyTextResetTheRecordedScenariosLabelInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.ResettherecordedscenarioslabelButtonXPATH","XPATH"), "Then verify text Reset the recorded scenarios label in follow me");
                
            }

            @When("^I selected Reset the recorded scenarios No in follow me$")			
            public void WhenISelectedResetTheRecordedScenariosNoInFollowMe()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.ResettherecordedscenariosNoButtonXPATH","XPATH");
                
            }

            @When("^I selected Reset the recorded scenarios Yes in follow me$")			
            public void WhenISelectedResetTheRecordedScenariosYesInFollowMe()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.ResettherecordedscenariosYesButtonXPATH","XPATH");
                
            }

            @When("^I selected Upload in project explorer$")			
            public void WhenISelectedUploadInProjectExplorer()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.UploadButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Upload Scraped file Submit in upload$")			
            public void ThenVerifyDisplayedUploadScrapedFileSubmitInUpload()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.UploadScrapedfileSubmitButtonXPATH","XPATH"), "Then verify displayed Upload Scraped file Submit in upload");
                
            }

            @When("^I selected Upload Scraped file Submit in upload$")			
            public void WhenISelectedUploadScrapedFileSubmitInUpload()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.UploadScrapedfileSubmitButtonXPATH","XPATH");
                
            }

             @Then("^verify text Edit Profile Email Id or Username in edit profile$")			
            public void ThenVerifyTextEditProfileEmailIdOrUsernameInEditProfile()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditProfileEmailIdorUsernameButtonXPATH","XPATH"), "Then verify text Edit Profile Email Id or Username in edit profile");
                
            }

             @Then("^verify text Edit Profile Gender in edit profile$")			
            public void ThenVerifyTextEditProfileGenderInEditProfile()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditProfileGenderButtonXPATH","XPATH"), "Then verify text Edit Profile Gender in edit profile");
                
            }

             @Then("^verify displayed Edit Profile Country in edit profile$")			
            public void ThenVerifyDisplayedEditProfileCountryInEditProfile()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditProfileCountryButtonXPATH","XPATH"), "Then verify displayed Edit Profile Country in edit profile");
                
            }

             @Then("^verify displayed Edit Profile Submit in edit profile$")			
            public void ThenVerifyDisplayedEditProfileSubmitInEditProfile()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditProfileSubmitButtonXPATH","XPATH"), "Then verify displayed Edit Profile Submit in edit profile");
                
            }

             @Then("^verify displayed Edit Profile Cancel in edit profile$")			
            public void ThenVerifyDisplayedEditProfileCancelInEditProfile()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditProfileCancelButtonXPATH","XPATH"), "Then verify displayed Edit Profile Cancel in edit profile");
                
            }

             @Then("^verify disabled Edit Profile Email Id or Username in edit profile$")			
            public void ThenVerifyDisabledEditProfileEmailIdOrUsernameInEditProfile()
            {
                Assertion.IsTrue(workFlow.verifyDisabled(0,"Current Screen","Current Screen.EditProfileEmailIdorUsernameButtonXPATH","XPATH"), "Then verify disabled Edit Profile Email Id or Username in edit profile");
                
            }

            @When("^I selected Edit Profile Gender in edit profile$")			
            public void WhenISelectedEditProfileGenderInEditProfile()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditProfileGenderButtonXPATH","XPATH");
                
            }

            @When("^I selected Edit Profile Gender as Male in edit profile$")			
            public void WhenISelectedEditProfileGenderAsMaleInEditProfile()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditProfileGenderasMaleButtonXPATH","XPATH");
                
            }

            @When("^I selected Edit Profile Country in edit profile$")			
            public void WhenISelectedEditProfileCountryInEditProfile()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditProfileCountryButtonXPATH","XPATH");
                
            }

            @When("^I selected Edit Profile Country as Hungary in edit profile$")			
            public void WhenISelectedEditProfileCountryAsHungaryInEditProfile()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditProfileCountryasHungaryButtonXPATH","XPATH");
                
            }

            @When("^I selected Edit Profile Submit in edit profile$")			
            public void WhenISelectedEditProfileSubmitInEditProfile()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditProfileSubmitButtonXPATH","XPATH");
                
            }

            @When("^I selected Edit Profile Gender as Female in edit profile$")			
            public void WhenISelectedEditProfileGenderAsFemaleInEditProfile()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditProfileGenderasFemaleButtonXPATH","XPATH");
                
            }

            @When("^I selected Edit Profile Country as India in edit profile$")			
            public void WhenISelectedEditProfileCountryAsIndiaInEditProfile()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditProfileCountryasIndiaButtonXPATH","XPATH");
                
            }

            @When("^I selected Edit Profile Cancel in edit profile$")			
            public void WhenISelectedEditProfileCancelInEditProfile()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditProfileCancelButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Change Password Current Password Show in change password$")			
            public void ThenVerifyDisplayedChangePasswordCurrentPasswordShowInChangePassword()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.ChangePasswordCurrentPasswordShowButtonXPATH","XPATH"), "Then verify displayed Change Password Current Password Show in change password");
                
            }

             @Then("^verify displayed Change Password New Password Show in change password$")			
            public void ThenVerifyDisplayedChangePasswordNewPasswordShowInChangePassword()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.ChangePasswordNewPasswordShowButtonXPATH","XPATH"), "Then verify displayed Change Password New Password Show in change password");
                
            }

             @Then("^verify displayed Change Password Confirm Password Show in change password$")			
            public void ThenVerifyDisplayedChangePasswordConfirmPasswordShowInChangePassword()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.ChangePasswordConfirmPasswordShowButtonXPATH","XPATH"), "Then verify displayed Change Password Confirm Password Show in change password");
                
            }

             @Then("^verify displayed Change Password Submit in change password$")			
            public void ThenVerifyDisplayedChangePasswordSubmitInChangePassword()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.ChangePasswordSubmitButtonXPATH","XPATH"), "Then verify displayed Change Password Submit in change password");
                
            }

             @Then("^verify displayed Change Password Cancel in change password$")			
            public void ThenVerifyDisplayedChangePasswordCancelInChangePassword()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.ChangePasswordCancelButtonXPATH","XPATH"), "Then verify displayed Change Password Cancel in change password");
                
            }

            @When("^I selected Change Password Submit in change password$")			
            public void WhenISelectedChangePasswordSubmitInChangePassword()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.ChangePasswordSubmitButtonXPATH","XPATH");
                
            }

            @When("^I selected Change Password Cancel in change password$")			
            public void WhenISelectedChangePasswordCancelInChangePassword()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.ChangePasswordCancelButtonXPATH","XPATH");
                
            }

            @When("^I selected Change Password Current Password Show in change password$")			
            public void WhenISelectedChangePasswordCurrentPasswordShowInChangePassword()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.ChangePasswordCurrentPasswordShowButtonXPATH","XPATH");
                
            }

            @When("^I selected Change Password New Password Show in change password$")			
            public void WhenISelectedChangePasswordNewPasswordShowInChangePassword()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.ChangePasswordNewPasswordShowButtonXPATH","XPATH");
                
            }

            @When("^I selected Change Password Confirm Password Show in change password$")			
            public void WhenISelectedChangePasswordConfirmPasswordShowInChangePassword()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.ChangePasswordConfirmPasswordShowButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed My Subscription Page in my subscription$")			
            public void ThenVerifyDisplayedMySubscriptionPageInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.MySubscriptionPageButtonXPATH","XPATH"), "Then verify displayed My Subscription Page in my subscription");
                
            }

             @Then("^verify displayed Current Plan in my subscription$")			
            public void ThenVerifyDisplayedCurrentPlanInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.CurrentPlanButtonXPATH","XPATH"), "Then verify displayed Current Plan in my subscription");
                
            }

             @Then("^verify displayed Enterprise in my subscription$")			
            public void ThenVerifyDisplayedEnterpriseInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EnterpriseButtonXPATH","XPATH"), "Then verify displayed Enterprise in my subscription");
                
            }

             @Then("^verify displayed Total TestCases in my subscription$")			
            public void ThenVerifyDisplayedTotalTestcasesInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.TotalTestCasesButtonXPATH","XPATH"), "Then verify displayed Total TestCases in my subscription");
                
            }

             @Then("^verify displayed Limit in my subscription$")			
            public void ThenVerifyDisplayedLimitInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.LimitButtonXPATH","XPATH"), "Then verify displayed Limit in my subscription");
                
            }

             @Then("^verify displayed Consumed in my subscription$")			
            public void ThenVerifyDisplayedConsumedInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.ConsumedButtonXPATH","XPATH"), "Then verify displayed Consumed in my subscription");
                
            }

             @Then("^verify displayed Expire on in my subscription$")			
            public void ThenVerifyDisplayedExpireOnInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.ExpireonButtonXPATH","XPATH"), "Then verify displayed Expire on in my subscription");
                
            }

             @Then("^verify displayed Storage Usage in my subscription$")			
            public void ThenVerifyDisplayedStorageUsageInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.StorageUsageButtonXPATH","XPATH"), "Then verify displayed Storage Usage in my subscription");
                
            }

             @Then("^verify displayed Plan Benefits in my subscription$")			
            public void ThenVerifyDisplayedPlanBenefitsInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.PlanBenefitsButtonXPATH","XPATH"), "Then verify displayed Plan Benefits in my subscription");
                
            }

             @Then("^verify displayed Web Automations in my subscription$")			
            public void ThenVerifyDisplayedWebAutomationsInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.WebAutomationsButtonXPATH","XPATH"), "Then verify displayed Web Automations in my subscription");
                
            }

             @Then("^verify displayed M Site Automation in my subscription$")			
            public void ThenVerifyDisplayedMSiteAutomationInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.MSiteAutomationButtonXPATH","XPATH"), "Then verify displayed M Site Automation in my subscription");
                
            }

             @Then("^verify displayed Desktop Automations in my subscription$")			
            public void ThenVerifyDisplayedDesktopAutomationsInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.DesktopAutomationsButtonXPATH","XPATH"), "Then verify displayed Desktop Automations in my subscription");
                
            }

             @Then("^verify displayed Project Sharing in my subscription$")			
            public void ThenVerifyDisplayedProjectSharingInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.ProjectSharingButtonXPATH","XPATH"), "Then verify displayed Project Sharing in my subscription");
                
            }

             @Then("^verify displayed Training material in my subscription$")			
            public void ThenVerifyDisplayedTrainingMaterialInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.TrainingmaterialButtonXPATH","XPATH"), "Then verify displayed Training material in my subscription");
                
            }

             @Then("^verify displayed API Automations in my subscription$")			
            public void ThenVerifyDisplayedApiAutomationsInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.APIAutomationsButtonXPATH","XPATH"), "Then verify displayed API Automations in my subscription");
                
            }

             @Then("^verify displayed M App Automation in my subscription$")			
            public void ThenVerifyDisplayedMAppAutomationInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.MAppAutomationButtonXPATH","XPATH"), "Then verify displayed M App Automation in my subscription");
                
            }

             @Then("^verify displayed LoadTest Automation in my subscription$")			
            public void ThenVerifyDisplayedLoadtestAutomationInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.LoadTestAutomationButtonXPATH","XPATH"), "Then verify displayed LoadTest Automation in my subscription");
                
            }

             @Then("^verify displayed Training support in my subscription$")			
            public void ThenVerifyDisplayedTrainingSupportInMySubscription()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.TrainingsupportButtonXPATH","XPATH"), "Then verify displayed Training support in my subscription");
                
            }

            @When("^I selected Edit in edit profile$")			
            public void WhenISelectedEditInEditProfile()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Profile Pictures in edit profile$")			
            public void ThenVerifyDisplayedProfilePicturesInEditProfile()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.ProfilePicturesButtonXPATH","XPATH"), "Then verify displayed Profile Pictures in edit profile");
                
            }

            @When("^I selected Reset in edit profile$")			
            public void WhenISelectedResetInEditProfile()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.ResetButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Follow Me Assertion or Action in follow me$")			
            public void ThenVerifyDisplayedFollowMeAssertionOrActionInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.FollowMeAssertionorActionButtonXPATH","XPATH"), "Then verify displayed Follow Me Assertion or Action in follow me");
                
            }

            @When("^I selected Follow Me Assertion or Action in follow me$")			
            public void WhenISelectedFollowMeAssertionOrActionInFollowMe()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.FollowMeAssertionorActionButtonXPATH","XPATH");
                
            }

            @When("^I selected Follow Me Edit in follow me$")			
            public void WhenISelectedFollowMeEditInFollowMe()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.FollowMeEditButtonXPATH","XPATH");
                
            }

            @When("^I selected Edit Control Show more in follow me$")			
            public void WhenISelectedEditControlShowMoreInFollowMe()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditControlShowmoreButtonXPATH","XPATH");
                
            }

            @When("^I selected Edit Controls Custom Action in follow me$")			
            public void WhenISelectedEditControlsCustomActionInFollowMe()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditControlsCustomActionButtonXPATH","XPATH");
                
            }

            @When("^I selected Edit Control show less in follow me$")			
            public void WhenISelectedEditControlShowLessInFollowMe()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditControlshowlessButtonXPATH","XPATH");
                
            }

            @When("^I selected Follow Me Edit created scenario Edit icon in follow me$")			
            public void WhenISelectedFollowMeEditCreatedScenarioEditIconInFollowMe()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.FollowMeEditcreatedscenarioEditiconButtonXPATH","XPATH");
                
            }

            @When("^I selected Scenario Sequence Feature Name Arrow in edit scenarios$")			
            public void WhenISelectedScenarioSequenceFeatureNameArrowInEditScenarios()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.ScenarioSequenceFeatureNameArrowButtonXPATH","XPATH");
                
            }

            @When("^I selected Scenario Sequence Control Name2 Edit Icon in edit scenarios$")			
            public void WhenISelectedScenarioSequenceControlName2EditIconInEditScenarios()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.ScenarioSequenceControlName2EditIconButtonXPATH","XPATH");
                
            }

             @Then("^verify disabled Edit Scenario Cross Icon in edit scenarios$")			
            public void ThenVerifyDisabledEditScenarioCrossIconInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyDisabled(0,"Current Screen","Current Screen.EditScenarioCrossIconButtonXPATH","XPATH"), "Then verify disabled Edit Scenario Cross Icon in edit scenarios");
                
            }

             @Then("^verify not displayed Edit Scenario Form Save As in edit scenarios$")			
            public void ThenVerifyNotDisplayedEditScenarioFormSaveAsInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyNotDisplayed(0,"Current Screen","Current Screen.EditScenarioFormSaveAsButtonXPATH","XPATH"), "Then verify not displayed Edit Scenario Form Save As in edit scenarios");
                
            }

             @Then("^verify displayed Edit Scenario Form Save As in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioFormSaveAsInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditScenarioFormSaveAsButtonXPATH","XPATH"), "Then verify displayed Edit Scenario Form Save As in edit scenarios");
                
            }

            @When("^I selected Edit Scenario Form Save As in edit scenarios$")			
            public void WhenISelectedEditScenarioFormSaveAsInEditScenarios()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditScenarioFormSaveAsButtonXPATH","XPATH");
                
            }

            @When("^I selected Edit Scenario Thik Icon in edit scenarios$")			
            public void WhenISelectedEditScenarioThikIconInEditScenarios()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditScenarioThikIconButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Follow Me Edit created scenario in follow me$")			
            public void ThenVerifyDisplayedFollowMeEditCreatedScenarioInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.FollowMeEditcreatedscenarioButtonXPATH","XPATH"), "Then verify displayed Follow Me Edit created scenario in follow me");
                
            }

            @When("^I selected Control Name4 in follow me$")			
            public void WhenISelectedControlName4InFollowMe()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.ControlName4ButtonXPATH","XPATH");
                
            }

            @When("^I selected Control Name3 in follow me$")			
            public void WhenISelectedControlName3InFollowMe()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.ControlName3ButtonXPATH","XPATH");
                
            }

            @When("^I selected Follow Me Edit created scenario Close Icon in follow me$")			
            public void WhenISelectedFollowMeEditCreatedScenarioCloseIconInFollowMe()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.FollowMeEditcreatedscenarioCloseIconButtonXPATH","XPATH");
                
            }

            @When("^I selected Scenario Sequence Delete Control Name1 in edit scenarios$")			
            public void WhenISelectedScenarioSequenceDeleteControlName1InEditScenarios()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.ScenarioSequenceDeleteControlName1ButtonXPATH","XPATH");
                
            }

            @When("^I selected Scenario Sequence Control Name1 Edit Icon in edit scenarios$")			
            public void WhenISelectedScenarioSequenceControlName1EditIconInEditScenarios()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.ScenarioSequenceControlName1EditIconButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Edit Scenario Form Save in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioFormSaveInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditScenarioFormSaveButtonXPATH","XPATH"), "Then verify displayed Edit Scenario Form Save in edit scenarios");
                
            }

            @When("^I selected Edit Scenario Form Save in edit scenarios$")			
            public void WhenISelectedEditScenarioFormSaveInEditScenarios()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditScenarioFormSaveButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Remove All Created Scenario in follow me$")			
            public void ThenVerifyDisplayedRemoveAllCreatedScenarioInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.RemoveAllCreatedScenarioButtonXPATH","XPATH"), "Then verify displayed Remove All Created Scenario in follow me");
                
            }

             @Then("^verify displayed Remove All Created Scenario Yes in follow me$")			
            public void ThenVerifyDisplayedRemoveAllCreatedScenarioYesInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.RemoveAllCreatedScenarioYesButtonXPATH","XPATH"), "Then verify displayed Remove All Created Scenario Yes in follow me");
                
            }

             @Then("^verify displayed Remove All Created Scenario No in follow me$")			
            public void ThenVerifyDisplayedRemoveAllCreatedScenarioNoInFollowMe()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.RemoveAllCreatedScenarioNoButtonXPATH","XPATH"), "Then verify displayed Remove All Created Scenario No in follow me");
                
            }

            @When("^I drag and drop horizontally In Node in node configuration$")			
            public void WhenIDragDropHorizontallyInNodeInNodeConfiguration()
            {
                workFlow.dragAndDropHorizontally(0,"Current Screen","Current Screen.InNodeButtonXPATH","XPATH");
                
            } 

            @When("^I Click And Drag Node in node configuration$")			
            public void WhenIClickDragNodeInNodeConfiguration()
            {
                workFlow.defaultWorkFlowMethod();
                
            }

            @When("^I selected Node Name Edit in node configuration$")			
            public void WhenISelectedNodeNameEditInNodeConfiguration()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.NodeNameEditButtonXPATH","XPATH");
                
            }

            @When("^I selected Node Configuration OK in node configuration$")			
            public void WhenISelectedNodeConfigurationOkInNodeConfiguration()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.NodeConfigurationOKButtonXPATH","XPATH");
                
            }

            @When("^I selected New Feature in node configuration$")			
            public void WhenISelectedNewFeatureInNodeConfiguration()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.NewFeatureButtonXPATH","XPATH");
                
            }

            @When("^I selected Update New Feature Name in node configuration$")			
            public void WhenISelectedUpdateNewFeatureNameInNodeConfiguration()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.UpdateNewFeatureNameButtonXPATH","XPATH");
                
            }

            @When("^I selected More in canvas$")			
            public void WhenISelectedMoreInCanvas()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.MoreButtonXPATH","XPATH");
                
            }

            @When("^I selected Edit Scenarios in more$")			
            public void WhenISelectedEditScenariosInMore()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditScenariosButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Edit Scenario Select to filter in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioSelectToFilterInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditScenarioSelecttofilterButtonXPATH","XPATH"), "Then verify displayed Edit Scenario Select to filter in edit scenarios");
                
            }

             @Then("^verify displayed Edit Scenario Reset in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioResetInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditScenarioResetButtonXPATH","XPATH"), "Then verify displayed Edit Scenario Reset in edit scenarios");
                
            }

             @Then("^verify displayed Edit Scenario Add Scenario in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioAddScenarioInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditScenarioAddScenarioButtonXPATH","XPATH"), "Then verify displayed Edit Scenario Add Scenario in edit scenarios");
                
            }

             @Then("^verify displayed Edit Scenario Edit Scenario in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioEditScenarioInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditScenarioEditScenarioButtonXPATH","XPATH"), "Then verify displayed Edit Scenario Edit Scenario in edit scenarios");
                
            }

             @Then("^verify displayed Edit Scenario Delete Scenario in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioDeleteScenarioInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditScenarioDeleteScenarioButtonXPATH","XPATH"), "Then verify displayed Edit Scenario Delete Scenario in edit scenarios");
                
            }

             @Then("^verify displayed Edit Scenario Scenario Name in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioScenarioNameInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditScenarioScenarioNameButtonXPATH","XPATH"), "Then verify displayed Edit Scenario Scenario Name in edit scenarios");
                
            }

             @Then("^verify displayed Edit Scenario Custom Tag in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioCustomTagInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditScenarioCustomTagButtonXPATH","XPATH"), "Then verify displayed Edit Scenario Custom Tag in edit scenarios");
                
            }

             @Then("^verify displayed Edit Scenario Scenario Outline in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioScenarioOutlineInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditScenarioScenarioOutlineButtonXPATH","XPATH"), "Then verify displayed Edit Scenario Scenario Outline in edit scenarios");
                
            }

             @Then("^verify displayed Edit Scenario Separate Feature in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioSeparateFeatureInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditScenarioSeparateFeatureButtonXPATH","XPATH"), "Then verify displayed Edit Scenario Separate Feature in edit scenarios");
                
            }

             @Then("^verify displayed Edit Scenario Folder Structure in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioFolderStructureInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditScenarioFolderStructureButtonXPATH","XPATH"), "Then verify displayed Edit Scenario Folder Structure in edit scenarios");
                
            }

             @Then("^verify displayed Edit Scenario Close in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioCloseInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditScenarioCloseButtonXPATH","XPATH"), "Then verify displayed Edit Scenario Close in edit scenarios");
                
            }

             @Then("^verify displayed Edit Scenario Rows per page in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioRowsPerPageInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditScenarioRowsperpageButtonXPATH","XPATH"), "Then verify displayed Edit Scenario Rows per page in edit scenarios");
                
            }

             @Then("^verify displayed No of scenarios in the page as 5 in edit scenarios$")			
            public void ThenVerifyDisplayedNoOfScenariosInThePageAs5InEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.Noofscenariosinthepageas5ButtonXPATH","XPATH"), "Then verify displayed No of scenarios in the page as 5 in edit scenarios");
                
            }

             @Then("^verify displayed No of scenarios in the page as 10 in edit scenarios$")			
            public void ThenVerifyDisplayedNoOfScenariosInThePageAs10InEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.Noofscenariosinthepageas10ButtonXPATH","XPATH"), "Then verify displayed No of scenarios in the page as 10 in edit scenarios");
                
            }

             @Then("^verify displayed No of scenarios in the page as 25 in edit scenarios$")			
            public void ThenVerifyDisplayedNoOfScenariosInThePageAs25InEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.Noofscenariosinthepageas25ButtonXPATH","XPATH"), "Then verify displayed No of scenarios in the page as 25 in edit scenarios");
                
            }

            @When("^I selected Edit Scenario Edit Scenario in edit scenarios$")			
            public void WhenISelectedEditScenarioEditScenarioInEditScenarios()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditScenarioEditScenarioButtonXPATH","XPATH");
                
            }

            @When("^I selected Edit Scenario Add Scenario in edit scenarios$")			
            public void WhenISelectedEditScenarioAddScenarioInEditScenarios()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditScenarioAddScenarioButtonXPATH","XPATH");
                
            }

            @When("^I selected Edit Scenario Delete Scenario in edit scenarios$")			
            public void WhenISelectedEditScenarioDeleteScenarioInEditScenarios()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditScenarioDeleteScenarioButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Edit Scenario delete popup Yes in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioDeletePopupYesInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditScenariodeletepopupYesButtonXPATH","XPATH"), "Then verify displayed Edit Scenario delete popup Yes in edit scenarios");
                
            }

             @Then("^verify displayed Edit Scenario delete popup No in edit scenarios$")			
            public void ThenVerifyDisplayedEditScenarioDeletePopupNoInEditScenarios()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.EditScenariodeletepopupNoButtonXPATH","XPATH"), "Then verify displayed Edit Scenario delete popup No in edit scenarios");
                
            }

            @When("^I selected Edit Scenario delete popup No in edit scenarios$")			
            public void WhenISelectedEditScenarioDeletePopupNoInEditScenarios()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditScenariodeletepopupNoButtonXPATH","XPATH");
                
            }

            @When("^I selected Edit Scenario delete popup Yes in edit scenarios$")			
            public void WhenISelectedEditScenarioDeletePopupYesInEditScenarios()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.EditScenariodeletepopupYesButtonXPATH","XPATH");
                
            }

            @When("^I selected Settings in project explorer$")			
            public void WhenISelectedSettingsInProjectExplorer()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.SettingsButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Settings Page in settings$")			
            public void ThenVerifyDisplayedSettingsPageInSettings()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.SettingsPageButtonXPATH","XPATH"), "Then verify displayed Settings Page in settings");
                
            }

             @Then("^verify displayed Project Settings label in settings$")			
            public void ThenVerifyDisplayedProjectSettingsLabelInSettings()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.ProjectSettingslabelButtonXPATH","XPATH"), "Then verify displayed Project Settings label in settings");
                
            }

            @When("^I selected Settings Submit in settings$")			
            public void WhenISelectedSettingsSubmitInSettings()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.SettingsSubmitButtonXPATH","XPATH");
                
            }

            @When("^I selected Settings in canvas$")			
            public void WhenISelectedSettingsInCanvas()
            {
                workFlow.clickedElement(0,"Current Screen","Current Screen.SettingsButtonXPATH","XPATH");
                
            }

             @Then("^verify displayed Settings in project explorer$")			
            public void ThenVerifyDisplayedSettingsInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.SettingsButtonXPATH","XPATH"), "Then verify displayed Settings in project explorer");
                
            }

             @Then("^verify displayed Upload in project explorer$")			
            public void ThenVerifyDisplayedUploadInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.UploadButtonXPATH","XPATH"), "Then verify displayed Upload in project explorer");
                
            }

             @Then("^verify displayed Download in project explorer$")			
            public void ThenVerifyDisplayedDownloadInProjectExplorer()
            {
                Assertion.IsTrue(workFlow.verifyTextInLink(0,"Current Screen","Current Screen.DownloadButtonXPATH","XPATH"), "Then verify displayed Download in project explorer");
                
            }
    }