# Exercicis casa


# Exercici: Caixa Registradora amb Bloqueig de Seguretat

Escriu un programa en Java per a una caixa registradora que sumi els preus dels productes que l'usuari va introduint per consola. Per demanar el número, no ho farem amb `nextDouble()`, s'ha de demanar amb `nextLine()` i transformar el `String` amb la instrucció `Double.parseDouble(entrada)`.

## Requisits

* **Ús d'un bucle:** El programa ha de demanar preus (`double`) i anar-los sumant a un total. El bucle funcionarà normalment mentre no es fiqui `0`.
* **Condició de sortida normal:** Si l'usuari introdueix un `0`, el bucle finalitza correctament i es mostra el total de la compra.
* **Captura d'excepcions i sortida forçada:** Si l'usuari fica un text no vàlid (per exemple, `"gratis"` o `"hola"`), el programa ha de capturar l'excepció `NumberFormatException`. En aquest moment, s'ha de mostrar un missatge crític (`"Error de format. Operació cancel·lada per seguretat."`) i el bucle s'ha d'interrompre.
* **Resultat final:** Tant si el bucle acaba normalment (amb un `0`) com si es trenca per l'excepció, el programa ha de mostrar el total acumulat fins a aquell moment.

# Exercici amb IA

Amb tot el que has apres fins ara, intenta fer un programa interessant per tu, no cal que sigui super complex, però que faci o calculi algunes coses interessants.
Que creguessiu que (amb capes de app mobil o web) podria funcionar. 
Pero sol pot sortir coses fetes a classe (Random, Scanner, if's ,swtich, bucles, Exceptions). 
Tampoc podeu fer meravelles, perque encara us falta molta teoria, pero algo que sigui interessant, bonic. 
S'ha de pujar , el document amb TOTA la interacció de la ia, com l'aneu modificant, i el fitxer final de JAVA.
