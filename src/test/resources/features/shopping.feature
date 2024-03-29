  #language: en
  Feature: Shopping


    Scenario Outline: Buy tickets
      Given "Daniel" is on cinemark app
      When he login in app from profile
        | name    | lastName | personType | email                    | phone      | address | gender    | birthdate  | documentType         | documentNumber | city                | preferredTheater | password  |
        | usuario | login    | Natural    | usuariologin@yopmail.com | 3189876543 | prueba  | Masculino | 16/12/1994 | Cédula de Ciudadanía | 987654321      | BOGOTA D.C., BOGOTÁ | Lab v5 Floresta  | Prueba123 |
      And he buys some seats to the movie
        | number   | installments   | country   | type   |
        | <number> | <installments> | <country> | <type> |
      Then see the confirmation payment

      Examples:
        | number           | installments | country  | type       |
#        | 36213800000009   | 1            | Brasil   | CENARES    |
        | 5247081012761500 | 1            | Colombia | DAVIVIENDA |
#        | 5256780000000007 | 1            | Mexico   | MASTERCARD |
#        | 5455040000000005 | 1            | Panama   | MASTERCARD |
#        | 377753000000009  | 1            | Peru     | AMEX       |



