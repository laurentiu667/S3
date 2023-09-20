window.addEventListener("load", () => {
    const boite = document.querySelector(".the-box");

    const SPEED = 50; 

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
       
       
    });
});
