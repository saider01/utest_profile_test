#Autor: SAider Lagares
  @stories
  Feature: Create a new user profile
    As a user, I want to create a nuw user profile in Utest page

  @scenario1
  Scenario: Create a new user
    Given that Carlos wanto to create a new user profile
    When he fill all forms to create a new user
    |name   |lastName |email          |birthMonth |birthDay|birthYear|city    |zipCode|country  |computer |version|language|mobile|model|system |password     |passwordConfirm|
    |Carlos | Marin   |cmarin@ddk.com |May        |9       |1987     |Medellin|051000 |Colombia |Linux    |Ubuntu |English |Xiaomi|Redmi|Android|Mysafe923#sw |Mysafe923#sw   |
    Then he find Complete Setup button