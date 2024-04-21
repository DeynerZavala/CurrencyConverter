#MoneyConverter

This is a simple currency converter program that allows users to convert between different currencies. It's built in Java and provides a command-line interface for user interaction.

##Features

- Converts between multiple currencies including ARS, BOB, BRL, CLP, COP, and USD.
- Allows users to input the amount they want to convert.
- Provides a list of currency conversion options for the user to choose from.
- Offers a user-friendly interface.
- Utilizes a currency conversion API to fetch real-time exchange rates.
- Utilizes BigDecimal for accurate currency conversions.

## Getting Started

To use the currency converter, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in your preferred Java development environment.
3. Run the `Main` class.

## Usage

Upon running the program, the user will be presented with a menu displaying the available currency conversion options. They can then choose a conversion by entering the corresponding number.

After selecting a conversion, the user will be prompted to enter the amount they want to convert. Once they enter the amount, the program will display the converted value.

## Currency Conversion API

This program uses an external API to fetch real-time exchange rates. The `CurrencyConverter` class in the `Api` package is responsible for making API requests and handling the responses.

### Endpoint API

The program accesses the API at the following endpoint:
https://v6.exchangerate-api.com/v6/{API_KEY}/pair/{FROM_CURRENCY}/{TO_CURRENCY}

Replace `{API_KEY}`, `{FROM_CURRENCY}`, and `{TO_CURRENCY}` with the appropriate values.

## BigDecimal Conversion

The `MoneyConversor` class in the `Conversion` package utilizes `BigDecimal` for accurate currency conversions. This ensures precision when dealing with monetary values.

## Contributing

Contributions are welcome! If you find any issues or would like to suggest improvements, feel free to open an issue or submit a pull request.


*****************************************************************************************************************************************************************

#Conversor de dinero

Este es un programa de conversión de moneda simple que permite a los usuarios convertir entre diferentes monedas. Está integrado en Java y proporciona una interfaz de línea de comandos para la interacción del usuario.

##Características

- Convierte entre múltiples monedas, incluidas ARS, BOB, BRL, CLP, COP y USD.
- Permite a los usuarios ingresar la cantidad que desean convertir.
- Proporciona una lista de opciones de conversión de moneda para que el usuario elija.
- Ofrece una interfaz fácil de usar.
- Utiliza una API de conversión de moneda para obtener tipos de cambio en tiempo real.
- Utiliza BigDecimal para conversiones de moneda precisas.

## Empezando

Para utilizar el conversor de moneda, siga estos pasos:

1. Clona el repositorio en tu máquina local.
2. Abra el proyecto en su entorno de desarrollo Java preferido.
3. Ejecute la clase "Principal".

## Uso

Al ejecutar el programa, se presentará al usuario un menú que muestra las opciones de conversión de moneda disponibles. Luego pueden elegir una conversión ingresando el número correspondiente.

Después de seleccionar una conversión, se le pedirá al usuario que ingrese la cantidad que desea convertir. Una vez que ingresen el monto, el programa mostrará el valor convertido.

## API de conversión de moneda

Este programa utiliza una API externa para obtener tipos de cambio en tiempo real. La clase `CurrencyConverter` en el paquete `Api` es responsable de realizar solicitudes de API y manejar las respuestas.

### API de punto final

El programa accede a la API en el siguiente punto final:
https://v6.exchangerate-api.com/v6/{API_KEY}/pair/{FROM_CURRENCY}/{TO_CURRENCY}

Reemplace `{API_KEY}`, `{FROM_CURRENCY}` y `{TO_CURRENCY}` con los valores apropiados.

## Gran conversión decimal

La clase `MoneyConversor` del paquete `Conversion` utiliza `BigDecimal` para realizar conversiones de moneda precisas. Esto garantiza la precisión al tratar con valores monetarios.

## Contribuyendo

¡Las contribuciones son bienvenidas! Si encuentra algún problema o desea sugerir mejoras, no dude en abrir un problema o enviar una solicitud de extracción.

