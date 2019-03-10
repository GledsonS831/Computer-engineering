class VerticeInvalidoException(Exception):
    pass

class ArestaInvalidaException(Exception):
    pass

class Grafo:

    QTDE_MAX_SEPARADOR = 1
    SEPARADOR_ARESTA = '-'

    def __init__(self, N=[], A={}):
        '''
        Constrói um objeto do tipo Grafo. Se nenhum parâmetro for passado, cria um Grafo vazio.
        Se houver alguma aresta ou algum vértice inválido, uma exceção é lançada.
        :param N: Uma lista dos vértices (ou nodos) do grafo.
        :param V: Uma dicionário que guarda as arestas do grafo. A chave representa o nome da aresta e o valor é uma string que contém dois vértices separados por um traço.
        '''
        for v in N:
            if not(Grafo.verticeValido(v)):
                raise VerticeInvalidoException('O vértice ' + v + ' é inválido')

        self.N = N

        for a in A:
            if not(self.arestaValida(A[a])):
                raise ArestaInvalidaException('A aresta ' + A[a] + ' é inválida')

        self.A = A

    def arestaValida(self, aresta=''):
        '''
        Verifica se uma aresta passada como parâmetro está dentro do padrão estabelecido.
        Uma aresta é representada por um string com o formato a-b, onde:
        a é um substring de aresta que é o nome de um vértice adjacente à aresta.
        - é um caractere separador. Uma aresta só pode ter um único caractere como esse.
        b é um substring de aresta que é o nome do outro vértice adjacente à aresta.
        Além disso, uma aresta só é válida se conectar dois vértices existentes no grafo.
        :param aresta: A aresta que se quer verificar se está no formato correto.
        :return: Um valor booleano que indica se a aresta está no formato correto.
        '''

        # Não pode haver mais de um caractere separador
        if aresta.count(Grafo.SEPARADOR_ARESTA) != Grafo.QTDE_MAX_SEPARADOR:
            return False

        # Índice do elemento separador
        i_traco = aresta.index(Grafo.SEPARADOR_ARESTA)

        # O caractere separador não pode ser o primeiro ou o último caractere da aresta
        if i_traco == 0 or aresta[-1] == Grafo.SEPARADOR_ARESTA:
            return False

        # Verifica se as arestas antes de depois do elemento separador existem no Grafo
        if not(self.existeVertice(aresta[:i_traco])) or not(self.existeVertice(aresta[i_traco+1:])):
            return False

        return True

    @classmethod
    def verticeValido(self, vertice=''):
        '''
        Verifica se um vértice passado como parâmetro está dentro do padrão estabelecido.
        Um vértice é um string qualquer que não pode ser vazio e nem conter o caractere separador.
        :param vertice: Um string que representa o vértice a ser analisado.
        :return: Um valor booleano que indica se o vértice está no formato correto.
        '''
        return vertice != '' and vertice.count(Grafo.SEPARADOR_ARESTA) == 0

    def existeVertice(self, vertice=''):
        '''
        Verifica se um vértice passado como parâmetro pertence ao grafo.
        :param vertice: O vértice que deve ser verificado.
        :return: Um valor booleano que indica se o vértice existe no grafo.
        '''
        return Grafo.verticeValido(vertice) and self.N.count(vertice) > 0

    def existeAresta(self, aresta=''):
        '''
        Verifica se uma aresta passada como parâmetro pertence ao grafo.
        :param aresta: A aresta a ser verificada
        :return: Um valor booleano que indica se a aresta existe no grafo.
        '''
        existe = False
        if Grafo.arestaValida(self, aresta):
            for k in self.A:
                if aresta == self.A[k]:
                    existe = True

        return existe

    def adicionaVertice(self, v):
        '''
        Adiciona um vértice no Grafo caso o vértice seja válido e não exista outro vértice com o mesmo nome
        :param v: O vértice a ser adicionado
        :raises: VerticeInvalidoException se o vértice passado como parâmetro não puder ser adicionado
        '''
        if self.verticeValido(v) and not self.existeVertice(v):
            self.N.append(v)
        else:
            raise VerticeInvalidoException('O vértice ' + v + ' é inválido')

    def adicionaAresta(self, nome, a):
        '''
        Adiciona uma aresta no Grafo caso a aresta seja válida e não exista outra aresta com o mesmo nome
        :param v: A aresta a ser adicionada
        :raises: ArestaInvalidaException se a aresta passada como parâmetro não puder ser adicionada
        '''
        if self.arestaValida(a):
            self.A[nome] = a
        else:
            ArestaInvalidaException('A aresta ' + self.A[a] + ' é inválida')

    #verifica se há algum laço em determinaod grafo
    def ha_laco(self):
        for values in self.A.values():
            value = values.split("-")
            if value[0] == value[1]:
                return True
        return False

    #verifica se há alguma aresta paralela em algum grafo
    def ha_paralelas(self):
        lista = []
        for value in self.A.values():
            if value not in lista:
                lista.append(value)
            else:
                return True
        return False

    #verifica o grau(quantidade de aresta sobre um vertice) de vertice em um grafo
    def grau(self, vertice):
        cont = 0
        for value in self.A.values():
            if value[0] == vertice or value[2] == vertice:
                cont += 1
        return cont

    def arestas_sobre_vertice(self, vertice):
        lista = []

        for key in self.A.keys():
            valor = self.A[key]
            if valor[0] == vertice or valor[2] == vertice:
                lista.append(key)
        return set(lista)

    def vertices_nao_adjacentes(self):
        lista = []
        for i in range(len(self.N)):
            for j in range(0, len(self.N)):
                eh_adj = 0
                aresta1 = self.N[i] + "-" + self.N[j]
                aresta2 = self.N[j] + "-" + self.N[i]
                for k in self.A.values():
                    if aresta1 == k or aresta2 == k:
                        eh_adj = 1
                        break
                if not eh_adj:
                    lista.append(aresta1)
        return lista

    #verifica se o grafo é completo
    def eh_completo(self):
        count_v = 0
        atual =0
        c_i = 0
        for i in self.N:
            count_v = 0
            laco = 0
            ant = atual
            c_i += 1
            for j in self.A.values():
                vertice = j.split('-')
                if vertice[0] == vertice[1] and laco == 0:
                    count_v += 1
                    laco = 1
                elif vertice[0] == i or vertice[1] == i:
                    count_v += 1
            atual = count_v

            if ant != atual and c_i > 1:
                return False
        return True

    #verifica se o grafo possui alguma parte desconectada
    def eh_conexo(self):

        if len(self.A) < len(self.N) - 1:
            return False
        lista = [self.N[0]]


        for j in self.N:
            for x in self.A.values():
                val1 = x[0]
                val2 = x[2]

                if val1 in lista:
                    lista.append(val2)
                elif val2 in lista:
                    lista.append(val1)
        return set(self.N) == set(lista)
    
    def caminho(self, n):

        vertices = []

        for x in self.A.values():
            vertices.append(x[0])
            vertices.append(x[2])
        vertices = list(set(vertices))

        caminhos = [[vertices[0]]]
        atual = vertices[0]

        while True:
            for caminho in self.A.values():
                pass
    def ha_ciclo(self):
        count_i = -1
        count_j = -1
        for i in self.A.values():
            count_i += 1
            #criando lista para  dar inicio a busca de caminhos
            temp = self.A.values()
            #criando aresta
            aresta = i.split('-')
            comprimento = 0
            ponto = aresta[0]
            ponto2 = aresta[1]
            for j in temp:
                count_j += 1
                #arestas nao podem ser iguais
                aresta_aux = j.split('-')
                if comprimento == 3:
                    return True
                if ponto == aresta_aux[1]:
                    ponto = aresta_aux[1]
                    comprimento += 1
                elif ponto == aresta_aux[0]:
                    ponto = aresta_aux[0]
                    comprimento += 1
  


    def __str__(self):
        '''
        Fornece uma representação do tipo String do grafo.
        O String contém um sequência dos vértices separados por vírgula, seguido de uma sequência das arestas no formato padrão.
        :return: Uma string que representa o grafo
        '''
        grafo_str = ''

        for v in range(len(self.N)):
            grafo_str += self.N[v]
            if v < (len(self.N) - 1):  # Só coloca a vírgula se não for o último vértice
                grafo_str += ", "

        grafo_str += '\n'

        for i, a in enumerate(self.A):
            grafo_str += self.A[a]
            if not(i == len(self.A) - 1): # Só coloca a vírgula se não for a última aresta
                grafo_str += ", "

        return grafo_str