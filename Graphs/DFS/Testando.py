from grafo_adj_nao_dir import *
g = Grafo([], {})
for i in ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"]:
    g.adicionaVertice(i)

g.adicionaAresta('0-1')
g.adicionaAresta('0-2')
g.adicionaAresta('0-3')
g.adicionaAresta('1-2')
g.adicionaAresta('1-7')
g.adicionaAresta('1-8')
g.adicionaAresta('1-9')
g.adicionaAresta('1-10')
g.adicionaAresta('2-3')
g.adicionaAresta('2-4')
g.adicionaAresta('2-5')
g.adicionaAresta('2-6')
g.adicionaAresta('3-4')
g.adicionaAresta('3-5')
g.adicionaAresta('6-7')
g.adicionaAresta('8-9')
g.adicionaAresta('8-10')

print(g)
g.dfs(0)



