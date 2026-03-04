# Recursion

Recursion occurs when a function calls itself directly or indirectly to solve a problem.

---

## Base Condition

The **base case** is a stopping condition in recursive functions that prevents infinite recursion.

Without a base condition, the function would keep calling itself indefinitely and cause a **stack overflow error**.

---

## Recursive Stack Space

Each time a function calls itself, a new frame is added to the **function call stack**.  

The stack keeps track of the current function execution.

When the **base condition is met**, the recursion stops and the stack begins **unwinding**, returning the results in reverse order of the calls.

---

## Types of Recursion

### 1. Head Recursion
The function **waits for the recursive call to return before performing any operation**.

---

### 2. Tail Recursion
The **recursive call is the last operation** in the function.

---