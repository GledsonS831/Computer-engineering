/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;
public class TrocaDinheiro {
    private int valor;
    
    public TrocaDinheiro(int d){
        this.valor = d;
    }
    public int getCelulas100(){
        int aux = this.valor;
        int n = 0;
        while(true){
            if(aux < 100){

                break;
            }
            n+=1;
            aux = aux - 100;
        }
        this.valor =this.valor -  n*100;
        if(n<=0){return 0;}
        return n;
    }
    public int getCelulas50(){
        int aux = this.valor;
        int n = 0;
        while(true){
            if(aux < 50){break;}
            n+=1;
            aux = aux - 50;
        }
        if(n== 0){return 0;}
        this.valor = this.valor - n*50;
        if(n<=0){return 0;}
        return n;
    }
    public int getCelulas20(){
        int aux = this.valor;
        int n = 0;
        while(true){
            if(aux < 20){break;}
            n+=1;
            aux = aux - 20;
        }
        if(n== 0){return 0;}
        this.valor = this.valor - n*20;
        if(n<=0){return 0;}
        return n;
    }
    public int getCelulas10(){
        int aux = this.valor;
        int n = 0;
        while(true){
            if(aux < 10){break;}
            n+=1;
            aux = aux - 10;
        }
        if(n== 0){return 0;}
        this.valor = this.valor - n*10;
        if(n<=0){return 0;}
        return n;
    }
    public int getCelulas5(){
        int aux = this.valor;
        int n = 0;
        while(true){
            if(aux < 5){break;}
            n+=1;
            aux = aux - 5;
        }
        if(n== 0){return 0;}
        this.valor = this.valor - n*5;
        if(n<=0){return 0;}
        return n;
    }
    public int getCelulas2(){
        int aux = this.valor;
        int n = 0;
        while(true){
            if(aux < 2){break;}
            n+=1;
            aux = aux - 2;
        }
        if(n== 0){return 0;}
        this.valor = this.valor - n*2;
        if(n<=0){return 0;}
        return n;
    }
    public int getCelulas1(){
        int aux = this.valor;
        int n = 0;
        while(true){
            if(aux < 1){break;}
            n+=1;
            aux = aux - 1;
        }
        if(n== 0){return 0;}
        this.valor = this.valor - n*1;
        if(n<=0){return 0;}
        return n;
    }
}
