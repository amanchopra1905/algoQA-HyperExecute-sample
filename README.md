HyperExecute Integration with AlgoQA
HyperExecute is an AI Powered Test Orchestration Cloud Platform, enabling test automation teams worldwide to achieve an accelerated time to market. For integrating HyperExecute with algoQA, make sure to run your test scripts through the ‘Remote’ desired capability. You can select all your desired capabilities from Lambda Test Capabilities Generator.
 
**Pre-requisites**         
•	HyperExecute YAML file which contains all the necessary instructions.    
•	HyperExecute CLI in order to initiate a test execution Job.    
•	Your lambdatest Username and Access key     
•	Sample scripts





**Steps to Integrate**     

Step 1: Login to Lambda Test. If you haven’t signed up yet, click [here](https://accounts.lambdatest.com/).

Step 2: Visit your Profile on Lambda Test to fetch your Username and Access Key value. 

Step 3: You would require these values for generating a secure remote connection with algoQA through Lambda Test remote URL.

Step 4: Visit LambdaTest Capabilities Generator for declaring desired capabilities. For instance, if you wish to test on macOS High Sierra using Firefox browser then desired capabilities for Java frameworks would look like below. 

Step 5: Create a hyperexecute.yaml file to design sophisticated test execution plans. A sample of yaml file is as below	   

Step 6: Open algoQA Scripts and navigate to root directory of your project. Paste the yaml, Hyperexecute CLI and hyperexecute.exe files

Step 7: Navigate to directory src/test/java 

Step 8: Open Application settings.XML file to modify Lambda Environment changes as highlighted in parameters.  
			a. BrowserType    
			b. LambdaTestBuild     
			c. LambdaTestURL
 
Step 9: Now script is ready for execution, Navigate back to root directory of your project.

Step 10: Open command prompt in the root directory

Step 11: in the command prompt type the following command to trigger the script execution in HyperExecute    
hyperexecute.exe --user <username> --key <lambda_accesskey> --config <yaml_file_name>
