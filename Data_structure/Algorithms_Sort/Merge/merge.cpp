#include <bits/stdc++.h>

using namespace std;

void merge(int *lista, int ini, int meio, int fim){
    int t1 = meio-ini + 1;
    int t2 = fim - meio;

    int esq[t1], dir[t2];

    for(int i = 0; i < t1; i++){
        esq[i] = lista[ini+i];
    }
    for(int i = 0; i < t2; i++){
        dir[i] = lista[meio+i+1];
    }

    int i = 0; 
    int j = 0; 
    int k = ini; 

    while (i < t1 && j < t2) 
    { 
        if (esq[i] <= dir[j]) 
        { 
            lista[k] = esq[i++];  
           
        } 
        else
        { 
            lista[k] = dir[j++]; 
          
        } 
        k++; 
        
    } 
    while (i < t1) 
    { 
        lista[k] = esq[i++]; 
        k++; 
       
    } 
  
    while (j < t2) 
    { 
        lista[k] = dir[j++]; 
        k++; 
        
    } 
    
}

void mergeSort(int *lista, int i, int f){
    if(i < f){
        int m = (i+f)/2;
        mergeSort(lista, i, m);
        mergeSort(lista, m+1, f);
        merge(lista, i, m, f);
    }
}
int main(){
    int n = 1, v;
    int *lista = new int[100000000];
    while(n){
        cin>>n;
        for(int i = 0; i < n; i++){
            cin>>v;
            lista[i] = v;
        }
        mergeSort(lista, 0, n-1);
        int sum = 0;
        for(int j = 0; j < n; j++){
            cout<<lista[j]<<endl;
        }
        
    }
   
}