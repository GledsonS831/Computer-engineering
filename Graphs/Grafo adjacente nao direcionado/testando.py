from grafo_adj_nao_dir import *

g = Grafo([], {})
g.adicionaVertice('a');
g.adicionaVertice('b');
g.adicionaVertice('c');
g.adicionaVertice('d');
g.adicionaVertice('e');
g.adicionaVertice('f');
g.adicionaVertice('g');
g.adicionaVertice('h');
g.adicionaAresta("a-g", 4);
g.adicionaAresta("a-b", 9);
g.adicionaAresta("b-c", 6);
g.adicionaAresta("b-h", 7);
g.adicionaAresta("b-g", 10);
g.adicionaAresta("c-d", 8);
g.adicionaAresta("c-f", 8);
g.adicionaAresta("d-e", 14);
g.adicionaAresta("c-e", 12);
g.adicionaAresta("e-f", 2);
g.adicionaAresta("f-h", 2);
g.adicionaAresta("f-g", 1);
print(g)
g.prim("g")