/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task29lab2;

/**
 *
 * @author Ася
 */
public interface IVisitor {
    boolean GetAble(Schoolkid a);
    boolean GetAble(Pensioner a);
    boolean GetAble(Student a);
}
