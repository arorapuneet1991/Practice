Scenario Outline: I want to login
Given I am on the login page
Then I log in with "<Username>" and "<Password>"

Examples:
|  Username  |  Password  |
|  User1     |  12345678  |
|  User2     |  12345679  |
|  User3     |  12345670  |
