# Conversor de Monedas en Java 💱

Este proyecto es una aplicación de consola escrita en Java que permite convertir valores entre diferentes monedas utilizando la API pública de [ExchangeRate-API](https://www.exchangerate-api.com/).

## 🚀 Características

- Interfaz de menú interactiva desde la consola.
- Conversión entre:
  - Dólar (USD) ↔ Peso Argentino (ARS)
  - Dólar (USD) ↔ Real Brasileño (BRL)
  - Dólar (USD) ↔ Peso Colombiano (COP)
- Validación de entradas (números y opciones del menú).
- Consulta en tiempo real de tasas de cambio desde la API.
- Resultados redondeados a dos decimales.

## 🧰 Tecnologías utilizadas

- Java SE
- [ExchangeRate-API](https://www.exchangerate-api.com/)
- Biblioteca externa: [Gson](https://github.com/google/gson) (para manejar JSON)

## 🏗️ Estructura del proyecto

```
src/
├── ConversorMonedas.java          # Archivo principal unificado
└── gson-2.13.1.jar                # Biblioteca externa para parseo JSON
```

## 🔧 Requisitos

- Java JDK 8 o superior
- Conexión a Internet (para hacer peticiones a la API)
- Biblioteca `gson-*.jar` añadida al classpath

## 🛠️ Cómo ejecutar

1. Clona o descarga el repositorio.

2. Asegúrate de tener la biblioteca Gson en tu proyecto. Puedes descargarla desde [Gson Releases](https://github.com/google/gson/releases).

3. Compila y ejecuta el archivo:

```bash
javac -cp gson-2.13.1.jar ConversorMonedas.java
java -cp ".;gson-2.13.1.jar" ConversorMonedas
```

> En Linux/Mac reemplaza `;` por `:` en el classpath.

## 🗝️ API Key

Este proyecto usa ExchangeRate-API. Para que funcione correctamente necesitas tu propia API Key:

1. Regístrate en: https://www.exchangerate-api.com/
2. Reemplaza tu clave en el archivo `ConsultarCambioMoneda` (línea 104 aprox.):

```java
String apiKey = "TU_API_KEY";
```

## 🧪 Ejemplo de uso

```
***************************************************
Sea bienvenido al conversor de monedas

1) Dólar =>> Peso Argentino
2) Peso Argentino =>> Dólar
...
Elija una opción: 1
Ingrese la cantidad a convertir: 100
100.00 USD = 135000.00 ARS
```

## 📦 Licencia

Este proyecto es de uso libre para fines educativos.

---

👨‍💻 Desarrollado por: Angel Chira
