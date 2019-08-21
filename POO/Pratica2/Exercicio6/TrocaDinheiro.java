/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

public class TrocaDinheiro {
    int valor;
    
    public TrocaDinheiro(int d){
        this.valor = d;
    }
    public int getCelulas100(){
        int aux = this.valor;
        int n = 0;
        while(true){
            if(aux < 100){break;}
            n+=1;
            aux = aux /100;
        }
        this.valor =this.valor -  n*100;
        if(n==0){return 0;}
        return n;
    }
    public int getCelulas50(){
        int aux = this.valor;
        int n = 0;
        while(true){
            if(aux < 50){break;}
            n+=1;
            aux = aux /100;
        }
        if(n== 0){return 0;}
        this.valor = this.valor - n*50;
        return n;
    }
}
