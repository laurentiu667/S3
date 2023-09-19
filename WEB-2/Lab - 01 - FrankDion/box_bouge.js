window.addEventListener("load", () => {

    const boite = document.querySelector(".the-box");

    const SPEED = 2;

    let cliquer = false;

    const x = 40, y = 70;

    let decalage_pixel = 0;

    function moveBox() {
        if (cliquer){
            decalage_pixel--;
        } 
        else {
            decalage_pixel++;
        }
        
        
        boite.style.left = decalage_pixel + "px"; 
    
    
       
    }
    // si tu met le setInteval dans addEvenLister ca vas juste concatener la vitesse
    setInterval(moveBox, 30) 
    
    boite.addEventListener('click', () => {
          
        cliquer = !cliquer;
       
    });
    


})