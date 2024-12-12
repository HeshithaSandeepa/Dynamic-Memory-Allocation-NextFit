package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Next-Fit Memory Allocation ---");

        // Input: Number of memory blocks
        int n = -1; // Initialize with an invalid value
        while (n <= 0) {
            System.out.print("Enter the number of memory blocks : ");
            //validation program prevent user enter negative or decimal
            try {
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("Error: Please enter a positive integer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a positive integer.");
                sc.next(); // Clear the invalid input
            }
        }

        // Initialize the allocator
        MemoryAllocator allocator = new MemoryAllocator();

        // Input: Sizes of memory blocks (validate positive integer)
        System.out.println("Enter the size of each memory block :");
        for (int i = 0; i < n; i++) {
            int size = -1;
            while (size <= 0) {
                System.out.print("Block " + (i + 1) + ": ");
                //validation program
                try {
                    size = sc.nextInt();
                    if (size <= 0) {
                        System.out.println("Error: Block size must be a positive integer");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input. Please enter a positive integer value");
                    sc.next(); // Clear invalid input
                }
            }
            allocator.addMemoryBlock(size);
        }

        // Menu for memory operations
        while (true) {
            System.out.println("\n1. Allocate Memory");
            System.out.println("2. Display Memory Blocks");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = -1;

            // Validate menu choice input
            while (choice < 1 || choice > 3) {
                try {
                    choice = sc.nextInt();
                    if (choice < 1 || choice > 3) {
                        System.out.println("Error: Please select a valid option (1-3).");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input. Please enter a valid option (1-3).");
                    sc.next(); // Clear invalid input
                }
            }

            switch (choice) {
                case 1:
                    // Input: Process size (validate for positive integer)
                    int processSize = -1;
                    while (processSize <= 0) {
                        System.out.print("Enter the size of the process to allocate: ");
                        try {
                            processSize = sc.nextInt();
                            if (processSize <= 0) {
                                System.out.println("Error: Process size must be a positive integer.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Invalid input. Please enter a positive integer.");
                            sc.next(); // Clear invalid input
                        }
                    }
                    allocator.allocateMemory(processSize);
                    break;

                case 2:
                    allocator.displayMemory();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
            }
        }
    }
}