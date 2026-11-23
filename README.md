# U3-ejercicio18
# 🚰 Tanque de Reserva de Agua y Control de Niveles

Ejercicio de **Programación Orientada a Objetos en Java** que modela un tanque de agua industrial aplicando el principio de **encapsulamiento**. El nivel actual es privado, se lee únicamente mediante un getter y solo puede modificarse con operaciones de llenado y consumo que garantizan que nunca baje de cero ni supere la capacidad máxima.

## 🎯 Objetivo

Proteger la integridad de un tanque de reserva regulando sus operaciones de llenado y vaciado, de modo que el nivel de agua se mantenga siempre entre 0 y la capacidad establecida.

## ✨ Características

- Atributos privados: `capacidadMaxima` y `nivelActual`.
- `llenar(double litros)`: llena hasta la capacidad máxima e informa los litros desbordados si hay excedente.
- `consumir(double litros)`: descuenta agua solo si hay suficiente disponible, sin permitir niveles negativos.
- Rechazo de valores negativos, cero, `NaN` e infinitos.
- Sin setter de nivel: la lectura se hace exclusivamente con `getNivelActual()`.
- Constructor que valida la capacidad y el nivel inicial.
- Estado general con el nivel y el porcentaje de llenado.

## 📚 Conceptos aplicados

Encapsulamiento · Modificadores de acceso · Getters · Validación de datos · Límites operativos · Constructores · Métodos privados

![U3 ejercicio18](U3%20ejercicio18.png)
