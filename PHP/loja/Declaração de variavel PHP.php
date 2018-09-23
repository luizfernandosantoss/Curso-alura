Variáveis
Em PHP, as variáveis são representadas pelo cifrão($), juntamente com o nome dela. Repare que nós não precisamos definir o tipo da variável:

<?php 
    $curso = "Curso PHP e Mysql I: Fundamentos para criar um sistema na Web";
?>
Imprimindo Dados
Para imprimir dados, como por exemplo, a variável declarada anteriormente, utilizamos o comando "echo":

<?php 
    $curso = "Curso PHP e Mysql I: Fundamentos para criar um sistema na Web";
    echo $curso;
?>
Condicionais
Como em toda linguagem de programação, o PHP também possui o seu if/else:

<?php 
    $numero = 10;
    if($numero > 5){
        echo "Maior que 5!";
    }
    else{
        echo "Menor que 5";
    }
?>
Repetições
Repare que o código PHP difere pouco das outras linguagens. A maior diferença talvez seja o cifrão($) na frente das variáveis. Repare no código do for:

<?php
  for ($i=0; $i < 5 ; $i++) {
    echo "Laço de número: " . $i;
  }
 ?>

?>
Nosso código acima irá imprimir os números: Laço de número: 0 Laço de número: 1 Laço de número: 2 .... Muito parecido com outras linguagens como C e Java!

Veja que juntamos também uma mensagem "Laço de número: ". Em PHP, para concatenarmos tanto strings quanto variáveis, utilizamos o .*(ponto)*. Repare agora no while:

<?php

    $condicao = 5;
    $i = 0;
    while ($i < $condicao) { 
        echo "Laço de número: " . $i;
        $i++;
    }

?>
Temos exatamente a mesma resposta: Laço de número: 0 Laço de número: 1 Laço de número: 2 ...

Arrays
Como aprendemos em Lógica de programação, arrays são muito úteis pois conseguem guardar diversos valores dentro uma mesma variável. Novamente, em PHP não temos nada de muito diferente na declaração de um array:

<?php

    $numeros = array(1,3,9,4,5,8,2,6,7,0);

?>
Passamos para a função array() do PHP os valores na qual queremos colocar dentro da variável $numeros. Para termos o acesso a cada um desses valores individualmente, fazemos:

<?php

    $numeros = array(1,3,9,4,5,8,2,6,7,0);
    for ($i=0; $i < 10; $i++) { 
        echo "Chave: " . $i . "Valor: " . $numeros[$i];
    }

?>
Nosso código acima irá verificar cada posição do array de 0 a 9, e irá imprimir a mensagem dizendo qual chave/valor estamos no array.

Lembra que nós não dizemos qual tipo a variável será? Isso significa também que nosso array não tem tipo, e por isso podemos colocar quaisquer valores dentro do array, inclusive misturando-os:

<?php

    $arrayMaluco = array(0,1,"banana","alura",4,5,"curso php",7,8,9);

?>