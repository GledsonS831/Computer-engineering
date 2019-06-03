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
    g.adicionaAresta("a-g", 4);
    g.adicionaAresta("a-b", 9);
    g.adicionaAresta("b-c", 6);
    g.adicionaAresta("b-h", 7);
    g.adicionaAresta("b-g", 10);
    g.adicionaAresta("c-d", 8);
    g.adicionaAresta("c-f", 8);
    g.adicionaAresta("d-e", 14);
    g.adicionaAresta("c-e", 12);
    g.adicionaAresta("e-f", 2);
    g.adicionaAresta("f-h", 2);
    g.adicionaAresta("f-g", 1);


    g2 = Grafo([], {})

    g2.adicionaVertice('a');
    g2.adicionaVertice('b');
    g2.adicionaVertice('c');
    g2.adicionaVertice('d');
    g2.adicionaVertice('e');
    g2.adicionaVertice('f');

    g2.adicionaAresta("a-b", 9);
    g2.adicionaAresta("b-c", 6);

    g2.adicionaAresta("c-d", 8);
    g2.adicionaAresta("c-f", 8);
    g2.adicionaAresta("d-e", 14);
    g2.adicionaAresta("c-e", 12);
    g2.adicionaAresta("e-f", 2);

    g3 = Grafo([], {})
    for i in ['a', 'b', 'c', 'd', 'e', 'f', 'g']:
        g3.adicionaVertice(i)
    g3.adicionaAresta("a-g", 5);
    g3.adicionaAresta("a-b", 19);
    g3.adicionaAresta("b-c", 16);
    g3.adicionaAresta("b-g", 13);
    g3.adicionaAresta("c-d", 19);
    g3.adicionaAresta("c-f", 1);
    g3.adicionaAresta("d-e", 21);
    g3.adicionaAresta("c-e", 30);
    g3.adicionaAresta("e-f", 15);
    g3.adicionaAresta("f-g", 3);

    g4 = Grafo([], {})
    for i in ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm']:
        g4.adicionaVertice(i)
    g4.adicionaAresta("a-g", 5);
    g4.adicionaAresta("a-b", 19);
    g4.adicionaAresta("b-c", 16);
    g4.adicionaAresta("b-g", 13);
    g4.adicionaAresta("c-d", 19);
    g4.adicionaAresta("c-f", 1);
    g4.adicionaAresta("d-e", 21);
    g4.adicionaAresta("c-e", 30);
    g4.adicionaAresta("e-f", 15);
    g4.adicionaAresta("f-g", 3);
    g4.adicionaAresta("g-m", 5);
    g4.adicionaAresta("i-k", 1);
    g4.adicionaAresta("a-m", 14);
    g4.adicionaAresta("j-l", 9);
    g4.adicionaAresta("i-m", 8);
    g4.adicionaAresta("f-i", 11);
    g4.adicionaAresta("f-h", 10);
    g4.adicionaAresta("c-e", 13);
    g4.adicionaAresta("e-j", 20);
    g4.adicionaAresta("f-k", 19);

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

    def test_prim(self):
        self.assertEqual(self.g.prim("g"), ['f-g', 'e-f', 'h-f', 'a-g', 'b-h', 'c-b', 'd-c'])
        print()
        self.assertEqual(self.g2.prim("a"), ['b-a', 'c-b', 'd-c', 'f-c', 'e-f'])
        self.assertEqual(self.g3.prim("c"), ['f-c', 'g-f', 'a-g', 'b-g', 'e-f', 'd-c'])
        self.assertEqual(self.g4.prim("e"), ['f-e', 'c-f', 'g-f', 'a-g', 'm-g', 'i-m', 'k-i', 'h-f', 'b-g', 'd-c', 'j-e', 'l-j'])