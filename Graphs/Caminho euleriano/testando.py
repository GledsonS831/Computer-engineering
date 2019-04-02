from grafo_adj_nao_dir import Grafo


g = Grafo([], [])
for i in ['a','b','c','d','e','f','g','h']:
    g.adiciona_vertice(i)

for i in ['a-c', 'a-c', 'a-e', 'a-f', 'a-g', 'a-h', 'b-d', 'b-g','c-h','c-h','d-e','d-f','e-f','f-g','g-h']:
    g.adiciona_aresta(i)

print(g.caminho_eleriano())
