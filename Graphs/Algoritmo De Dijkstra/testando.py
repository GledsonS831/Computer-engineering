from grafo_adj import Grafo
from math import inf
g_challenger = Grafo([], [])
for i in ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Y", "W", "Z", "1", "2", "3", "4", "5", "6", "7"]:
    g_challenger.adiciona_vertice(i)
for i in ['A-B', 'A-C', 'A-D', 'B-H', 'B-I', 'C-F', 'D-C', 'D-E', 'E-F', 'E-L', 'F-G', 'F-J', 'F-K', 'G-B', 'G-J', 'H-G',
           'I-P', 'J-I', 'J-O', 'K-N', 'L-M', 'M-Q', 'N-R', 'O-5', 'O-R', 'O-Q', 'P-R', 'P-T', 'R-5', 'R-Y',
          'T-U', 'U-7', 'U-W', 'V-2', 'V-W', 'V-X', 'X-R', 'Y-Z', 'Y-1', '1-3', '1-X', '3-4', '3-S',
           '5-T', '5-V', '6-3', '7-6']:
    g_challenger.adiciona_aresta(i)

lista_carga = ['L','R','U','6']


n = Grafo([], [])
for i in ['a','b','c','d','e']:
    n.adiciona_vertice(i)
for i in ['a-b','b-c','c-d','d-e']:
    n.adiciona_aresta(i)
l = ['a']
print(n.dijkstra(4,4,l,'a','e'))
c2 = Grafo([], [])

for i in ['a','b','c','d','e','f','g','h']:
    c2.adiciona_vertice(i)
for i in ['h-f','h-b','f-g','g-e','e-d','b-c','c-a','a-d']:
    c2.adiciona_aresta(i)

r = ['g']

##print(c2.dijkstra2(2,2,r,'h','d'))
##g_challenger.dijkstra('A','J')
##print(g_challenger.dijkstra(3, 4,lista_carga, 'A','S'))




