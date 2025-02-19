# Types of Backtracking
Decision=> means finding a single solution to the problem
Optimization=> means better performance and reduce memory usage when dealing with large datasets with large memory
Enumeration=> means list karna
Backtracking is a general algorithmic technique that involves exploring all possible solutions to a problem by systematically searching through the solution space. It is often used for problems where the solution can be represented as a sequence of decisions, and the goal is to find a valid solution or all valid solutions. Backtracking can be categorized into three main types based on the nature of the problem:

# 1.Decision Problems
Objective: Determine whether a valid solution exists for the given problem.

Approach: The algorithm explores the solution space to find at least one valid solution. If a valid solution is found, it returns "true" or "yes"; otherwise, it returns "false" or "no."

Examples:

N-Queens Problem: Determine if it's possible to place N queens on an N×N chessboard such that no two queens threaten each other.

Sudoku Solver: Check if a given Sudoku puzzle has a valid solution.

Subset Sum Problem: Determine if there exists a subset of a given set of numbers that adds up to a target sum.

# 2.Optimization Problems
Objective: Find the best solution among all possible solutions, typically based on some criteria (e.g., minimizing or maximizing a value).

Approach: The algorithm explores the solution space to find the optimal solution. It may use pruning techniques to eliminate suboptimal paths early in the search.

Examples:

Knapsack Problem: Find the subset of items with the maximum total value that fits into a knapsack of limited capacity.

Traveling Salesman Problem (TSP): Find the shortest possible route that visits each city exactly once and returns to the origin city.

Job Scheduling: Assign jobs to machines in a way that minimizes the total completion time.

# 1. Enumeration Problems
Objective: Generate all possible valid solutions to the problem.

Approach: The algorithm systematically explores the entire solution space and lists all valid solutions.

Examples:

Permutations: Generate all possible permutations of a given set of elements.

Combinations: Generate all possible combinations of a given size from a set of elements.

Power Set: Generate all possible subsets of a given set.

All Solutions to N-Queens: Find all possible ways to place N queens on an N×N chessboard without conflicts.

Key Characteristics of Backtracking:
Incremental Construction: Solutions are built step-by-step, one decision at a time.

Pruning: Invalid or suboptimal paths are abandoned early to reduce the search space.

Recursion: Backtracking is often implemented using recursion to explore decision trees.

Backtracking Step: If a partial solution cannot be extended to a valid solution, the algorithm "backtracks" to the previous step and tries a different path.

Each type of backtracking problem (decision, optimization, enumeration) uses these characteristics but focuses on different goals: finding a single solution, the best solution, or all solutions, respectively.
