// onclick setAtribute(mostraVideo) || setAtribute(escondeVideo) || setAtribute(escondeVideo)
//                  videoClicado                outro video                  outro video

const videoDestaque = document.querySelector('.videoDestaque');

const videoDestaqueBala = document.querySelector('.videoDestaqueBala');
const btnVideoBala = document.querySelector('.btnVideoBala');

const videoDestaquePico = document.querySelector('.videoDestaquePico');
const btnVideoPico = document.querySelector('.btnVideoPico');

const videoDestaqueBlacYellow = document.querySelector('.videoDestaqueBlacYellow');
const btnVideoBlackYellow = document.querySelector('.btnVideoBlackYellow');



btnVideoBala.addEventListener('click', function(event) {
    alteraVideoBala();
});

btnVideoPico.addEventListener('click', function(event) {
    alteraVideoPico();
});

btnVideoBlackYellow.addEventListener('click', function(event) {
    alteraVideoBlacYellow();
});

function alteraVideoBala() {
    videoDestaqueBala.classList.remove('videoEscondido');
    videoDestaquePico.classList.add('videoEscondido');
    videoDestaqueBlacYellow.classList.add('videoEscondido');
}

function alteraVideoPico() {
    videoDestaquePico.classList.remove('videoEscondido');
    videoDestaqueBala.classList.add('videoEscondido');
    videoDestaqueBlacYellow.classList.add('videoEscondido');
}

function alteraVideoBlacYellow() {
    videoDestaqueBlacYellow.classList.remove('videoEscondido');
    videoDestaquePico.classList.add('videoEscondido');
    videoDestaqueBala.classList.add('videoEscondido');
}

