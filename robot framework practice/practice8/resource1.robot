*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${url} =  https://rahulshettyacademy.com/loginpagePractise/
${browser} =  chrome
${uname} =  xpath =  //*[@id='username']
${value} =  rahulshettyacademy 
${pwd} =  xpath =  //*[@id='password']
${valid_password} =  learning
${invalid_password} =  lening
${btn} =  xpath =  //*[@id='signInBtn']
${error} =    css:.alert-danger
${btns} =  css:.nav-link 
@{ListofProducts} =  Blackberry    Nokia Edge
# @{expected_list} =    Create List    iphone X    Samsung Note 8    Nokia Edge    Blackberry
# ${all_elements} =    Get WebElements    css:.card-title
*** Keywords ***
opening browser with an application
    Open Browser    ${url}    ${browser}
    Maximize Browser Window