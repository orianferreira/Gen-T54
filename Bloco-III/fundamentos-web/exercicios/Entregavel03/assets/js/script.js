let nome = window.document.getElementById("nome");
let email = window.document.querySelector("#email");
let assunto = window.document.querySelector("#assunto");
let nomeOk = false;
let emailOk = false;
let assuntoOk = false;
let mapa = document.querySelector("#mapa");

nome.style.width = "100%";
email.style.width = "100%";
assunto.style.width = "100%";

function validaNome() {
  let txt = document.querySelector("#txtNome");
  //Importando id txtNome

  if (nome.value.length < 3) {
    txt.innerHTML = "Nome inválido";
    txt.style.color = "red";
  } else {
    txt.innerHTML = "Nome válido";
    txt.style.color = "green";
    nomeOk = true;
  }
}

function validaEmail() {
  let txt = document.querySelector("#txtEmail");
  //Importando id txtEmail

  if (email.value.indexOf("@") == -1 || email.value.indexOf(".") == -1) {
    txt.innerHTML = "E-mail inválido";
    txt.style.color = "red";
  } else {
    txt.innerHTML = "E-mail válido";
    txt.style.color = "green";
    emailOk = true;
  }
}

function validaAssunto() {
  let txt = document.querySelector("#txtAssunto");
  //Importando id txtAssunto

  if (assunto.value.length > 100) {
    txt.innerHTML = "Texto muito grande, digite no máximo 100 caracteres";
    txt.style.color = "red";
    txt.style.display = "block";
  } else {
    txt.style.display = "nome";
    assuntoOk = true;
  }
}

function enviar() {
  if (nomeOk == true || emailOk == true || assuntoOk == true) {
    alert("Formulário enviado com sucesso!");
  } else {
    alert("Preencha o formulário corretamente antes de enviar...");
  }
}

function mapaZoom() {
  mapa.style.width = "800px";
  mapa.style.height = "650px";
  mapa.style.border = "3px solid black";
}

function mapaNormal() {
  mapa.style.width = "600px";
  mapa.style.height = "450px";
  mapa.style.border = "3px solid green";
}
