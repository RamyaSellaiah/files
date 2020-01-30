Feature: Login with Registered Credientials

Scenario Outline: Validation of registered credentials
When user open the Application in browser
When user clicks on SignIn button
When user enters username as "<username>" in user field
And password as "<password>" in pass field
When user clicks on login button

Examples:
|username|password|
|Indian|AaBbCcDd.@3|