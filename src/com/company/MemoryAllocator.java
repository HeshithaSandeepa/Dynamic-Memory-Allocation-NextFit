package com.company;

import java.util.ArrayList;

public class MemoryAllocator {
    private ArrayList<MemoryBlock> memoryBlocks; // ArrayList to manage memory blocks
    private int lastAllocatedIndex; // Pointer to the last allocated block

    // Constructor
    public MemoryAllocator() {
        memoryBlocks = new ArrayList<MemoryBlock>();
        lastAllocatedIndex = 0;
    }

    // Add a new memory block
    public void addMemoryBlock(int size) {
        memoryBlocks.add(new MemoryBlock(size));
    }

    // Allocate memory using the Next-Fit algorithm
    public void allocateMemory(int processSize) {
        int n = memoryBlocks.size();
        int start = lastAllocatedIndex;
        boolean allocated = false;

        // Search for a suitable block starting from the last allocated position
        for (int i = 0; i < n; i++) {
            int currentIndex = (start + i) % n; // Wrap-around logic
            MemoryBlock block = memoryBlocks.get(currentIndex);

            if (block.getSize() >= processSize) {
                System.out.println("Process allocated to block " + (currentIndex + 1));
                block.allocate(processSize); // Reduce the available size of the block
                lastAllocatedIndex = currentIndex; // Update last allocated pointer
                allocated = true;
                break;
            }
        }

        if (!allocated) {
            System.out.println("No suitable memory block found for the process!");
        }
    }

    // Display the current state of memory blocks
    public void displayMemory() {
        System.out.println("\nCurrent state of memory blocks:");
        for (int i = 0; i < memoryBlocks.size(); i++) {
            System.out.println("Block " + (i + 1) + ": " + memoryBlocks.get(i).getSize() + " KB");
        }
    }
}


