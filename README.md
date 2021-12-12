<h1>TIC TAC TOE GAME USING MINIMAX ALGORITHM</h1>
<br>
<b>Welcome to my Tic Tac Toe Android App. This is a super cool Tic Tac Toe app for android that is impossible to beat.
This game would be impossible to beat because we are going to use the Artificial Intelligence here.</b><br><br>

<h2><b>Some ScreenShots of App 😍😍</b></h2><br>


<div>
  <img width="150" src="https://user-images.githubusercontent.com/85172635/145696807-3d011c7e-9137-4e63-bd4b-0ca0e3a50b33.jpg"/>
  
 <img width="150" src="https://user-images.githubusercontent.com/85172635/145696940-c6bcba58-6872-49b9-8a50-652ecaa22384.jpg"/>
 
 <img width="150" src="https://user-images.githubusercontent.com/85172635/145697208-7168783b-174c-4e69-b1ad-078d3c77063c.jpg"/>
 
 <img width="150" src="https://user-images.githubusercontent.com/85172635/145697211-1ea97ebc-474b-4b06-8c7a-da4257e2d6fe.jpg"/>
</div>
<br>
<h2><b>What is MiniMax Algorithm 🤔</b></h2><br>
<b>The Minimax algorithm uses backtracking to recursively find the next best move by assigning a value to each board configuration
and evaluating each of these configurations using a heuristic evaluation function. In the vanilla implementation of MiniMax (MiniMax.java) 
the evaluation function returns a heuristic value for terminal nodes and nodes at the predetermined maximum search depth but the heuristic only 
takes into account winning, losing and draw configurations returning +10 for winning configurations, -10 for losing and 0 for a draw which slightly 
hinders the performance of the algorithm in terms of time to win, this is addressed in MiniMaxImproved.

This implementation also explores every possible board configuration it can, even when it is redundant to do so resulting in a time complexity of O(b^d) 
where b is how many legal moves there are from a board configuration (i.e. the branching factor of the game tree) and d is the maximum depth of the tree, 
this inefficiency is addressed with the Alpha-Beta optimisation.</b>


