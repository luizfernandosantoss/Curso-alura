function removeLinha(event){
    event.preventDefault();
    $(this).parent().parent().remove();
}


function novaLinha(nomeUsuario,quantidaPalavras){
    var linha = $("<tr>")
    var colunaUsuario = $("<td>").text(nomeUsuario);
    var colunaPalavras = $("<td>").text(quantidaPalavras);
    var colunaRemover = $("<td>")
    var link = $("<a>").attr("href","#").addClass("botao-remover");
    var icone = $("<i>").addClass("small").addClass("material-icons").text("delete");
    
    link.append(icone);
    colunaRemover.append(link);

    linha.append(colunaUsuario);
    linha.append(colunaPalavras);
    linha.append(colunaRemover);

    return linha;    
}
function inserePlacar(){
    var tabela = $("#tabela").find("tbody");

     var quantidaPalavras = $("#contador-palavras").text();
     var usuario = "Luiz Fernando";

     var linha = novaLinha(usuario,quantidaPalavras);
     linha.find(".botao-remover").click(removeLinha);


    tabela.prepend(linha);

}