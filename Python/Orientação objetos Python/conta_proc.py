def conta(numero,titular,saldo,limite):
    conta = {"numero":numero,"titular":titular,"saldo":saldo,"limite":limite};
    return conta

def deposita(conta,valor):
    conta["saldo"] +=valor;
    return conta;

def sacar(conta,valor):
    conta["saldo"] -=valor;
    return conta;

def extrato(conta):
    print("Seu saldo é de {}".format(conta["saldo"]))


teste =  conta(123,"luiz Fernando",1000,100)
extrato(teste)
print(teste)