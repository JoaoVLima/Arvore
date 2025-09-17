/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arvorebinaria;

/**
 *
 * @author Lima
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==== ArvoreBinaria ====");
        ArvoreBinaria arvore = new ArvoreBinaria();
        
        int[] itemsInsercao = {14,4,3,9,7,5,4,5,9,15,14,18,16,17,20};
        
        System.out.println("Inserindo items nessa ordem:\t[14,4,3,9,7,5,4,5,9,15,14,18,16,17,20]");
        for(int item : itemsInsercao){
            arvore.insere(item);
        }
        
        System.out.println();
        
        System.out.println("Impressao em PreOrdem Esperada:\t[14,4,3,9,7,5,4,5,9,15,14,18,16,17,20]");
        System.out.print("Impressao em PreOrdem Obtida:\t");
        arvore.preOrdem();
        
        System.out.println("Impressao em inOrdem Esperada:\t[3,4,4,5,5,7,9,9,14,14,15,16,17,18,20]");
        System.out.print("Impressao em inOrdem Obtida:\t");
        arvore.inOrdem();
        
        System.out.println("Impressao em posOrdem Esperada:\t[3,4,5,5,7,9,9,4,14,17,16,20,18,15,14]");
        System.out.print("Impressao em posOrdem Obtida:\t");
        arvore.posOrdem();
        
        System.out.println();
        
        System.out.print("Removendo o item: ");
        System.out.println(arvore.remove(20).getInformacao());
        
        System.out.println();
        
        System.out.println("Impressao em PreOrdem Esperada:\t[14,4,3,9,7,5,4,5,9,15,14,18,16,17]");
        System.out.print("Impressao em PreOrdem Obtida:\t");
        arvore.preOrdem();
        
        System.out.println("Impressao em inOrdem Esperada:\t[3,4,4,5,5,7,9,9,14,14,15,16,17,18]");
        System.out.print("Impressao em inOrdem Obtida:\t");
        arvore.inOrdem();
        
        System.out.println("Impressao em posOrdem Esperada:\t[3,4,5,5,7,9,9,4,14,17,16,18,15,14]");
        System.out.print("Impressao em posOrdem Obtida:\t");
        arvore.posOrdem();
        
        System.out.println();
        
        System.out.print("Removendo o item: ");
        System.out.println(arvore.remove(7).getInformacao());
        
        System.out.println();
        
        System.out.println("Impressao em PreOrdem Esperada:\t[14,4,3,9,5,4,5,9,15,14,18,16,17]");
        System.out.print("Impressao em PreOrdem Obtida:\t");
        arvore.preOrdem();
        
        System.out.println("Impressao em inOrdem Esperada:\t[3,4,4,5,5,9,9,14,14,15,16,17,18]");
        System.out.print("Impressao em inOrdem Obtida:\t");
        arvore.inOrdem();
        
        System.out.println("Impressao em posOrdem Esperada:\t[3,4,5,5,9,9,4,14,17,16,18,15,14]");
        System.out.print("Impressao em posOrdem Obtida:\t");
        arvore.posOrdem();
        
        System.out.println();
        
        System.out.print("Removendo o item: ");
        System.out.println(arvore.removeMenor().getInformacao());
        
        System.out.println();
        
        System.out.println("Impressao em PreOrdem Esperada:\t[14,4,9,5,4,5,9,15,14,18,16,17]");
        System.out.print("Impressao em PreOrdem Obtida:\t");
        arvore.preOrdem();
        
        System.out.println("Impressao em inOrdem Esperada:\t[4,4,5,5,9,9,14,14,15,16,17,18]");
        System.out.print("Impressao em inOrdem Obtida:\t");
        arvore.inOrdem();
        
        System.out.println("Impressao em posOrdem Esperada:\t[4,5,5,9,9,4,14,17,16,18,15,14]");
        System.out.print("Impressao em posOrdem Obtida:\t");
        arvore.posOrdem();
        
        System.out.println();
        
        System.out.print("Removendo o item: ");
        System.out.println(arvore.removeMaior().getInformacao());
        
        System.out.println();
        
        System.out.println("Impressao em PreOrdem Esperada:\t[14,4,9,5,4,5,9,15,14,16,17]");
        System.out.print("Impressao em PreOrdem Obtida:\t");
        arvore.preOrdem();
        
        System.out.println("Impressao em inOrdem Esperada:\t[4,4,5,5,9,9,14,14,15,16,17]");
        System.out.print("Impressao em inOrdem Obtida:\t");
        arvore.inOrdem();
        
        System.out.println("Impressao em posOrdem Esperada:\t[4,5,5,9,9,4,14,17,16,15,14]");
        System.out.print("Impressao em posOrdem Obtida:\t");
        arvore.posOrdem();
        
        
    }
}
