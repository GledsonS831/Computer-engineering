#include <bits/stdc++.h>

using namespace std;

void Insertion_sort(int *lista, int tam){
    int aux;
    for(int j = 1; j < tam; j++){
        int n = lista[j];
        aux = j - 1;
        
        while(aux >= 0 && lista[aux] > n){
            lista[aux+1] = lista[aux];
            aux--;
        
        }

        lista[aux+1] = n;
    }
}

int main(){
    int lista[5] = {3, 2, 7, 1, 4};
    Insertion_sort(lista, 5);
    for(int k = 0 ; k < 5; k++){
        cout<<lista[k]<<endl;
    }
}