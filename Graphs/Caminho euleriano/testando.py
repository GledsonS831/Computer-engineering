from grafo_adj_nao_dir import Grafo


g = Grafo([], [])
for i in ['a','b','c','d','e','f','g']:
    g.adiciona_vertice(i)

for i in ['a-e','a-f','a-f','a-g','b-e','b-d','b-d','b-f','d-e','e-g']:
    g.adiciona_aresta(i)

print(g.caminho_euleriano())