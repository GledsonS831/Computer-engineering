from grafo_adj import Grafo
from math import *


g = Grafo([], [])

for i in ['a','b','c','d','e','f','g','h']:
    g.adiciona_vertice(i)
for i in ['a-b','a-c','b-d','b-e','c-e','c-g','d-f','e-f','e-g','h-f','h-d','h-b']:
    g.adiciona_aresta(i)

