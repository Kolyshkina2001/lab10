package ru.mirea.Yana.lab10;

public class Client implements Chair{
    Chair chair;
    void sit(){
        System.out.println("Сижу на "+ chair);
    }
    void setChair(Chair chair){
        this.chair = chair;
    }
}
