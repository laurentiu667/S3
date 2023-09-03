const validation = () => {

    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;

    const divErrors = document.createElement("errors");

    divErrors.className = "errors";


    let errors = [];

    if (name.length >= 40){
        errors.push("Votre nom est trop long veuillez abbreger");
    }

    if (name.length < 2){
        errors.push("Votre nom est trop court");
    }
    
    else if (name.match(/^[!@#$%^&*()_+{}:"<>?|]*$/)){
        errors.push("Votre nom contient des caracteres non accepter ex : !@&^$#*(")
    }

    if (!email.includes("@")){

        errors.push("Il se peut qu il vous manque : @ ou adresse email invalide");
    }

    if(errors.length > 0 ){
        let message = "Vous avez des erreurs";
        errors.forEach(err => {
            message += "\n - " + err;
            alert(message);
        })
    }
    
}


const menu = document.querySelector(".burger")
const slide = document.querySelector(".menu-def")

menu.addEventListener('click', () => {
    menu.classList.toggle('active');
    slide.classList.toggle('active');
})