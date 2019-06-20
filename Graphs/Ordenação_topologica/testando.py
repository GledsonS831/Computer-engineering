from grafo_adj import *

g = Grafo([],[])

for i in ['9','8','7','2','11','5','3', '10']:
    g.adiciona_vertice(i)

for i in ['7-11', '5-8', '3-11', '7-8', '8-9','11-10','11-2', '5-10']:
    g.adiciona_aresta(i)
print(g)
print(g.dfs('7'))


