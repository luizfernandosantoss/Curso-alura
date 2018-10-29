from conta import Conta

conta = Conta(9178,"Luiz Fernando",1000,100)
conta.saca(3000)

codigos = Conta.codigos_banco();
print(codigos["Caixa"])

print("Saldo",conta.saldo)
print("Limite",conta.limite)

