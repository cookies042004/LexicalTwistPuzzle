# 🧩 Lexical Twist Puzzle

![Java](https://img.shields.io/badge/Language-Java-blue.svg)
![OOPS](https://img.shields.io/badge/Design-OOPS-orange.svg)
![Architecture](https://img.shields.io/badge/Architecture-Modular-green.svg)
![Version](https://img.shields.io/badge/Version-8.0-brightgreen.svg)
![Status](https://img.shields.io/badge/Status-Completed-success.svg)

---

## 📌 Project Overview

**Lexical Twist Puzzle** is a console-based Java application that processes two words and performs logical transformations based on defined conditions.

The system progressively evolves from basic procedural logic to a **fully modular, OOPS-compliant architecture**.

It demonstrates:

- Input validation
- Reverse-word detection
- Conditional string transformation
- Vowel–consonant distribution analysis
- Rule-based character output
- Clean layered architecture

---

## 🏗 Final Architecture

```
LexicalTwistPuzzle  →  Input & Output
        ↓
WordValidator      →  Input Validation
        ↓
LexicalAnalyzer    →  Puzzle Logic
```

---

## 🧠 OOPS Principles Demonstrated

### ✔ Encapsulation
All puzzle-processing logic resides inside analyzer classes.

### ✔ Abstraction
Users interact only through public methods — internal logic remains hidden.

### ✔ Single Responsibility Principle

| Class | Responsibility |
|--------|---------------|
| `LexicalTwistPuzzle` | Input & Output |
| `WordValidator` | Input Validation |
| `LexicalAnalyzer` | Puzzle Logic |

### ✔ Modularity
Each feature is isolated and independently maintainable.

### ✔ Extensibility
New features can be added easily:
- Palindrome detection
- Anagram checking
- Pattern transformations
- Difficulty levels
- Strategy pattern integration

---

# 📚 Use Case Evolution

---

## ✅ UC1 – Display Puzzle Title
Basic program entry and static output.

## ✅ UC2 – Accept Word Inputs
Introduced `Scanner` for dynamic input.

## ✅ UC3 – Single Word Validation
Defensive programming and early return strategy.

## ✅ UC4 – Reverse Relationship Check
Efficient string reversal and case-insensitive comparison.

## ✅ UC5 – Word Transformation
Reverse + lowercase + vowel replacement (`@`).

## ✅ UC6 – Combine & Analyze
Uppercase merging and vowel–consonant counting.

## ✅ UC7 – Rule-Based Output
Print first 2 unique vowels or consonants using ordered filtering.

## ✅ UC8 – Fully Modular OOPS Architecture
Clean separation of:
- Input handling
- Validation
- Business logic

---

# 🛠 Technologies Used

- Java (Core)
- OOPS Principles
- Collections Framework (`LinkedHashSet`)
- StringBuilder
- Regular Expressions
- Defensive Programming

---

# ▶ How to Run

### 🔹 Compile
```
javac LexicalTwistPuzzle.java
```

### 🔹 Run
```
java LexicalTwistPuzzle
```

---

# 📷 Sample Execution

```
Enter first word: hello
Enter second word: world

First 2 unique Consonants: HL
```

---

# 🚀 Learning Outcomes

This project demonstrates:

- Progressive refactoring
- Clean architecture evolution
- Real-world separation of concerns
- Transition from procedural coding to modular OOPS design
- Maintainable and extensible software structure

---

# 📊 Version History

| Version | Description |
|----------|------------|
| 1.0 | Static display |
| 2.0 | Input acceptance |
| 3.0 | Validation |
| 4.0 | Reverse checking |
| 5.0 | Transformation |
| 6.0 | Distribution analysis |
| 7.0 | Rule-based output |
| 8.0 | Fully modular OOPS design |

---

# 👨‍💻 Developer

**Akhil Puri**

---

> This project reflects growth from simple console programming to structured software engineering design.
