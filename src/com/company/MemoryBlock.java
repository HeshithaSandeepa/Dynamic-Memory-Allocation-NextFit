package com.company;

public class MemoryBlock {
    private int size;

    public MemoryBlock(int size) {
        this.size = size;
    }

    // Get the current size of the memory block
    public int getSize() {
        return size;
    }

    // Allocate memory by reducing the block size
    public void allocate(int processSize) {
        if (processSize <= size) {
            size -= processSize;
        }
    }
}
