#include <bits/stdc++.h>

using namespace std;

void Selection_sort(int *lista, int tam){
    int menor_index, novo_index, aux, index_atual;
    for(int i = 0; i < tam; i++){
        menor_index = i;
        for(int j = i+1; j < tam; j++){
            if(lista[j] < lista[menor_index]){
                menor_index = j;
            }
        }
        int aux = lista[menor_index];
        lista[menor_index] = lista[i];
        lista[i] = aux;
    }
    
}

int main(){
    int lista[4] = {2, 0, 1, 5};
    Selection_sort(lista, 4);
    for(int k = 0; k < 4; k++){
        cout<<lista[k]<<" ";
    }
    cout<<endl;
}