class Frame {
    constructor(id){
        this.id = id;
        this.node = document.querySelector("#" + this.id);
        

        this.node.onmouseover = () => {
            console.log(3);
           
        }
        this.node.onmouseout = () => {
            this.speed += 2; 
        }
    }
    tick() {

       
        
    }
}