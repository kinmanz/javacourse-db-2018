package com.db.strategy;

/**
 * Created by Evegeny on 25/08/2017.
 */
public interface Father {
   default void speak(){
       System.out.println("сынок иди кушать");
   }
}
