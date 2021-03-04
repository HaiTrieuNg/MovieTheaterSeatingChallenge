# MovieTheaterSeatingChallenge

My first thought was to fill the seats rows by rows
<br>pros: the theater can fill the most seat possible
<br>cons: unrealistic since in real life, users get to chose their seat. Therefore, the seat chosen will be random.
<br><br>
The thought of implement a program that simulate realistic behavior lead me to decide to work on a more complicated implementation - filling the seats randomly.
<br>pros: this is the situation in real life
<br>cons: the theater won't be as full. There might be empty seats.
<br><br>
To run the program on command line:
<br>
-cd to the program directory
<br>
-type: javac main.java
<br>
-type: java main "directory to your input file"
<br>
exp: java main "input.txt"
<br><br> 
s : available seats
<br>
X : taken seat (unavailable)
<br>
B : buffer seats (unavailable)
<br><br>
- Assumed that input file acts as user. Since real users don't chose the seats row by row, the program implemented random seat chosing behavior.
- Users that buy multiple tickets tend to sit together. The program assumed that each for each reservation, everyone seat next to each other on consecutive seats.
- Everytime seats are taken, the 3 seats on the right and 3 seats on the left of the party will become buffers to ensure safety.
- Since the seats are chosen randomly for each reservation to illustrate real customer behavior, many times there are more than 3 buffers between 2 customers. Even so, no one should seat between them to ensure safety.
- Rows from A to J
- Seats from 1 to 20
- Output file will be created as the program done executes in the same directory as the source code.
- Multiple runs will be written to the same output file once it created after the first time.
- Input file can be from any directory, doesn't have to be in the same file as the source code.
<br><br>

Under is an example of how the grid and output file looks like after running the program with input file :<br>
R001 2
<br>
R002 4
<br>
R003 4
<br>
R004 3
<br>

![Demo](https://github.com/HaiTrieuNg/Turing-Machine-TM-that-simulates-DFA/blob/main/Images/Screenshot%20(606).png)

![Demo](https://github.com/HaiTrieuNg/Turing-Machine-TM-that-simulates-DFA/blob/main/Images/Screenshot%20(605).png)
