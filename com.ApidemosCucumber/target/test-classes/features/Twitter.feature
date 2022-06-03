Feature: Twitter test
  @Twit
  Scenario: otomatik twit atma test
    Given login button a tiklanir
    And mailBox a "famiysengul@gmail.com" yazar
    And nextButtonMail e tiklar
    And password kutusuna "161980iVm" yazar
    And logInButton a tiklar
    And phone box a "0467750626" yazar
    And nextButtonPhone a tiklar
    And twitButton a tiklar
    And twitTextBox a "Merhaba Dunya" yazar
    And twitSendbutton a tiklar
    And insanIkon una tiklar
    And profilButton a tiklar
    Then twit in text ini alir ve dogrular.