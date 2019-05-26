from grafo_adj_nao_dir import *
g8 = Grafo([], {})
for i in ['a', 'b', 'c', 'd', 'e', 'f', 'g']:
    g8.adicionaVertice(i)
g8.adicionaAresta("a-b", 5)
g8.adicionaAresta("a-e", 12)
g8.adicionaAresta("b-g", 4)
g8.adicionaAresta("b-f", 9)
g8.adicionaAresta("c-d", 10)
g8.adicionaAresta("c-f", 7)
g8.adicionaAresta("d-f", 8)
g8.adicionaAresta("c-e", 10)
g8.adicionaAresta("e-g", 2)
g8.adicionaAresta("f-g", 6)








print(g8.Kruskal())