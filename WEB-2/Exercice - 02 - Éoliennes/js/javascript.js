let eolione = [];

window.addEventListener("load", () => {
    for (let i = 1; i <= 3; i++) {
        eolione.push(new Frame("blades-" + i));
    }
    
    tick();
});

const tick = () => {
    for (let i = 0; i < eolione.length; i++) {
        const frame = eolione[i];
        frame.tick();
    }
    window.requestAnimationFrame(tick);
};
