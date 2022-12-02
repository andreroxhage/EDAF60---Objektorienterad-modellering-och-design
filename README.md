# EDAF60---Objektorienterad-modellering-och-design
Lunds tekniska högskola: EDAF60 Objektorienterad modellering och design. Projekt 1 Computer &amp; Projekt 2 XL. 


![Alt Text](https://media3.giphy.com/media/ule4vhcY1xEKQ/giphy.gif?cid=ecf05e47ekzqgrepuljbomr4vn9qx9yqv98dsod8qe3f62vu&rid=giphy.gif&ct=gif)

For further improvement:
Project 1
- You may move the Instruction interface and the Program class to the hardware package
** The main point here is to organize packages logically as well as avoid circular dependencies between packages
- You can further create sub-packages for BW, LW and their respective factories
- You can create a BinOp super class for Add and Mul

Project 2
- Chained/indirect reference case: you may think about how to handle cases properly in which the value of the referenced cell (indirectly referenced in a division formula) is changed to make the denominator become 0, e.g.(also in the screenshot below), a3 = 1/(3-a2), a2=1+a1 where a1 is changed from 1 to 2
