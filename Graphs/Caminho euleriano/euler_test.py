import unittest
from grafo_adj_nao_dir import Grafo

class TestEuler(unittest.TestCase):

    def setUp(self):

        # Pontes de Konigsberg
        self.konigsberg = Grafo([], [])
        for i in ['M', 'T', 'B', 'R']:
            self.konigsberg.adiciona_vertice(i)
        for i in ['M-T', 'M-T', 'M-B', 'M-B', 'M-R', 'B-R', 'T-R']:
            self.konigsberg.adiciona_aresta(i)


        # Grafos com caminho euleriano
        self.konigsberg_mod = Grafo([], [])
        for i in ['M', 'T', 'B', 'R']:
            self.konigsberg_mod.adiciona_vertice(i)
        for i in ['M-T', 'M-T', 'M-B', 'M-B', 'M-R', 'M-R', 'B-R', 'T-R']:
            self.konigsberg_mod.adiciona_aresta(i)

        self.g_c_e = Grafo([], [])
        for i in ['A', 'B', 'C']:
            self.g_c_e.adiciona_vertice(i)
        for i in ['A-B', 'B-C']:
            self.g_c_e.adiciona_aresta(i)


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
        for i in ['J-C', 'J-E', 'J-P', 'C-E', 'C-P', 'E-P']:
            self.g_c.adiciona_aresta(i)

        self.g_c2 = Grafo([], [])
        for i in ['J', 'C', 'E', 'P']:
            self.g_c2.adiciona_vertice(i)
        for i in ['J-C', 'E-J', 'J-P', 'E-C', 'C-P', 'P-E']:
            self.g_c2.adiciona_aresta(i)

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
        for i in ['A-B', 'B-B', 'A-B']:
            self.g_l2.adiciona_aresta(i)

        self.g_l3 = Grafo([], [])
        for i in ['A', 'B', 'C', 'D']:
            self.g_l3.adiciona_vertice(i)
        for i in ['A-C', 'C-C', 'D-D']:
            self.g_l3.adiciona_aresta(i)

        self.g_l4 = Grafo([], [])
        self.g_l4.adiciona_vertice('D')
        self.g_l4.adiciona_aresta('D-D')

        self.g_l5 = Grafo([], [])
        for i in ['C', 'D']:
            self.g_l5.adiciona_vertice(i)
        for i in ['C-D', 'C-C']:
            self.g_l5.adiciona_aresta(i)

        self.g_16 = Grafo([],[])
        for i in ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h']:
            self.g_16.adiciona_vertice(i)

        for i in ['a-c', 'a-c', 'a-e', 'a-f', 'a-g', 'a-h', 'b-d', 'b-g', 'c-h', 'c-h', 'd-e', 'd-f', 'e-f', 'f-g',
                  'g-h']:
            self.g_16.adiciona_aresta(i)

        self.g_17 = Grafo([], [])
        for i in ['a', 'b', 'c', 'd', 'e', 'f', 'g']:
            self.g_17.adiciona_vertice(i)

        for i in ['a-b','a-c','a-f','a-g','b-c','b-f','b-g','c-d','c-e','c-f','c-g','d-e','f-g']:
            self.g_17.adiciona_aresta(i)

        self.g_18 = Grafo([], [])
        for i in ['a', 'b', 'c', 'd', 'e']:
            self.g_18.adiciona_vertice(i)

        for i in ['a-b','a-d', 'b-c','b-e','c-d']:
            self.g_18.adiciona_aresta(i)

        self.g_19 = Grafo([], [])
        for i in ['C', 'D']:
            self.g_19.adiciona_vertice(i)

        for i in ['C-C', 'C-D']:
            self.g_19.adiciona_aresta(i)

        self.g_20 = Grafo([], [])
        for i in ['a','b','c','d','e','f','g']:
            self.g_20.adiciona_vertice(i)
        for i in ['a-e','a-f','a-f','a-g','b-e','b-d','b-d','b-f','d-e','e-g']:
            self.g_20.adiciona_aresta(i)
    def test_caminho_euleriano(self):
        self.assertTrue(self.konigsberg_mod.caminho_euleriano())
        self.assertTrue(self.g_c_e.caminho_euleriano())
        self.assertFalse(self.konigsberg.caminho_euleriano())
        self.assertFalse(self.g_p.caminho_euleriano())
        self.assertFalse(self.g_p_sem_paralelas.caminho_euleriano())
        self.assertFalse(self.g_c.caminho_euleriano())
        self.assertEqual(self.g_16.caminho_euleriano(), ['d', 'e', 'f', 'g', 'h', 'a', 'c', 'h', 'c', 'a', 'f', 'd', 'b', 'g', 'a', 'e'])
        self.assertEqual(self.g_17.caminho_euleriano(),['a', 'b', 'c', 'd', 'e', 'c', 'f', 'g', 'a', 'c', 'g', 'b', 'f', 'a'])
        self.assertEqual(self.g_18.caminho_euleriano(), ['b', 'c', 'd', 'a', 'b', 'e'])
        self.assertEqual(self.g_19.caminho_euleriano(), ['C','D'])
        self.assertEqual(self.g_20.caminho_euleriano(), ['d', 'e', 'g', 'a', 'e', 'b', 'd', 'b', 'f', 'a', 'f'])

