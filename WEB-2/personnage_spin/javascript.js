window.addEventListener("load", () =>{
    const input_colonne = document.querySelector("#square_by");
    const parent = document.querySelector("#game_pixel")
    const couleur = document.querySelector("#color1ST")
    const pixel = document.querySelector(".pixel")
    const draw = false;
    let isMouseDown = false;

    input_colonne.onkeyup = event =>{
        
        if (event.key == "Enter") {
            const colonne = input_colonne.value;
            parent.style.setProperty('--size', colonne);
            input_colonne.value = "";

            for (let i = 0; i < colonne * colonne; i++) {
                let noeud = document.createElement('div');
                noeud.classList.add("pixel");
                parent.append(noeud);  

                noeud.addEventListener('mousedown', () =>{
                    console.log(23);
                    draw = true
                    noeud.addEventListener('mouseover', () =>{
                        if (!draw) return noeud.style.backgroundColor = couleur.value;
                    }) 
                })
            
                noeud.addEventListener('mouseup', () =>{
                    console.log(20349);
                    draw = false
                })

                   
            }  
        }
    }
    

})