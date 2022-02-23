// onclick setAtribute(mostraVideo) || setAtribute(escondeVideo) || setAtribute(escondeVideo)
//                  videoClicado                outro video                  outro video

const videoDestaquePico0 = document.querySelector('.videoDestaquePico0');
const btnVideoBala = document.querySelector('.btnVideoPico0');

const videoDestaquePico1 = document.querySelector('.videoDestaquePico1');
const btnVideoPico1 = document.querySelector('.btnVideoPico1');

const videoDestaquePico2 = document.querySelector('.videoDestaquePico2');
const btnVideoPico2 = document.querySelector('.btnVideoPico2');

const videoDestaquePico3 = document.querySelector('.videoDestaquePico3');
const btnVideoPico3 = document.querySelector('.btnVideoPico3');


btnVideoBala.addEventListener('click', function(event) {
    alteraVideoPico0();
});

btnVideoPico1.addEventListener('click', function(event) {
    alteraVideoPico1();
});

btnVideoPico2.addEventListener('click', function(event) {
    alteraVideoPico2();
});

btnVideoPico3.addEventListener('click', function(event) {
    alteraVideoPico3();
});

function alteraVideoPico0() {
    videoDestaquePico0.classList.remove('videoEscondido');
    videoDestaquePico1.classList.add('videoEscondido');
    videoDestaquePico2.classList.add('videoEscondido');
    videoDestaquePico3.classList.add('videoEscondido');
}

function alteraVideoPico1() {
    videoDestaquePico1.classList.remove('videoEscondido');
    videoDestaquePico0.classList.add('videoEscondido');
    videoDestaquePico2.classList.add('videoEscondido');
    videoDestaquePico3.classList.add('videoEscondido');
}

function alteraVideoPico2() {
    videoDestaquePico2.classList.remove('videoEscondido');
    videoDestaquePico1.classList.add('videoEscondido');
    videoDestaquePico0.classList.add('videoEscondido');
    videoDestaquePico3.classList.add('videoEscondido');
}

function alteraVideoPico3() {
    videoDestaquePico3.classList.remove('videoEscondido');
    videoDestaquePico1.classList.add('videoEscondido');
    videoDestaquePico2.classList.add('videoEscondido');
    videoDestaquePico0.classList.add('videoEscondido');
}