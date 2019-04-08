import unittest
import grafo_adj


class TestGrafo(unittest.TestCase):

    def setUp(self):

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

        def warshall(self):
            E = self.M.copy()
            for i in range(len(self.N)):
                for j in range(len(self.N)):
                    if E[j][i] == 1:
                        for k in range(len(self.N)):
                            E[j][k] = max(E[j][k], E[i][k])

            return E

        def eh_conexo(self):
            contem = 0
            for i in range(len(self.N)):
                for j in range(len(self.N)):
                    if (self.M[i][j] != '-' and self.M[i][j] > 0 and contem == 0):
                        contem = 1
                if contem == 0:
                    for j in range(len(self.N)):
                        if (self.M[j][i] != '-' and self.M[j][i] > 0):
                            contem = 1
                if contem == 0:
                    return False
            return True

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

        self.g_16 = Grafo([],[])
        for i in ['a', 'b', 'c', 'd', 'e']:
            self.g_16.adiciona_vertice(i)

        for i in ['a-b', 'b-c', 'b-d', 'b-e', 'c-d', 'e-c']:
            self.g_16.adiciona_aresta(i)

        self.g_17 = Grafo([], [])

        for i in ['a', 'b', 'c', 'd', 'e']:
            self.g_17.adiciona_vertice(i)
        for i in ['a-e', 'b-a', 'b-e', 'b-c', 'c-a', 'c-d', 'e-d', 'e-c']:
            self.g_17.adiciona_aresta(i)

        self.g_18 = Grafo([], [])

        for i in ['a', 'b', 'c', 'd', 'e', 'f']:
            self.g_18.adiciona_vertice(i)

        for i in ['a-b', 'a-f', 'b-e', 'c-b', 'c-d', 'd-e', 'f-e']:
            self.g_18.adiciona_aresta(i)
        self.g_19 = Grafo([], [])

        for i in ['a', 'b', 'c', 'd', 'e', 'f']:
            self.g_19.adiciona_vertice(i)

        for i in ['b-a', 'b-e', 'b-f', 'd-e', 'f-c', 'e-f']:
            self.g_19.adiciona_aresta(i)

    def test_warshal(self):
        self.assertEqual(self.g_l2.warshall(), [[1, 1, 0, 0], [1, 1, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]])
        self.assertEqual(self.g_16.warshall(), [[0, 1, 1, 1, 1], [0, 0, 1, 1, 1], [0, 0, 0, 1, 0], [0, 0, 0, 0, 0], [0, 0, 1, 1, 0]])
        self.assertEqual(self.g_17.warshall(), [[1, 0, 1, 1, 1], [1, 0, 1, 1, 1], [1, 0, 1, 1, 1], [0, 0, 0, 0, 0], [1, 0, 1, 1, 1]])
        self.assertEqual(self.g_18.warshall(), [[0, 1, 0, 0, 1, 1], [0, 0, 0, 0, 1, 0], [0, 1, 0, 1, 1, 0], [0, 0, 0, 0, 1, 0], [0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 1, 0]])
        self.assertEqual(self.g_19.warshall(), [[0, 0, 0, 0, 0, 0], [1, 0, 1, 0, 1, 1], [0, 0, 0, 0, 0, 0], [0, 0, 1, 0, 1, 1], [0, 0, 1, 0, 0, 1], [0, 0, 1, 0, 0, 0]])

