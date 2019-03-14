from grafo_adj_nao_dir import Grafo

g = Grafo(['J', 'C', 'E', 'P'])
g.adicionaAresta('J-C')
g.adicionaAresta('J-E')
g.adicionaAresta('J-P')
g.adicionaAresta('C-E')
g.adicionaAresta('C-P')
g.adicionaAresta('E-P')
print(g)

g.vertices_nao_adjacentes()