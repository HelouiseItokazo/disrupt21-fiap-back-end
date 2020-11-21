/**
 * 
 */

function carregarIdioma() {
    atualizarIdioma(localStorage.getItem("idioma"), "pitch");
}

carregarIdioma();

engBtn.addEventListener('click', e => {
    e.preventDefault();
    localStorage.setItem("idioma", "eng")
    atualizarIdioma("eng", "pitch");
})

ptBtn.addEventListener('click', e => {
    e.preventDefault();
    localStorage.setItem("idioma", "pt")
    atualizarIdioma("pt", "pitch");
})