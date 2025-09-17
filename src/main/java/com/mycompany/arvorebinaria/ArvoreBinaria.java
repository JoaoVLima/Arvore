/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arvorebinaria;

/**
 *
 * @author Lima
 */
public class ArvoreBinaria {
    private Node raiz;
    
    public ArvoreBinaria(){
        this.raiz = null;
    }
    
    boolean vazia(){
        return raiz==null;
    }
    
    boolean insere(int info){
        if (vazia()) {
            Node no = new Node();
            no.setInformacao(info);
            raiz = no;
            return true;
        } else {
            return insere(raiz, info);
        }
    }
    
    private boolean insere(Node raiz, int info){
        int raiz_info = raiz.getInformacao();
        if(info < raiz_info){
            Node esquerda = raiz.getEsquerda();
            if(esquerda!=null){
                insere(esquerda, info);
            }else{
                Node no = new Node();
                no.setInformacao(info);
                raiz.setEsquerda(no);
                return true;
            }
        }else{ // (info >= raiz_info)
            Node direita = raiz.getDireita();
            if(direita!=null){
                insere(direita, info);
            }else{
                Node no = new Node();
                no.setInformacao(info);
                raiz.setDireita(no);
                return true;
            }
        }
        return false;
    }
    
    void preOrdem(){
        if(vazia()){
            return;
        }
        System.out.print("[");
        preOrdem(raiz);
        System.out.println("]");
    }
    
    private void preOrdem(Node raiz){ // I,E,D
        if(raiz==null){
            return;
        }
        System.out.print(raiz.getInformacao()+",");
        preOrdem(raiz.getEsquerda());
        preOrdem(raiz.getDireita());
    }
    
    void inOrdem(){
        if(vazia()){
            return;
        }
        System.out.print("[");
        inOrdem(raiz);
        System.out.println("]");
    }
    
    private void inOrdem(Node raiz){ // E,I,D
        if(raiz==null){
            return;
        }
        inOrdem(raiz.getEsquerda());
        System.out.print(raiz.getInformacao()+",");
        inOrdem(raiz.getDireita());
    }
    
    void posOrdem(){
        if(vazia()){
            return;
        }
        System.out.print("[");
        posOrdem(raiz);
        System.out.println("]");
    }
    
    private void posOrdem(Node raiz){ // E,D,I
        if(raiz==null){
            return;
        }
        posOrdem(raiz.getEsquerda());
        posOrdem(raiz.getDireita());
        System.out.print(raiz.getInformacao()+",");
    }
    
    Node getMaior(){
        if (vazia()) {
            return null;
        } else {
            return getMaior(raiz);
        }
    }
    
    private Node getMaior(Node raiz){
        if(raiz==null){
            return raiz;
        }
        Node maior = null;
        Node direita = raiz.getDireita();
        if(direita!=null){
            maior = getMaior(direita);
        } else {
            return raiz;
        }
        return maior;
    }
    
    Node getMenor(){
        if (vazia()) {
            return null;
        } else {
            return getMenor(raiz);
        }
    }
    
    private Node getMenor(Node raiz){
        if(raiz==null){
            return raiz;
        }
        Node maior = null;
        Node esquerda = raiz.getEsquerda();
        if(esquerda!=null){
            maior = getMenor(esquerda);
        } else {
            return raiz;
        }
        return maior;
    }
    
    Node removeMaior(){ // ineficiente, mas to sem tempo
        Node maior = getMaior();
        return remove(maior.getInformacao());
    }
    
    Node removeMenor(){ // ineficiente, mas to sem tempo
        Node menor = getMenor();
        return remove(menor.getInformacao());
    }
    
    Node remove(int info){
        if (vazia()) {
            return null;
        } else {
            return remove(raiz, raiz, info);
        }
    }
    
    private Node remove(Node raiz, Node raiz_quadrada, int info){
        if(raiz==null){
            return null;
        }
        int raiz_info = raiz.getInformacao();
        if (info < raiz_info) {
            Node esquerda = raiz.getEsquerda();
            if (esquerda!=null){
                return remove(esquerda, raiz, info);
            }else{
                return null;
            }
            
        }else if (info > raiz_info){
            Node direita = raiz.getDireita();
            if (direita!=null){
                return remove(direita, raiz, info);
            }else{
                return null;
            }
        }else{ // (info == raiz_info)
            // removendo o no
            Node esquerda = raiz.getEsquerda();
            if(esquerda!=null){
                Node maior = getMaior(esquerda);
                maior.setDireita(raiz.getDireita());
                
                if(raiz_quadrada.getEsquerda()==raiz){
                    raiz_quadrada.setEsquerda(esquerda);
                }else{
                    raiz_quadrada.setDireita(esquerda);
                }
            }else{
                Node direita = raiz.getDireita();
                if(direita!=null){
                    raiz_quadrada.setEsquerda(direita);
                }else{
                    if(raiz_quadrada.getEsquerda()==raiz){
                        raiz_quadrada.setEsquerda(null);
                    }else{
                        raiz_quadrada.setDireita(null);
                    }
                }
            }
            return raiz;
        }
    }
    
}
