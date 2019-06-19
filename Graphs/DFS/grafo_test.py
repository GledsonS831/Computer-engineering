import unittest
from grafo_adj_nao_dir import Grafo

class TestGrafo(unittest.TestCase):

    def setUp(self):
        # Grafo da Paraíba
        self.g_p = Grafo(['J', 'C', 'E', 'P', 'M', 'T', 'Z'])
        #{'a1':'J-C', 'a2':'C-E', 'a3':'C-E', 'a4':'C-P', 'a5':'C-P', 'a6':'C-M', 'a7':'C-T', 'a8':'M-T', 'a9':'T-Z'}
        self.g_p.adicionaAresta('J-C')
        self.g_p.adicionaAresta('C-E')
        self.g_p.adicionaAresta('C-E')
        self.g_p.adicionaAresta('C-P')
        self.g_p.adicionaAresta('C-P')
        self.g_p.adicionaAresta('C-M')
        self.g_p.adicionaAresta('C-T')
        self.g_p.adicionaAresta('M-T')
        self.g_p.adicionaAresta('T-Z')


        # Grafo da Paraíba sem arestas paralelas
        self.g_p_sem_paralelas = Grafo(['J', 'C', 'E', 'P', 'M', 'T', 'Z'])
        self.g_p_sem_paralelas.adicionaAresta('J-C')
        self.g_p_sem_paralelas.adicionaAresta('C-E')
        self.g_p_sem_paralelas.adicionaAresta('C-P')
        self.g_p_sem_paralelas.adicionaAresta('C-M')
        self.g_p_sem_paralelas.adicionaAresta('C-T')
        self.g_p_sem_paralelas.adicionaAresta('M-T')
        self.g_p_sem_paralelas.adicionaAresta('T-Z')

        # Grafos completos
        #self.g_c = Grafo(['J', 'C', 'E', 'P'], {'a1':'J-C', 'a3':'J-E', 'a4':'J-P', 'a6':'C-E', 'a7':'C-P', 'a8':'E-P'})
        self.g_c = Grafo(['J', 'C', 'E', 'P'])
        self.g_c.adicionaAresta('J-C')
        self.g_c.adicionaAresta('J-E')
        self.g_c.adicionaAresta('J-P')
        self.g_c.adicionaAresta('C-E')
        self.g_c.adicionaAresta('C-P')
        self.g_c.adicionaAresta('E-P')


        self.g = Grafo([], {})
        for i in ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h']:
            self.g.adicionaVertice(i)
        self.g.adicionaAresta("a-g");
        self.g.adicionaAresta("a-b");
        self.g.adicionaAresta("b-c");
        self.g.adicionaAresta("b-h");
        self.g.adicionaAresta("b-g");
        self.g.adicionaAresta("c-d");
        self.g.adicionaAresta("c-f");
        self.g.adicionaAresta("d-e");
        self.g.adicionaAresta("c-e");
        self.g.adicionaAresta("e-f");
        self.g.adicionaAresta("f-h");
        self.g.adicionaAresta("f-g");

        self.g2 = Grafo([], {})

        self.g2.adicionaVertice('a');
        self.g2.adicionaVertice('b');
        self.g2.adicionaVertice('c');
        self.g2.adicionaVertice('d');
        self.g2.adicionaVertice('e');
        self.g2.adicionaVertice('f');

        self.g2.adicionaAresta("a-b");
        self.g2.adicionaAresta("b-c");

        self.g2.adicionaAresta("c-d");
        self.g2.adicionaAresta("c-f");
        self.g2.adicionaAresta("d-e");
        self.g2.adicionaAresta("c-e");
        self.g2.adicionaAresta("e-f");

        self.g3 = Grafo([], {})
        for i in ['a', 'b', 'c', 'd', 'e', 'f', 'g']:
            self.g3.adicionaVertice(i)
        self.g3.adicionaAresta("a-g");
        self.g3.adicionaAresta("a-b");
        self.g3.adicionaAresta("b-c");
        self.g3.adicionaAresta("b-g");
        self.g3.adicionaAresta("c-d");
        self.g3.adicionaAresta("c-f");
        self.g3.adicionaAresta("d-e");
        self.g3.adicionaAresta("c-e");
        self.g3.adicionaAresta("e-f");
        self.g3.adicionaAresta("f-g");

        g = Grafo([], {})
        for i in ["0", "1", "2", "3", "4", "5", "6"]:
            g.adicionaVertice(i)

        g.adicionaAresta('0-1')
        g.adicionaAresta('0-2')
        g.adicionaAresta('0-3')
        g.adicionaAresta('1-2')
        g.adicionaAresta('2-3')
        g.adicionaAresta('2-4')
        g.adicionaAresta('2-5')
        g.adicionaAresta('2-6')
        g.adicionaAresta('3-4')
        g.adicionaAresta('3-5')

        g2 = Grafo([], {})
        for i in ["0", "1", "2", "3", "4", "5", "6"]:
            g2.adicionaVertice(i)

        g2.adicionaAresta('0-4')
        g2.adicionaAresta('0-2')
        g2.adicionaAresta('0-3')
        g2.adicionaAresta('1-2')
        g2.adicionaAresta('2-3')
        g2.adicionaAresta('2-4')
        g2.adicionaAresta('2-5')
        g2.adicionaAresta('3-4')
        g2.adicionaAresta('3-5')

        g3 = Grafo([], {})
        for i in ["0",'1',"2", "3", "4", '5',"6"]:
            g3.adicionaVertice(i)

        g3.adicionaAresta('0-4')
        g3.adicionaAresta('0-2')
        g3.adicionaAresta('0-3')
        g3.adicionaAresta('2-3')
        g3.adicionaAresta('2-6')
        g3.adicionaAresta('2-4')
        g3.adicionaAresta('3-4')
        g3.adicionaAresta('4-6')
        g3.adicionaAresta('3-6')


        self.g5 = Grafo([], {})
        for i in ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"]:
            self.g5.adicionaVertice(i)

        self.g5.adicionaAresta('0-1')
        self.g5.adicionaAresta('0-2')
        self.g5.adicionaAresta('0-3')
        self.g5.adicionaAresta('1-2')
        self.g5.adicionaAresta('1-7')
        self.g5.adicionaAresta('1-8')
        self.g5.adicionaAresta('1-9')
        self.g5.adicionaAresta('1-10')
        self.g5.adicionaAresta('2-3')
        self.g5.adicionaAresta('2-4')
        self.g5.adicionaAresta('2-5')
        self.g5.adicionaAresta('2-6')
        self.g5.adicionaAresta('3-4')
        self.g5.adicionaAresta('3-5')
        self.g5.adicionaAresta('6-7')
        self.g5.adicionaAresta('8-9')
        self.g5.adicionaAresta('8-10')
    
    def test_DFS(self):
        self.assertEqual(self.g5.dfs(0), [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
        self.assertEqual(self.g.dfs(0), [0, 1, 2, 3, 4, 5, 6, 7])
        self.assertEqual(self.g2.dfs(0),[0, 1, 2, 3, 4, 5])
        self.assertEqual(self.g3.dfs(0), [0, 1, 2, 3, 4, 5, 6])
        