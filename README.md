# SudokuSolver
# Christmas 2019 Project: Sudoku Solving Algorithm Visualizer. 
<img width="602" alt="Capture" src="https://user-images.githubusercontent.com/59344613/71601773-c8b18a80-2b09-11ea-9723-29b9b2934afd.PNG">

To begin this project, I created an algorithm to generate a valid Sudoku board. This works by using a 9x9 2D array. Each cell has a 25% chance that a value will populate it, and that value is checked for legality in the vertical row, horizontal collum, and the 3x3 block it resides in. 

<img width="602" alt="Capture2" src="https://user-images.githubusercontent.com/59344613/71601978-c996ec00-2b0a-11ea-98a7-f9623da74cac.PNG">

I then implemented a recursive backtracking algorithm to solve the Sudoku board. This reccursive algorithm works by finding the first empty space on the board, filing it with '1', then continuing to the next empty space. It will try '1', then see that it is not legal and try '2'. This will go on until it can no longer find a legal value to place in the empty space. When this occurs, it will backtrack to the immediate previous block, increase the value until it is legal, then move onwards again.

<img width="602" alt="Capture3" src="https://user-images.githubusercontent.com/59344613/71602049-1aa6e000-2b0b-11ea-88e2-7872966fe02c.PNG">

Used JavaFX to create a clean GUI to visualize the algorithm.

