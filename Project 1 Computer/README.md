# OMD Project 1 Computer
![alt text](img/figure4.png "Title Text")

Sequence diagram
"new Add(n, wf.word("-1"), n)"
![alt text](img/figure5.png "Title Text")



Förberedelseuppgifterna:

O1: Vad är en Address egentligen? Försök svara så precist som möjligt.
En adress refererar till en plats i vår dators minne. I adressen finns referenspunkter (som exempelvis en nyckel i en ‘nyckel-värde’ tabell) till ord. Dessa referenspunkter finns för att nå data i minnet. 
An address is a reference to a place in our computer's memory. In the address there’s a reference point (for example a key in a ‘key-value’ table) to a word. These reference points are there so that we can access specific data from our memory.

O2: Vilken information behövs för att hämta värdet på en adress?
För att hämta värdet på en adress behöver vi ha indexet av adressen 
To access the value of an address we need to know the index of said address.

O3: Vilken är typen på de tre parametrar vi skickar in när vi skapar ett Add-objekt
 Word/address for the first two parameters and the third is always an address
 Parameters will be (operand, operand, adress)

O4: See figure 1.
here we’re talking about modelling Word and Address:

![alt text](img/figur1.png "Title Text")
Figure 1.

O5: See figure 2

Add

![alt text](img/figur2.png "Title Text")

Figure 2.
O6:  WordType, WordType, adress

W1:  LongWord, som lagrar sitt värde i en long, och därför kan hantera tal i intervallet -9223372036854775808..9223372036854775807
W2: In the class LongWord with method add().

W3: Add is declared in the Word class

W4: A generic type would have a specific type but we want a type that will be restricted. For example, longWord in the interaval -9223372036854775808..9223372036854775807.

W5: When adding sum and the word from address n, the new word is adressed at sum. 
Therefore we’ll overwrite the previous word on the address to be the “word+otherword”
       add(new Add(sum, n, sum));

W6: remove and perhaps undo

W7: runtime error

I1: See figure 3

![alt text](img/figur3.png "Title Text")
Figure 3.

I2: The subclasses to the super class ‘Instructions’ (Add, Halt, Print, Mul, Copy and JumpEq)

I3: We don’t keep track of the next instruction. The next instruction isn’t an instruction until it is the only instruction (?)

I4: The info that comes with the add method; address and word




P1: We devide it into hardware & software.
See figure 4

![alt text](img/figur4.png "Title Text")
Figure 4.
har jag besegrat git gudarna? svar: ja
