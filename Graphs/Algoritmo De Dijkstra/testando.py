from grafo_adj import Grafo

g = Grafo([], [])

for i in ['a','b','c','d','e','f','g','h']:
    g.adiciona_vertice(i)

for i in ['a-b','a-d','b-c','b-f','c-a','c-g','c-e','e-f','e-g','h-b','h-f']:
    g.adiciona_aresta(i)

print(g)

g.dijkstra('h', 'g')
dic = {'a':1, 'b':2}

