import unittest
from grafo_adj import *



class TestGrafo(unittest.TestCase):

    def setUp(self):
        self.g = Grafo([], [])

        for i in ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12']:
            self.g.adiciona_vertice(i)

        self.g.adiciona_aresta('0-1')
        self.g.adiciona_aresta('0-6')
        self.g.adiciona_aresta('0-3')
        self.g.adiciona_aresta('1-2')
        self.g.adiciona_aresta('1-5')
        self.g.adiciona_aresta('1-5')
        self.g.adiciona_aresta('2-3')
        self.g.adiciona_aresta('2-4')
        self.g.adiciona_aresta('4-1')
        self.g.adiciona_aresta('5-6')
        self.g.adiciona_aresta('5-3')
        self.g.adiciona_aresta('7-8')
        self.g.adiciona_aresta('8-11')
        self.g.adiciona_aresta('8-9')
        self.g.adiciona_aresta('9-10')
        self.g.adiciona_aresta('9-11')
        self.g.adiciona_aresta('10-5')
        self.g.adiciona_aresta('10-8')
        self.g.adiciona_aresta('12-7')
        self.g.adiciona_aresta('12-8')
        self.g.adiciona_aresta('12-11')

        self.g4 = Grafo([], [])

        for i in ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12']:
            self.g4.adiciona_vertice(i)

        self.g4.adiciona_aresta('0-1')
        self.g4.adiciona_aresta('0-6')
        self.g4.adiciona_aresta('0-3')
        self.g4.adiciona_aresta('1-2')
        self.g4.adiciona_aresta('1-5')
        self.g4.adiciona_aresta('1-5')
        self.g4.adiciona_aresta('2-3')
        self.g4.adiciona_aresta('2-4')
        self.g4.adiciona_aresta('4-1')
        self.g4.adiciona_aresta('5-6')
        self.g4.adiciona_aresta('5-3')
        self.g4.adiciona_aresta('7-8')
        self.g4.adiciona_aresta('8-11')
        self.g4.adiciona_aresta('8-9')
        self.g4.adiciona_aresta('9-10')
        self.g4.adiciona_aresta('9-11')
        self.g4.adiciona_aresta('10-5')
        self.g4.adiciona_aresta('10-8')
        self.g4.adiciona_aresta('12-7')
        self.g4.adiciona_aresta('12-8')
        self.g4.adiciona_aresta('12-11')

        self.g2 = Grafo([], [])

        for i in ['0', '1', '2', '3', '4', '5', '6']:
            self.g2.adiciona_vertice(i)

        self.g2.adiciona_aresta('0-1')
        self.g2.adiciona_aresta('0-6')
        self.g2.adiciona_aresta('0-3')
        self.g2.adiciona_aresta('1-2')
        self.g2.adiciona_aresta('1-5')
        self.g2.adiciona_aresta('1-5')
        self.g2.adiciona_aresta('2-3')
        self.g2.adiciona_aresta('2-4')
        self.g2.adiciona_aresta('4-1')
        self.g2.adiciona_aresta('5-6')

        self.g3 = Grafo([], [])

        for i in ['0', '1', '2', '3', '4', '5', '6']:
            self.g3.adiciona_vertice(i)

        self.g3.adiciona_aresta('0-1')
        self.g3.adiciona_aresta('0-6')
        self.g3.adiciona_aresta('0-3')
        self.g3.adiciona_aresta('1-2')
        self.g3.adiciona_aresta('1-5')
        self.g3.adiciona_aresta('1-5')
        self.g3.adiciona_aresta('2-3')
        self.g3.adiciona_aresta('2-4')
        self.g3.adiciona_aresta('4-1')
        self.g3.adiciona_aresta('5-6')


        # Grafo da Paraíba
        self.g_p = Grafo([], [])
        for i in ['J', 'C', 'E', 'P', 'M', 'T', 'Z']:
            self.g_p.adiciona_vertice(i)
        for i in ['J-C', 'C-E', 'C-E', 'C-P', 'C-P', 'C-M', 'C-T', 'M-T', 'T-Z']:
            self.g_p.adiciona_aresta(i)

        # Grafo da Paraíba sem arestas paralelas
        self.g_p_sem_paralelas = Grafo([], [])
        for i in ['J', 'C', 'E', 'P', 'M', 'T', 'Z']:
            self.g_p_sem_paralelas.adiciona_vertice(i)
        for i in ['J-C', 'C-E', 'C-P', 'C-M', 'C-T', 'M-T', 'T-Z']:
            self.g_p_sem_paralelas.adiciona_aresta(i)

        # Grafos completos
        self.g_c = Grafo([], [])
        for i in ['J', 'C', 'E', 'P']:
            self.g_c.adiciona_vertice(i)
        for i in ['J-C', 'J-E', 'J-P', 'C-J', 'C-E', 'C-P', 'E-J', 'E-C', 'E-P', 'P-J', 'P-C', 'P-E']:
            self.g_c.adiciona_aresta(i)


        self.g_c3 = Grafo([], [])
        self.g_c3.adiciona_vertice('J')



        # Grafos com laco
        self.g_l1 = Grafo([], [])
        for i in ['A', 'B', 'C', 'D']:
            self.g_l1.adiciona_vertice(i)
        for i in ['A-A', 'B-A', 'A-A']:
            self.g_l1.adiciona_aresta(i)

        self.g_l2 = Grafo([], [])
        for i in ['A', 'B', 'C', 'D']:
            self.g_l2.adiciona_vertice(i)
        for i in ['A-B', 'B-B', 'B-A']:
            self.g_l2.adiciona_aresta(i)

        self.g_l3 = Grafo([], [])
        for i in ['A', 'B', 'C', 'D']:
            self.g_l3.adiciona_vertice(i)
        for i in ['C-A', 'C-C', 'D-D']:
            self.g_l3.adiciona_aresta(i)

        self.g_l4 = Grafo([], [])
        self.g_l4.adiciona_vertice('D')
        self.g_l4.adiciona_aresta('D-D')

        self.g_l5 = Grafo([], [])
        for i in ['C', 'D']:
            self.g_l5.adiciona_vertice(i)
        for i in ['D-C', 'C-C']:
            self.g_l5.adiciona_aresta(i)



    def test_DFS(self):
        self.assertEqual(self.g.dfs(0), [0, 1, 2, 3, 4, 5, 6, 7, 12, 8, 9, 10, 11])
        self.assertEqual(self.g2.dfs(0), [0, 1, 2, 3, 4, 5, 6])
        self.assertEqual(self.g3.dfs(0), [0, 1, 2, 3, 4, 5, 6])
        self.assertEqual(self.g4.dfs(0), [0, 1, 2, 3, 4, 5, 6, 7, 12, 8, 9, 10, 11])
