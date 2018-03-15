Vari�veis
Em PHP, as vari�veis s�o representadas pelo cifr�o($), juntamente com o nome dela. Repare que n�s n�o precisamos definir o tipo da vari�vel:

<?php 
    $curso = "Curso PHP e Mysql I: Fundamentos para criar um sistema na Web";
?>
Imprimindo Dados
Para imprimir dados, como por exemplo, a vari�vel declarada anteriormente, utilizamos o comando "echo":

<?php 
    $curso = "Curso PHP e Mysql I: Fundamentos para criar um sistema na Web";
    echo $curso;
?>
Condicionais
Como em toda linguagem de programa��o, o PHP tamb�m possui o seu if/else:

<?php 
    $numero = 10;
    if($numero > 5){
        echo "Maior que 5!";
    }
    else{
        echo "Menor que 5";
    }
?>
Repeti��es
Repare que o c�digo PHP difere pouco das outras linguagens. A maior diferen�a talvez seja o cifr�o($) na frente das vari�veis. Repare no c�digo do for:

<?php
  for ($i=0; $i < 5 ; $i++) {
    echo "La�o de n�mero: " . $i;
  }
 ?>

?>
Nosso c�digo acima ir� imprimir os n�meros: La�o de n�mero: 0 La�o de n�mero: 1 La�o de n�mero: 2 .... Muito parecido com outras linguagens como C e Java!

Veja que juntamos tamb�m uma mensagem "La�o de n�mero: ". Em PHP, para concatenarmos tanto strings quanto vari�veis, utilizamos o .*(ponto)*. Repare agora no while:

<?php

    $condicao = 5;
    $i = 0;
    while ($i < $condicao) { 
        echo "La�o de n�mero: " . $i;
        $i++;
    }

?>
Temos exatamente a mesma resposta: La�o de n�mero: 0 La�o de n�mero: 1 La�o de n�mero: 2 ...

Arrays
Como aprendemos em L�gica de programa��o, arrays s�o muito �teis pois conseguem guardar diversos valores dentro uma mesma vari�vel. Novamente, em PHP n�o temos nada de muito diferente na declara��o de um array:

<?php

    $numeros = array(1,3,9,4,5,8,2,6,7,0);

?>
Passamos para a fun��o array() do PHP os valores na qual queremos colocar dentro da vari�vel $numeros. Para termos o acesso a cada um desses valores individualmente, fazemos:

<?php

    $numeros = array(1,3,9,4,5,8,2,6,7,0);
    for ($i=0; $i < 10; $i++) { 
        echo "Chave: " . $i . "Valor: " . $numeros[$i];
    }

?>
Nosso c�digo acima ir� verificar cada posi��o do array de 0 a 9, e ir� imprimir a mensagem dizendo qual chave/valor estamos no array.

Lembra que n�s n�o dizemos qual tipo a vari�vel ser�? Isso significa tamb�m que nosso array n�o tem tipo, e por isso podemos colocar quaisquer valores dentro do array, inclusive misturando-os:

<?php

    $arrayMaluco = array(0,1,"banana","alura",4,5,"curso php",7,8,9);

?>