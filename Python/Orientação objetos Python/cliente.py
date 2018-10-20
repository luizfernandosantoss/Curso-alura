class Cliente:


    def  __init__(self,nome,endereco,telefone):

        print("Construindo um Objeto {}".format(self))
        self.__nome = nome
        self.__endereco = endereco
        self.__telefone = telefone

    @property
    def nome(self):
        print("Chamando a @property nome()")
        return self.__nome.title()

    @nome.setter
    def nome(self,nome):
        self.__nome = nome


