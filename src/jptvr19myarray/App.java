/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19myarray;

import java.util.Random;

/**
 *
 * @author pupil
 */
class App {
    public void run(){
        System.out.println("Hello");
        System.out.println("Создать массив типа int с названием myArray c 20 ячейками");
        int myArray[] = new int[20];
        System.out.println("Заполнить массив случайными значениями в диапазоне от 0 до 49");
        Random random = new Random();
        for(int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(49-0+1)-0;
        }
        System.out.println("Ввести значения массива на экран");
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + ",");
        }
        System.out.println();
        
    }
}
