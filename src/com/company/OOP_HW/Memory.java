package com.company.OOP_HW;

public class Memory {

    String[] memoryCell;
    int lastIndex = memoryCell.length - 1;

    public Memory(){
        memoryCell = null;
    }

    String readLast(String[] memoryCell) {
        int i;
        for (i = memoryCell.length - 1; i >= 0; i--) {
            if (memoryCell[i] != null) {
                break;
            }
        } return memoryCell[i];
    }

    String removeLast(String[] memoryCell){
        return memoryCell[lastIndex] = "null";
    }

    boolean save(String string){
        for (int i = memoryCell.length - 1; i >= 0; i--) {
            if (memoryCell[i] == null) {
                memoryCell[i] = string;
                return true;
            }
        } return  false;
    }

    //getMemoryInfo() – возвращает объект, состоящий из двух полей:
    // общий объём памяти (количество доступных ячеек), занятый объём памяти (в процентах).
    class MemoryInfo{

        MemoryInfo(){
            int totalMemory = memoryCell.length;
            counterFields();
        }

        int counterFields() {
            int occupiedMemory;
            int elementCounter = 0;
            for (int i = 0; i <= memoryCell.length - 1; i++) {
                if (memoryCell[i] != null) {
                    elementCounter++;
                }
            }
           return occupiedMemory = (elementCounter / memoryCell.length) * 100;
        }
    }

    MemoryInfo getMemoryInfo(){
        MemoryInfo memoryInfo = new MemoryInfo();
        return  memoryInfo;
    }


}
