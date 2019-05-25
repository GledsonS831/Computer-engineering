# -*- coding: utf-8 -*-

class VerticeInvalidoException(Exception):
    pass

class ArestaInvalidaException(Exception):
    pass

class MatrizInvalidaException(Exception):
    pass

class Grafo:

    QTDE_MAX_SEPARADOR = 1
    SEPARADOR_ARESTA = '-'
    __maior_vertice = 0

    def __init__(self, V=None, M=None):
        '''
        Constrói um objeto do tipo Grafo. Se nenhum parâmetro for passado, cria um Grafo vazio.
        Se houver alguma aresta ou algum vértice inválido, uma exceção é lançada.
        :param V: Uma lista dos vértices (ou nodos) do grafo.
        :param V: Uma matriz de adjacência que guarda as arestas do grafo. Cada entrada da matriz tem um inteiro que indica a quantidade de arestas que ligam aqueles vértices
        '''

        if V == None:
            V = list()
        if M == None:
            M = list()

        for v in V:
            if not(Grafo.verticeValido(v)):
                raise VerticeInvalidoException('O vértice ' + v + ' é inválido')
            if len(v) > self.__maior_vertice:
                self.__maior_vertice = len(v)

        self.N = list(V)
        self.pesos = {}
        if M == []:
            for k in range(len(V)):
                M.append(list())
                for l in range(len(V)):
                    if k>l:
                        M[k].append('-')
                    else:
                        M[k].append(0)


        if len(M) != len(V):
            raise MatrizInvalidaException('A matriz passada como parâmetro não tem o tamanho correto')

        for c in M:
            if len(c) != len(V):
                raise MatrizInvalidaException('A matriz passada como parâmetro não tem o tamanho correto')

        for i in range(len(V)):
            for j in range(len(V)):
                '''
                Verifica se os índices passados como parâmetro representam um elemento da matriz abaixo da diagonal principal.
                Além disso, verifica se o referido elemento é um traço "-". Isso indica que a matriz é não direcionada e foi construída corretamente.
                '''
                if i>j and not(M[i][j] == '-'):
                    raise MatrizInvalidaException('A matriz não representa uma matriz não direcionada')


                aresta = V[i] + Grafo.SEPARADOR_ARESTA + V[j]
                if not(self.arestaValida(aresta)):
                    raise ArestaInvalidaException('A aresta ' + aresta + ' é inválida')

        self.M = list(M)

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

        if not(self.existeVertice(aresta[:i_traco])) or not(self.existeVertice(aresta[i_traco+1:])):
            return False

        return True

    @classmethod
    def verticeValido(self, vertice: str):
        '''
        Verifica se um vértice passado como parâmetro está dentro do padrão estabelecido.
        Um vértice é um string qualquer que não pode ser vazio e nem conter o caractere separador.
        :param vertice: Um string que representa o vértice a ser analisado.
        :return: Um valor booleano que indica se o vértice está no formato correto.
        '''
        return vertice != '' and vertice.count(Grafo.SEPARADOR_ARESTA) == 0

    def existeVertice(self, vertice: str):
        '''
        Verifica se um vértice passado como parâmetro pertence ao grafo.
        :param vertice: O vértice que deve ser verificado.
        :return: Um valor booleano que indica se o vértice existe no grafo.
        '''
        return Grafo.verticeValido(vertice) and self.N.count(vertice) > 0

    def __primeiro_vertice_aresta(self, a: str):
        '''
        Dada uma aresta no formato X-Y, retorna o vértice X
        :param a: a aresta a ser analisada
        :return: O primeiro vértice da aresta
        '''
        return a[0:a.index(Grafo.SEPARADOR_ARESTA)]

    def __segundo_vertice_aresta(self, a: str):
        '''
        Dada uma aresta no formato X-Y, retorna o vértice Y
        :param a: A aresta a ser analisada
        :return: O segundo vértice da aresta
        '''
        return a[a.index(Grafo.SEPARADOR_ARESTA)+1:]

    def __indice_primeiro_vertice_aresta(self, a: str):
        '''
        Dada uma aresta no formato X-Y, retorna o índice do vértice X na lista de vértices
        :param a: A aresta a ser analisada
        :return: O índice do primeiro vértice da aresta na lista de vértices
        '''
        return self.N.index(self.__primeiro_vertice_aresta(a))

    def __indice_segundo_vertice_aresta(self, a: str):
        '''
        Dada uma aresta no formato X-Y, retorna o índice do vértice Y na lista de vértices
        :param a: A aresta a ser analisada
        :return: O índice do segundo vértice da aresta na lista de vértices
        '''
        return self.N.index(self.__segundo_vertice_aresta(a))

    def existeAresta(self, a: str):
        '''
        Verifica se uma aresta passada como parâmetro pertence ao grafo.
        :param aresta: A aresta a ser verificada
        :return: Um valor booleano que indica se a aresta existe no grafo.
        '''
        existe = False
        if Grafo.arestaValida(self, a):
            for i in range(len(self.M)):
                for j in range(len(self.M)):
                    if self.M[self.__indice_primeiro_vertice_aresta(a)][self.__indice_segundo_vertice_aresta(a)]:
                        existe = True

        return existe

    def adicionaVertice(self, v):
        '''
        Inclui um vértice no grafo se ele estiver no formato correto.
        :param v: O vértice a ser incluído no grafo.
        :raises VerticeInvalidoException se o vértice já existe ou se ele não estiver no formato válido.
        '''
        if v in self.N:
            raise VerticeInvalidoException('O vértice {} já existe'.format(v))

        if self.verticeValido(v):
            if len(v) > self.__maior_vertice:
                self.__maior_vertice = len(v)

            self.N.append(v) # Adiciona vértice na lista de vértices
            self.M.append([]) # Adiciona a linha

            for k in range(len(self.N)):
                if k != len(self.N) -1:
                    self.M[k].append(0) # adiciona os elementos da coluna do vértice
                    self.M[self.N.index(v)].append('-') # adiciona os elementos da linha do vértice
                else:
                    self.M[self.N.index(v)].append(0)  # adiciona um zero no último elemento da linha
        else:
            raise VerticeInvalidoException('O vértice ' + v + ' é inválido')

    def adicionaAresta(self, a, peso):
        '''
        Adiciona uma aresta ao grafo no formato X-Y, onde X é o primeiro vértice e Y é o segundo vértice
        :param a: a aresta no formato correto
        :raise: lança uma exceção caso a aresta não estiver em um formato válido
        '''
        if self.arestaValida(a):
            i_a1 = self.__indice_primeiro_vertice_aresta(a)
            i_a2 = self.__indice_segundo_vertice_aresta(a)
            if i_a1 < i_a2:
                self.M[i_a1][i_a2] += 1
            else:
                self.M[i_a2][i_a1] += 1
        else:
            raise ArestaInvalidaException('A aresta {} é inválida'.format(a))
        self.pesos[a] = peso
    def remove_aresta(self, a):
        '''
        Remove uma aresta ao grafo no formato X-Y, onde X é o primeiro vértice e Y é o segundo vértice
        :param a: a aresta no formato correto
        :raise: lança uma exceção caso a aresta não estiver em um formato válido
        '''
        if self.arestaValida(a):
            if self.existeAresta(a):
                i_a1 = self.__indice_primeiro_vertice_aresta(a)
                i_a2 = self.__indice_segundo_vertice_aresta(a)
                if i_a1 < i_a2:
                    self.M[i_a1][i_a2] -= 1
                else:
                    self.M[i_a2][i_a1] -= 1
        else:
            raise ArestaInvalidaException('A aresta {} é inválida'.format(a))

    def vertices_nao_adjacentes(self):
        not_adj = []
        for i in range(len(self.N)):
            for j in range(len(self.N)):
                if self.M[i][j] == 0:
                    aresta = self.N[i]+"-"+self.N[j]
                    not_adj.append(aresta)
        return not_adj

    def ha_laco(self):
        for i in range(len(self.M)):
             if self.M[i][i] > 0:
                 return True
        return False

    def ha_paralelas(self):

        for i in range(len(self.M)):
            for j in range(len(self.M)):
                if self.M[i][j] != '-' and self.M[i][j] > 1:
                    return True
        return False

    def arestas_sobre_vertice(self, vertice):
        sobre_vertice = []
        '''for i in range(len(self.N)):
                for j in range(len(self.N)):
                    if self.N[i] == vertice and self.M[i][j] != '-'and i != j and self.M[i][j] > 0:
                        aresta = vertice+"-"+self.N[j]
                        sobre_vertice.append(aresta)

                    if self.N[j] == vertice and self.M[i][j] != '-' and i != j and self.M[i][j] > 0:
                        aresta = vertice+'-'+self.N[i]
                        sobre_vertice.append(aresta)

                    elif self.N[i] == vertice and self.M[i][j] != '-' and i == j and self.M[i][j] > 0:
                        aresta = vertice + '-' + self.N[i]
                        sobre_vertice.append(aresta)'''

        index = 0
        for i in range(len(self.N)):
            if self.N[i] == vertice:
                index = i

        for i in range(len(self.N)):
            if self.M[index][i] != '-' and self.M[index][i] > 0:
                for j in range(self.M[index][i]):
                    aresta = vertice+"-"+self.N[i]
                    sobre_vertice.append(aresta)


            if self.M[i][index] != '-' and self.M[i][index] > 0:
                for j in range(self.M[i][index]):
                    aresta = vertice + "-" + self.N[i]
                    sobre_vertice.append(aresta)



        return sobre_vertice
    def eh_completo(self):
        completo = True
        for i in range(len(self.M)):
            for j in range(len(self.M)):
                if self.M[i][j] != '-' and self.M[i][j] >= 1 and i != j:
                    completo = True
                elif self.M[i][j] != '-' and self.M[i][j] == 0 and i != j:
                    return False
        return completo

    def grau(self, vertice):
        index = 1
        soma = 0
        soma_diagonal = 0
        for i in range(len(self.N)):
            for j in range(len(self.N)):
                if self.N[i] == vertice or self.N[j] == vertice and i != j:
                    if self.M[i][j] != "-":
                        soma += self.M[i][j]
        return soma

    def prim(self, inicial):
        verificado = []
        verificado.append(inicial)
        aux = []
        c = 0
        while len(self.N) != len(verificado):
            c+=1
            for i in verificado:

                for j in range(len(self.N)):
                    if self.M[self.N.index(i)][j] == 1 and self.N[j] not in verificado:
                        aresta = self.N[j]+"-"+i
                        aux.append(aresta)
                        ##print(self.M[self.N.index(i)][j])

                    if self.M[j][self.N.index(i)] == 1 and self.N[j] not in verificado:
                        ##print(self.M[j][self.N.index(i)])
                        aresta = i + "-" + self.N[j]
                        aux.append(aresta)
            #print(aux)
            menor_peso = 99999
            lista_correta = []

            for i in aux:
                v1 = i[0]
                v2 = i[2]
                aresta_aux = v1+"-"+v2
                if self.M[self.N.index(aresta_aux[0])][self.N.index(aresta_aux[2])] == "-":
                    aresta_aux = v2+"-"+v1
                lista_correta.append(aresta_aux)


            for i in lista_correta:
                if self.pesos[i] < menor_peso:
                    menor_peso = self.pesos[i]
            for i in lista_correta:
                if self.pesos[i] == menor_peso:
                    if i[0] not in verificado:
                        verificado.append(i[0])
                    elif i[0] in verificado and i[2] not in verificado:
                        verificado.append(i[2])

            print(verificado)
            aux = []






        '''print(self.M[self.N.index(v1)][self.N.index(v2)])
        print(self.M[self.N.index(v2)][self.N.index(v1)])
        print(self.pesos[v2+'-'+v1])'''

    def __str__(self):
        '''
        Fornece uma representação do tipo String do grafo.
        O String contém um sequência dos vértices separados por vírgula, seguido de uma sequência das arestas no formato padrão.
        :return: Uma string que representa o grafo
        '''

        # Dá o espaçamento correto de acordo com o tamanho do string do maior vértice
        espaco = ' '*(self.__maior_vertice)

        grafo_str = espaco + ' '

        for v in range(len(self.N)):
            grafo_str += self.N[v]
            if v < (len(self.N) - 1):  # Só coloca o espaço se não for o último vértice
                grafo_str += ' '

        grafo_str += '\n'

        for l in range(len(self.M)):
            grafo_str += self.N[l] + ' '
            for c in range(len(self.M)):
                grafo_str += str(self.M[l][c]) + ' '
            grafo_str += '\n'

        return grafo_str































