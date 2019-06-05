from grafo_adj import *

g = Grafo([], [])

for i in ['0','1' ,'2' ,'3' ,'4' ,'5' ,'6' ,'7' ,'8', '9', '10','11', '12']:
    g.adiciona_vertice(i)

g.adiciona_aresta('0-1')
g.adiciona_aresta('0-6')
g.adiciona_aresta('0-3')
g.adiciona_aresta('1-2')
g.adiciona_aresta('1-5')
g.adiciona_aresta('1-5')
g.adiciona_aresta('2-3')
g.adiciona_aresta('2-4')
g.adiciona_aresta('4-1')
g.adiciona_aresta('5-6')
g.adiciona_aresta('5-3')
g.adiciona_aresta('7-8')
g.adiciona_aresta('8-11')
g.adiciona_aresta('8-9')
g.adiciona_aresta('9-10')
g.adiciona_aresta('9-11')
g.adiciona_aresta('10-5')
g.adiciona_aresta('10-8')
g.adiciona_aresta('12-7')
g.adiciona_aresta('12-8')
g.adiciona_aresta('12-11')

print(g.dfs(0))

