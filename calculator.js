let result=document.querySelector(".display")
console.log(result);
let td=document.querySelectorAll("td")
console.log(td);

td.forEach(key =>{
    key.addEventListener("click", calculate)
})

function calculate(){
    // console.log("working");
    let tdText=this.innerText;
    //console.log(tdText);
    if (tdText === "AC") {
        result.innerText="";
    }
    else if (tdText === "=") {
        result.innerText = eval(result.innerText)
    } 
    else {
        result.textContent += tdText
    }
}


