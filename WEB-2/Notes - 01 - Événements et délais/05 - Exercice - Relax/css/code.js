
/* 
const image = document.querySelector("elem-1")
const texte1 = document.querySelector("elem-2")
const texte2 = document.querySelector("elem-3")
*/

let x = 2000;

for (let i = 1; i < 3; i++)1{
    setTimeout(() => {
        document.querySelector("#elem-" + i).style.opacity = 1;
        
    }, x);
    x += 2000;
}