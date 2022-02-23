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
    alteraVideo();
});

btnVideoPico.addEventListener('click', function(event) {
    alert('Video Pico selecionado');
});

btnVideoBlackYellow.addEventListener('click', function(event) {
    alert('Video Black and yellow - Wiz Kalifa selecionado');
});

function alteraVideo() {
    videoDestaqueBala.classList.remove('videoEscondido');
    videoDestaquePico.classList.add('videoEscondido');
    videoDestaqueBlacYellow.classList.add('videoEscondido');

}





// btnVideo.addEventListener('click', function (e) {
//     const el = e.target;

//     if (el.classList.contains('videoBala')) {
//         videoDestaque.removeAttribute('class', 'videoEscondido');
//     }

    // if (el.classList.contains('videoBala')) {
    //     videoDestaque.classList.remove('videoEscondido') 
    //     || videoDestaque.classList.add('mostraVideo');
    // }

    // if (el.classList.contains('videoBlackYellow')) {
    //     videoDestaque.classList.remove('videoEscondido') 
    //     || videoDestaque.classList.add('mostraVideo');
    // }

// });


