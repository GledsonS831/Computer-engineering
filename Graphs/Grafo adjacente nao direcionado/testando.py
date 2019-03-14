from grafo_adj_nao_dir import Grafo
#testar fora das classes
g = Grafo(['J', 'C', 'E', 'P', 'M', 'T', 'Z'])
g.adicionaAresta('J-C')
g.adicionaAresta('C-E')
g.adicionaAresta('C-P')
g.adicionaAresta('C-M')
g.adicionaAresta('C-T')
g.adicionaAresta('M-T')
g.adicionaAresta('T-Z')
print(g.arestas_sobre_vertice("C"))

