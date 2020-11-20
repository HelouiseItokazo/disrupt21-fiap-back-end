/**
 * 
 */

function carregarIdioma() {
    atualizarIdioma(localStorage.getItem("idioma"), "index");
}

carregarIdioma();

engBtn.addEventListener('click', e => {
    e.preventDefault();
    localStorage.setItem("idioma", "eng")
    atualizarIdioma("eng", "index");
})

ptBtn.addEventListener('click', e => {
    e.preventDefault();
    localStorage.setItem("idioma", "pt")
    atualizarIdioma("pt", "index");
})