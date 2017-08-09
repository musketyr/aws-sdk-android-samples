package com.amazonaws.cognito.sync;


import com.amazonaws.regions.Regions;

public interface CognitoConfiguration {


    /**
     * Salt used to hash the passwords by the auth server.
     */
    String SALT = "YourOwnSalt";

    /**
     * Name of the provider as entered in the Identity Pool
     */
    String DEVELOPER_PROVIDER = "myapp.login";

    /**
     * URL where the auth server is running.
     */
    String COGNITO_SAMPLE_DEVELOPER_AUTHENTICATION_APP_ENDPOINT = "http://cognito.example.com/";


    /**
     * Enter here the Identity Pool associated with your app and the AWS
     * region where it belongs. Get this information from the AWS console.
     */

    String IDENTITY_POOL_ID = "eu-west-1:abcd";

    /**
     * Enter region of the identity pool.
     */
    Regions REGION = Regions.EU_WEST_1;

    /**
     * Set this flag to true for using developer authenticated identities
     * Make sure you configured it in DeveloperAuthenticationProvider.java.
     */
    boolean USE_DEVELOPER_AUTHENTICATED_IDENTITIES = true;
}
