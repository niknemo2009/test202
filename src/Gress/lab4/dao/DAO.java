/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gress.lab4.dao;

import java.util.ArrayList;

/**
 *
 * @author Anastasiia Hress
 */
public interface DAO<T, T1> {
    boolean create(T t);
    T get(String str);
    void update (T t, T1 t1);
    boolean delete (T t);
    ArrayList<T> getAll();
}
