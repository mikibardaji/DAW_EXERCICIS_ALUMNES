# Exercicis casa


# Exercici: Caixa Registradora amb Bloqueig de Seguretat

Escriu un programa en Java per a una caixa registradora que sumi els preus dels productes que l'usuari va introduint per consola. Per demanar el número, no ho farem amb `nextDouble()`, s'ha de demanar amb `nextLine()` i transformar el `String` amb la instrucció `Double.parseDouble(entrada)`.

## Requisits

* **Ús d'un bucle:** El programa ha de demanar preus (`double`) i anar-los sumant a un total. El bucle funcionarà normalment mentre no es fiqui `0`.
* **Condició de sortida normal:** Si l'usuari introdueix un `0`, el bucle finalitza correctament i es mostra el total de la compra.
* **Captura d'excepcions i sortida forçada:** Si l'usuari fica un text no vàlid (per exemple, `"gratis"` o `"hola"`), el programa ha de capturar l'excepció `NumberFormatException`. En aquest moment, s'ha de mostrar un missatge crític (`"Error de format. Operació cancel·lada per seguretat."`) i el bucle s'ha d'interrompre.
* **Resultat final:** Tant si el bucle acaba normalment (amb un `0`) com si es trenca per l'excepció, el programa ha de mostrar el total acumulat fins a aquell moment.



# Exercici Pràctic: Crea un Programa amb Intel·ligència Artificial (IA)

## 📌 Objectiu de l'exercici
L'objectiu és utilitzar tot el que has après fins ara a classe per dissenyar i programar una aplicació que trobis **interessant**. No cal que sigui excessivament complexa, però sí que ha de fer càlculs o accions útils que, en un futur (afegint-hi una interfície web o mòbil), puguin funcionar com una aplicació real.

---

## 🛠️ Requisits Tècnics (Què es pot fer servir?)
Com que encara falta teoria per veure, està totalment **prohibit** utilitzar conceptes avançats que no s'hagin explicat a classe. El teu programa s'ha de basar exclusivament en:
* `Scanner` (per a l'entrada de dades)
* `Random` (per a generar valors aleatoris)
* Estructures condicionals (`if` / `switch`)
* Bucles (`for` / `while` / `do-while`)
* Gestió d'excepcions (`try-catch`)

*Nota: No cal que surti tot lo que hi ha aquí*

---

## 📂 
Has de pujar un **únic lliurament** que inclogui els dos elements següents:

1. **Document de la interacció amb la IA:** Un fitxer (PDF o Word) on es mostri **TOTA** la conversa fins al resultat final.
2. **El fitxer de codi font:** El fitxer original amb l'extensió `.java` del programa definitiu.
