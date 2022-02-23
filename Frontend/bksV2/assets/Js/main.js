// onclick setAtribute(mostraVideo) || setAtribute(escondeVideo) || setAtribute(escondeVideo)
//                  videoClicado                outro video                  outro video

const videoDestaque = document.querySelector('.videoDestaque1');
const btnVideo = document.querySelector('btnVideo');
const videoBala = document.querySelector('videoBala');
const videoEscondido = document.querySelector('videoEscondido');

btnVideo.addEventListener('click', function (e) {
    const el = e.target;

    if (el.classList.contains('videoBala')) {
        videoDestaque.removeAttribute('class', 'videoEscondido');
    }

    // if (el.classList.contains('videoBala')) {
    //     videoDestaque.classList.remove('videoEscondido') 
    //     || videoDestaque.classList.add('mostraVideo');
    // }

    // if (el.classList.contains('videoBlackYellow')) {
    //     videoDestaque.classList.remove('videoEscondido') 
    //     || videoDestaque.classList.add('mostraVideo');
    // }

});


