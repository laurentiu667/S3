let monstre;

window.addEventListener("load", () => {
    monstre = new Frame("#alien");
    monstre.repositionAlien();
    tick();
});

const tick = () => {
    monstre.tick();
    requestAnimationFrame(tick);
};