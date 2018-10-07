class Conta:


    def __init__(self,numero,titular,saldo,limite): #função construtora
        print("Construindo um Objeto...{}".format(self)); #self sabe onde o objeto esta sendo criado;
        self.__numero = numero
        self.__titular = titular
        self.__saldo = saldo
        self.__limite = limite

    @property
    def numero(self):
        return self.__numero

    @property
    def titular(self):
        return self.__titular

    @property
    def saldo(self):
        return self.__saldo

    @property
    def limite(self):
        return self.__limite

    @limite.setter
    def limite(self, limite):
        self.__limite = limite

    @staticmethod
    def codigos_banco():# Metodo Static
        return {"BB":"001","Caixa":"104","Bradesco":"237"}

    @staticmethod
    def codigo_banco():  # Metodo Static
        return "111"




    def extrato(self):
        print("Saldo de {} do titular {}".format(self.__saldo,self.__titular))

    def deposita(self, valor):
        if(self.__saldo < 0):
            self.__limite += abs(self.__saldo)

        self.__saldo += valor;


    def saca(self, valor):
        if(self.__pode_sacar(valor)):
            self.__saldo -= valor
        else:
            print("O valor {} passou o limite".format(valor))

    def __pode_sacar(self,valor):
        return valor <= (self.__saldo + self.__limite)

    def transfere(self, valor,destino):
        self.saca(valor)
        destino.deposita(valor)


