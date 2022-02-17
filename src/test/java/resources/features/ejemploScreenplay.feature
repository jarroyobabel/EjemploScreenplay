@Autor Jose Arroyo


  Feature: Realizar compras de artículos
    Como un nuevo cliente
    Quiero ingresar a la página www.abc.com
    para realizar una compra de artículo

  Scenario Outline: Agregar artículos al carrito de compras
    Given Que un nuevo cliente accede hasta la web de compras
    When el agrega productos al carrito
        |<nombreProducto>|<cantidad>|
    Then el ve los productos listados en el carrito de compras

    Examples:
    |nombreProducto|cantidad|
    |tapabocas n95 |100     |