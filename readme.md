#Next-Fit Memory Allocation

This project demonstrates the Next-Fit memory allocation algorithm using Java. The Next-Fit algorithm is a variation of the First-Fit algorithm, designed to allocate memory blocks to processes efficiently.

##Features

Dynamic Memory Management: Allocate and deallocate memory blocks using the Next-Fit approach.

Validation: Ensures user inputs (e.g., memory block sizes and process sizes) are positive integers.

User-Friendly Interface: Menu-driven console application for ease of use.

## Classes and Responsibilities

### 1. MemoryBlock

Manages the size of individual memory blocks.

Provides methods to:
Get the current size of a memory block.
Allocate memory to processes by reducing the block size.

### 2. MemoryAllocator

Implements the Next-Fit memory allocation algorithm.
Tracks the last allocated memory block to optimize the search process.

Key functionalities:
Add memory blocks.
Allocate memory to processes.
Display the current state of memory blocks.

### 3. Main

Entry point of the program.
Handles user input, validates data, and interacts with MemoryAllocator.
Provides a menu-driven interface for:
Adding memory blocks.
Allocating memory to processes.
Viewing the current memory status.

##HOW TO RUN
1.Download the project folder

2.Use intelliJ IDEA 2021.1

3.Then go to Main.java file and run


