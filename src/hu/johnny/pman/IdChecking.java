/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.johnny.pman;

/**
 *
 * @author johnny
 */
public class IdChecking {
    public static void main(String[] args) {
        MrPoliceman pMan = new MrPoliceman();
        pMan.setFeeling(Feeling.ANGRY);
        pMan.IdCheck();
    }
}
