from grafo_adj_nao_dir import Grafo


g = Grafo([], [])
for i in ['M', 'T', 'B', 'R', 'A', 'C']:
    g.adiciona_vertice(i)

for i in ['M-T', 'M-T', 'M-B', 'M-B', 'M-R', 'B-R', 'T-R', 'A-C']:
    g.adiciona_aresta(i)

print(g.eh_conexo())