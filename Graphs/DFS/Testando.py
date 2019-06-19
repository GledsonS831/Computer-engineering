from grafo_adj_nao_dir import *
g5 = Grafo([], {})
for i in ["0", "1", "2", "3", "4", "5", "6"]:
    g5.adicionaVertice(i)

g5.adicionaAresta('0-1')
g5.adicionaAresta('0-2')
g5.adicionaAresta('0-3')
g5.adicionaAresta('1-2')
g5.adicionaAresta('2-3')
g5.adicionaAresta('2-4')
g5.adicionaAresta('2-5')
g5.adicionaAresta('2-6')
g5.adicionaAresta('3-4')
g5.adicionaAresta('3-5')

##print(g5)
g5.dfs(0)



