window.addEventListener("load", () => {
    const boite = document.querySelector(".the-box");

    const SPEED = 20; 

    let cliquer = false;

    let x = 0;
    let y = 0;

    let clickx = 0;
    let clicky = 0;

    function moveBox() {
        
        x += (clickx - x) / SPEED;
        y += (clicky - y) / SPEED;
        

        boite.style.left = x + "px";
        boite.style.top = y + "px";
    }
    
    setInterval(moveBox, 0); 

    document.addEventListener('click', (event) => {
        clickx = event.clientX; 
        clicky = event.clientY; 

        cliquer = !cliquer;

     
        boite.style.backgroundColor = cliquer ? "red" : "blue";
        
       
       
    });
});


// Si on doit donner un x et y directement sans que je touche sur l ecran

// window.addEventListener("load", () => {
//     const boite = document.querySelector(".the-box");

//     const SPEED = 40; 
//     let cliquer = false;
//     let x = 0;
//     let y = 0;

//     let clickx = 400;
//     let clicky = 200;

//     function moveBox() {
        
//         if (cliquer){
//             x += (clickx - x) / SPEED;
//             y += (clicky - y) / SPEED;
//         }
//         else{
//             console.log("cliquerfalse");
//             x = (0 + x) / SPEED;
//             y = (0 + y) / SPEED;
//         }
        

//         boite.style.left = x + "px";
//         boite.style.top = y + "px";
//     }

//     setInterval(moveBox, 0); 

//     boite.addEventListener("click", () => {
//         console.log(true);
//         cliquer = !cliquer
//     })

    
// });
