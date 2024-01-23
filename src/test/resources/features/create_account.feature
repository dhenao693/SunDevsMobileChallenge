  #language: en
  Feature: Create account


    Scenario Outline: Create account successfull
      Given "Daniel" is on cinemark app
      When he registers in the app
        | <name> | <lastName> | <otros> |
        |        |            |         |
      Then see register confirmation

      Examples:
        | name   | lastName | otros |
        | Daniel | Henao    |       |
      ##When El usuario elige el producto <producto> la manera de entrega <modoPedido> y la tienda de preferencia <lugarPedido>
