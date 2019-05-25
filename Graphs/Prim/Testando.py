from grafo_adj_nao_dir import *
g4 = Grafo([], {})
for i in ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm']:
    g4.adicionaVertice(i)
g4.adicionaAresta("a-g", 5);
g4.adicionaAresta("a-b", 19);
g4.adicionaAresta("b-c", 16);
g4.adicionaAresta("b-g", 13);
g4.adicionaAresta("c-d", 19);
g4.adicionaAresta("c-f", 1);
g4.adicionaAresta("d-e", 21);
g4.adicionaAresta("c-e", 30);
g4.adicionaAresta("e-f", 15);
g4.adicionaAresta("f-g", 3);
g4.adicionaAresta("g-m", 5);
g4.adicionaAresta("i-k", 1);
g4.adicionaAresta("a-m", 14);
g4.adicionaAresta("j-l", 9);
g4.adicionaAresta("i-m", 8);
g4.adicionaAresta("f-i", 11);
g4.adicionaAresta("f-h", 10);
g4.adicionaAresta("c-e", 13);
g4.adicionaAresta("e-j", 20);
g4.adicionaAresta("f-k", 19);

print(g4)
g4.prim("e")