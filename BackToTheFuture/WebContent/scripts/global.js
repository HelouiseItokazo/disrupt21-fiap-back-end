const engBtn = document.querySelector("#eng");
const ptBtn = document.querySelector("#pt");

function atualizarIdioma(idioma, page) {
    if (idioma == null || idioma == "")
        idioma = "pt";

    document.querySelector("#home").innerHTML = idioma == "pt" ? "Início" : "Home";
    document.querySelector("#about").innerHTML = idioma == "pt" ? "Sobre" : "About";
    document.querySelector("#cast").innerHTML = idioma == "pt" ? "Elenco" : "Cast";
    document.querySelector("#diagram").innerHTML = idioma == "pt" ? "Diagrama" : "Diagram";
    document.querySelector("#contact").innerHTML = idioma == "pt" ? "Contato" : "Contact";
    document.querySelector("#guide").innerHTML = idioma == "pt" ? "Guia" : "Guide";
    document.querySelector("#langSelect").innerHTML = idioma == "pt" ? "Selecionar idioma" : "Select Language";

    document.querySelector('footer div p').innerHTML = idioma == "pt" ? "DISRUPT21 - Desenvolvido por <a href=''>Ambers</a>" : "DISRUPT21 - Developed by <a href=''>Ambers</a>";

    if (page == "about") {
        if (idioma == "pt") {

            document.querySelector('.film-date > p').innerHTML = "<strong>Lançamento: </strong>1985";

            document.querySelector('.film-category > p').innerHTML = "<strong>Categoria: </strong>Ficção Científica, Aventura";

            document.querySelector('.film-sinopse > p').innerHTML = "Marty McFly, um adolescente de uma pequena cidade californiana, é transportado para a década de 1950 quando a experiência do excêntrico cientista Doc Brown dá errado. Viajando no tempo em um carro modificado, Marty conhece versões jovens de seus pais " +
                "e precisa fazer com que eles se apaixonem, ou então ele deixará de existir. Para complicar, Marty precisa voltar para casa a tempo de salvar o cientista.";

            document.querySelector('.film-direction > p').innerHTML = "<p><strong>Direção: </strong>Robert Zemeckis</p>"

            document.querySelector('.film-cast > p').innerHTML = "<strong>Elenco: </strong>Michael J. Fox, Christopher Lloyd, Lea Thompson, Crispin Glover, Thomas F. Wilson, Claudia Wells"


        } else {
            document.querySelector('.film-date > p').innerHTML = "<strong>Release: </strong>1985";

            document.querySelector('.film-category > p').innerHTML = "<strong>Genre: </strong>Sci-Fi, Adventure";

            document.querySelector('.film-sinopse > p').innerHTML = "Marty McFly, a teenager of a small Californian City, was transported to the 50s when the excentric Doctor Brown”s experience went wrong. " +
                "Travelling through the time on a modified car, Marty knew younger versions of your parents and had to make them to fall in love by yourselves, although he’ll not exist anymore. To make things more complicated, Marty needs to come back home in time to save the scientist.";

            document.querySelector('.film-direction > p').innerHTML = "<p><strong>Directed by: </strong>Robert Zemeckis</p>"

            document.querySelector('.film-cast > p').innerHTML = "<strong>Cast: </strong>Michael J. Fox, Christopher Lloyd, Lea Thompson, Crispin Glover, Thomas F. Wilson, Claudia Wells"

        }

    } else if(page == "guide") {
    	if(idioma == "pt") {
    		document.querySelector('.film-info div h1').innerHTML = "Conheça os personagens";
    		document.querySelector('.film-sinopse p').innerHTML = "Selecione um personagem abaixo para um resumo do seu papel no filme - e o período em que cada evento ocorre.";
    	} else {
    		document.querySelector('.film-info div h1').innerHTML = "Meet the characters";
    		document.querySelector('.film-sinopse p').innerHTML = "Pick a character and a year - we will show you what the character did in that time.";
    	}
    	
    } else if(page == "contact") {
    	if(idioma == "pt") {
    		document.querySelector('#contact-form').innerHTML = "CONTATO";
    		
    		document.querySelector('#contactName').placeholder = "Nome";
    		document.querySelector('#contactEmail').placeholder = "E-mail";
    		document.querySelector('#contactTelephone').placeholder = "Telefone";
    		document.querySelector('#contactMessage').placeholder = "Mensagem";
    		
    		document.querySelector('#sendMessage').innerHTML = "Enviar";
    	} else {
    		document.querySelector('#contact-form').innerHTML = "CONTACT";
    		
    		document.querySelector('#contactName').placeholder = "Name";
    		document.querySelector('#contactEmail').placeholder = "E-mail";
    		document.querySelector('#contactTelephone').placeholder = "Tel";
    		document.querySelector('#contactMessage').placeholder = "Message";
    		
    		document.querySelector('#sendMessage').innerHTML = "Send";
    	}
    	
    }

}