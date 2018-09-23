import  random





def jogar():

    imprime_abertura();
    palavra_secreta = escolher_palavra();
    letras_acertadas = quantidade_letras(palavra_secreta);

    enforcou = False
    acertou = False
    erros = 0;
    chutes=[];


    while (not enforcou and not acertou):

        chute = pede_chute();

        if (chute in palavra_secreta):
            marca_chute_correto(chute,palavra_secreta,letras_acertadas);
        else:
            erros += 1
            desenha_forca(erros);

        guardar_chutes(chute,chutes);

        enforcou = erros == 7;
        acertou = not '_' in letras_acertadas;
        print(letras_acertadas)

    if(acertou):
        imprime_mensagem_vencedor();
    else:
        imprime_mensagem_perdedor(palavra_secreta);

    continuar_jogo();













def imprime_abertura():
    print("*********************************")
    print("***Bem vindo ao jogo da Forca!***")
    print("*********************************")


def escolher_palavra():
    arquivo = open("palavra.txt", "r");
    palavra = [];
    for linha in arquivo:
        palavra.append(linha.strip())
    numero = random.randrange(0, len(palavra));

    arquivo.close();
    return palavra[numero].upper();



def quantidade_letras(palavra):
    return ['_' for letra in palavra]


def pede_chute():
    chute = input("Qual letra? ")
    return chute.strip().upper();


def marca_chute_correto(chute,palavra_secreta,letras_acertadas):
    index = 0
    for letra in palavra_secreta:
        if (chute == letra):
            letras_acertadas[index] = letra
        index += 1




def guardar_chutes(chute,chutes):
    if(chute in chutes):
        print("Voce ja tentou essa letra {}".format(chutes))
    else:
        chutes.append(chute);
        print("chutes efetuados {}".format(chutes))

def continuar_jogo():
    print("Deseja continuar Jogandor ?");
    decisao = int(input("1:Sim ou 2:N:"));
    deseja_continuar = decisao == 1;
    if(deseja_continuar):
        jogar();
    else:
        print("Fim do jogo");



def desenha_forca(erros):
    print("  _______     ")
    print(" |/      |    ")

    if(erros == 1):
        print(" |      (_)   ")
        print(" |            ")
        print(" |            ")
        print(" |            ")

    if(erros == 2):
        print(" |      (_)   ")
        print(" |      \     ")
        print(" |            ")
        print(" |            ")

    if(erros == 3):
        print(" |      (_)   ")
        print(" |      \|    ")
        print(" |            ")
        print(" |            ")

    if(erros == 4):
        print(" |      (_)   ")
        print(" |      \|/   ")
        print(" |            ")
        print(" |            ")

    if(erros == 5):
        print(" |      (_)   ")
        print(" |      \|/   ")
        print(" |       |    ")
        print(" |            ")

    if(erros == 6):
        print(" |      (_)   ")
        print(" |      \|/   ")
        print(" |       |    ")
        print(" |      /     ")

    if (erros == 7):
        print(" |      (_)   ")
        print(" |      \|/   ")
        print(" |       |    ")
        print(" |      / \   ")

    print(" |            ")
    print("_|___         ")
    print()



def imprime_mensagem_vencedor():
    print("Parabéns, você ganhou!")
    print("       ___________      ")
    print("      '._==_==_=_.'     ")
    print("      .-\\:      /-.    ")
    print("     | (|:.     |) |    ")
    print("      '-|:.     |-'     ")
    print("        \\::.    /      ")
    print("         '::. .'        ")
    print("           ) (          ")
    print("         _.' '._        ")
    print("        '-------'       ")


def imprime_mensagem_perdedor(palavra_secreta):
    print("Puxa, você foi enforcado!")
    print("A palavra era {}".format(palavra_secreta))
    print("    _______________         ")
    print("   /               \       ")
    print("  /                 \      ")
    print("//                   \/\  ")
    print("\|   XXXX     XXXX   | /   ")
    print(" |   XXXX     XXXX   |/     ")
    print(" |   XXX       XXX   |      ")
    print(" |                   |      ")
    print(" \__      XXX      __/     ")
    print("   |\     XXX     /|       ")
    print("   | |           | |        ")
    print("   | I I I I I I I |        ")
    print("   |  I I I I I I  |        ")
    print("   \_             _/       ")
    print("     \_         _/         ")
    print("       \_______/           ")

if (__name__ == "__main__"):
    jogar()

