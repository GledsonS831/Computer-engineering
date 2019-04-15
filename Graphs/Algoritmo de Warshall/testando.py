from grafo_adj import *

g = Grafo([], [])

for i in ['a', 'b', 'c', 'd', 'e', 'f']:
    g.adiciona_vertice(i)

for i in ['a-b', 'a-f', 'b-e', 'c-b', 'c-d', 'd-e', 'f-e','b-e']:
    g.adiciona_aresta(i)

print(g)