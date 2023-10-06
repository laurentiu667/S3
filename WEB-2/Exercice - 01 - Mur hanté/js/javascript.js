let spriteList = [];

window.addEventListener("load", () => {
    for (let i = 0; i < 6; i++) {
        spriteList.push(new Frame("frame-" + i + "evil"));
    }
   

    tick();
})

const tick = () => {
    for (let i = 0; i < spriteList.length; i++) {
        const node = spriteList[i];
        node.tick(); // node.tick fait reference dans la classe Ball.js
        
    }
    window.requestAnimationFrame(tick) // prends le refreshrRate de l ecran donc 60 fois par seconde sur mon ecran

}