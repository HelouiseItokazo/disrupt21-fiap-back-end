/**
 * 
 */

function carregarIdioma() {
    atualizarIdioma(localStorage.getItem("idioma"), "contact");
}

carregarIdioma();

engBtn.addEventListener('click', e => {
    e.preventDefault();
    localStorage.setItem("idioma", "eng")
    atualizarIdioma("eng", "contact");
})

ptBtn.addEventListener('click', e => {
    e.preventDefault();
    localStorage.setItem("idioma", "pt")
    atualizarIdioma("pt", "contact");
})