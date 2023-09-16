window.addEventListener("load", () => {
    const genericDiv = document.querySelector(".generic"); 
    
    let currentTop = 600;
    let moveUp = true;

    function moveGeneric() {
        if (moveUp) {
            currentTop +=1;
        } else {
            currentTop -= 1;
        }

        genericDiv.style.top = currentTop + "px";

        if (currentTop <= 0) {
            moveUp = false;
        } else if (currentTop >= 600) {
            moveUp = true;
        }
    }

    setInterval(moveGeneric, 30);

    genericDiv.addEventListener('click', () => {
        moveUp = !moveUp;
    });
});
