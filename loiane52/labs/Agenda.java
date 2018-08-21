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
public class Agenda {
    private Contato[] contatos;
    
    public Agenda(){
        contatos = new Contato[5];
    }
    
    public void adicionarContato(Contato c) throws AgendaCheiaException{
        
        boolean cheia = true;
        for (int i=0; i<contatos.length; i++){
            if (contatos[i] == null){
                contatos[i] = c;
                cheia = false;
                break;
            }
        }

        if (cheia){
            throw new AgendaCheiaException();
        }
    }
    
    public int consultaContatoPorNome(String nome) throws ContatoNaoExisteExecption{
        
        for (int i=0; i<contatos.length; i++){
            if (contatos[i] != null){
                if (contatos[i].getNome().equalsIgnoreCase(nome)){
                    return i;
                }
            }
        }
        throw new ContatoNaoExisteExecption(nome);
    }

    @Override
    public String toString() {
        String s = "";
        for (Contato c : contatos){
            if (c != null){
                s += c.toString() + "\n";
            }
        }
        return s;
    }
}
