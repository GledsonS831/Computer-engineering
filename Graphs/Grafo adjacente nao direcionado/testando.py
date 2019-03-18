from grafo_adj_nao_dir import Grafo
g = Grafo(['J', 'C', 'E', 'P', 'M', 'T', 'Z'])
#{'a1':'J-C', 'a2':'C-E', 'a3':'C-E', 'a4':'C-P', 'a5':'C-P', 'a6':'C-M', 'a7':'C-T', 'a8':'M-T', 'a9':'T-Z'}
g.adicionaAresta('J-C')
g.adicionaAresta('C-E')
g.adicionaAresta('C-E')
g.adicionaAresta('C-P')
g.adicionaAresta('C-P')
g.adicionaAresta('C-M')
g.adicionaAresta('C-T')
g.adicionaAresta('M-T')
g.adicionaAresta('T-Z')
g.adicionaAresta('M-P')

print(g)
