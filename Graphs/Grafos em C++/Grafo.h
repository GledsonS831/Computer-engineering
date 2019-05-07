#include <iostream>
#include <map>
using namespace std;

class Grafo{
private:
    char vertices[100];
    int qnt_v = 0;
    int matriz[100][100] = {};
    map<char, int> linha;

public:
    void insere_vertice(char v){
        this->vertices[qnt_v] = v;
        this->linha[v] = qnt_v;
        qnt_v++;
    }
    void imprimeGrafo(){
        cout<<" ";
        for(auto l = linha.begin(); l != linha.end(); l++){
            cout<<" "<<l->first;
        }
        cout<<endl;
        auto it = this->linha.begin();
        for(int i = 0; i < this->qnt_v ; i++){
                cout<<it->first<<" ";
                it++;
            for(int j = 0; j < this->qnt_v; j++){
                cout<<this->matriz[i][j]<<" ";
            }
            cout<<endl<<endl;;
        }
    }
    char* get_vertices(){
        return this->vertices;
    }
    void insere_aresta(string a){
        char a1 = a[0];
        char a2 = a[2];

        this->matriz[linha[a1]][linha[a2]]++;
    }
};

