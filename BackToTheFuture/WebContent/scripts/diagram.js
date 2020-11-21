/**
 * 
 */

function carregarIdioma() {
    atualizarIdioma(localStorage.getItem("idioma"), "diagram");
}

carregarIdioma();

engBtn.addEventListener('click', e => {
    e.preventDefault();
    localStorage.setItem("idioma", "eng")
    atualizarIdioma("eng", "diagram");
})

ptBtn.addEventListener('click', e => {
    e.preventDefault();
    localStorage.setItem("idioma", "pt")
    atualizarIdioma("pt", "diagram");
})