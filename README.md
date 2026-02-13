# 🧩 Lexical Twist Puzzle

## 📌 Application Overview

The **Lexical Twist Puzzle** is a console-based Java application that processes two words and performs transformations based on logical conditions.

The system:
- Validates input
- Checks reverse relationships
- Applies string transformations
- Analyzes vowel–consonant distribution
- Outputs rule-based results

The application evolves progressively from basic procedural logic to a **fully modular, OOPS-compliant architecture**.

---

# 📚 Use Case Evolution

---

## ✅ UC1: Display Puzzle Title

### 🎯 Goal
Display a static message indicating the purpose of the application.

### 👤 Actor
User

### 🔄 Flow
1. User runs the program
2. Program prints `"Lexical Twist Puzzle"`
3. Program exits

### 🧠 Key Concepts Used
- Class and `main()` method
- Print statements
- Program entry point

### ⚠ Drawbacks
- Not interactive
- No user input
- No puzzle logic
- Limited learning scope

➡ **Next Improvement:** Accept user inputs.

---

## ✅ UC2: Accept Word Inputs

### 🎯 Goal
Accept two words from the user for puzzle processing.

### 🧠 Key Concepts Used
- `Scanner` class
- User input handling
- Variable storage

### ⚠ Drawbacks
- No validation
- No logical processing
- Direct input handling in `main()`

➡ **Next Improvement:** Add input validation.

---

## ✅ UC3: Validate Single Word Constraint

### 🎯 Goal
Ensure each input contains only one word.

### 🔄 Flow
- Check for whitespace
- Reject multi-word input
- Stop execution safely

### 🧠 Key Concepts
- String validation
- Defensive programming
- Early return strategy

### ⚠ Drawbacks
- Validation inside `main()`
- Low readability
- Violates Single Responsibility Principle
- Hard to reuse

➡ **Next Improvement:** Extract validation logic into a separate class.

---

## ✅ UC4: Check Reverse Relationship

### 🎯 Goal
Determine if the second word is the reverse of the first word (case-insensitive).

### 🧠 Key Concepts
- `StringBuilder.reverse()`
- `equalsIgnoreCase()`
- Conditional branching

### ⚠ Drawbacks
- Reverse logic mixed with input handling
- `main()` becoming crowded
- Poor modularity
- Difficult to test

➡ **Next Improvement:** Separate business logic from input handling.

---

## ✅ UC5: Transform Word if Reverse Match

### 🎯 Goal
If reverse match:
- Reverse first word
- Convert to lowercase
- Replace vowels with `@`
- Output transformed word

### 🧠 Key Concepts
- String manipulation
- Regex replacement
- Character processing

### ⚠ Drawbacks
- Business logic tightly coupled
- Not reusable
- Hard to extend

➡ **Next Improvement:** Combine logic into structured processing methods.

---

## ✅ UC6: Combine Words if Not Reverse

### 🎯 Goal
If not reverse:
- Combine words
- Convert to uppercase
- Count vowels and consonants

### 🧠 Key Concepts
- String concatenation
- `toUpperCase()`
- Character classification

### ⚠ Drawbacks
- Counting logic embedded in flow
- Hard to maintain
- Multiple responsibilities

➡ **Next Improvement:** Introduce rule-based output handling.

---

## ✅ UC7: Output Based on Vowel–Consonant Count

### 🎯 Goal
Print characters based on distribution rules.

### 🔄 Flow
- If vowels > consonants → Print first 2 unique vowels
- If consonants > vowels → Print first 2 unique consonants
- If equal → Print equality message

### 🧠 Key Concepts
- Ordered filtering
- Duplicate removal
- Conditional logic
- `LinkedHashSet` for order preservation

### ⚠ Drawbacks
- Logic still partially coupled
- Limited abstraction

➡ **Next Improvement:** Fully modular OOPS-compliant architecture.

---

## ✅ UC8: Fully Modular & OOPS-Compliant Puzzle System

### 🎯 Goal
Deliver a clean, reusable, and extensible puzzle analyzer.

### 🔄 Flow
1. Inputs collected in `main()`
2. Validation handled in `WordValidator`
3. Business logic handled in `LexicalAnalyzer`
4. Result displayed cleanly

---

# 🏗 Final Architecture

```
LexicalTwistPuzzle  →  Input & Output
        ↓
WordValidator      →  Input Validation
        ↓
LexicalAnalyzer    →  Puzzle Logic
```

---

# 🧠 OOPS Principles Demonstrated

## ✔ Encapsulation
All string-processing logic resides inside analyzer classes.

## ✔ Abstraction
Users interact through method calls without knowing internal implementation.

## ✔ Single Responsibility Principle

| Class | Responsibility |
|--------|---------------|
| LexicalTwistPuzzle | Input & Output |
| WordValidator | Input Validation |
| LexicalAnalyzer | Puzzle Logic |

## ✔ Modularity
Each feature is isolated and independently maintainable.

## ✔ Reusability
Logic can be reused in:
- Web applications
- APIs
- GUI versions

## ✔ Extensibility
New features can be added easily:
- Palindrome detection
- Anagram checking
- Pattern transformations
- Difficulty levels
- Strategy pattern integration

---

# 🛠 Technologies Used

- Java
- OOPS Principles
- Collections Framework (`LinkedHashSet`)
- StringBuilder
- Regex
- Defensive Programming

---

# ▶ How to Run

1. Compile:
   ```
   javac LexicalTwistPuzzle.java
   ```

2. Run:
   ```
   java LexicalTwistPuzzle
   ```

---

# 🚀 Learning Outcome

This project demonstrates:

- Progressive software evolution
- Refactoring techniques
- Clean architecture design
- Transition from procedural to OOPS design
- Real-world system structuring approach

---

# 📌 Version History

| Version | Description |
|----------|------------|
| v1.0 | Static display |
| v2.0 | Input acceptance |
| v3.0 | Validation added |
| v4.0 | Reverse checking |
| v5.0 | Transformation logic |
| v6.0 | Distribution analysis |
| v7.0 | Rule-based output |
| v8.0 | Fully modular OOPS design |

---

# 🎯 Final Note

The Lexical Twist Puzzle demonstrates how a simple console program can evolve into a structured, modular, and maintainable system using proper design principles.

This project reflects growth from basic coding to structured software engineering design.
