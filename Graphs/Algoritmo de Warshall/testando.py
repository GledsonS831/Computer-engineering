from grafo_adj import *

g_l2 = Grafo([], [])
for i in ['A', 'B', 'C', 'D']:
    g_l2.adiciona_vertice(i)
for i in ['A-B', 'B-B', 'B-A']:
    g_l2.adiciona_aresta(i)

print(g_l2.warshall())