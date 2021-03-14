package com.company.OOP_HW;

public class Device {
    Processor processor;
    Memory memory;

    public Device(Processor processor, Memory memory){
        this.processor = processor;
        this.memory = memory;
    }

    //  void save (String[] data) – сохранение в память всех элементов в массиве
    void save (String[] data){
        if (data.length < memory.memoryCell.length){
            throw new IllegalArgumentException("We are out of bounds");
        }
        for (int i = 0; i <= data.length; i++) {
            memory.memoryCell[i] = data[i];
        }
    }

   public String[] readAll() { // вычитка всех элементов из памяти, затем стирание данных
       String [] temp = new String[memory.memoryCell.length];
       for (int i = 0; i <= memory.memoryCell.length - 1; i++) {
           temp[i] = memory.memoryCell[i];
           memory.memoryCell [i] = null;
       } return temp;
   }

    public void dataProcessing() { // преобразование всех данных, записанных в памяти
        String [] ret = new String[memory.memoryCell.length];
        for (int i = 0; i <= memory.memoryCell.length - 1; i++) {
            ret[i] = memory.memoryCell[i].toUpperCase();
        } memory.memoryCell = ret;
    }

    String getSystemInfo() { // получение строки с информацией о системе (информация о процессоре, памяти)
        return "Processor: " + processor.getDetails() + "; " + "memory: " + memory.getMemoryInfo() + " %";
    }
}
