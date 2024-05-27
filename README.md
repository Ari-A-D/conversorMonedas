<h1 align="center"> Conversor de Monedas </h1>
<p align="center">
  <img alt="Java badge" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white">
  <img alt="Intellig badge" src="https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white">
</p>

<h2>Descripción</h2>
<p>El programa posee un menú donde se selecciona entre siete opciones, una de las cuales corresponde a salir del sistema. El mismo convierte el valor de una moneda base de referencia a su equivalente en otro tipo de valuación para otros países</p>

<h2>Lógica</h2>

<p>El programa posee tres clases. La primera es un objeto modelo de moneda, que tiene como atributo la moneda base (código de la moneda) y un diccionario con los coeficientes de conversión para otros tipos de monedas. Esta clase tiene dos métodos: uno para buscar otra moneda y convertirla, y otro que es el conversor mismo.</p>

<p>La segunda clase, llamada main, es un menú de selección para la conversión. Esta clase tiene constructores desde la clase de conversión, que utiliza el modelo de moneda para llamar a los atributos necesarios desde la API. Una vez declarados estos elementos, la moneda se transforma a otra denominación y valor, y se envía al menú en forma de mensaje con el nuevo valor y denominación asignada.</p>
