<?php include("cabecalho.php");?>   
   <h1> Formulário de produto</h1>    
<form action="adiciona-produto.php" method="post">
    <table class="table">
        <tr>
            <td>Nome:</td>
            <td><input class="form-control" type="text" name="nome"><br/><br/></td>
        </tr>
        <tr>
            <td>
                Preço:
            </td>
            <td>
                <input class="form-control" type="number" name="preco" step="0.01"><br\><br/><br/></br\>
            </td>
        </tr>
        <tr>
            <td>Descrição:</td>
            <td><textarea name="descricao" class="form-control" ></textarea><br/><br/></td>
        </tr>
        <tr>
            <td>Categoria</td>
            <td>
                <input type="radio" name="categoria">Esporte</br>
                <input type="radio" name="categoria">Escolar</br>
                <input type="radio" name="categoria">Mobilidade</br>

            </td>
        </tr>
        <tr>
            <td>
                <button class="btn btn-primary" type="submit">Cadastrar</button>
            </td>
        </tr>
    </table>
</form>
<?php include("rodape.php");?>