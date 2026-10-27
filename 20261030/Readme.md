# Exercici de Programació: Ampliació del programa de compres

Completar l'exercici de Jean Piero amb una modificació inspirada en l'enunciat de l'Andreu.

## 1. Exercici base (fet a classe)
El programa ha de funcionar de la següent manera:
* **Entrada de dades:** Un bucle demana el producte que es vol comprar i el seu preu.
* **Continuïtat:** Després d'introduir-lo, demana si es volen contractar més serveis (**SÍ/NO**).
  * **Si es respon SÍ:** S'afegeixen més productes.
  * **Si es respon NO:** Se surt del bucle.
* **Sortida:** En sortir, el programa mostra:
  * El **total de diners** gastats (acumulat).
  * La **quantitat total** de productes comprats.

---

## 2. Ampliació sol·licitada
S'afegeix un sistema de crèdits i un menú de gestió:

* **Saldo inicial:** L'usuari comença amb un total de **500 crèdits**.
* **Menú principal:** Dins del bucle, es mostra un menú amb tres opcions:
  1. **Ingressar diners**
  2. **Comprar producte**
  3. **Sortir**

### Funcionament de les opcions:

#### Opció 1: Ingressar diners
* Demana a l'usuari quants diners vol ingressar.
* Suma aquesta quantitat al saldo actual.

#### Opció 2: Comprar producte
* Funciona igual que l'exercici base, però amb una **restricció de saldo**:
  * **S'accepta la compra:** Només si el saldo actual és superior o igual al preu del producte. En aquest cas, es realitza la compra i s'actualitza el saldo (es resta el preu).
  * **Es denega la compra:** Si el saldo és insuficient, es mostra un avís i no s'afegeix el producte.

#### Opció 3: Sortir
* Pregunta a l'usuari: *"Vols sortir? (SÍ/NO)"*.
* Si es confirma la sortida, es mostren els totals acumulats (diners gastats i articles) .
