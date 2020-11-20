const inputs = document.querySelectorAll('.toggleWrapper')
const objBusca = {
    id: null,
    ano: ""
}

function percorrerInputs(element, index, array) {
    console.log(element);
}

function logArrayElements(element, index, array) {

    let refCheckbox = element.htmlFor;

    element.addEventListener('click', () => {

        if (refCheckbox == "year1985" || refCheckbox == "year1955" || refCheckbox == "year1985alt") {

            objBusca.ano = refCheckbox;
            console.log(objBusca)

            document.querySelectorAll('.year-wrapper > input').forEach((elm, index) => {
                if (elm.id != refCheckbox) {
                    elm.checked = false;
                }
            })
            
            $.ajax({
                url: location.origin + "/BackToTheFuture/Event",
                type: 'get',
                data: objBusca,
                success: function(data, textStatus, jqXHR){
                	 console.log("Printing data and cleaning HTML");                	 
                     console.log(data);   
                     $(".description-container").empty();
             		info = ""
                		for(i = 0; i < data.length; i++) {
                			info = info + "<p>" + data[i] + "</p>";
                		}
               			$(".description-container").html(info); 		

                },
                error: function(a,b,c) {
                     console.log('something went wrong:',a,b,c);
                }
           });



        } else {

            let bgClassName = "";
            let bgElement = document.querySelector('.film-header');
            
            $(".description-container").empty();

            objBusca.id = refCheckbox;
            objBusca.ano = null;

            console.log(objBusca)

            switch (parseInt(refCheckbox)) {
                case 1:
                    bgClassName = "marty";
                    break;
                case 2:
                    bgClassName = "doc";
                    break;
                case 3:
                    bgClassName = "lorraine";
                    break;
                case 4:
                    bgClassName = "george";
                    break;
                case 5:
                    bgClassName = "beef";
                    break;
                default:
                    bgClassName = "pirates";
            }

            let classToRemove = bgElement.classList[1];

            bgElement.classList.remove(classToRemove);
            bgElement.classList.add(bgClassName);

            document.querySelectorAll('.characters-wrapper > input').forEach((elm, index) => {
                if (elm.id != refCheckbox) {
                    elm.checked = false;
                }
            })

            document.querySelectorAll('.year-wrapper > input').forEach((elm, index) => {
                elm.checked = false;
            })
        }
    })

}

inputs.forEach(logArrayElements)