
const validate = () => {
    console.log(23432);
    let nom = document.querySelector("#nompinput").value;
    let motDepasse = document.querySelector("#mdpinput").value;

    let errors = [];
    
    if (nom != "franck"){
        errors.push("Nom invalide")
        
    }

    if (motDepasse != "dion"){
        errors.push("Mot de passe invalide")
    }
  
    if (errors.length > 0){
					
        let message = "Vous avez ces erreurs : ";
        errors.forEach(err => {
            message += "\n - " + err;
        } )
        alert(message);
    }


}

window.addEventListener("load", () => {
    const videoOnclick = document.querySelector("video");
    const bodyy = document.querySelector("#booody");

    videoOnclick.onplay = () => {
        bodyy.style.backgroundColor = "#555";
    };

    videoOnclick.onpause = () => {
        bodyy.style.backgroundColor = "white";
    };

    videoOnclick.onended = () => {
        window.location.href = "./generique.html";
    };

});
