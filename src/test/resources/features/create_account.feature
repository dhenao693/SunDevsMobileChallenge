  #language: en
  Feature: Create account


    Scenario Outline: Create account successfull
      Given "Daniel" is on cinemark app
      When he registers in the app
        | name   | lastName   | personType   | email   | phone   | address   |
        | <name> | <lastName> | <personType> | <email> | <phone> | <address> |
      Then see register confirmation

      Examples:
        | name   | lastName | personType | email              | phone      | address            |
        | Daniel | Henao    | Natural    | dhenao@yopmail.com | 3181234567 | Calle siempre viva |
