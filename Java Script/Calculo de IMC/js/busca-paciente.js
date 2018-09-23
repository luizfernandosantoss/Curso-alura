var botaoAdicionar = document.querySelector("#buscar-pacientes");


botaoAdicionar.addEventListener("click",function (event) {
  var erroAjax = document.querySelector("#erro-ajax");
    event.preventDefault();
    var xhr = new XMLHttpRequest();
    xhr.open("GET", "http://api-pacientes.herokuapp.com/pacientes");

    xhr.addEventListener("load",function () {

      if (xhr.status == 200) {
        erroAjax.classList.add('invisivel');
        var resposta = xhr.responseText;
        var pacientes = JSON.parse(resposta);
        console.log(pacientes[1].nome);
        pacientes.forEach(function (paciente) {
          adicionaPacienteNaTabela(paciente);
        });
      }else {

        erroAjax.classList.remove('invisivel');
        console.log(xhr.status);
      }

    });
    xhr.send();

});
