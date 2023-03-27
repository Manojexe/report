Feature: automating the cylos for practise
    Scenario: I login the cyclos page
    Given launch the browser
    And username and password and click submit
    And enter to login page with vaild credentials
    
   Scenario: click the payuser button
    Given launch the browsers
    And username and password and click submits
    And enter to login page with vaild credentialss
    When enter the user name in search field 
    And enter the user amount to be send 
    And Write a discription amount send or not 
    And click the next button to redirect page
    Then verify once all details correct then click to confirm button

    Scenario: I visiting Movie voucher
    Given launch the browser
    When select the buy movie voucher
    Then Choose the Voucher Section and click 
    
    
     #Scenario: Adding new advertisement
    #Given launch the browser
    #And username and password and click submit
    #And enter to login page with vaild credentials
    #When navigate upload image and add advertisement 
    #Then place the advertisement to the website 
    