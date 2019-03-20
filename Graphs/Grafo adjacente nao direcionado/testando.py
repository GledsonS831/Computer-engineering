from grafo_adj_nao_dir import Grafo
g = Grafo(['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'])
#{'a1':'J-C', 'a2':'C-E', 'a3':'C-E', 'a4':'C-P', 'a5':'C-P', 'a6':'C-M', 'a7':'C-T', 'a8':'M-T', 'a9':'T-Z'}
g.adicionaAresta('a-e')
g.adicionaAresta('a-d')
g.adicionaAresta('a-h')
g.adicionaAresta('a-h')
g.adicionaAresta('b-c')
g.adicionaAresta('b-g')
g.adicionaAresta('b-f')
g.adicionaAresta('d-e')
g.adicionaAresta('c-g')
g.adicionaAresta('a-g')



g.eh_conexo()


