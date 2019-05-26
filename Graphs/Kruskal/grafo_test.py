import unittest
from grafo_adj_nao_dir import Grafo

class TestGrafo(unittest.TestCase):

    def setUp(self):
        # Grafo da Paraíba
        self.g_p = Grafo(['J', 'C', 'E', 'P', 'M', 'T', 'Z'])
        #{'a1':'J-C', 'a2':'C-E', 'a3':'C-E', 'a4':'C-P', 'a5':'C-P', 'a6':'C-M', 'a7':'C-T', 'a8':'M-T', 'a9':'T-Z'}
        self.g_p.adicionaAresta('J-C', 3)
        self.g_p.adicionaAresta('C-E', 3)
        self.g_p.adicionaAresta('C-E', 2)
        self.g_p.adicionaAresta('C-P', 1)
        self.g_p.adicionaAresta('C-P', 7)
        self.g_p.adicionaAresta('C-M', 5)
        self.g_p.adicionaAresta('C-T', 4)
        self.g_p.adicionaAresta('M-T', 3)
        self.g_p.adicionaAresta('T-Z', 4)


        # Grafo da Paraíba sem arestas paralelas
        self.g_p_sem_paralelas = Grafo(['J', 'C', 'E', 'P', 'M', 'T', 'Z'])
        self.g_p_sem_paralelas.adicionaAresta('J-C', 3)
        self.g_p_sem_paralelas.adicionaAresta('C-E', 6)
        self.g_p_sem_paralelas.adicionaAresta('C-P', 7)
        self.g_p_sem_paralelas.adicionaAresta('C-M', 4)
        self.g_p_sem_paralelas.adicionaAresta('C-T', 4)
        self.g_p_sem_paralelas.adicionaAresta('M-T',8)
        self.g_p_sem_paralelas.adicionaAresta('T-Z', 9)

        # Grafos completos
        #self.g_c = Grafo(['J', 'C', 'E', 'P'], {'a1':'J-C', 'a3':'J-E', 'a4':'J-P', 'a6':'C-E', 'a7':'C-P', 'a8':'E-P'})
        self.g_c = Grafo(['J', 'C', 'E', 'P'])
        self.g_c.adicionaAresta('J-C', 4)
        self.g_c.adicionaAresta('J-E', 2)
        self.g_c.adicionaAresta('J-P', 1)
        self.g_c.adicionaAresta('C-E', 5)
        self.g_c.adicionaAresta('C-P', 8)
        self.g_c.adicionaAresta('E-P', 3)


    g = Grafo([], {})
    for i in ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h']:
        g.adicionaVertice(i)
    g.adicionaAresta("a-g", 4)
    g.adicionaAresta("a-b", 9)
    g.adicionaAresta("b-c", 6)
    g.adicionaAresta("b-h", 7)
    g.adicionaAresta("b-g", 10)
    g.adicionaAresta("c-d", 8)
    g.adicionaAresta("c-f", 8)
    g.adicionaAresta("d-e", 14)
    g.adicionaAresta("c-e", 12)
    g.adicionaAresta("e-f", 2)
    g.adicionaAresta("f-h", 2)
    g.adicionaAresta("f-g", 1)


    g2 = Grafo([], {})

    g2.adicionaVertice('a')
    g2.adicionaVertice('b')
    g2.adicionaVertice('c')
    g2.adicionaVertice('d')
    g2.adicionaVertice('e')
    g2.adicionaVertice('f')

    g2.adicionaAresta("a-b", 9)
    g2.adicionaAresta("b-c", 6)

    g2.adicionaAresta("c-d", 8)
    g2.adicionaAresta("c-f", 8)
    g2.adicionaAresta("d-e", 14)
    g2.adicionaAresta("c-e", 12)
    g2.adicionaAresta("e-f", 2)

    g3 = Grafo([], {})
    for i in ['a', 'b', 'c', 'd', 'e', 'f', 'g']:
        g3.adicionaVertice(i)
    g3.adicionaAresta("a-g", 5)
    g3.adicionaAresta("a-b", 19)
    g3.adicionaAresta("b-c", 16)
    g3.adicionaAresta("b-g", 13)
    g3.adicionaAresta("c-d", 19)
    g3.adicionaAresta("c-f", 1)
    g3.adicionaAresta("d-e", 21)
    g3.adicionaAresta("c-e", 30)
    g3.adicionaAresta("e-f", 15)
    g3.adicionaAresta("f-g", 3)

    g4 = Grafo([], {})
    for i in ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm']:
        g4.adicionaVertice(i)
    g4.adicionaAresta("a-g", 5)
    g4.adicionaAresta("a-b", 19)
    g4.adicionaAresta("b-c", 16)
    g4.adicionaAresta("b-g", 13)
    g4.adicionaAresta("c-d", 19)
    g4.adicionaAresta("c-f", 1)
    g4.adicionaAresta("d-e", 21)
    g4.adicionaAresta("c-e", 30)
    g4.adicionaAresta("e-f", 15)
    g4.adicionaAresta("f-g", 3)
    g4.adicionaAresta("g-m", 5)
    g4.adicionaAresta("i-k", 1)
    g4.adicionaAresta("a-m", 14)
    g4.adicionaAresta("j-l", 9)
    g4.adicionaAresta("i-m", 8)
    g4.adicionaAresta("f-i", 11)
    g4.adicionaAresta("f-h", 10)
    g4.adicionaAresta("c-e", 13)
    g4.adicionaAresta("e-j", 20)
    g4.adicionaAresta("f-k", 19)

    g5 = Grafo([], {})
    for i in ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h']:
        g5.adicionaVertice(i)
    g5.adicionaAresta("a-g", 4)
    g5.adicionaAresta("a-b", 9)
    g5.adicionaAresta("b-c", 6)
    g5.adicionaAresta("b-h", 7)
    g5.adicionaAresta("b-g", 10)
    g5.adicionaAresta("c-d", 8)
    g5.adicionaAresta("c-f", 8)
    g5.adicionaAresta("d-e", 14)
    g5.adicionaAresta("c-e", 12)
    g5.adicionaAresta("e-f", 2)
    g5.adicionaAresta("f-h", 2)
    g5.adicionaAresta("f-g", 1)

    g6 = Grafo([], {})

    g6.adicionaVertice('a')
    g6.adicionaVertice('b')
    g6.adicionaVertice('c')
    g6.adicionaVertice('d')
    g6.adicionaVertice('e')
    g6.adicionaVertice('f')

    g6.adicionaAresta("a-b", 9)
    g6.adicionaAresta("b-c", 6)

    g6.adicionaAresta("c-d", 8)
    g6.adicionaAresta("c-f", 8)
    g6.adicionaAresta("d-e", 14)
    g6.adicionaAresta("c-e", 12)
    g6.adicionaAresta("e-f", 2)

    g7 = Grafo([], {})
    for i in ['a', 'b', 'c', 'd', 'e', 'f', 'g']:
        g7.adicionaVertice(i)
    g7.adicionaAresta("a-c", 50)
    g7.adicionaAresta("a-d", 49)
    g7.adicionaAresta("b-f", 55)
    g7.adicionaAresta("b-g", 60)
    g7.adicionaAresta("c-d", 45)
    g7.adicionaAresta("c-g", 52)
    g7.adicionaAresta("d-f", 44)
    g7.adicionaAresta("c-g", 56)
    g7.adicionaAresta("e-f", 10)


    g8 = Grafo([], {})
    for i in ['a', 'b', 'c', 'd', 'e', 'f', 'g']:
        g8.adicionaVertice(i)
    g8.adicionaAresta("a-b", 5)
    g8.adicionaAresta("a-e", 12)
    g8.adicionaAresta("b-g", 4)
    g8.adicionaAresta("b-f", 9)
    g8.adicionaAresta("c-d", 10)
    g8.adicionaAresta("c-f", 7)
    g8.adicionaAresta("d-f", 8)
    g8.adicionaAresta("c-e", 10)
    g8.adicionaAresta("e-g", 2)
    g8.adicionaAresta("f-g", 6)

    def test_vertices_nao_adjacentes(self):
        self.assertEqual(self.g_p.vertices_nao_adjacentes(), ['J-J', 'J-E', 'J-P', 'J-M', 'J-T', 'J-Z', 'C-C', 'C-Z', 'E-E', 'E-P', 'E-M', 'E-T', 'E-Z', 'P-P', 'P-M', 'P-T', 'P-Z', 'M-M', 'M-Z', 'T-T', 'Z-Z'])

        self.assertEqual(self.g_c.vertices_nao_adjacentes(), ['J-J', 'C-C', 'E-E', 'P-P'])

        self.assertEqual(self.g_c3.vertices_nao_adjacentes(), ['J-J'])

    def test_ha_laco(self):
        self.assertFalse(self.g_p.ha_laco())
        self.assertFalse(self.g_p_sem_paralelas.ha_laco())
        self.assertTrue(self.g_l1.ha_laco())
        self.assertTrue(self.g_l2.ha_laco())
        self.assertTrue(self.g_l3.ha_laco())
        self.assertTrue(self.g_l4.ha_laco())
        self.assertTrue(self.g_l5.ha_laco())

    def test_grau(self):
        # Paraíba
        self.assertEqual(self.g_p.grau('J'), 1)
        self.assertEqual(self.g_p.grau('C'), 7)
        self.assertEqual(self.g_p.grau('E'), 2)
        self.assertEqual(self.g_p.grau('P'), 2)
        self.assertEqual(self.g_p.grau('M'), 2)
        self.assertEqual(self.g_p.grau('T'), 3)
        self.assertEqual(self.g_p.grau('Z'), 1)

        # Completos
        self.assertEqual(self.g_c.grau('J'), 3)
        self.assertEqual(self.g_c.grau('C'), 3)
        self.assertEqual(self.g_c.grau('E'), 3)
        self.assertEqual(self.g_c.grau('P'), 3)

        # Com laço. Lembrando que cada laço conta uma única vez por vértice para cálculo do grau
        self.assertEqual(self.g_l1.grau('A'), 3)
        self.assertEqual(self.g_l2.grau('B'), 3)
        self.assertEqual(self.g_l4.grau('D'), 1)

    def test_arestas_ha_paralelas(self):
        self.assertTrue(self.g_p.ha_paralelas())
        self.assertFalse(self.g_p_sem_paralelas.ha_paralelas())
        self.assertFalse(self.g_c.ha_paralelas())
        self.assertFalse(self.g_c3.ha_paralelas())
        self.assertTrue(self.g_l1.ha_paralelas())

    def test_arestas_sobre_vertice(self):
        #{'a1': 'J-C', 'a2': 'C-E', 'a3': 'C-E', 'a4': 'C-P', 'a5': 'C-P', 'a6': 'C-M', 'a7': 'C-T', 'a8': 'M-T',
        # 'a9': 'T-Z'}
        self.assertEqual(set(self.g_p.arestas_sobre_vertice('J')), set(['J-C']))
        self.assertEqual(set(self.g_p.arestas_sobre_vertice('C')), set(['C-J', 'C-E', 'C-E', 'C-P', 'C-P', 'C-M', 'C-T']))
        self.assertEqual(set(self.g_p.arestas_sobre_vertice('M')), set(['M-C', 'M-T']))

    def test_eh_completo(self):
        self.assertFalse(self.g_p.eh_completo())
        self.assertFalse((self.g_p_sem_paralelas.eh_completo()))
        self.assertTrue((self.g_c.eh_completo()))
        self.assertTrue((self.g_c.eh_completo()))
        self.assertTrue((self.g_c3.eh_completo()))
        self.assertFalse((self.g_l1.eh_completo()))
        self.assertFalse((self.g_l2.eh_completo()))
        self.assertFalse((self.g_l3.eh_completo()))
        self.assertTrue((self.g_l4.eh_completo()))
        self.assertTrue((self.g_l5.eh_completo()))

    def test_kruskal(self):
        self.assertEqual(self.g_p_sem_paralelas.Kruskal(), ['J-C', 'C-M', 'M-T', 'T-Z'])
        self.assertEqual(self.g3.Kruskal(), ['c-f', 'f-g', 'a-g', 'b-g', 'e-f', 'd-e'])
        self.assertEqual(self.g4.Kruskal(), ['c-f', 'i-k', 'f-g', 'a-g', 'g-m', 'j-l', 'b-g', 'e-f', 'd-e'])
        self.assertEqual(self.g5.Kruskal(), ['f-g', 'e-f', 'a-g', 'b-c', 'c-d', 'd-e'])
        self.assertEqual(self.g6.Kruskal(), ['e-f', 'b-c', 'c-d', 'a-b', 'd-e'])
        self.assertEqual(self.g7.Kruskal(), ['e-f', 'd-f', 'c-d', 'a-d', 'b-f'])
        self.assertEqual(self.g8.Kruskal(), ['e-g', 'b-g', 'a-b', 'f-g', 'c-f', 'd-f'])