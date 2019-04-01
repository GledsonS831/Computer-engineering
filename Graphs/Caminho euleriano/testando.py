from grafo_adj_nao_dir import Grafo


g = Grafo([], [])
for i in ['J', 'C', 'E', 'P', 'M', 'T']:
    g.adiciona_vertice(i)

for i in ['J-C', 'C-E', 'C-E', 'C-P', 'C-P', 'C-M', 'C-T', 'M-T']:
    g.adiciona_aresta(i)

print(g)
print(g.eh_conexo())