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
public class ContatoNaoExisteExecption extends Exception{
    private String nomeContato;

    public ContatoNaoExisteExecption(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    @Override
    public String getMessage() {
        return "Contato " + nomeContato + " não existe na agenda";
    }
}
