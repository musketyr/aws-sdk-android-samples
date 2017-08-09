Running the CognitoSyncDemo Sample
============================================
This sample demonstrates how to use Cognito Sync client library on Android. It supports Facebook Login, Login with Amazon, developer authenticated identities as well as Unauthenticated Identities.

1. Import the CognitoSyncDemo project into your IDE.
      * From the Welcome screen, click on "Import project".
      * Browse to the CognitoSyncDemo directory and press OK.
      * Accept the messages about adding Gradle to the project.
      * If the SDK reports some missing Android SDK packages (like Build Tools or the Android API package), follow the instructions to install them.
	  
2. To add support for Developer authenticated identities using the Sample Cognito Developer Authentication application (Optional)
	* In the `CognitoConfiguration` class :
		* Set the application endpoint received from the Amazon ElasticBeanStalk console.
		* Set the developer provider name in the to the one you set in Amazon Cognito console for your identity pool.
		* Set salt used for hashing the passwords
		* Set identity pool id
		* Set identity pool region

3. Run demo:
   * At this point you can run the sample:
     + Go to Run -> Run.
