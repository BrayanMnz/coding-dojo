# Coding Dojo 

### Kata - [Roman Numerals](https://codingdojo.org/kata/RomanNumerals/)

#### Casos de prueba

##### Happy path 

- Digitar el número 499 (debe mostrarse el número romando CDXCIX)

##### Non-happy path

- Digitar aleatoriamente 10 números negativos debería arrojar un [IllegalArgumentException](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalArgumentException.html) las 10 veces. 

- Digitar aleatoriamente 10 números mayores a 3999 debería arrojar un [IllegalArgumentException](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalArgumentException.html) las 10 veces.

- Digitar un cero debería arrojar un [IllegalArgumentException](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalArgumentException.html).

#### Diseño del componente

- RomanNumberConverter:
    - Va a tener un private constructor
    - Va a tener un método estático que permita hacer la conversión, llamado: String fromArabic (int value)
