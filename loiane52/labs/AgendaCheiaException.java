/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jefferson.loiane52.labs;

/**
 *
 * @author Tijuaçu
 */
public class AgendaCheiaException extends Exception{
    @Override
    public String getMessage(){
        return "Agenda já está cheia";
    }
}
